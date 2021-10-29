package tc.oc.occ.dispense.events.currency;

public abstract interface CurrencyEvent {

  public CurrencyType getType();

  public boolean isSoundPlayed();

  public int getCustomAmount();
}
