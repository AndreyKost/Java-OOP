package customlist;

import java.lang.reflect.Array;
import java.util.*;

@SuppressWarnings("rawtypes")
public class CustomList <T extends Comparable<T>> implements Iterable {

    private T array[];
    private int count;

    @SuppressWarnings("unchecked")
    public CustomList(Class<T> clazz){
        this.array = (T[]) Array.newInstance(clazz, 5);
        this.count = 0;
    }

    // Adding an element to the array!
    public void add(T element){

        if(count <= this.array.length - 1){
            this.array[this.count] = element;
            this.count++;
        }else{
            this.doubleArraySize();
            this.array[this.count] = element;
            this.count++;
        }
    }

    // Removing an element from the list
    public T remove(int index){
        if(index < 0 || index > this.count || array[index] == null){
            throw new IndexOutOfBoundsException();
        }
        T element = this.array[index];

        for(int i = index; i < this.count; i++){
            if(i + 1 == this.count || array[i + 1] == null){
                array[i] = null;
                this.count--;
                break;
            }
            array[i] = array[i + 1];
        }
        return element;
    }

    // Checking if the array contains
    public boolean contains(T element){
        boolean isTrue = false;
        for(int i = 0; i < this.count; i++){
            if(this.array[i].compareTo(element) == 0){
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

    // Swapping two elements
    public void swap(int index1, int index2){
        if(index1 < 0 || index2 < 0 || index1 >= count || index2 >= count){
            throw new IndexOutOfBoundsException();
        }

        T element1 = this.array[index1];
        T element2 = this.array[index2];
        array[index1] = element2;
        array[index2] = element1;

    }

    // Count greater than T elements
    public int countGreaterThan(T element){
        int count = 0;
        for(int i = 0; i < this.count; i++){
            if(array[i].compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    // Returns max element
    public T getMax(){
        T maxElement = this.array[0];
        for(int i = 1; i < this.count; i++){
            if(maxElement.compareTo(array[i]) < 0){
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    // Returns min element
    public T getMin(){
        T minElement = this.array[0];
        for(int i = 1; i < this.count; i++){
            if(minElement.compareTo(array[i]) > 0){
                minElement = array[i];
            }
        }
        return minElement;
    }

    // Printing the elements of the CustomList
    @SuppressWarnings({ "unchecked" })
    public void print(){
        //  StringBuilder sb = new StringBuilder();
        //for(int i = 0; i < this.count; i++){
        //  sb.append(this.array[i]).append(System.lineSeparator());
        //}
        //System.out.print(sb.toString());

        Iterator it = this.iterator(); // Printing the List by implementing iterator.
        it.forEachRemaining(a ->{    // Iterator does not work with an array!
            if(a != null){
                System.out.println(a);
            }
        });
    }



    private void doubleArraySize(){ // Doubles the list size!
        @SuppressWarnings("unchecked")
        T arrayCopy[] = (T[]) Array.newInstance(this.array[0].getClass(), this.count * 2);
        System.arraycopy(array, 0, arrayCopy, 0, this.count);
        this.array = arrayCopy;
    }

    // Returns list length
    public int getLength(){
        return this.count;
    }

    // Return index
    public T get(int index){
        return this.array[index];
    }

    public void set(int index, T element){
        this.array[index] = element;
    }

    // Iterator
    @Override
    public Iterator iterator() {
        List<T> list = new ArrayList<T>();
        list = Arrays.asList(this.array);
        Iterator<T> it = list.iterator();
        return it;

    }

}