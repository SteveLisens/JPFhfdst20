package be.vdab.tienkamper;
import java.util.Objects;

public class Tienkamper implements Comparable<Tienkamper> {
    private String naam;
    private int punten;


    public Tienkamper(String naam, int punten) {
        if (naam == null) {
            throw new IllegalArgumentException("Naam mag niet null zijn.");
        }
        if (punten < 0) {
            throw new IllegalArgumentException("Punten mogen niet negatief zijn.");
        }
        this.naam = naam;
        this.punten = punten;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam == null) {
            throw new IllegalArgumentException("Naam mag niet null zijn.");
        }
        this.naam = naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        if (punten < 0) {
            throw new IllegalArgumentException("Punten mogen niet negatief zijn.");
        }
        this.punten = punten;
    }

    @Override
    public String toString() {
        return "Tienkamper{" +
                "naam='" + naam + '\'' +
                ", punten=" + punten +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tienkamper that = (Tienkamper) o;
        return Objects.equals(naam, that.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam);
    }

    @Override
    public int compareTo(Tienkamper other) {
        return this.naam.compareTo(other.naam);
    }
}
