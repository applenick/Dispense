package tc.oc.occ.dispense.events.players;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMPlayerBlockBreakEvent extends SinglePlayerEvent {

  private final Block block;

  public PGMPlayerBlockBreakEvent(Player player, Block block) {
    super(player);
    this.block = block;
  }

  public Block getBlock() {
    return block;
  }
}
