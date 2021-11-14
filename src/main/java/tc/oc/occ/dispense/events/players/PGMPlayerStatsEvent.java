package tc.oc.occ.dispense.events.players;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;
import tc.oc.occ.dispense.events.players.data.PGMPlayerStats;

public class PGMPlayerStatsEvent extends SinglePlayerEvent {

  private PGMPlayerStats stats;

  public PGMPlayerStatsEvent(Player player, PGMPlayerStats stats) {
    super(player);
    this.stats = stats;
  }

  public PGMPlayerStats getStats() {
    return stats;
  }
}
