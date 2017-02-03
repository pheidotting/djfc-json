package nl.lakedigital.djfc.commons.json;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class JsonPolis {
    private Long id;
    private String status;
    private String polisNummer;
    private String kenmerk;
    private String ingangsDatum;
    private String eindDatum;
    private String premie;
    private String wijzigingsDatum;
    private String prolongatieDatum;
    private String betaalfrequentie;
    private String dekking;
    private String verzekerdeZaak;
    //    private List<JsonOpmerking> opmerkingen;
    private String maatschappij;
    private String soort;
    private List<JsonBijlage> bijlages;
    //    private String bedrijf;
    //    private Long bedrijfsId;
    private String idDiv;
    private String idDivLink;
    private String className;
    private List<JsonSchade> schades;
    //    private String relatie;
    private String titel;
    private String omschrijvingVerzekering;
    private List<String> errors;
    private String soortEntiteit;
    private Long entiteitId;
    //    private JsonOpmerkingenModel opmerkingenModel;
    private String readOnly;
    private String notReadOnly;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPolisNummer() {
        return polisNummer;
    }

    public void setPolisNummer(String polisNummer) {
        this.polisNummer = polisNummer;
    }

    public String getKenmerk() {
        return kenmerk;
    }

    public void setKenmerk(String kenmerk) {
        this.kenmerk = kenmerk;
    }

    public String getIngangsDatum() {
        return ingangsDatum;
    }

    public void setIngangsDatum(String ingangsDatum) {
        this.ingangsDatum = ingangsDatum;
    }

    public String getEindDatum() {
        return eindDatum;
    }

    public void setEindDatum(String eindDatum) {
        this.eindDatum = eindDatum;
    }

    public String getPremie() {
        return premie;
    }

    public void setPremie(String premie) {
        this.premie = premie;
    }

    public String getWijzigingsDatum() {
        return wijzigingsDatum;
    }

    public void setWijzigingsDatum(String wijzigingsDatum) {
        this.wijzigingsDatum = wijzigingsDatum;
    }

    public String getProlongatieDatum() {
        return prolongatieDatum;
    }

    public void setProlongatieDatum(String prolongatieDatum) {
        this.prolongatieDatum = prolongatieDatum;
    }

    public String getBetaalfrequentie() {
        return betaalfrequentie;
    }

    public void setBetaalfrequentie(String betaalfrequentie) {
        this.betaalfrequentie = betaalfrequentie;
    }

    public String getDekking() {
        return dekking;
    }

    public void setDekking(String dekking) {
        this.dekking = dekking;
    }

    public String getVerzekerdeZaak() {
        return verzekerdeZaak;
    }

    public void setVerzekerdeZaak(String verzekerdeZaak) {
        this.verzekerdeZaak = verzekerdeZaak;
    }

    //    public List<JsonOpmerking> getOpmerkingen() {
    //        if (opmerkingen == null) {
    //            opmerkingen = new ArrayList<JsonOpmerking>();
    //        }
    //        return opmerkingen;
    //    }
    //
    //    public void setOpmerkingen(List<JsonOpmerking> opmerkingen) {
    //        this.opmerkingen = opmerkingen;
    //    }

    public String getMaatschappij() {
        return maatschappij;
    }

    public void setMaatschappij(String maatschappij) {
        this.maatschappij = maatschappij;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public List<JsonBijlage> getBijlages() {
        if (bijlages == null) {
            bijlages = new ArrayList<>();
        }
        return bijlages;
    }

    public void setBijlages(List<JsonBijlage> bijlages) {
        this.bijlages = bijlages;
    }

    //    public String getBedrijf() {
    //        return bedrijf;
    //    }
    //
    //    public void setBedrijf(String bedrijf) {
    //        this.bedrijf = bedrijf;
    //    }
    //
    //    public Long getBedrijfsId() {
    //        return bedrijfsId;
    //    }
    //
    //    public void setBedrijfsId(Long bedrijfsId) {
    //        this.bedrijfsId = bedrijfsId;
    //    }
    //
    public List<JsonSchade> getSchades() {
        if (schades == null) {
            schades = new ArrayList<JsonSchade>();
        }
        return schades;
    }

    public void setSchades(List<JsonSchade> schades) {
        this.schades = schades;
    }

    public String getIdDiv() {
        return idDiv;
    }

    public void setIdDiv(String idDiv) {
        this.idDiv = idDiv;
    }

    public String getIdDivLink() {
        return idDivLink;
    }

    public void setIdDivLink(String idDivLink) {
        this.idDivLink = idDivLink;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    //    public String getRelatie() {
    //        return relatie;
    //    }
    //
    //    public void setRelatie(String relatie) {
    //        this.relatie = relatie;
    //    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOmschrijvingVerzekering() {
        return omschrijvingVerzekering;
    }

    public void setOmschrijvingVerzekering(String omschrijvingVerzekering) {
        this.omschrijvingVerzekering = omschrijvingVerzekering;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public String getSoortEntiteit() {
        return soortEntiteit;
    }

    public void setSoortEntiteit(String soortEntiteit) {
        this.soortEntiteit = soortEntiteit;
    }

    public Long getEntiteitId() {
        return entiteitId;
    }

    public void setEntiteitId(Long entiteitId) {
        this.entiteitId = entiteitId;
    }

    //    public JsonOpmerkingenModel getOpmerkingenModel() {
    //        if (opmerkingenModel == null) {
    //            opmerkingenModel = new JsonOpmerkingenModel();
    //        }
    //        return opmerkingenModel;
    //    }
    //
    //    public void setOpmerkingenModel(JsonOpmerkingenModel opmerkingenModel) {
    //        this.opmerkingenModel = opmerkingenModel;
    //    }

    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly;
    }

    public String getNotReadOnly() {
        return notReadOnly;
    }

    public void setNotReadOnly(String notReadOnly) {
        this.notReadOnly = notReadOnly;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(betaalfrequentie).append(className).append(id).append(idDiv).append(idDivLink).append(ingangsDatum).append(maatschappij).append(polisNummer).append(premie).append(prolongatieDatum).append(soort).append(wijzigingsDatum).toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        JsonPolis other = (JsonPolis) obj;

        return new EqualsBuilder().append(betaalfrequentie, other.betaalfrequentie).append(className, other.className).append(id, other.id).append(idDiv, other.idDiv).append(idDivLink, other.idDivLink).append(ingangsDatum, other.ingangsDatum).append(maatschappij, other.maatschappij).append(polisNummer, other.polisNummer).append(premie, other.premie).append(prolongatieDatum, other.prolongatieDatum).append(soort, other.soort).append(wijzigingsDatum, other.wijzigingsDatum).isEquals();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nJsonPolis [id=").append(id);
        builder.append(", polisNummer=").append(polisNummer);
        builder.append(", ingangsDatum=").append(ingangsDatum);
        builder.append(", premie=").append(premie);
        builder.append(", wijzigingsDatum=").append(wijzigingsDatum);
        builder.append(", prolongatieDatum=").append(prolongatieDatum);
        builder.append(", betaalfrequentie=").append(betaalfrequentie);
        //        builder.append(", opmerkingen=").append(opmerkingen);
        builder.append(", maatschappij=").append(maatschappij);
        builder.append(", soort=").append(soort);
        //        builder.append(", bedrijf=").append(bedrijf);
        builder.append(", idDiv=").append(idDiv);
        builder.append(", idDivLink=").append(idDivLink);
        builder.append(", className=").append(className);
        //        builder.append(", relatie=").append(relatie);
        builder.append("]");
        return builder.toString();
    }

}