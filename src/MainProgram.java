
public class MainProgram {
    public static void main(String[] args) {
        if (args[0].equals("-s")) {
            {
                int port = Integer.parseInt(args[1]);
                new Server(port);
            }
        }
        else if (args[0].equals("-c")){
                String ip = args[1];
                int port = Integer.parseInt(args[2]);
                new Client(ip, port);
        }
        else {
            System.out.println("MainProgram -s port(0 - 65536) for server");
            System.out.println("MainProgram -c ip port(0-65536) for client");
        }
    }
}
