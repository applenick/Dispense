package tc.oc.occ.dispense.events.match;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.DispenseEvent;

public class PGMMatchEndEvent extends DispenseEvent {

  private final List<Player> winners;
  private final List<Player> participation;
  private final Duration matchLength;

  public PGMMatchEndEvent(List<Player> winners, List<Player> participation, Duration matchLength) {
    this.winners = winners;
    this.participation = participation;
    this.matchLength = matchLength;
  }

  public List<Player> getWinners() {
    return winners;
  }

  public List<Player> getParticipants(boolean includeWinners) {
    return participation.stream()
        .filter(p -> includeWinners || !winners.contains(p))
        .collect(Collectors.toList());
  }

  public Duration getMatchLength() {
    return matchLength;
  }
}
