package Projects;
import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        List<String> num = new ArrayList<>();
        boolean t = true;

        while (t) {
            System.out.println("Enter operation to perform ['ADD', 'DELETE', 'UPDATE', 'EXIT', 'VIEW']: ");
            Scanner in = new Scanner(System.in);
            String n = in.nextLine();

            if (n.equals("ADD") || n.equals("A")) {
                System.out.print("Enter Task to Add: ");
                String task = in.nextLine();
                num.add(task);
                System.out.println("Task Successfully Added!!!");
            } else if (n.equals("DELETE") || n.equals("D")) {
                System.out.println("Enter Task to remove: ");
                String task = in.nextLine();
                if (num.contains(task)) {
                    num.remove(task);
                    System.out.println("Task Successfully Deleted!!!");
                } else {
                    System.out.println("Task Not Found!!!");
                }
            } else if (n.equals("UPDATE") || n.equals("U")) {
                System.out.println("Enter Task to update: ");
                String oldValue = in.nextLine();
                System.out.println("Enter value to update: ");
                String newValue = in.nextLine();
                if (num.contains(oldValue)) {
                    int index = num.indexOf(oldValue);
                    num.set(index, newValue);
                    System.out.println("Task Successfully Updated!!!");
                } else {
                    System.out.println("Task Not Found!!!");
                }
            } else if (n.equals("VIEW") || n.equals("V")) {
                System.out.println(num);
            } else if (n.equals("EXIT")) {
                t = false;
            }
        }

        System.out.println("Your To-Do Task List !!!");
        for (String i : num) {
            System.out.println(i);
        }
    }
}
