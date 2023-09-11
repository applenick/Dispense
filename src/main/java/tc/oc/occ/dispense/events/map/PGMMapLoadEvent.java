package tc.oc.occ.dispense.events.map;

import tc.oc.occ.dispense.events.DispenseEvent;

public class PGMMapLoadEvent extends DispenseEvent {

  private final String mapName;
  private final String mapDescription;
  private final String mapGamemode;
  private final int maxPlayers;

  public PGMMapLoadEvent(
      String mapName, String mapDescription, String mapGamemode, int maxPlayers) {
    this.mapName = mapName;
    this.mapDescription = mapDescription;
    this.mapGamemode = mapGamemode;
    this.maxPlayers = maxPlayers;
  }

  public String getMapName() {
    return mapName;
  }

  public String getMapDescription() {
    return mapDescription;
  }

  public String getGamemode() {
    return mapGamemode;
  }

  public int getMaxPlayers() {
    return maxPlayers;
  }
}
