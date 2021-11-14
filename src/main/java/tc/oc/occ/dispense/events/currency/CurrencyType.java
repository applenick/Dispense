package tc.oc.occ.dispense.events.currency;

public enum CurrencyType {
  KILL("kill"),
  KILL_WOOL_HOLDER("kill_wool_holder"),
  WOOL_CAPTURE("wool_capture"),
  WOOL_TOUCH("wool_touch"),
  WOOL_DESTROY("wool_destroy"),
  CORE("core"),
  MONUMENT("monument"),
  FLAG("flag"),
  SCORE("score"),
  WIN("win"),
  PARTICIPATE("participation"),
  MAP_VOTE("vote");

  String configKey; // Using this in case we ever wanna adjust config easily

  CurrencyType(String configKey) {
    this.configKey = configKey;
  }

  public String getKey() {
    return configKey;
  }
}
