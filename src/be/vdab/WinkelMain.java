package be.vdab;

import be.vdab.winkel.Mandje;
import be.vdab.winkel.Product;
import be.vdab.winkel.Catalogus;

public class WinkelMain {
    public static void main(String[] args) {
        var catalogus = new Catalogus();
        var mandje = new Mandje();

        Product appel = catalogus.getProducten().stream().filter(p -> p.getOmschrijving().equals("Appel")).findFirst().orElse(null);
        Product banaan = catalogus.getProducten().stream().filter(p -> p.getOmschrijving().equals("Banaan")).findFirst().orElse(null);
        Product peer = catalogus.getProducten().stream().filter(p -> p.getOmschrijving().equals("Peer")).findFirst().orElse(null);
        Product komkommer = catalogus.getProducten().stream().filter(p -> p.getOmschrijving().equals("Komkommer")).findFirst().orElse(null);
        Product eieren = catalogus.getProducten().stream().filter(p -> p.getOmschrijving().equals("Eieren")).findFirst().orElse(null);
        Product kipfilet = catalogus.getProducten().stream().filter(p -> p.getOmschrijving().equals("Kipfilet")).findFirst().orElse(null);

        mandje.add(appel, 4);
        mandje.add(banaan, 2);
        mandje.add(peer, 4);
        mandje.add(komkommer, 1);
        mandje.add(eieren, 2);
        mandje.add(kipfilet, 1);

        System.out.println("Inhoud van uw mandje : ");
        mandje.toonMandje();

        System.out.println("Totaal te betalen : €" + mandje.getTotalePrijs());

        mandje.remove(komkommer);
        System.out.println("\nNa het verwijderen van de komkommer:");
        mandje.toonMandje();
        System.out.println("Uw nieuw totaalbedrag : €" + mandje.getTotalePrijs());

        System.out.println("\nBevat het mandje bananen? " + mandje.bevat(banaan));

        System.out.println("\nWijzig aantal bananen naar 5.");
        mandje.wijzigAantal(banaan, 5);
        mandje.toonMandje();
        System.out.println("Uw nieuw totaalbedrag : €" + mandje.getTotalePrijs());

        System.out.println("\nTotaal aantal items in het mandje: " + mandje.getTotaalAantalItems());

        mandje.clear();
        System.out.println("\nNa het leegmaken van het mandje:");
        mandje.toonMandje();
    }
}
