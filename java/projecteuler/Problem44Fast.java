import static java.util.Comparator.comparingLong;
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
    Set<Long> pentagonalNumbers = new HashSet<>();

    public PentagonalCalculator(int limit) {
        for (int i = 1; i <= limit; i++) {
            pentagonalNumbers.add(i * (3L * i - 1) / 2);
        }
    }

    public Set<Pair<Long>> withPentagonalSumAndDiff() {
        var set = new HashSet<Pair<Long>>();
        var smallestDiff = Long.MAX_VALUE;

        for (var num1 : pentagonalNumbers) {
            for (var num2 : pentagonalNumbers) {
                var diff = Math.abs(num1 - num2);
                if (diff > smallestDiff)
                    continue;

                var sum = num1 + num2;

                if (pentagonalNumbers.contains(sum) && pentagonalNumbers.contains(diff)) {
                    set.add(new Pair<>(num1, num2));
                    smallestDiff = diff;
                }
            }
        }

        return set;
    }
}
