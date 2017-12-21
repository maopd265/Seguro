
public class Cliente 
{
    private String nome; 
    private String cpf; 
    private String nascimento;
    private String Endereco;
    private Seguro seguro;
    private Lista<Seguro> donos = new ListaEncadeada<Seguro>(1000);
    public void incluirUmSeguro(Seguro s)
            throws ObjetoJaExistente
    {
        donos.incluir(s);
    }
    public Cliente()
    {
        this.nome = nome ;
       
    }
    public Seguro getSeguro()
    {
        return seguro;
    }
    
    public void setSeguro(Seguro seguro)
    {
        this.seguro = seguro;
    }
    
    public Cliente(String nome, String cpf, String nascimento, String Endereco){
    this.nome=nome;
    this.cpf=cpf;
    this.nascimento=nascimento;
    this.Endereco=Endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf ;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setData_de_nascimento(String data_de_nascimento)
    {
        this.nascimento = data_de_nascimento ;
    }

    public String getData_de_nascimento()
    {
        return nascimento;
    }

    public void setEndereco(String Endereco)
    {
        this.Endereco = Endereco ;
    }

    public String getEndereco()
    {
        return Endereco;
    }
}