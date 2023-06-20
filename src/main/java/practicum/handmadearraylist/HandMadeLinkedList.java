package practicum.handmadearraylist;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.NoSuchElementException;

public class HandMadeLinkedList<T> {

    class Node<E> {
        public E data;
        public Node<E> next;
        public Node<E> prev;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }


    /**
     * Указатель на первый элемент списка. Он же first
     */
    private Node<T> head;

    /**
     * Указатель на последний элемент списка. Он же last
     */
    private Node<T> tail;

    private int size = 0;

    public void addFirst(T element) {
        final Node<T> oldHead = head;
        final Node<T> newNode = new Node<>(null, element, oldHead);
        head = newNode;
        if (oldHead == null)
            tail = newNode;
        else
            oldHead.prev = newNode;
        size++;
    }

    public T getFirst() {
        final Node<T> curHead = head;
        if (curHead == null)
            throw new NoSuchElementException();
        return head.data;
    }

    public void addLast(T element) {
        final Node<T> oldTail = tail;
        final Node<T> newNode = new Node<>(tail, element, null);
        tail = newNode;
        if (oldTail != null)
            oldTail.next = newNode;
        else head = newNode;
        size++;
    }

    public T getLast() {
        final Node<T> curTail = tail;
        if (curTail == null)
            throw new NoSuchElementException();
        return tail.data;
    }

    public int size() {
        return this.size;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        HandMadeLinkedList<Integer> integers = new HandMadeLinkedList<>();

        integers.addFirst(1);
        integers.addFirst(2);
        integers.addFirst(3);
        integers.addLast(4);
        integers.addLast(5);
        integers.addFirst(1);

        System.out.println(integers.getFirst());
        System.out.println(integers.size());
        System.out.println(integers.getLast());
        System.out.println(integers.size());

        String str = "{\"time\":1687275515,\"token1\":\"bet\"}";
        str = str + "SECRET";

        byte[] strToByte = str.getBytes();
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] MD5 = md.digest(strToByte);

        byte[] base64 = (Base64.getEncoder().encode(MD5));
        System.out.println(new String(base64)); // gXV/2OnfIuNU233U2VthoQ==
    }
}
