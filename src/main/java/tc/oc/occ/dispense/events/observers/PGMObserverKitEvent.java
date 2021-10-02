package tc.oc.occ.dispense.events.observers;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMObserverKitEvent extends SinglePlayerEvent {

  public PGMObserverKitEvent(Player player) {
    super(player);
  }
}
