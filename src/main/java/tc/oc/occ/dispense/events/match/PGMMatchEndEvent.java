package tc.oc.occ.dispense.events.match;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.bukkit.entity.Player;
import tc.oc.occ.dispense.events.DispenseEvent;

public class PGMMatchEndEvent extends DispenseEvent {

  private final List<Player> winners;
  private final Map<Player, Duration> playerTimes;
  private final String winnerName;
  private final Duration matchLength;

  public PGMMatchEndEvent(
      List<Player> winners,
      Map<Player, Duration> playerTimes,
      String winnerName,
      Duration matchLength) {
    this.winners = winners;
    this.winnerName = winnerName;
    this.playerTimes = playerTimes;
    this.matchLength = matchLength;
  }

  public List<Player> getWinners() {
    return winners;
  }

  public String getWinnerName() {
    return winnerName;
  }

  public List<Player> getParticipants(boolean includeWinners) {
    return playerTimes.keySet().stream()
        .filter(p -> includeWinners || !winners.contains(p))
        .collect(Collectors.toList());
  }

  public Duration getPlayerTime(Player player) {
    return playerTimes.get(player);
  }

  public Duration getMatchLength() {
    return matchLength;
  }
}
