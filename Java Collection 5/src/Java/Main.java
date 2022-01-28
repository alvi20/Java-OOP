package Java;

import java.util.ArrayList;
import java.util.Objects;


class Person {
    String name;
    String occupation;
    String designation;

    Person(String name, String occupation, String designation) {
        this.name = name;
        this.occupation = occupation;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "n='" + name + '\'' +
                ", occ='" + occupation + '\'' +
                ", des='" + designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return name.equals(person.name);
    }

//	@Override
//	public int hashCode() {
//		return Objects.hash(name, occupation, designation);
//	}
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mr.A", "Student", "A-Level");
        Person p2 = new Person("Ms.B", "Student", "O-Level");
        Person p3 = new Person("Ms.C", "Teacher", "Lecturer");
        Person p4 = new Person("Mr.D", "Teacher", "Professor");

        ArrayList<Person> list = new ArrayList();
        printList(list);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        printList(list);

        list.add(2, new Person("Mr.G", "Private Job", "SWE"));
        printList(list);

        System.out.println("Contains G? : " + list.contains(new Person("Mr.G", "--", "--")));
        printList(list);
        System.out.println("Contains A? : " + list.contains(new Person("Mr.A", "--", "--")));
        list.remove(new Person("Mr.A", "", ""));
        printList(list);
        System.out.println("Contains A? : " + list.contains(new Person("Mr.A", "--", "--")));

    }

    public static void printList(ArrayList<Person> mList) {
        System.out.print(mList.size() + "-> [");
        for (Person s : mList) {
            System.out.print(s + ", ");
        }
        System.out.println("]");
    }
}
