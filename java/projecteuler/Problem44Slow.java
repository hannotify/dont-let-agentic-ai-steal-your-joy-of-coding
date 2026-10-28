import static java.util.Comparator.comparingLong;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import static projecteuler.util.Watch.timed;

void main() {
    timed(i -> findSmallestDifference(i).toString(), 10_000);
}

private Optional<Long> findSmallestDifference(int limit) {
    var calculator = new PentagonalCalculator(limit);

    return calculator.withPentagonalSumAndDiff()
            .stream()
            .min(comparingLong(pair -> Math.abs(pair.first() - pair.second())))
            .map(pair -> Math.abs(pair.first() - pair.second()));
}

record Pair<T>(T first, T second) {
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?> pair = (Pair<?>) o;

        return first.equals(pair.second) && second.equals(pair.first) ||
            first.equals(pair.first) && second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        return 31 * (Objects.hashCode(first) + Objects.hashCode(second));
    }
}

static class PentagonalCalculator {
    Map<Integer, Long> pentagonalNumbers = new HashMap<>();

    public PentagonalCalculator(int limit) {
        for (int i = 1; i <= limit; i++) {
            pentagonalNumbers.computeIfAbsent(i, key -> key * (3L * key - 1) / 2);
        }
    }

    public Set<Pair<Long>> withPentagonalSumAndDiff() {
        var set = new HashSet<Pair<Long>>();
        var smallestDiff = Long.MAX_VALUE;

        for (var num1 : pentagonalNumbers.values()) {
            for (var num2 : pentagonalNumbers.values()) {
                var diff = Math.abs(num1 - num2);
                if (diff > smallestDiff)
                    continue;

                var sum = num1 + num2;

                if (pentagonalNumbers.containsValue(sum) && pentagonalNumbers.containsValue(diff)) {
                    set.add(new Pair<>(num1, num2));
                    smallestDiff = diff;
                }
            }
        }

        return set;
    }
}
