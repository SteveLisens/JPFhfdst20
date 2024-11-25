package be.vdab;

import be.vdab.land.Land;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LandMain {
    public static void main(String[] args) {
        ArrayList<Land> landen = new ArrayList<>();

        landen.add(new Land("BE", "België", "Brussel", new BigInteger("11500000"), new BigDecimal("30528")));
        landen.add(new Land("NL", "Nederland", "Amsterdam", new BigInteger("17697431"), new BigDecimal("41543")));
        landen.add(new Land("AU", "Australië", "Canberra", new BigInteger("25948163"), new BigDecimal("7692024")));
        landen.add(new Land("CA", "Canada", "Ottawa", new BigInteger("38436447"), new BigDecimal("9984670")));
        landen.add(new Land("FR", "Frankrijk", "Parijs", new BigInteger("67813000"), new BigDecimal("554500")));
        landen.add(new Land("GR", "Griekenland", "Athene", new BigInteger("10678632"), new BigDecimal("131957")));
        landen.add(new Land("JP", "Japan", "Tokio", new BigInteger("125470000"), new BigDecimal("377930")));
        landen.add(new Land("IT", "Italië", "Rome", new BigInteger("59045521"), new BigDecimal("301339")));
        landen.add(new Land("HR", "Kroatië", "Zagreb", new BigInteger("3888529"), new BigDecimal("56538")));
        landen.add(new Land("UA", "Oekraine", "Kiev", new BigInteger("41208106"), new BigDecimal("603500")));

        System.out.println("Landen en hun bevolkingsdichtheid:");
        for (Land land : landen) {
            System.out.printf("%s (%s): %.2f inwoners/km²%n",
                    land.getLandNaam(), land.getHoofdstad(), land.getBevolkingsdichtheid());
        }

        BigDecimal totaalDichtheid = BigDecimal.ZERO;
        for (Land land : landen) {
            totaalDichtheid = totaalDichtheid.add(land.getBevolkingsdichtheid());
        }
        BigDecimal gemiddeldeDichtheid = totaalDichtheid.divide(BigDecimal.valueOf(landen.size()), 2, BigDecimal.ROUND_HALF_UP);

        System.out.printf("%nGemiddelde bevolkingsdichtheid: %.2f inwoners/km²%n", gemiddeldeDichtheid);

        Land dichtstBijGemiddeld = null;
        BigDecimal kleinsteVerschil = null;

        for (Land land : landen) {
            BigDecimal verschil = land.getBevolkingsdichtheid().subtract(gemiddeldeDichtheid).abs();
            if (kleinsteVerschil == null || verschil.compareTo(kleinsteVerschil) < 0) {
                kleinsteVerschil = verschil;
                dichtstBijGemiddeld = land;
            }
        }

        if (dichtstBijGemiddeld != null) {
            System.out.printf("Land met bevolkingsdichtheid dichtst bij het gemiddelde: %s (%s) met %.2f inwoners/km²%n",
                    dichtstBijGemiddeld.getLandNaam(), dichtstBijGemiddeld.getHoofdstad(),
                    dichtstBijGemiddeld.getBevolkingsdichtheid());
        }
    }
}