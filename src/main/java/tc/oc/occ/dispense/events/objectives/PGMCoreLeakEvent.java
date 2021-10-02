package tc.oc.occ.dispense.events.objectives;

import java.util.List;
import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.MultiPlayerEvent;

public class PGMCoreLeakEvent extends MultiPlayerEvent {

  public PGMCoreLeakEvent(List<Player> leakers) {
    super(leakers);
  }
}
