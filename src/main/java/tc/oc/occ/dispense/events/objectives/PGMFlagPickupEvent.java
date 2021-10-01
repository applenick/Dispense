package tc.oc.occ.dispense.events.objectives;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMFlagPickupEvent extends SinglePlayerEvent {

  public PGMFlagPickupEvent(Player player) {
    super(player);
  }
}
