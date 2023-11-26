package com.github.RicardoLopezProgramacion.projectDataStructure.model.list.circularLinkedList;

import com.github.RicardoLopezProgramacion.projectDataStructure.model.user.User;

import javax.swing.*;

public class CircularLinkedList {

    Node head;
    Node tail;

    public CircularLinkedList() {
        head = tail = null;
    }
    public boolean isEmpty() {
        return head == null && tail == null;
    }
    public void insertFirstNode(User user) {
        if(!isEmpty()) {
            head.setBack(new Node(user, tail, head));
            head = head.getBack();
            tail.setNext(head);
        }else {
            head = tail = new Node(user, tail, head);
        }
    }
    public void insertNode(User user) {
        if(!isEmpty()) {
            tail.setNext(new Node(user, tail, head));
            tail = tail.getNext();
            head.setBack(tail);
        }else {insertFirstNode(user);}
    }
    public void deleteFirstNode() {
        if(!isEmpty()) {
            head = head.getNext();
            head.setBack(tail);
            tail.setNext(head);
        }else {
            JOptionPane.showMessageDialog(null, "not enough nodes");
        }
    }
    public String mostrar() {
        if(!isEmpty()) {
            if(head == tail) {
                return head.getUser().toString();
            }
            Node aux = head;
            String resumen = "";
            do{
                resumen += aux.getUser().toString()+"\n";
                aux = aux.getNext();
            }while(aux != head);
      return resumen;
        }
        return "nada";
    }


}
