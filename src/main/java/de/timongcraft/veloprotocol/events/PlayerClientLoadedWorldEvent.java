package de.timongcraft.veloprotocol.events;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.velocitypowered.api.proxy.Player;

/**
 * Called when a player is marked as loaded by the client.
 *
 * <p>Note: This event may be fired in the following scenarios:
 * <br>- If the player notifies the server after loading the world (closing the downloading terrain screen)
 * <br>- If the player has <u>not</u> notified the server within 1500ms after joining the server - ({@link #timeout} = true)
 */
@Beta
@Deprecated(since = "1.3.3", forRemoval = true) // will be removed when the pull request is merged - https://github.com/PaperMC/Velocity/pull/1541
public final class PlayerClientLoadedWorldEvent {

    private final Player player;
    private final boolean timeout;

    public PlayerClientLoadedWorldEvent(Player player, boolean timeout) {
        this.player = Preconditions.checkNotNull(player, "player");
        this.timeout = timeout;
    }

    public Player getPlayer() {
        return player;
    }

    /**
     * True if the event was triggered because the server has not been notified by the player
     * for 1500ms after the player joined the server.
     *
     * @return true if the event was triggered because of a timeout
     */
    public boolean isTimeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "PlayerClientLoadedWorldEvent{"
                + "player=" + player
                + ", timeout=" + timeout
                + '}';
    }

}