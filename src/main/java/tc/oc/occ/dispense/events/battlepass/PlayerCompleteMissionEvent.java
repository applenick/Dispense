package tc.oc.occ.dispense.events.battlepass;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PlayerCompleteMissionEvent extends SinglePlayerEvent {

  private int reward;
  private String missionName;

  public PlayerCompleteMissionEvent(Player player, int reward, String missionName) {
    super(player);
    this.reward = reward;
    this.missionName = missionName;
  }

  public int getReward() {
    return reward;
  }

  public String getMissionName() {
    return missionName;
  }
}
