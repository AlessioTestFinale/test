package dto;

public class ContoCorrente {
    public int idConto;
    public String cin;
    public String abi;
    public String cab;
    public String numeroConto;
    public String nomeTitolare;
    public String cognomeTitolare;
    public String codiceFiscaleTitolare;
    public ContoCorrente(int idConto, String cin, String abi, String cab, String numeroConto, String nomeTitolare, String cognomeTitolare, String codiceFiscaleTitolare) {
        this.idConto = idConto;
        this.cin = cin;
        this.abi = abi;
        this.cab = cab;
        this.numeroConto = numeroConto;
        this.nomeTitolare = nomeTitolare;
        this.cognomeTitolare = cognomeTitolare;
        this.codiceFiscaleTitolare = codiceFiscaleTitolare;
    }

    public ContoCorrente(String cin, String abi, String cab, String numeroConto, String nomeTitolare, String cognomeTitolare, String codiceFiscaleTitolare) {
        this.cin = cin;
        this.abi = abi;
        this.cab = cab;
        this.numeroConto = numeroConto;
        this.nomeTitolare = nomeTitolare;
        this.cognomeTitolare = cognomeTitolare;
        this.codiceFiscaleTitolare = codiceFiscaleTitolare;
    }

    public ContoCorrente(String cognomeTitolare) {
    }

    public ContoCorrente() {

    }


    public int getIdConto() {
        return idConto;
    }

    public void setIdConto(int idConto) {
        this.idConto = idConto;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAbi() {
        return abi;
    }

    public void setAbi(String abi) {
        this.abi = abi;
    }

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(String numeroConto) {
        this.numeroConto = numeroConto;
    }

    public String getNomeTitolare() {
        return nomeTitolare;
    }

    public void setNomeTitolare(String nomeTitolare) {
        this.nomeTitolare = nomeTitolare;
    }

    public String getCognomeTitolare() {
        return cognomeTitolare;
    }

    public void setCognomeTitolare(String cognomeTitolare) {
        this.cognomeTitolare = cognomeTitolare;
    }

    public String getCodiceFiscaleTitolare() {
        return codiceFiscaleTitolare;
    }

    public void setCodiceFiscaleTitolare(String codiceFiscaleTitolare) {
        this.codiceFiscaleTitolare = codiceFiscaleTitolare;
    }

    @Override
    public String toString() {
        return "|ContiCorrenti:" + "idConto=" + idConto + ", cin='" + cin + '\'' + ", abi='" + abi + '\'' + ", cab='" + cab + '\'' + ", numeroConto='" + numeroConto + '\'' +
                ", nomeTitolare='" + nomeTitolare + '\'' + ", cognomeTitolare='" + cognomeTitolare + '\'' + ", codiceFiscaleTitolare='" + codiceFiscaleTitolare + '\'' + '|';
    }
}
