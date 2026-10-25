import java.util.Scanner;
public class Player {
    int number;
    Scanner tec = new Scanner(System.in);
    public void guess() {
        System.out.println("De seu palpite");
        number = tec.nextInt();
    }
}