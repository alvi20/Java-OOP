package Java;

public class Main {

    public static void main(String[] args) {
// TODO code application logic here
        Animal animal = new Animal();
        animal.Jump();

        animal.setName("Elephant");
        System.out.println(animal.getName());

        animal.setName("Cat");
        System.out.println(animal.getName());

        animal.setNoOfLegs(4);
        System.out.println(animal.getNoOfLegs());

        Animal hen = new Animal(2);
        animal.setName("Hen");
        System.out.println(animal.getName());
        animal.setNoOfLegs(2);
        System.out.println(animal.getNoOfLegs() );
	// write your code here
    }
}
