package tc.oc.occ.dispense.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class DispenseEvent extends Event {

  private static final HandlerList handlers = new HandlerList();

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }
}
