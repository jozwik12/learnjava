package com.javaudemy.misc;

public class DefaultMyList<E> implements MyList<E>{

    private int size = 0;

    private Node<E> first;

    private Node<E> last;


    public DefaultMyList(){
    }

    @Override
    public void add(E e) {
        size++;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean remove(E o) {
        size--;
        return false;
    }

    @Override
    public E[] toArray() {
        return new E[0];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E o) {
        return false;
    }

    @Override
    public boolean containsAll(MyList c) {
        return false;
    }

    /*
    Node nested class
     */
    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> previous;


        //Node constructor
        Node(Node<E> previous, E data, Node<E> next) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }

}
