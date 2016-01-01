package nl.lakedigital.djfc.commons.json;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class JsonAdres {
    private static final long serialVersionUID = 2361944992062349932L;

    private Long id;
    private String straat;
    private Long huisnummer;
    private String toevoeging;
    private String postcode;
    private String plaats;
    private String soortAdres;
    private String relatie;
    private String bedrijf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public Long getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(Long huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getToevoeging() {
        return toevoeging;
    }

    public void setToevoeging(String toevoeging) {
        this.toevoeging = toevoeging;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String getSoortAdres() {
        return soortAdres;
    }

    public void setSoortAdres(String soortAdres) {
        this.soortAdres = soortAdres;
    }

    public String getRelatie() {
        return relatie;
    }

    public void setRelatie(String relatie) {
        this.relatie = relatie;
    }

    public String getBedrijf() {
        return bedrijf;
    }

    public void setBedrijf(String bedrijf) {
        this.bedrijf = bedrijf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof JsonAdres)) {
            return false;
        }

        JsonAdres jsonAdres = (JsonAdres) o;

        return new EqualsBuilder().append(getId(), jsonAdres.getId()).append(getStraat(), jsonAdres.getStraat()).append(getHuisnummer(), jsonAdres.getHuisnummer()).append(getToevoeging(), jsonAdres.getToevoeging()).append(getPostcode(), jsonAdres.getPostcode()).append(getPlaats(), jsonAdres.getPlaats()).append(getSoortAdres(), jsonAdres.getSoortAdres()).append(getRelatie(), jsonAdres.getRelatie()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getId()).append(getStraat()).append(getHuisnummer()).append(getToevoeging()).append(getPostcode()).append(getPlaats()).append(getSoortAdres()).append(getRelatie()).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("straat", straat).append("huisnummer", huisnummer).append("toevoeging", toevoeging).append("postcode", postcode).append("plaats", plaats).append("soortAdres", soortAdres).append("relatie", relatie).toString();
    }
}
