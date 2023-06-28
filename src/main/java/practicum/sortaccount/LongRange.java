package practicum.sortaccount;

import java.util.Comparator;
import java.util.Objects;

class LongRange {
    private final long left;
    private final long right;
    private long getRange() {
        return (long) Math.sqrt((right - left) * (right - left));
    }

    public static Comparator<LongRange> getComparator() {
        Comparator<LongRange> result = Comparator.comparingLong(LongRange::getRange)
                .thenComparing(LongRange::getLeft);
        return result;
    }

    public LongRange(long left, long right) {
        this.left = left;
        this.right = right;
    }

    public long getLeft() {
        return left;
    }

    public long getRight() {
        return right;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        LongRange longRange = (LongRange) other;
        return left == longRange.left &&
                right == longRange.right;
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public String toString() {
        return String.format("%d %d", left, right);
    }
}