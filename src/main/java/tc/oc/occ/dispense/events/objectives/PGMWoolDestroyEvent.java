package tc.oc.occ.dispense.events.objectives;

import org.bukkit.DyeColor;
import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMWoolDestroyEvent extends SinglePlayerEvent {

  private DyeColor color;

  public PGMWoolDestroyEvent(Player player, DyeColor color) {
    super(player);
    this.color = color;
  }

  public DyeColor getColor() {
    return color;
  }
}
