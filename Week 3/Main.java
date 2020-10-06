import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        // Object of a class that has both produce()
        // and consume() methods
        final PC pc = new PC();
        // Create producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        // Start both threads
        t1.start();
        t2.start();
        // t1 finishes before t2
        t1.join();
        t2.join();
    }

    // This class has a list, producer (adds items to list
    // and consumber (removes items).
    public static class PC {
        // Create a list shared by producer and consumer
        // Size of list is 2.
        // LinkedList<Integer> - it’s Java generics. You will learn
        // Java generics in Week 9. For this exercise, you can go to
        // https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html to
        // check useful methods of LinkedList.

        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;
        boolean full = false;
        boolean empty = true;

        // Function called by producer thread
        public void produce() throws InterruptedException {
            // TODO: Add your code here
            if (!full) {
                list.push(1);
                if (list.size() == capacity) {
                    full = true;
                }
                empty = false;
            } else {
                // sleep
            }
            System.out.println(list);
        }
        // Function called by consumer thread
        public void consume() throws InterruptedException {
            // TODO: Add your code here
            if (!empty) {
                list.pop();
                if (list.size() == 0) {
                    empty = true;
                }
                full = false;
            } else {
                // sleep
            }
            System.out.println(list);
        }
    }
}