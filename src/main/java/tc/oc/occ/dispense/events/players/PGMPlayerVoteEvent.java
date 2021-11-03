package tc.oc.occ.dispense.events.players;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMPlayerVoteEvent extends SinglePlayerEvent {

  private String mapName;
  private boolean add;

  public PGMPlayerVoteEvent(Player player, String mapName, boolean add) {
    super(player);
    this.mapName = mapName;
    this.add = add;
  }

  public String getMapName() {
    return mapName;
  }

  public boolean isAdd() {
    return add;
  }
}
