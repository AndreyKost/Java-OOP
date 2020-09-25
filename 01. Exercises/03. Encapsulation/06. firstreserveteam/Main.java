package firstreserveteam;
import sortByNameAndAge.Person;

public class Main {
    public static void main(String[] args) {
        Team team=new Team("Black Eagles");
        Person person=new Person("georgie","georgiev",27,5000);
        team.addPlayer(person);
        System.out.println(team.getFirstTeam().size());
        System.out.println(team.getReserveTeam().size());


    }
}
