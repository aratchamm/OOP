public class pro3 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 0; i < 20; i++) {
            queue.enqueue(i + 1);
        }

        int queueSize = queue.getSize();
        for (int j = 0; j < queueSize; j++) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}