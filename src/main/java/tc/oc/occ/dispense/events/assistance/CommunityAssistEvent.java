package tc.oc.occ.dispense.events.assistance;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class CommunityAssistEvent extends SinglePlayerEvent {

  private final String reason;
  private final String server;

  public CommunityAssistEvent(Player player, String reason, String server) {
    super(player);
    this.reason = reason;
    this.server = server;
  }

  public String getReason() {
    return reason;
  }
}
