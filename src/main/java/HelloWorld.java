public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello from EC2 and Kubernetes!");
        System.out.println("Application is running.");
        Thread.currentThread().join();
    }
}
