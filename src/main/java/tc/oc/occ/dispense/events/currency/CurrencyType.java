package tc.oc.occ.dispense.events.currency;

public enum CurrencyType {
  KILL("kill", false),
  KILL_WOOL_HOLDER("kill_wool_holder", false),
  WOOL_CAPTURE("wool_capture", false),
  WOOL_TOUCH("wool_touch", false),
  WOOL_DESTROY("wool_destroy", false),
  CORE("core", false),
  MONUMENT("monument", false),
  FLAG_CAPTURE("flag_capture", false),
  FLAG_PICKUP("flag_pickup", false),
  SCORE("score", false),
  WIN("win", true),
  PARTICIPATE("participation", true),
  MAP_VOTE("vote", false),
  SPORTSMANSHIP("sportsmanship", false),
  CUSTOM("custom", false);

  String configKey; // Using this in case we ever wanna adjust config easily
  boolean multiplier; // Whether currency should be given a static or multiplied amount

  CurrencyType(String configKey, boolean multiplier) {
    this.configKey = configKey;
    this.multiplier = multiplier;
  }

  public String getKey() {
    return configKey;
  }

  public boolean isMultiplier() {
    return multiplier;
  }
}
