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
    display(list);

    // (b)Searching
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name , age and marks:");
    String name = sc.nextLine();
    int age = sc.nextInt();
    int mark = sc.nextInt();
    sc.nextLine();

    Student s = new Student(name, age, mark);
    if (search(list, s) != -1)
      System.out.println("Present");
    else
      System.out.println("Not Present");

    // (c)Remove
    System.out.println("Enter name, age and mark to remove the student:");
    String delName = sc.nextLine();
    int delAge = sc.nextInt();
    int delMark = sc.nextInt();

    Student delStudent = new Student(delName, delAge, delMark);
    remove(list, delStudent);
    display(list);

    // (d)count
    System.out.println(list.size());
    sc.close();
  }

  public static int search(LinkedList<Student> list, Student s) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).name.equals(s.name) && list.get(i).age == s.age && list.get(i).mark == s.mark) {
        return i;
      }
    }
    return -1;
  }

  public static void display(LinkedList<Student> list) {
    Iterator<Student> it = list.iterator();

    while (it.hasNext()) {
      Student temp = it.next();
      System.out.println(temp.name + " " + temp.age + " " + temp.mark);
    }
  }

  public static void remove(LinkedList<Student> list, Student s) {
    int i = search(list, s);
    if (i != -1) {
      list.remove(i);
    }
  }
}
