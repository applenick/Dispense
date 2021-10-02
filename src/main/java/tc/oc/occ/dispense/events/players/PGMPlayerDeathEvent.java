package tc.oc.occ.dispense.events.players;

import javax.annotation.Nullable;
import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.DispenseEvent;

public class PGMPlayerDeathEvent extends DispenseEvent {

  private final Player dead;
  private final @Nullable Player killer;

  private final boolean self;
  private final boolean teamKill;
  private final boolean suicide;

  public PGMPlayerDeathEvent(
      Player dead, @Nullable Player killer, boolean self, boolean teamKill, boolean suicide) {
    this.dead = dead;
    this.killer = killer;
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
