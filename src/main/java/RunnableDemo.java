public class RunnableDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Anonymous class");
            }
        }).start();


        //Lambda always work with :Single Abstract Method SAM
        //@FuntionalInterface explicitly check that interface has only one abstract method
        //Expression lambda
        new Thread(() -> System.out.println("inside Expression Lambda")).start();
        new Thread(() ->
        {
            System.out.println("inside Block Lambda");
        }).start();

        Runnable runnable = () -> System.out.println("Assigned to a variable");
        new Thread(runnable).start();
    }
}


