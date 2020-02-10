import org.junit.Assert;
import org.junit.Test;
public class The_Tester {
    @Test
    public void Person_Test() {
        Person greeting = new Person("Lufuno", 25, "Male", new String[]{"being a hardarse", "agile", "ssd hard drives"});

        Assert.assertEquals(greeting.getName(), "Lufuno");
        Assert.assertEquals(greeting.getAge(), 25);
        Assert.assertEquals(greeting.getGender(),"Male");
        Assert.assertEquals(greeting.getInterest(), new String[]{"being a hardarse", "agile", "ssd hard drives"});


    }
}

