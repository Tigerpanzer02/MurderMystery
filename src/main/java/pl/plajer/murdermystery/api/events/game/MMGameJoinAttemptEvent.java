/*
 * MurderMystery - Find the murderer, kill him and survive!
 * Copyright (C) 2019  Plajer's Lair - maintained by Plajer and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.plajer.murdermystery.api.events.game;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import pl.plajer.murdermystery.api.events.MurderMysteryEvent;
import pl.plajer.murdermystery.arena.Arena;

/**
 * @author Plajer
 * @since 0.0.1-alpha
 * <p>
 * Called when player is attempting to join arena.
 */
public class MMGameJoinAttemptEvent extends MurderMysteryEvent implements Cancellable {

  private static final HandlerList HANDLERS = new HandlerList();
  private final Player player;
  private boolean isCancelled;

  public MMGameJoinAttemptEvent(Player player, Arena targetArena) {
    super(targetArena);
    this.player = player;
    this.isCancelled = false;
  }

  public static HandlerList getHandlerList() {
    return HANDLERS;
  }

  public boolean isCancelled() {
    return this.isCancelled;
  }

  public void setCancelled(boolean isCancelled) {
    this.isCancelled = isCancelled;
  }

  public Player getPlayer() {
    return player;
  }

  public HandlerList getHandlers() {
    return HANDLERS;
  }

}
