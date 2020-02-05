public class Main {
    public static void main(String[] arg) {
    String name ="Ryan";
    int age = 20;
    String gender ="Male";
    String[] interest = {"being a hardarse", "agile", "ssd hard drives"};


        Person greeting = new Person(name, age, gender, interest);
        greeting.hello();
    }
}

