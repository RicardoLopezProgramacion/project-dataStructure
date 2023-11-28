package com.github.RicardoLopezProgramacion.projectDataStructure.model.list.circularDoublyLinkedList;

import com.github.RicardoLopezProgramacion.projectDataStructure.model.user.User;

public class Node {

    Node back;
    Node next;
    User user;
    public Node(User user, Node back, Node next) {
        this.user = user;
        this.back = back;
        this.next = next;
    }

    public Node getBack() {
        return back;
    }

    public void setBack(Node back) {
        this.back = back;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
