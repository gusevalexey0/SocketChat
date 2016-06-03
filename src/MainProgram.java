import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Run (c)lient or (s)erver");
        //while (true) {
            char answer = Character.toLowerCase(in.nextLine().charAt(0));
            if (answer == 's') {
                System.out.println("Enter server port:");
                int port = in.nextInt();
                new Server(port);
            }
            else if (answer == 'c'){
                System.out.println("Enter server ip:");
                String ip = in.nextLine();
                System.out.println("Enter server port:");
                int port = in.nextInt();
                new Client(ip, port);
            }
            else
                System.out.println("Try again");
        //}
    }
}
