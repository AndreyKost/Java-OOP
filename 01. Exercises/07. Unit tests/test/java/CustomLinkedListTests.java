import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p05_CustomLinkedList.CustomLinkedList;

import java.lang.reflect.Field;
import java.util.Arrays;

public class CustomLinkedListTests<T> {
    private CustomLinkedList<T> list;

    @Before
    public void setUp(){
        this.list=new CustomLinkedList<>();
    }

    @Test
    public void creatingLinkedListShouldHaveZeroCount() throws IllegalAccessException {
        Field field = Arrays.stream(CustomLinkedList.class.getDeclaredFields())
                .filter(f -> f.getName().equals("count"))
                .findFirst()
                .orElse(null);

        Assert.assertNotNull("Field count was null! Invalid object state",field);
        field.setAccessible(true);
            int count = (int) field.get(list);

        Assert.assertEquals("Creating empty LinkedList should have zero count",0,count);
    }
}
