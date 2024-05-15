package tc.oc.occ.dispense.events.match;

import tc.oc.occ.dispense.events.DispenseEvent;

public class PGMMatchShareLinkEvent extends DispenseEvent {

  private String matchLink;

  public PGMMatchShareLinkEvent(String matchLink) {
    this.matchLink = matchLink;
  }

  public String getMatchLink() {
    return matchLink;
  }
}
