package tc.oc.occ.dispense.events.currency;

public enum CurrencyType {
  KILL("kill", false, false),
  KILL_WOOL_HOLDER("kill_wool_holder", false, false),
  KILL_ASSIST("kill_assist", false, false),
  WOOL_CAPTURE("wool_capture", false, false),
  WOOL_TOUCH("wool_touch", false, false),
  WOOL_DESTROY("wool_destroy", false, false),
  CORE("core", false, false),
  MONUMENT("monument", false, false),
  FLAG_CAPTURE("flag_capture", false, false),
  FLAG_PICKUP("flag_pickup", false, false),
  SCORE("score", false, false),
  WIN("win", true, false),
  PARTICIPATE("participation", true, false),
  MAP_VOTE("vote", false, false),
  SPORTSMANSHIP("sportsmanship", false, false),
  SPORTSMANSHIP_LOSER("sportsmanship_loser", false, false),
  SPORTSMANSHIP_OBS("sportsmanship_obs", false, false),
  MISSION_COMPLETION("mission", false, true),
  CUSTOM("custom", false, false);

  String configKey; // Using this in case we ever wanna adjust config easily
  boolean multiplier; // Whether currency should be given a static or multiplied amount
  boolean skip; // Whether the currency has already been granted

  CurrencyType(String configKey, boolean multiplier, boolean skip) {
    this.configKey = configKey;
    this.multiplier = multiplier;
    this.skip = skip;
  }

  public String getKey() {
    return configKey;
  }

  public boolean isMultiplier() {
    return multiplier;
  }

  public boolean isSkip() {
    return skip;
  }
}
