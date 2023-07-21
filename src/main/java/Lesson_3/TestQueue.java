package Lesson_3;

import Lesson_3.queue.Queue;
import Lesson_3.queue.QueueImpl;



public class TestQueue {
    public static void main(String[] args) {

        testQueue();
    }



    private static void testQueue() {

        Queue<Integer> queue = new QueueImpl<>(8);

        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));

        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("add element: " + queue.insert(17));
        queue.display();
        System.out.println("add element: " + queue.insert(120));
        queue.display();
        System.out.println("add element: " + queue.insert(11));
        queue.display();
        System.out.println("add element: " + queue.insert(19));
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();

        System.out.println("add element: " + queue.insert(19));
        queue.display();
        System.out.println("add element: " + queue.insert(19));
        queue.display();

    }

}
