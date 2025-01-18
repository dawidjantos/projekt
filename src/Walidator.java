public interface Walidator<T> {
    void walidacja(T data) throws WalidatorException;
}
