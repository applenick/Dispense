package tc.oc.occ.dispense.events.map;

import tc.oc.occ.dispense.events.DispenseEvent;

public class PGMMatchVoteFinishEvent extends DispenseEvent {

  private final String pickedMapName;

  public PGMMatchVoteFinishEvent(String pickedMapName) {
    this.pickedMapName = pickedMapName;
  }

  public String getPickedMapName() {
    return pickedMapName;
  }
}
