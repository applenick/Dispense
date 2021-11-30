package tc.oc.occ.dispense.events.etc;

import tc.oc.occ.dispense.events.DispenseEvent;

public class NetworkCommandEvent extends DispenseEvent {

  private String command;

  public NetworkCommandEvent(String command) {
    this.command = command;
  }

  public String getCommand() {
    return command;
  }
}
