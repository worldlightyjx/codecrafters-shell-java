import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        while (true){
            System.out.print("$ ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            switch ( command){
                case "echo" -> {
                    System.out.println(input.split(" ",2)[1]);
                }
                case "exit" -> {System.exit(0);}
                default -> {
                    System.out.println(command+": command not found");
                }
            }
        }


    }
}