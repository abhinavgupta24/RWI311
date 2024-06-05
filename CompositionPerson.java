class Pet {
    String pName;
    int pAge;

    public Pet(String pName, int pAge) {
        this.pName = pName;
        this.pAge = pAge;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }
}

class Person {
    String name;
    Pet pet;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

public class CompositionPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Abhinav");
        Person p2 = new Person("Manu");

        Pet pt1 = new Pet("Michael", 2);
        Pet pt2 = new Pet("kitty", 1);

        p1.setPet(pt1);
        p2.setPet(pt2);

        System.out.println(p1.getName() + " has a dog name " + p1.getPet().getpName() + ". Which is of "
                + p1.getPet().getpAge() + " years old.");
        System.out.println(p2.getName() + " has a cat name " + p2.getPet().getpName() + ". Which is of "
                + p2.getPet().getpAge() + " years old.");

    }
}
