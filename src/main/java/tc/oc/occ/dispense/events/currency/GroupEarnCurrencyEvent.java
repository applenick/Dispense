package tc.oc.occ.dispense.events.currency;

import java.util.List;
import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.MultiPlayerEvent;

public class GroupEarnCurrencyEvent extends MultiPlayerEvent implements CurrencyEvent {

  private CurrencyType type;

  public GroupEarnCurrencyEvent(List<Player> players, CurrencyType type) {
    super(players);
    this.type = type;
  }

  @Override
  public CurrencyType getType() {
    return type;
  }
}
