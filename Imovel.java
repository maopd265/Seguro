

public class Imovel extends Seguro
{
    protected String dataDeConstrucao;
    // valor do seguro e a data de validade do seguro
    //Para apólices de seguro de automóveis e residências,
    //é necessário registrar a franquia.

    
    public Imovel(String dataDeConstrucao, String numeroApolice, String Data, double valorSeguro, Cliente titular)
    {
        super(numeroApolice, Data, valorSeguro,titular);
        this.dataDeConstrucao=dataDeConstrucao;
    }

    public void setdataDeConstrucao(String  dataDeConstrucao) {
        this.dataDeConstrucao= dataDeConstrucao;
    }
    public String getdataDeConstrucao(String dataDeConstrucao) {
        return dataDeConstrucao;
    }
        public String toString(){
        return "Tipo do seguro: Imovel";
    }

}
