public class Person {
    private String name;
    private int age;
    private String gender;
    private String[] interest;


    public Person(String name, int age, String gender, String[] interest) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String[] getInterest() {
        return interest;
    }




    public void hello() {
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old. My interests are " + this.interest[0] + " " + this.interest[1] + " " + this.interest[2]);
    }
}
