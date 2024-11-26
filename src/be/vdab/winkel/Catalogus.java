package be.vdab.winkel;

import java.util.HashSet;
import java.util.Set;

public class Catalogus {
    private final Set<Product> producten = new HashSet<>();

    public Catalogus() {
        producten.add(new Product("Appel", 0.50));
        producten.add(new Product("Peer", 0.60));
        producten.add(new Product("Banaan", 0.75));
        producten.add(new Product("Citroen", 0.35));
        producten.add(new Product("Eieren", 1.50));
        producten.add(new Product("Komkommer", 1.10));
        producten.add(new Product("Paprika", 0.65));
        producten.add(new Product("Wortellen", 2.50));
        producten.add(new Product("Kipfilet", 3.00));
        producten.add(new Product("Hesp", 2.85));
    }

    public Set<Product> getProducten() {
        return producten;
    }
}
