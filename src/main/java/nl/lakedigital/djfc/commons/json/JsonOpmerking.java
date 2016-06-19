package nl.lakedigital.djfc.commons.json;

import java.io.Serializable;

public class JsonOpmerking implements Serializable {
    private static final long serialVersionUID = -2035670222129537280L;

    private Long id;
    private String tijd;
    private String opmerking;
    private String medewerker;
    private Long medewerkerId;
    private String tekstBackup;
    private String soortEntiteit;
    private Long entiteitId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTijd() {
        return tijd;
    }

    public void setTijd(String tijd) {
        this.tijd = tijd;
    }

    public String getOpmerking() {
        return opmerking;
    }

    public void setOpmerking(String opmerking) {
        this.opmerking = opmerking;
    }

    public String getMedewerker() {
        return medewerker;
    }

    public void setMedewerker(String medewerker) {
        this.medewerker = medewerker;
    }

    public Long getMedewerkerId() {
        return medewerkerId;
    }

    public void setMedewerkerId(Long medewerkerId) {
        this.medewerkerId = medewerkerId;
    }

    public String getTekstBackup() {
        return tekstBackup;
    }

    public void setTekstBackup(String tekstBackup) {
        this.tekstBackup = tekstBackup;
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
}
