public class GameClient implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Client: Started...");
            // FILL IN CODE to play the number guessing name with the server

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    static void main(String[] args) {
        GameClient client = new GameClient();
        Thread t1 = new Thread(client);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("The thread got interrupted " + e);
        }
    }
}
