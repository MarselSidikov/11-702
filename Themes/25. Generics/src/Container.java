/**
 * 20.02.2018
 * Container
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface Container<T> {
    void put(T value);
    T get();
}
