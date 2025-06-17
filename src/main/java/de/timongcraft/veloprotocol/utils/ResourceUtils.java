package de.timongcraft.veloprotocol.utils;

import org.jetbrains.annotations.Unmodifiable;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

//Based on Tgc-Translations's ResourceUtils
public class ResourceUtils {

    @Unmodifiable
    public static List<InputStream> getFileStreams(String folderPath) {
        ClassLoader classLoader = ResourceUtils.class.getClassLoader();

        List<InputStream> fileStreams = new ArrayList<>();
        try {
            URL resourceUrl = classLoader.getResource(folderPath);
            if (resourceUrl != null) {
                FileSystem fileSystem = null;
                boolean createdFileSystem = false;
                try {
                    URI resourceUri = resourceUrl.toURI();
                    try {
                        fileSystem = FileSystems.getFileSystem(resourceUri);
                    } catch (FileSystemNotFoundException e) {
                        fileSystem = FileSystems.newFileSystem(resourceUri, Collections.emptyMap());
                        createdFileSystem = true;
                    }

                    Path folderRootPath = fileSystem.getPath(folderPath);
                    try (Stream<Path> paths = Files.walk(folderRootPath, 1)) {
                        return paths.filter(path -> !path.equals(folderRootPath))
                                .map(path -> classLoader.getResourceAsStream(path.toString()))
                                .filter(Objects::nonNull)
                                .toList();
                    }
                } finally {
                    if (createdFileSystem && fileSystem != null) {
                        fileSystem.close();
                    }
                }
            } else {
                System.out.println("Unable to find folder " + folderPath + " in resources");
            }
        } catch (Exception e) {
            System.out.println("Unable to read resources files from " + folderPath);
            e.printStackTrace();
        }
        return fileStreams;
    }

}