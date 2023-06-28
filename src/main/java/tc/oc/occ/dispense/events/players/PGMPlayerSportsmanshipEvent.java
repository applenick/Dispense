package tc.oc.occ.dispense.events.players;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMPlayerSportsmanshipEvent extends SinglePlayerEvent {

  private boolean winner;
  private boolean participant;

  public PGMPlayerSportsmanshipEvent(Player player, boolean winner, boolean participant) {
    super(player);
    this.winner = winner;
    this.participant = participant;
  }

  public boolean isWinner() {
    return winner;
  }

  public boolean isParticipant() {
    return participant;
  }
}
