package tc.oc.occ.dispense.events.players;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;
import tc.oc.occ.dispense.events.DispenseEvent;

public class PGMPlayerDeathEvent extends DispenseEvent {

  private final Player dead;
  private final @Nullable Player killer;
  private final @Nullable Player assister;

  private final boolean self;
  private final boolean teamKill;
  private final boolean suicide;

  public PGMPlayerDeathEvent(
      Player dead,
      @Nullable Player killer,
      @Nullable Player assister,
      boolean self,
      boolean teamKill,
      boolean suicide) {
    this.dead = dead;
    this.killer = killer;
    this.assister = assister;
    this.self = self;
    this.teamKill = teamKill;
    this.suicide = suicide;
  }

  public Player getDead() {
    return dead;
  }

  @Nullable
  public Player getKiller() {
    return killer;
  }

  @Nullable
  public Player getAssister() {
    return assister;
  }

  public boolean isSelfKill() {
    return self;
  }

  public boolean isTeamKill() {
    return teamKill;
  }

  public boolean isSuicide() {
    return suicide;
  }
}
