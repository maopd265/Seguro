import java.io.Serializable;

public interface Lista<T> extends Serializable 
{
    public int getCapacidade();
    public int incluir(T obj) throws ObjetoJaExistente;
        
    public int tamanho();
    public T get(int indice);
    public T pesquisa(T obj);
}
