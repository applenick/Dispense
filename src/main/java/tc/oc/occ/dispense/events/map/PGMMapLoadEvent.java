package tc.oc.occ.dispense.events.map;

import tc.oc.occ.dispense.events.DispenseEvent;

public class PGMMapLoadEvent extends DispenseEvent {

  private final String mapName;
  private final String mapDescription;
  private final int maxPlayers;

  public PGMMapLoadEvent(String mapName, String mapDescription, int maxPlayers) {
    this.mapName = mapName;
    this.mapDescription = mapDescription;
    this.maxPlayers = maxPlayers;
  }

  public String getMapName() {
    return mapName;
  }

  public String getMapDescription() {
    return mapDescription;
  }

  public int getMaxPlayers() {
    return maxPlayers;
  }
}
