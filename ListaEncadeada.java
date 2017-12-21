import java.io.Serializable;
/**
 * 
 * 
 * 
 */
public class ListaEncadeada<T> implements Serializable,Lista<T>
{
    private Nodo inicio;
    private Nodo fim;
    private int capacidade;
    private int quantos;

    public ListaEncadeada(int capacidade)
    {
        this.capacidade = capacidade  ;    
    }

    public int getCapacidade()
    {
        return capacidade ;
    }

    /**
     * Inclusão na última posição disponível na lista de clientes.
     * 
     * @author Maurício Zalamena Bavaresco 
     * @version 4.0 09 de novembro de 2017
     */
    public int incluir(T obj) throws ObjetoJaExistente
    {
        if(this.pesquisa(obj)==null)
        {
            Nodo temp = new Nodo();
            temp.setInfo(obj);
            if(quantos==0)
            {
                inicio = fim = temp;
            }
            else
            {
                fim.setProx(temp);
                fim = temp;
            }
            quantos++;
            return quantos;
        }
        else
        {
            throw new ObjetoJaExistente();

        }
    }

        /**
         * Inclusão inicial.
         * 
         * @author Maurício Zalamena Bavaresco 
         * @version 4.0 09 de novembro de 2017
         */
        public int incluirInicial(T obj)
        {
        Nodo temp = new Nodo();
        temp.setInfo(obj);
        temp.setProx(inicio);
        inicio = temp;
        if (fim==null)
        {
            fim = temp;
        }
        quantos++;
        return 0;
    }

    public int tamanho()
    {
        return quantos;
    }

    /**
     * Este método é para percorrer a lista.
     * 
     * @author Maurício Zalamena Bavaresco
     * @version 20 de dezembro de 2017
     */
    public T get(int indice)
    {
        if((indice>=0) && (indice<quantos))
        {
            Nodo temp = inicio;
            for(int i=0;i<indice;i++)
            {
                temp=temp.getProx();
            }
            return temp.getInfo();
        }
        return null;
    }

    public T pesquisa(T obj)
    {
        if(quantos>0)
        {   
            Nodo temp = inicio;
            while(temp != null)
            {
                if(obj.equals(temp.getInfo()))
                {
                    return temp.getInfo();
                }
                temp = temp.getProx();
            }
        }
        return null;
    }

    public class Nodo implements Serializable
    {
        private Nodo prox;
        private T info;
        public Nodo()
        {
        }

        public void setProx(Nodo prox)
        {
            this.prox = prox;
        }

        public Nodo getProx()
        {
            return prox;
        }

        public void setInfo(T info)
        {
            this.info = info;
        }

        public T getInfo()
        {
            return info;
        }
    }
}

