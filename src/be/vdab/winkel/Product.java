package be.vdab.winkel;

import java.util.Objects;

public class Product {
    private String omschrijving;
    private double prijs;

    public Product(String omschrijving, double prijs) {
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(omschrijving, product.omschrijving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(omschrijving);
    }

    @Override
    public String toString() {
        return omschrijving + "(€" + prijs + ")";
    }
}
