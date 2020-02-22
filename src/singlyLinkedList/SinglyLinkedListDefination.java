package singlyLinkedList;

import ADT.LinkedListADT;

public class SinglyLinkedListDefination<E> implements LinkedListADT<E> {
    private Node<E> head =null;
    private  int size =0;
    private Node<E> getNode(int index) {
        Node<E> response = null;
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        else{
            Node<E> temp = head;
            for (int i = 0; i < index && temp !=null; i++) {
                temp = temp.getNext();

            }
            response = temp;
        }

        return response;
    }
    private void addFirst(E item) {
        head = new Node<>(item,head);
        size++;

    }





    @Override
    public void add(E item) {

    }

    @Override
    public E remove(E item) {
        return null;
    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }
    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private Node(E data) {
            this.data = data;
        }

        private E getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }
    }

}
