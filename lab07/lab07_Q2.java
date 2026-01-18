public class lab07_Q2 {
    // Static variable to keep track of queue size
    private static int queueSize = 0;

    // Method to join the queue
    public static void joinQueue(int orderedLoafs, int[] queue) {
        // Check if queue is full
        if (queueSize >= 20) {
            System.out.println("Queue is full. Order rejected.");
            return;
        }

        // Add the order to the queue
        queue[queueSize] = orderedLoafs;
        queueSize++;

        // Print current queue status
        System.out.print("Current Queue: ");
        for (int i = 0; i < queueSize; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Method to bake and manage the queue
    public static void bake(int expectedLoaves, int[] queue) {
        // If no bread available
        if (expectedLoaves < queue[queueSize - 1]) {
            System.out.println("Not enough bread. Dismissing customers.");
            
            // Dismiss customers who won't get bread
            for (int i = 0; i < queueSize; i++) {
                System.out.println("Customer with order " + queue[i] + " loaves dismissed.");
            }
            
            // Reset queue
            queueSize = 0;
            return;
        }

        // If all customers can get bread
        System.out.println("All customers will receive their bread.");
        
        // If queue is initially empty
        if (queueSize == 0) {
            System.out.println("Current Queue: Empty");
            return;
        }
        
        // Prepare remaining queue
        int[] remainingQueue = new int[20];
        int remainingSize = 0;

        // Keep track of served customers
        boolean multiLoafCustomerServed = false;
        int remainingLoaves = expectedLoaves;

        // Process the queue
        for (int i = 0; i < queueSize; i++) {
            // Serve multi-loaf customer first
            if (!multiLoafCustomerServed && queue[i] > 1) {
                remainingLoaves -= queue[i];
                multiLoafCustomerServed = true;
            } 
            // Then serve single-loaf customer
            else if (multiLoafCustomerServed && queue[i] == 1) {
                remainingLoaves--;
            } 
            // If not served in this round, keep in remaining queue
            else {
                remainingQueue[remainingSize++] = queue[i];
            }
        }

        // Update queue
        for (int i = 0; i < remainingSize; i++) {
            queue[i] = remainingQueue[i];
        }
        queueSize = remainingSize;

        // Print remaining queue
        System.out.print("Current Queue: ");
        for (int i = 0; i < queueSize; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] queue = new int[20];
        
        System.out.println("---- Testing joinQueue ----");
        joinQueue(3, queue);
        joinQueue(2, queue);
        joinQueue(4, queue);
        joinQueue(1, queue);
        joinQueue(2, queue);
        joinQueue(2, queue);
        joinQueue(1, queue);
        joinQueue(1, queue);
        
        System.out.println("\n---- Testing full queue ----");
        for (int i = 0; i < 12; i++) {
            joinQueue(2, queue);
        }
        joinQueue(1, queue);
        
        System.out.println("\n---- Testing Bake First ----");
        bake(8, queue);
        
        System.out.println("\n---- Testing Bake Second ----");
        queue = new int[20];
        queueSize = 0;
        bake(8, queue);
    }
}