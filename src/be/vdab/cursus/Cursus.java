package be.vdab.cursus;

import java.util.Objects;

public class Cursus implements Comparable<Cursus> {
    private int cursusNr;
    private String cursusNaam;
    private int prijs;

    public Cursus(int nr, String naam, int prijs) {
        setCursusNr(nr);
        setCursusNaam(naam);
        setPrijs(prijs);
    }

    public int getCursusNr() {
        return cursusNr;
    }

    public final void setCursusNr(int nr) {
        if (nr > 0)
            this.cursusNr = nr;
    }

    public String getCursusNaam() {
        return cursusNaam;
    }

    public final void setCursusNaam(String naam) {
        Objects.requireNonNull(naam);
        if (!(naam.trim().isBlank()))
            this.cursusNaam = naam;
    }

    public int getPrijs() {
        return prijs;
    }

    public final void setPrijs(int prijs) {
        if (prijs > 0)
            this.prijs = prijs;
    }

    @Override
    public String toString() {
        return (cursusNr + " ; " + cursusNaam + " ; " + prijs);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cursus cursus)) {
            return false;
        }
        return cursusNr == cursus.getCursusNr();
    }

    @Override
    public int hashCode() {
        return cursusNr;
    }

    @Override
   public int compareTo(Cursus c) {
        if (this.equals(c))
            return 0;
        else
            return prijs <= c.getPrijs() ? -1 : prijs - c.getPrijs();


        //return cursusNr - c.getCursusNr();
    }
}
