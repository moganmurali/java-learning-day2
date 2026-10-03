import java.util.HashMap;
import java.util.Scanner;

public class StudentDictionary {

    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Mogan", 85);
        marks.put("Arsath", 92);
        marks.put("Naveen", 78);
        marks.put("Dragon", 88);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        if (marks.containsKey(name)) {
            System.out.println(name + "'s mark = " + marks.get(name));
        } else {
            System.out.println("Student not found!");
        }

        sc.close();
    }
}