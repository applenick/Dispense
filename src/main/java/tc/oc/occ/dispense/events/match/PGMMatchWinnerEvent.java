package tc.oc.occ.dispense.events.match;

import java.util.List;
import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.MultiPlayerEvent;

public class PGMMatchWinnerEvent extends MultiPlayerEvent {

  public PGMMatchWinnerEvent(List<Player> winners) {
    super(winners);
  }
}
