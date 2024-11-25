package be.vdab.tienkamper;

import java.util.ArrayList;
import java.util.TreeSet;

public class TienkamperMain {
    public static void main(String[] args) {

        ArrayList<Tienkamper> atleten = new ArrayList<>();
        atleten.add(new Tienkamper("Sven", 8000));
        atleten.add(new Tienkamper("Lisa", 7500));
        atleten.add(new Tienkamper("Bram", 8200));
        atleten.add(new Tienkamper("Anna", 7700));
        atleten.add(new Tienkamper("Lisa", 7500));

        System.out.println("Atleten in ArrayList:");
        for (Tienkamper atleet : atleten) {
            System.out.println(atleet);
        }

        TreeSet<Tienkamper> uniekeAtleten = new TreeSet<>(atleten);

        System.out.println("\nAtleten in TreeSet (gesorteerd en zonder dubbels):");
        for (Tienkamper atleet : uniekeAtleten) {
            System.out.println(atleet);
        }
    }
}
