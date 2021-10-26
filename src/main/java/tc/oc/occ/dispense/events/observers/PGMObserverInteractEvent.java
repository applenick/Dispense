package tc.oc.occ.dispense.events.observers;

import javax.annotation.Nullable;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMObserverInteractEvent extends SinglePlayerEvent {

  private final ItemStack item;
  private final @Nullable Player target;
  private final boolean isTargetObserver;

  public PGMObserverInteractEvent(
      Player player, ItemStack item, Player target, boolean isTargetObserver) {
    super(player);
    this.item = item;
    this.target = target;
    this.isTargetObserver = isTargetObserver;
  }

  public ItemStack getItem() {
    return item;
  }

  @Nullable
  public Player getTargetPlayer() {
    return target;
  }

  public boolean isTargetObserver() {
    return isTargetObserver;
  }
}
