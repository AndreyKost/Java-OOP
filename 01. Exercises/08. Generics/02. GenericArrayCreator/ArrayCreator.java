package GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {
    public static <T> T[] create(int length, T item){
        T[] array=(T[])new Object[length];
        for (int i = 0; i <array.length ; i++) {
            array[i]=item;
        }
        return array;
    }

    public static <T> T[] create(Class<T> tclas, int length, T item){
        T[] o = (T[]) Array.newInstance(tclas, length);

        for (int i = 0; i <o.length ; i++) {
            o[i]=item;
        }
        return o;
    }

}
