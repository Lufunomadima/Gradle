public class Main {
    public static void main(String[] arg) {
    String name ="Ryan";
    int age = 20;
    String gender ="Male";
    String[] interest = {"being a hardarse", "agile", "ssd hard drives."};


        Person person = new Person(name, age, gender, interest);
       String greeting = person.hello();
        System.out.println(greeting);
    }
}

