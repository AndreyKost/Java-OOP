import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p02_ExtendedDatabase.Database;
import p02_ExtendedDatabase.Person;

import javax.naming.OperationNotSupportedException;

public class ExtendedDatabaseTests {
    private Database database;
    public Person[] elements;

    @Before
    public void initValues() throws OperationNotSupportedException {
        Person person=new Person(10,"Pesho");
        Person person1=new Person(5,"Tasho");
        Person person2=new Person(3,"Kesho");
        this.elements=new Person[3];
        this.elements[0]=person;
        this.elements[1]=person1;
        this.elements[2]=person2;
        this.database=new Database(elements);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void addNullOrNegativeIds() throws OperationNotSupportedException {
        Person person3=null;
        database.add(person3);
    }

    @Test
    public void whenRemovingShouldRemoveTheLastIndex() throws OperationNotSupportedException {
        Person[] elements = this.database.getElements();
        int n=elements.length;
        database.remove();

        Assert.assertEquals(2,this.database.getElements().length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void tryingToRemoveWhenThereIsNullElements() throws OperationNotSupportedException {
        for (int i = 0; i <this.elements.length ; i++) {
            this.database.remove();
        }

        this.database.remove();
    }


    @Test(expected = OperationNotSupportedException.class)
    public void ifNoUserIsNotAvailableByThisNameThrowException() throws OperationNotSupportedException {
        this.database.findByUsername("sfsf");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void ifUserIsNullThrowException() throws OperationNotSupportedException {
        this.database.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void argumentsOfParametersAreCaseSensitive() throws OperationNotSupportedException {
        this.database.findByUsername("PESHO");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void ifNoUserIsPresentByThisIdThrowException() throws OperationNotSupportedException {
        this.database.findById(6);
    }


    @Test(expected = OperationNotSupportedException.class)
    public void addTestWithExistingId() throws OperationNotSupportedException {
        this.database.add(new Person(10,"ss"));
    }



}
