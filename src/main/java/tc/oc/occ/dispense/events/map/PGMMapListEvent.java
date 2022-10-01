package tc.oc.occ.dispense.events.map;

import com.google.common.collect.Sets;
import java.util.Set;
import tc.oc.occ.dispense.events.DispenseEvent;

public class PGMMapListEvent extends DispenseEvent {

  private Set<String> maps;

  public PGMMapListEvent() {
    this(Sets.newHashSet());
  }

  public PGMMapListEvent(Set<String> maps) {
    this.maps = maps;
  }

  public Set<String> getMaps() {
    return maps;
  }

  public void setMaps(Set<String> maps) {
    this.maps = maps;
  }
}
