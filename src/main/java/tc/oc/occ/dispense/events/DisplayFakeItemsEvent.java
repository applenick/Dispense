package tc.oc.occ.dispense.events;

import java.time.Duration;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class DisplayFakeItemsEvent extends SinglePlayerEvent {

  private final Location location;
  private final Material material;
  private final int amount;
  private final Duration delay;

  public DisplayFakeItemsEvent(
      Player player, Location location, Material material, int amount, Duration delay) {
    super(player);
    this.location = location;
    this.material = material;
    this.amount = amount;
    this.delay = delay;
  }

  public Location getLocation() {
    return location;
  }

  public Material getMaterial() {
    return material;
  }

  public int getAmount() {
    return amount;
  }

  public Duration getDelay() {
    return delay;
  }
}
