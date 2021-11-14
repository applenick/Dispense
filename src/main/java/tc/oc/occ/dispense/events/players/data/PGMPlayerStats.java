package tc.oc.occ.dispense.events.players.data;

import java.util.UUID;

public class PGMPlayerStats {

  private UUID playerId;

  private int kills;
  private int deaths;
  private int highestKillstreak;

  private int longestBowKill;
  private double bowDamage;
  private int shotsTaken;
  private int shotsHit;

  private double damageDone;
  private double damageTaken;

  public PGMPlayerStats(
      UUID playerId,
      int kills,
      int deaths,
      int highestKillstreak,
      int longestBowKill,
      double bowDamage,
      int shotsTaken,
      int shotsHit,
      double damageDone,
      double damageTaken) {
    this.playerId = playerId;
    this.kills = kills;
    this.deaths = deaths;
    this.highestKillstreak = highestKillstreak;
    this.longestBowKill = longestBowKill;
    this.bowDamage = bowDamage;
    this.shotsTaken = shotsTaken;
    this.shotsHit = shotsHit;
    this.damageDone = damageDone;
    this.damageTaken = damageTaken;
  }

  public UUID getPlayerId() {
    return playerId;
  }

  public int getKills() {
    return kills;
  }

  public int getDeaths() {
    return deaths;
  }

  public int getHighestKillstreak() {
    return highestKillstreak;
  }

  public int getLongestBowKill() {
    return longestBowKill;
  }

  public double getBowDamage() {
    return bowDamage;
  }

  public int getShotsTaken() {
    return shotsTaken;
  }

  public int getShotsHit() {
    return shotsHit;
  }

  public double getDamageDone() {
    return damageDone;
  }

  public double getDamageTaken() {
    return damageTaken;
  }
}
