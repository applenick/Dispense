package tc.oc.occ.dispense.events.observers;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMObserverInteractEvent extends SinglePlayerEvent {

  private ItemStack item;

  public PGMObserverInteractEvent(Player player, ItemStack item) {
    super(player);
    this.item = item;
  }

  public ItemStack getItem() {
    return item;
  }
}
