package tc.oc.occ.dispense.events.objectives;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMFlagCaptureEvent extends SinglePlayerEvent {

  public PGMFlagCaptureEvent(Player player) {
    super(player);
  }
}
