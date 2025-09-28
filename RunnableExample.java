package Com.Thread;

class MyRunnable implements Runnable {
    private String taskName;

    public MyRunnable(String name) {
        this.taskName = name;
    }
    
    @Override
    public void run() {
        System.out.println("Starting task: " + taskName);
        try {
            // Simulate a task by making the thread sleep
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
        System.out.println("Finished task: " + taskName);
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        // 3. Create instances of the runnable class
        MyRunnable task1 = new MyRunnable("Task 1");
        MyRunnable task2 = new MyRunnable("Task 2");

        // 4. Create Thread objects and pass the runnable instances
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // 5. Start the threads. This invokes the run() method in a new thread.
        thread1.start();
        thread2.start();

        System.out.println("Main thread finished.");
    }
}
