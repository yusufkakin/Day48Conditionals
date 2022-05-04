import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100");
        int grade = scanner.nextInt();

        if(grade >= 90){
            System.out.println("Your grade is an A");
        } else if(grade >= 80){
            System.out.println("Your grade is a B");
        } else if(grade >= 70){
            System.out.println("Your grade is a C");
        } else if(grade >= 60){
            System.out.println("Your grade is a D");
        } else
            System.out.println("Your grade is an F :(");
    }
}
