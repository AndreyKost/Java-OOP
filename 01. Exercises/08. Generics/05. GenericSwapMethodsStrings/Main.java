package GenericSwapMethodsStrings;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Box<String>> boxOfStrings=new ArrayList<>();
        //List<Box<Integer>> boxOfIntegers=new ArrayList<>();

        while (n-- >0){
            String line=scanner.nextLine();
            Box<String> box=new Box<>(line);

            boxOfStrings.add(box);


        }

        int[] indexes= Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


            swapValues(boxOfStrings, indexes[0], indexes[1]);
            for (Box box : boxOfStrings) {
                System.out.println(box.toString());
            }



    }

    public static <T> void swapValues(List<T> list, int firstIndex, int secondIndex){
        T temp= list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
    }

}
