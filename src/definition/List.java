package definition;

import adt.ListADT;

public class List<E> implements ListADT<E> {


    private Node<E> head = null;

    private int size = 0;

    private void addFirst(E item) {
        head = new Node<E>(item, head);
        size++;
    }

    private void addAfter(Node<E> node, E item) {
        node.next = new Node<E>(item, node.next);
        size++;
    }

    public void add(int index, E item) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(Integer.toString(index));
        else if (index == 0) {
            addFirst(item);
        } else
            Node<E> temp = getNode(index - 1);

    }

    private Node<E> getNode(int index) {
        Node<E> response = head;
        for (int i = 0; i < index; i++) {
            response = response.next;
        }
        return response;
    }


    @Override
    public boolean add(E item) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int search(E data) {
        return 0;
    }

    @Override
    public void sort() {

    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }


    }
}
