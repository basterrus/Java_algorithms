package Lesson_3;


import Lesson_3.Deque.Deque;
import Lesson_3.Deque.DequeImpl;

public class DequeTest {
    public static void main(String[] args) {
        testDeue();
    }

    private static void testDeue() {

        Deque<Integer> deque = new DequeImpl<>(12);
        System.out.println("add Left: " + deque.insertLeft(1));
        deque.display();
        System.out.println("add Right: " + deque.insertRight(2));
        deque.display();
        System.out.println("add Right: " + deque.insertRight(3));
        deque.display();
        System.out.println("add Left: " + deque.insertLeft(4));
        deque.display();
        System.out.println("add Left: " + deque.insertLeft(5));
        deque.display();
        System.out.println("add Left: " + deque.insertLeft(6));
        deque.display();

        System.out.println("remove left: " + deque.removeLeft());
        deque.display();
        System.out.println("remove left: " + deque.removeLeft());
        deque.display();
        System.out.println("remove left: " + deque.removeLeft());
        deque.display();
        System.out.println("remove left: " + deque.removeLeft());
        deque.display();
        System.out.println("remove left: " + deque.removeLeft());
        deque.display();
        System.out.println("remove left: " + deque.removeLeft());
        deque.display();
        System.out.println("remove left: " + deque.removeLeft());
        deque.display();

        System.out.println("-----------------");
        System.out.println("add Right: " + deque.insertRight(7));
        deque.display();
        System.out.println("add Right: " + deque.insertRight(8));
        deque.display();
        System.out.println("add Right: " + deque.insertRight(9));
        deque.display();
        System.out.println("add Left: " + deque.insertLeft(10));
        deque.display();
        System.out.println("add Left: " + deque.insertLeft(11));
        deque.display();
        System.out.println("add Left: " + deque.insertLeft(12));
        deque.display();

        System.out.println("-----------------");
        System.out.println("remove right: " + deque.removeRight());
        deque.display();
        System.out.println("remove right: " + deque.removeRight());
        deque.display();
        System.out.println("remove right: " + deque.removeRight());
        deque.display();
        System.out.println("remove right: " + deque.removeRight());
        deque.display();
        System.out.println("remove right: " + deque.removeRight());
        deque.display();
        System.out.println("remove right: " + deque.removeRight());
        deque.display();
        System.out.println("remove right: " + deque.removeRight());
        deque.display();
    }
}
