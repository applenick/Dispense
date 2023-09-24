package tc.oc.occ.dispense.events.restart;

import java.time.Duration;
import tc.oc.occ.dispense.events.DispenseEvent;

public class PGMRestartEvent extends DispenseEvent {

  private Duration remaining;
  private int online;

  public PGMRestartEvent(Duration remaining, int online) {
    this.remaining = remaining;
    this.online = online;
  }

  public Duration getRemaining() {
    return remaining;
  }

  public int getOnline() {
    return online;
  }
}
