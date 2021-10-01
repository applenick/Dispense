package tc.oc.occ.dispense.events.objectives;

import java.util.List;
import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.MultiPlayerEvent;

public class PGMMonumentDestroyEvent extends MultiPlayerEvent {

  public PGMMonumentDestroyEvent(List<Player> players) {
    super(players);
  }
}
