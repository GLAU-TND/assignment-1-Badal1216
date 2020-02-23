package adt;

public interface ListADT<E> {
    void add(E item);

    E remove();

    int search(E data);

    void sort();
}
