import java.util.Scanner;

public class mark{
    public static void main(String[] args) {
        Scanner mark1 = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = mark1.nextLine();

        System.out.print("Enter Mark 1: ");
        int mark1value = mark1.nextInt();

        System.out.print("Enter Mark 2: ");
        int mark2value = mark1.nextInt();

        System.out.print("Enter Mark 3: ");
        int mark3value = mark1.nextInt();
        
        int total = mark1value + mark2value + mark3value;
        double average =total /3.0;
        System.out.println("Student Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

    }
}