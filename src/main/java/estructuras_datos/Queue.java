/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras_datos;

/**
 *
 * @author rsolano
 */
public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    public void enqueue(T value) {

        Node<T> newNode = new Node<T>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {

            tail.setNext(newNode);
            tail = newNode;

        }

    }

    public Node<T> dequeue() {

        if (head == null) {

            System.out.println("La cola esta vacia");
            return null;

        } else {

            Node<T> firsInQueue = head;
            head = head.getNext();
            return firsInQueue;

        }
    }

    public Node<T> findByIndex(int i) {

        if (head == null) {

            System.out.println("La cola esta vacia");
            return null;

        } else {

            Node<T> temp = head;

            while (!temp.getNext().equals(null) && i != 0) {

                temp = temp.getNext();
                i--;

            }

            if (i == 0) {
                return temp;

            } else {
                System.out.println("La cola no tiene tantos valores");
                return null;

            }

        }

    }

}
