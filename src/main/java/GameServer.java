import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GameServer {
    public static final String END_GAME = "END";
    public static final String SHUTDOWN = "SHUTDOWN";
    public static final int PORT = 8000;
    private ExecutorService poolManager;

    private static volatile boolean isShutdown;

    public GameServer() {
        poolManager = Executors.newFixedThreadPool(4);
        isShutdown = false;
    }

    public void runServer() {
        ServerSocket welcomingSocket = null;
        // FILL IN CODE: repeatedly listen for client requests, create a new "helper", a GameWorker
        // to handle each client


    }

    /** Server's helper - deals with one client connected via the connection socket
     */
    static class GameWorker implements Runnable {
        // FILL IN CODE: add instance variables as needed, such as socket
        @Override
        public void run() {
            // FILL IN CODE: generate a random number from 0 to 10, and interact with the client
            // as the client is trying to guess it
            // Stop the game and close the socket once the client guesses the number correctly

        }
    }

    static void main(String[] args) {
        GameServer server = new GameServer();
        server.runServer();
    }
}