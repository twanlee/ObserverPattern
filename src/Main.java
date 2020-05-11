import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new OctObserver(subject);
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("Enter your Number: ");
            subject.setState(sc.nextInt());
        }
    }
}
