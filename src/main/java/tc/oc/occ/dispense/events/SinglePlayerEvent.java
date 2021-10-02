package tc.oc.occ.dispense.events;

import org.bukkit.entity.Player;

public abstract class SinglePlayerEvent extends DispenseEvent {

  private Player player;

  public SinglePlayerEvent(Player player) {
    this.player = player;
  }

  public Player getPlayer() {
    return player;
  }
}
