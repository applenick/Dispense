package tc.oc.occ.dispense.events;

public class UpdateObjectiveTrackingEvent extends DispenseEvent {

  private boolean value;

  public UpdateObjectiveTrackingEvent(boolean value) {
    this.value = value;
  }

  public boolean getValue() {
    return value;
  }
}
