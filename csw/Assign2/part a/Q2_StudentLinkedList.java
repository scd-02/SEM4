import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Q2_StudentLinkedList {

  static class Student {
    String name;
    int age;
    int mark;

    Student(String name, int age, int mark) {
      this.name = name;
      this.age = age;
      this.mark = mark;
    }
  }

  public static void main(String[] args) {

    /*
     * LinkedList
     * can contain duplicate elements
     * maintain insertion order
     * non synchronized
     * can be used as a list, stack or queue
     * it uses double LinkedList to store elements
     * manipulation is fast as no shifting needs to occur
     */
    LinkedList<Student> list = new LinkedList<>();

    list.add(new Student("Sourav", 18, 46));
    list.add(new Student("Anurag", 19, 49));
    list.add(new Student("Vivek", 18, 48));

    // (a)Display
    Iterator<Student> it = list.iterator();

    while (it.hasNext()) {
      Student temp = it.next();
      System.out.println(temp.name + " " + temp.age + " " + temp.mark);
    }

    // (b)Searching
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name , age and marks:");
    String name = sc.nextLine();
    int age = sc.nextInt();
    int mark = sc.nextInt();
    Student s = new Student(name, age, mark);

    for (Student obj : list) {
      if (obj.name == s.name && obj.age == s.age && obj.mark == s.mark)
        System.out.println("Present");
    }
  }
}
