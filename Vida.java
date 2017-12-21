public class Vida extends Seguro
{
    protected int NumeroDependentes;

    /*public Vida(String numeroApolice, String Data, double valorSeguro,Cliente titular){
        this.NumeroDependentes=NumeroDependentes;
    }*/

    public  Vida(String numeroApolice, String Data, double valorSeguro,Cliente titular,int numeroDependentes)
    {
        super(numeroApolice, Data, valorSeguro,titular);
        this.NumeroDependentes=numeroDependentes;
    }

    public void Vida(int NumeroDependentes)
    {
        this.NumeroDependentes=NumeroDependentes;
    }

    public void setNumeroDependentes(int  NumeroDependentes) {
        this.NumeroDependentes = NumeroDependentes;
    }

    public int getNumeroDependentes(int  NumeroDependentes) {
        return NumeroDependentes;
    }

    public String toString(){
        return "Tipo do seguro: Vida";
    }
}
