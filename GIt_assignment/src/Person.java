public class Person {
    private String name;
    private int ageOfPerson;  //fixed typeo error

    public Person(String name, int age) {
        this.name = name;
        this.ageOfPerson = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return ageOfPerson;
    }

    public void setAge(int age) {
        this.ageOfPerson = age;
    }


    boolean isValidAge() {
        if (getAge() >= 18)
            return true;
        else
            return false;
    }
}
