package tc.oc.occ.dispense.events.players;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMPlayerJoinFullEvent extends SinglePlayerEvent {

  public PGMPlayerJoinFullEvent(Player player) {
    super(player);
  }
}
