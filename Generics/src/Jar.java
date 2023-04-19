import java.util.ArrayList;
import java.util.List;

public class Jar<T> {
List<T> n = new ArrayList<>();
    public void add(T element)
    {
        n.add(element);
    }
    public T remove(int index)
    {
        return n.remove(index);
    }
    public T get(int index)
    {
        return n.get(index);
    }
}

