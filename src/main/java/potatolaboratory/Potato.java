package potatolaboratory;

import java.util.Objects;

public class Potato implements Comparable<Potato> {

    public final int id;

    /**
     * Масса
     */
    public final int weight;

    /**
     * Длина
     */
    public final int length;

    /**
     * Ширина
     */
    public final int girth;


    public Potato(int id, int weight, int length, int girth) {
        this.id = id;
        this.weight = weight;
        this.length = length;
        this.girth = girth;
    }

    public int calculateAlpha(Potato potato) {
        return (int) (potato.weight * 0.5
                + potato.length * 0.65
                + potato.girth * 0.80);
    }

    @Override
    public int compareTo(Potato o) {
        int thisAlpha = (int) (this.weight * 0.5 + this.length * 0.65 + this.girth * 0.80);
        return Integer.compare(thisAlpha, calculateAlpha(o));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Potato potato = (Potato) o;
        return id == potato.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Potato{" +
                "id=" + id +
                ", weight=" + weight +
                ", length=" + length +
                ", girth=" + girth +
                '}';
    }
}