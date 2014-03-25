package jdbm;

/**
 * After deserialization, allow instance tweaking or even replacing
 * @author Predrag Knezevic
 */
public interface ObjectResolver<E> {

    public E resolveObject(E object);
}
