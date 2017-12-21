public class Automovel extends Seguro
{
    protected String placaDoCarro;
    protected String estado;
    protected String modeloDoCarro;
    protected String numeroDaLicenca;
    protected String anoDoCarro;
    public  Automovel(String placaDoCarro,String estado,String modeloDoCarro,String numeroDaLicenca, String anoDoCarro,String numeroApolice,String Data, double valorSeguro, Cliente titular)
    {
    super(numeroApolice, Data, valorSeguro, titular);
    this.placaDoCarro=placaDoCarro;
    this.estado=estado;
    this.modeloDoCarro=modeloDoCarro;
    this.numeroDaLicenca=numeroDaLicenca;
    this.anoDoCarro=anoDoCarro;
    
    }
    public String getPlacaDoCarro() {
        return placaDoCarro;
    }

    public void setPlacaDoCarro(String placaDoCarro) {
        this.placaDoCarro = placaDoCarro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public String getNumeroDaLicenca() {
        return numeroDaLicenca;
    }

    public void setNumeroDaLicenca(String numeroDaLicenca) {
        this.numeroDaLicenca = numeroDaLicenca;
    }

    public String getAnoDoCarro() {
        return anoDoCarro;
    }

    public void setAnoDoCarro(String anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }
        public String toString(){
        return "Tipo do seguro: Automóvel";
    }


}
