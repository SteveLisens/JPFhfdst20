package be.vdab.cursus;

import java.util.Set;
import java.util.TreeSet;

public class CursusMain {
    public static void main(String[] args) {

        var cursussen = new TreeSet<Cursus>();
        cursussen.add(new Cursus(5, "Word", 100));
        cursussen.add(new Cursus(3, "Excel", 110));
        cursussen.add(new Cursus(1, "Windows", 90));
        cursussen.add(new Cursus(4, "Access", 120));
        cursussen.add(new Cursus(2, "Powerpoint", 80));
        cursussen.add(new Cursus(6, "Photoshop", 100));

        for (var cursus : cursussen) {
            System.out.println(cursus);
        }
    }
}
