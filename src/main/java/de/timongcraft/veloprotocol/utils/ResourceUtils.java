package de.timongcraft.veloprotocol.utils;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ResourceUtils {

    public static List<Path> getFilePaths(String folderPath) {
        List<Path> filePaths = new ArrayList<>();
        try {
            URL resourceUrl = ResourceUtils.class.getClassLoader().getResource(folderPath);
            if (resourceUrl != null) {
                try (FileSystem fileSystem = FileSystems.newFileSystem(resourceUrl.toURI(), Collections.emptyMap())) {
                    Path folderRootPath = fileSystem.getPath(folderPath);
                    try (Stream<Path> paths = Files.walk(folderRootPath, 1)) {
                        paths.filter(path -> !path.equals(folderRootPath))
                                .forEach(filePaths::add);
                    }
                }
            } else {
                System.out.println("Folder " + folderPath + " not in resources");
            }
        } catch (Exception e) {
            System.out.println("Failed to get Paths from folder in resources");
            e.printStackTrace();
        }
        return filePaths;
    }

    public static List<InputStream> getFileStreams(String folderPath) {
        ClassLoader classLoader = ResourceUtils.class.getClassLoader();

        List<InputStream> fileStreams = new ArrayList<>();
        try {
            URL resourceUrl = classLoader.getResource(folderPath);
            if (resourceUrl != null) {
                try (FileSystem fileSystem = FileSystems.newFileSystem(resourceUrl.toURI(), Collections.emptyMap())) {
                    Path folderRootPath = fileSystem.getPath(folderPath);
                    try (Stream<Path> paths = Files.walk(folderRootPath, 1)) {
                        paths.filter(path -> !path.equals(folderRootPath))
                                .forEach(path -> fileStreams.add(classLoader.getResourceAsStream(path.toString())));
                    }
                }
            } else {
                System.out.println("Folder " + folderPath + " not in resources");
            }
        } catch (Exception e) {
            System.out.println("Failed to get InputStreams from folder in resources");
            e.printStackTrace();
        }
        return fileStreams;
    }

}