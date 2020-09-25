package ListUtilities;

import java.util.List;

public class ListUtils {

    static <T extends Comparable<T>> T getMIn(List<T> elements){
        if(elements.size()==0){
            throw new IllegalArgumentException();
        }
        T max=elements.get(0);
        for (int i = 1; i <elements.size() ; i++) {
            if(max.compareTo(elements.get(i))<0){
                max=elements.get(i);
            }
        }
        return max;
    }

    static <T extends Comparable<T>> T getMax(List<T> elements){
        if(elements.size()==0){
            throw new IllegalArgumentException();

        }
        T min=elements.get(0);
        for (int i = 0; i <elements.size(); i++) {
            if(min.compareTo(elements.get(i))>0){
                min=elements.get(i);
            }
        }
        return min;
    }

}
