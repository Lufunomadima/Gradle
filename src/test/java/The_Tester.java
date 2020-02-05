import org.junit.Assert;
import org.junit.Test;
public class The_Tester {
    @Test
    public void Person_Test(){
        Person greeting = new Person("Lufuno", 25, "Male", new String[]{"being a hardarse", "agile", "ssd hard drives"});

        Assert.assertEquals(greeting.getName(), "Lufuno");
    }

}

