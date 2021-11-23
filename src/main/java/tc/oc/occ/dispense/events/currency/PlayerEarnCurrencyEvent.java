package tc.oc.occ.dispense.events.currency;

import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.SinglePlayerEvent;

public class PlayerEarnCurrencyEvent extends SinglePlayerEvent implements CurrencyEvent {

  private final CurrencyType type;
  private final int amount;
  private final boolean playSound;
  private final String reason;

  public PlayerEarnCurrencyEvent(Player player, int amount, String reason) {
    this(player, CurrencyType.CUSTOM, true, amount, reason);
  }

  public PlayerEarnCurrencyEvent(Player player, CurrencyType type, boolean playSound) {
    this(player, type, playSound, -1, null);
  }

  public PlayerEarnCurrencyEvent(Player player, CurrencyType type) {
    this(player, type, false, -1, null);
  }

  public PlayerEarnCurrencyEvent(Player player, CurrencyType type, int amount) {
    this(player, type, false, amount, null);
  }

  public PlayerEarnCurrencyEvent(Player player, CurrencyType type, boolean playSound, int amount) {
    this(player, type, playSound, amount, null);
  }

  public PlayerEarnCurrencyEvent(
      Player player, CurrencyType type, boolean playSound, int amount, String reason) {
    super(player);
    this.type = type;
    this.playSound = playSound;
    this.amount = amount;
    this.reason = reason;
  }

  @Override
  public CurrencyType getType() {
    return type;
  }

  @Override
  public int getCustomAmount() {
    return amount;
  }

  @Override
  public boolean isSoundPlayed() {
    return playSound;
  }

  public String getReason() {
    return reason;
  }
}
