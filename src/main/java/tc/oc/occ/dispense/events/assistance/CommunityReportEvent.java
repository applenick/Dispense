package tc.oc.occ.dispense.events.assistance;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class CommunityReportEvent extends SinglePlayerEvent {

  private final Player target;
  private final String reason;
  private final String server;

  public CommunityReportEvent(Player reporter, Player target, String reason, String server) {
    super(reporter);
    this.target = target;
    this.reason = reason;
    this.server = server;
  }

  public Player getTarget() {
    return target;
  }

  public String getReason() {
    return reason;
  }

  public String getServer() {
    return server;
  }
}
