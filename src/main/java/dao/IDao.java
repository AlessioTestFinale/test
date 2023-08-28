package dao;
import java.util.List;
public interface IDao<T,S>{
    List<T> findByTextCognome(S text);
    List<T> findByTextCodiceFiscale(S text);
    T add(T elemento);

}
