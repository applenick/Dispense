package tc.oc.occ.dispense.events;

import java.util.List;
import org.bukkit.entity.Player;

public abstract class MultiPlayerEvent extends DispenseEvent {

  private List<Player> players;

  public MultiPlayerEvent(List<Player> players) {
    this.players = players;
  }

  public List<Player> getPlayers() {
    return players;
  }
}
