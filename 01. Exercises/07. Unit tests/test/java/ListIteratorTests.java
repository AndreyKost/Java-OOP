import org.junit.Assert;
import org.junit.Test;
import p03_IteratorTest.ListIterator;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListIteratorTests {


    @Test(expected = OperationNotSupportedException.class)
    public void creatingInitialValuesWithNullShouldThrowException() throws OperationNotSupportedException {
        ListIterator listIterator=new ListIterator(null);
    }

    @Test
    public void checkIfHasNextMethodWorkCorrectlyWithTrue() throws OperationNotSupportedException{
        ListIterator listIterator=new ListIterator("Pesho","Gosho","Shosho");

        Assert.assertTrue(listIterator.hasNext());
    }

    @Test
    public void checkIfHasNextMethodWorkCorrectlyWithFalse() throws OperationNotSupportedException {
        ListIterator listIterator=new ListIterator("Pesho","Gosho","Shosho");
        listIterator.move();
        listIterator.move();

        Assert.assertFalse(listIterator.hasNext());
    }

    @Test
    public void checkMoveMethodToReturnTheNextValueWhenWeKnowWeHaveSuch() throws OperationNotSupportedException {
        ListIterator listIterator=new ListIterator("Pesho","Gosho","Shosho");

        Assert.assertTrue(listIterator.move());
    }

    @Test
    public void checkMoveMethodToReturnTheNextValueWhenWeKnowWeDoNotHaveSuch() throws OperationNotSupportedException {
        ListIterator listIterator=new ListIterator("Pesho","Gosho","Shosho");
        listIterator.move();
        listIterator.move();

        Assert.assertFalse(listIterator.move());
    }


    @Test
    public void checkIfPrintFindTheCurrentIndexValue() throws OperationNotSupportedException {
        ListIterator listIterator=new ListIterator("Pesho","Gosho","Shosho");
        listIterator.move();

        String print = listIterator.print();

        Assert.assertEquals("Gosho",print);
    }

    @Test(expected =  IllegalStateException.class)
    public void checkIfPrintReturnsMessageWhenWeHaveNullElements() throws OperationNotSupportedException {
        ListIterator listIterator=new ListIterator();
        listIterator.print();
    }

}
