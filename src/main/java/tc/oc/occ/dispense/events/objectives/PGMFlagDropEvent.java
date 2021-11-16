package tc.oc.occ.dispense.events.objectives;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMFlagDropEvent extends SinglePlayerEvent {

  public PGMFlagDropEvent(Player player) {
    super(player);
  }
}
