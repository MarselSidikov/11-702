/**
 * 20.02.2018
 * Box
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Box<V> implements Container<V> {

    private V value;

    @Override
    public void put(V value) {
        this.value = value;
    }

    @Override
    public V get() {
        return value;
    }
}
