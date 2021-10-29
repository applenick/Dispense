package tc.oc.occ.dispense.events.objectives;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMScoreEvent extends SinglePlayerEvent {

  private int score;

  public PGMScoreEvent(Player player, int score) {
    super(player);
    this.score = score;
  }

  public int getScore() {
    return score;
  }
}
