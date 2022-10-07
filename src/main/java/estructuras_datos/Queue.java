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

}
