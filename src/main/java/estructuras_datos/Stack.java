/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras_datos;

/**
 *
 * @author rsolano
 */
public class Stack<T> {

    // Nuestro atributos
    private Node<T> top;

    public void push(T value) {

        Node<T> newNode = new Node<T>(value);

        if (top == null) {

            top = newNode;

        } else {

            newNode.setNext(top);

            top = newNode;

        }

    }

    public T pop() {

        Node<T> popped_value = top;

        if (top != null) {

            top = top.getNext();
            return popped_value.getValue();

        } else {

            return null;

        }

    }

    public boolean encuentra(T x) {

        boolean existe = false;

        while (existe != true && top != null) {

            if (x == top.getValue()) {

                existe = true;

            } else {

                top = top.getNext();
            }

        }

        return existe;

    }

}