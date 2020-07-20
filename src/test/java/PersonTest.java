import com.github.curriculeon.Person;
import org.junit.Assert;
import org.junit.Test;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

public class PersonTest {
    @Test
    public void testConstructor() {
        //Given
        Long expectedId = 0L;
        String expectedName = "Some Name;";
        //When
        Person person = new Person(expectedId,expectedName);
        Long actualId = person.getId();
        String actualName = person.getName();
        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void testSetName(){
        //Given
        Person person = new Person(null,null);
        String expectedName = "Some Name";
        Assert.assertNotEquals(expectedName,person.getName());

        //When
        person.setName(expectedName);
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

}
