import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Run (c)lient or (s)erver");
        if (args[0].equals("s")) {
            {
                int port = Integer.parseInt(args[1]);
                new Server(port);
            }
        }
        else if (args[0].equals("c")){
            while (true) {
                String ip = args[1];
                int port = Integer.parseInt(args[2]);
                new Client(ip, port);
            }
        }
        else
            System.out.println("Use only 's' or 'c'!");
    }
}
