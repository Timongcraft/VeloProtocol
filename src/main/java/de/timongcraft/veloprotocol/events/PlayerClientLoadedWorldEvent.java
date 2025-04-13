package de.timongcraft.veloprotocol.events;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.velocitypowered.api.proxy.Player;
import org.jetbrains.annotations.ApiStatus;

//todo: respawn timeout event - requires decoded respawn packets
//todo: normal respawn by allowing after a respawn packet

/**
 * Called when a player is marked as loaded.
 *
 * <p>Note: This event may be fired in the following scenarios:
 * <br>- If the player notifies the server after loading the world (closing the downloading terrain screen)
 * <br>- If the player has not notified the server within 60 ticks after joining the server / respawning (RESPAWN NOT IMPLEMENTED) - ({@link #timeout} = true)
 * <br>- If the player respawned (NOT IMPLEMENTED)
 */
@Beta
public class PlayerClientLoadedWorldEvent {

    private final Player player;
    private final Cause cause;
    private final boolean timeout;

    @ApiStatus.Internal
    public PlayerClientLoadedWorldEvent(Player player, Cause cause, boolean timeout) {
        this.player = Preconditions.checkNotNull(player, "player");
        this.cause = Preconditions.checkNotNull(cause, "cause");
        this.timeout = timeout;
    }

    public Player getPlayer() {
        return player;
    }

    public Cause getCause() {
        return cause;
    }

    /**
     * True if the event was triggered because the server has not been notified by the player
     * for 60 ticks after the player joined the server or respawned.
     *
     * @return true if the event was triggered because of a timeout
     */
    public boolean isTimeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "PlayerClientLoadedWorldEvent{" +
                "player=" + player +
                ", cause=" + cause +
                ", timeout=" + timeout +
                '}';
    }

    /**
     * Represents the possible causes for the event.
     */
    public enum Cause {

        /**
         * The player joined a server and loaded the first world
         */
        SERVER_JOIN,
        /**
         * The player respawned.
         *
         * <p>Note: This will also be triggered on dimension switches
         */
        // TODO: implement
        RESPAWN

    }

}