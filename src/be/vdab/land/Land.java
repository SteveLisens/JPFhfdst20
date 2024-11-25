package be.vdab.land;

import be.vdab.util.LandException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Land {
    private String landCode, landNaam, hoofdstad;
    private BigInteger aantalInwoners;
    private BigDecimal oppervlakte;

    public Land(String landCode, String landNaam, String hoofdstad, BigInteger aantalInwoners, BigDecimal oppervlakte) {
        if (landCode == null || landCode.isEmpty() || landNaam == null || landNaam.isEmpty() || hoofdstad == null || hoofdstad.isEmpty()) {
            throw new LandException("De landcode, landnaam en hoofdstad mogen niet leeg zijn.");
        }
        if (aantalInwoners.compareTo(BigInteger.ZERO) <= 0) {
            throw new LandException("Aantal inwoners moet meer dan 0 zijn.");
        }
        if (oppervlakte.compareTo(BigDecimal.ZERO) <= 0) {
            throw new LandException("Oppervlakte mag niet 0 zijn.");
        }
        this.landCode = landCode;
        this.landNaam = landNaam;
        this.hoofdstad = hoofdstad;
        this.aantalInwoners = aantalInwoners;
        this.oppervlakte = oppervlakte;
    }

    public String getLandCode() {
        return landCode;
    }

    public String getLandNaam() {
        return landNaam;
    }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public BigInteger getAantalInwoners() {
        return aantalInwoners;
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public void setLandCode(String landCode) {
        if (landCode == null || landCode.isEmpty()) {
            throw new LandException("De landcode mag niet leeg zijn.");
        }
        this.landCode = landCode;
    }

    public void setLandNaam(String landNaam) {
        if (landNaam == null || landNaam.isEmpty()) {
            throw new LandException("De landnaam mag niet leeg zijn.");
        }
        this.landNaam = landNaam;
    }

    public void setHoofdstad(String hoofdstad) {
        if (hoofdstad == null || hoofdstad.isEmpty()) {
            throw new LandException("De hoofdstad man niet leeg zijn.");
        }
        this.hoofdstad = hoofdstad;
    }

    public void setAantalInwoners(BigInteger aantalInwoners) {
        if (aantalInwoners.compareTo(BigInteger.ZERO) <= 0) {
            throw new LandException("Het aantal inwoners mag niet 0 zijn.");
        }
        this.aantalInwoners = aantalInwoners;
    }

    public void setOppervlakte(BigDecimal oppervlakte) {
        if (oppervlakte.compareTo(BigDecimal.ZERO) <= 0) {
            throw new LandException("De oppervlakte mag niet 0 zijn.");
        }
        this.oppervlakte = oppervlakte;
    }

    public BigDecimal getBevolkingsdichtheid() {
        return new BigDecimal(aantalInwoners).divide(oppervlakte, 2, BigDecimal.ROUND_HALF_UP);
    }
}














