public class Person {
    private String name;
    private int age;
    private String gender;
    private String[] interests;


    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
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
        return interests;
    }




    public String hello() {
        return ("Hello, my name is " + this.name + " and I am " + this.age + " years old" + ". " +" My interests are being a " + interests());
    }
    public  String interests(){
        String list ="";
        for(int i = 0;i<interests.length;i++){
            if(i==0) {
                list = list + interests[i];
            }
            else  if(i>=1 && i<= interests.length-2) {
                list = list +", " + interests[i];
            }
            else {
                list = list + " and " + interests[i];
            }
            }
        return list;
        }
    }

