/**
 
 */
public  abstract class  Seguro

{
    protected String numeroApolice;
    protected Cliente titular;
    protected String Data;
    protected double valorSeguro; 

    public Seguro(String numeroApolice, String Data, double valorSeguro, Cliente titular)
    {
        this.numeroApolice=numeroApolice;
        this.Data=Data;
        this.valorSeguro=valorSeguro;
        this.titular=titular;

    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular.setNome(titular) ;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

}
