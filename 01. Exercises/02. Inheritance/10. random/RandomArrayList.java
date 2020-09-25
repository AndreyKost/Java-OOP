package random;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    private static  final Random RANDOM;

    static {
        RANDOM= new Random();
    }

    public Object getRandomElement(){
        int index=RANDOM.nextInt(super.size());
        Object o=super.get(index);
        super.remove(o);
        return o;
    }
}
