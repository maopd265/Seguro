import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
/**
 * Escreva a descrição da classe PersistenciaDeObjetos aqui.
 * 
 * @author 
 */
public class PersistenciaDeListas 
{
     public void guarda(ArrayList<Lista> lista)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(
                                        new FileOutputStream("seguradora.obj")))
        {
            oos.writeObject(lista);
        }
        catch(IOException e)
        {}
    }
    
    public ArrayList<Lista> recupera()
    {
        ArrayList<Lista> lista = null ;
        try(ObjectInputStream ois = new ObjectInputStream(
                                        new FileInputStream("seguradora.obj")))
        {
            lista = (ArrayList<Lista>) ois.readObject();
        }
        catch(IOException e){}
        catch(Exception e){}
        
        if(lista == null)
        {
            lista = new ArrayList<Lista>();
            lista.add(new ListaEncadeada<Cliente>(1000));
            lista.add(new ListaEncadeada<Seguro>(1000));
        }
        return lista;
    }
}
