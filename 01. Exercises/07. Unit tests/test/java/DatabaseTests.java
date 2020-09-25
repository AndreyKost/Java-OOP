import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p1_Database.Database;

import javax.naming.OperationNotSupportedException;

public class DatabaseTests {
    public Integer[] numbers;
    private Database database;

    @Before
    public void setDatabaseField() throws OperationNotSupportedException {
        this.numbers=initNumbers(6);
        this.database=new Database(numbers);
    }

    private Integer[] initNumbers(int size) {
        Integer[] arr=new Integer[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= i+1;
        }
        return arr;
    }

    @Test
    public void databaseCreatonTestShouldCreateObjectWithValidParameters() throws OperationNotSupportedException {
        Integer[] elements = database.getElements();

        Assert.assertEquals(numbers.length,elements.length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void databaseCreatonTestShouldThrowExceptionWithNullParameters() throws OperationNotSupportedException {
        new Database();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void databaseCreatonTestShouldThrowExceptionWithMoreThan16Elements() throws OperationNotSupportedException {

        Integer[] numbers= new Integer[17];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=i;
        }
        new Database(numbers);
    }

    @Test
    public void databaseCreationTestShouldSetElementsInCorrectOrderAccordingToInitialParameters()throws OperationNotSupportedException {
        Integer[] elements = this.database.getElements();
        boolean areEqual=true;


        if(elements.length==numbers.length) {
            for (int i = 0; i < elements.length; i++) {
                    if (!elements[i].equals(numbers[i])) {
                        areEqual = false;
                        break;
                    }
            }
        } else {
         areEqual=false;
        }

        Assert.assertTrue(areEqual);
    }

    @Test
    public void addAnElementAtTheNextFreeCell() throws OperationNotSupportedException {
        database.add(5);
        Integer[] elements = database.getElements();
        int n=elements[elements.length-1];
        Assert.assertEquals(5,n);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void addNullElementShouldThrowAnException() throws OperationNotSupportedException {
        database.add(null);
    }


    @Test(expected = OperationNotSupportedException.class)
    public void emoveAnElementFromEmptyArrayShouldThrowAnError() throws OperationNotSupportedException {
        for (int i = 0; i <this.numbers.length ; i++) {
            this.database.remove();
        }
        this.database.remove();
    }

    @Test
    public void removeAnElementShouldOnlyRemoveAnElementAtTheLastIndex() throws OperationNotSupportedException {
        this.database.remove();
        Integer[] elements = database.getElements();
        Integer last=elements[elements.length-1];

        Assert.assertEquals(this.numbers[this.numbers.length-2],last);
    }

}
