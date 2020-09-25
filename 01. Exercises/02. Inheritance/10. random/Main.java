package random;

public class Main {
    public static void main(String[] args) {
        RandomArrayList randomArrayList=new RandomArrayList();
        randomArrayList.add("Pesho");
        randomArrayList.add("Tania");
        randomArrayList.add("Katia");
        randomArrayList.add(125);
        randomArrayList.add('a');

        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());

    }
}
