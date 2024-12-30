package tc.oc.occ.dispense.events.players;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PGMPlayerDamageEvent extends SinglePlayerEvent {

  private final Player receiver;
  private final double damage;

  public PGMPlayerDamageEvent(Player player, Player receiver, double damage) {
    super(player);
    this.receiver = receiver;
    this.damage = damage;
  }

  public Player getReceiver() {
    return receiver;
  }

  public double getDamage() {
    return damage;
  }
}
