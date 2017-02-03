package nl.lakedigital.djfc.commons.json;

public class JsonBijlage {
    private Long id;
    private String bestandsNaam;
    private String url;
    private String tonen;
    private String omschrijving;
    private String datumUpload;
    private String omschrijvingOfBestandsNaam;
    private String omschrijvingOfBestandsNaamBackup;
    private String s3Identificatie;
    private String soortEntiteit;
    private Long entiteitId;
    private Long groepBijlages;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBestandsNaam() {
        return bestandsNaam;
    }

    public void setBestandsNaam(String bestandsNaam) {
        this.bestandsNaam = bestandsNaam;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTonen() {
        return tonen;
    }

    public void setTonen(String tonen) {
        this.tonen = tonen;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getDatumUpload() {
        return datumUpload;
    }

    public void setDatumUpload(String datumUpload) {
        this.datumUpload = datumUpload;
    }

    public String getOmschrijvingOfBestandsNaam() {
        return omschrijvingOfBestandsNaam;
    }

    public void setOmschrijvingOfBestandsNaam(String omschrijvingOfBestandsNaam) {
        this.omschrijvingOfBestandsNaam = omschrijvingOfBestandsNaam;
    }

    public String getOmschrijvingOfBestandsNaamBackup() {
        return omschrijvingOfBestandsNaamBackup;
    }

    public void setOmschrijvingOfBestandsNaamBackup(String omschrijvingOfBestandsNaamBackup) {
        this.omschrijvingOfBestandsNaamBackup = omschrijvingOfBestandsNaamBackup;
    }

    public String getS3Identificatie() {
        return s3Identificatie;
    }

    public void setS3Identificatie(String s3Identificatie) {
        this.s3Identificatie = s3Identificatie;
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

    public Long getGroepBijlages() {
        return groepBijlages;
    }

    public void setGroepBijlages(Long groepBijlages) {
        this.groepBijlages = groepBijlages;
    }
}
