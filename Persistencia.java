import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;

public interface Persistencia<T> extends Serializable
{ 
    public void guarda(Lista<T> lista);
    public Lista<T> recupera();
}