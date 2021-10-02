package tc.oc.occ.dispense.events.currency;

public enum CurrencyType {
  KILL("kill"),
  WOOL_CAPTURE("wool_capture"),
  WOOL_TOUCH("wool_touch"),
  CORE("core"),
  MONUMENT("monument"),
  FLAG("flag"),
  WIN("win"),
  PARTICIPATE("participation");

  String configKey; // Using this in case we ever wanna adjust config easily

  CurrencyType(String configKey) {
    this.configKey = configKey;
  }

  public String getKey() {
    return configKey;
  }
}
