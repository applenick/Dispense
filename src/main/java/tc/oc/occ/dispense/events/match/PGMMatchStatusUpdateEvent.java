package tc.oc.occ.dispense.events.match;

import tc.oc.occ.dispense.events.DispenseEvent;

public class PGMMatchStatusUpdateEvent extends DispenseEvent {

  private MatchStatus status;

  public PGMMatchStatusUpdateEvent(MatchStatus status) {
    this.status = status;
  }

  public MatchStatus getStatus() {
    return status;
  }
}
