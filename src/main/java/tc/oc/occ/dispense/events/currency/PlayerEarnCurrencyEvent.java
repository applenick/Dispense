package tc.oc.occ.dispense.events.currency;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PlayerEarnCurrencyEvent extends SinglePlayerEvent implements CurrencyEvent {

  private CurrencyType type;

  public PlayerEarnCurrencyEvent(Player player, CurrencyType type) {
    super(player);
    this.type = type;
  }

  @Override
  public CurrencyType getType() {
    return type;
  }
}
