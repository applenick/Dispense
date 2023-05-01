package tc.oc.occ.dispense.events.battlepass;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PlayerLevelUpEvent extends SinglePlayerEvent {

  private final int level;

  public PlayerLevelUpEvent(Player player, int level) {
    super(player);
    this.level = level;
  }

  public int getLevel() {
    return level;
  }
}
