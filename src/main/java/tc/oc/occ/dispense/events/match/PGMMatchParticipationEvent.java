package tc.oc.occ.dispense.events.match;

import java.util.List;
import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.MultiPlayerEvent;

public class PGMMatchParticipationEvent extends MultiPlayerEvent {

  public PGMMatchParticipationEvent(List<Player> participating) {
    super(participating);
  }
}
