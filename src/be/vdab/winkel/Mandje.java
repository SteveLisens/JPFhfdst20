package be.vdab.winkel;

import java.util.LinkedHashMap;
import java.util.Map;

public class Mandje {
    private final Map<Product, Integer> producten = new LinkedHashMap<>();

    public void add(Product product, int aantal) {
        producten.merge(product, aantal, Integer::sum);
    }

    public void remove(Product product) {
        producten.remove(product);
    }

    public void clear() {
        producten.clear();
    }

    public double getTotalePrijs() {
        return producten.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPrijs() * entry.getValue())
                .sum();
    }

    public void toonMandje() {
        if (producten.isEmpty()) {
            System.out.println("Uw winkelmandje is leeg.");
        } else {
            producten.forEach(((product, aantal) ->
                    System.out.println(product + " x " + aantal + " = €"
                            + (product.getPrijs() * aantal))));
        }
    }

    public boolean bevat(Product product) {
        return producten.containsKey(product);
    }

    public void wijzigAantal(Product product, int nieuwAantal) {
        if (nieuwAantal <= 0) {
            producten.remove(product);
        } else {
            producten.put(product, nieuwAantal);
        }
    }

    public int getTotaalAantalItems() {
        return producten.values().stream().mapToInt(Integer::intValue).sum();
    }
}
