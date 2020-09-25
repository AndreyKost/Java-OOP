package Google;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Person> listOfPersons=new ArrayList<>();

        String line=scanner.nextLine();
        while (!line.equals("End")) {
            String tokens[] = line.split(" ");
            String personName = tokens[0];
            String kind = tokens[1];
            boolean isValid = true;
            ArrayList<Children> listOfChildren = new ArrayList<>();
            ArrayList<Parents> listOfParents = new ArrayList<>();
            ArrayList<Pokemon> listOfPokemons = new ArrayList<>();

            for (Person person : listOfPersons) {
                if (person.getName().equals(personName)) {
                    isValid = false;
                }
            }
            if (isValid){
                Person person = new Person();
            person.setName(personName);
            if (kind.equals("company")) {
                Company company = new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                person.setCompany(company);
                listOfPersons.add(person);
            } else if (kind.equals("car")) {
                Car car=new Car(tokens[2], Integer.parseInt(tokens[3]));
                person.setCar(car);
                listOfPersons.add(person);
            } else if (kind.equals("parents")) {
                Parents parents = new Parents(tokens[2], tokens[3]);
                listOfParents.add(parents);
                person.setParents(listOfParents);
                listOfPersons.add(person);
            } else if (kind.equals("children")) {
                Children children = new Children(tokens[2], tokens[3]);
                listOfChildren.add(children);
                person.setChildren(listOfChildren);
                listOfPersons.add(person);
            } else if (kind.equals("pokemon")) {
                Pokemon pokemon = new Pokemon(tokens[2], tokens[3]);
                listOfPokemons.add(pokemon);
                person.setPokemon(listOfPokemons);
                listOfPersons.add(person);
            }
        } else {
                if(kind.equals("company")){
                    for (int i = 0; i <listOfPersons.size() ; i++) {
                        if(listOfPersons.get(i).getName().equals(personName)){
                            if(listOfPersons.get(i).getCompany()!=null){
                                listOfPersons.get(i).getCompany().setName(tokens[2]);
                                listOfPersons.get(i).getCompany().setDepartment(tokens[3]);
                                listOfPersons.get(i).getCompany().setSalary(Double.parseDouble(tokens[4]));
                            } else {
                                Company company = new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                                listOfPersons.get(i).setCompany(company);
                            }
                        }
                    }
                } else if(kind.equals("car")){
                    for (Person listOfPerson : listOfPersons) {
                        if(listOfPerson.getName().equals(personName)){
                            if(listOfPerson.getCar()!=null){
                                listOfPerson.getCar().setModel(tokens[2]);
                                listOfPerson.getCar().setSpeed(Integer.parseInt(tokens[3]));
                            } else {
                                Car car=new Car(tokens[2], Integer.parseInt(tokens[3]));
                                listOfPerson.setCar(car);
                            }
                        }
                    }
                } else if(kind.equals("parents")){
                    Parents parents = new Parents(tokens[2], tokens[3]);
                    for (Person listOfPerson : listOfPersons) {
                        if(listOfPerson.getName().equals(personName)){
                            if(listOfPerson.getParents()!=null) {
                                listOfPerson.getParents().add(parents);
                            } else {
                                listOfParents.add(parents);
                                listOfPerson.setParents(listOfParents);
                            }
                        }
                    }
                } else if(kind.equals("children")){
                    Children children = new Children(tokens[2], tokens[3]);
                    for (Person listOfPerson : listOfPersons) {
                        if(listOfPerson.getName().equals(personName)){
                            if(listOfPerson.getChildren()!=null){
                                listOfPerson.getChildren().add(children);
                            } else {
                              listOfChildren.add(children);
                              listOfPerson.setChildren(listOfChildren);
                            }
                        }
                    }
                } else if(kind.equals("pokemon")){
                    Pokemon pokemon = new Pokemon(tokens[2], tokens[3]);
                    for (Person listOfPerson : listOfPersons) {
                        if(listOfPerson.getName().equals(personName)){
                            if(listOfPerson.getPokemon()!=null){
                                listOfPerson.getPokemon().add(pokemon);
                            } else {
                                listOfPokemons.add(pokemon);
                                listOfPerson.setPokemon(listOfPokemons);
                            }
                        }
                    }
                }
            }

            line=scanner.nextLine();
        }

        String text=scanner.nextLine();

        for (Person listOfPerson : listOfPersons) {
            if(listOfPerson.getName().equals(text)){
                System.out.println(listOfPerson.getName());
                System.out.println("Company:");
                if(listOfPerson.getCompany()!=null){
                    System.out.printf("%s %s %.2f%n",listOfPerson.getCompany().getName()
                            ,listOfPerson.getCompany().getDepartment(),
                            listOfPerson.getCompany().getSalary());
                }
                System.out.println("Car:");
                if(listOfPerson.getCar()!=null){
                    System.out.printf("%s %d%n",listOfPerson.getCar().getModel()
                    ,listOfPerson.getCar().getSpeed());
                }
                System.out.println("Pokemon:");
                if(listOfPerson.getPokemon()!=null){
                    for (Pokemon pokemon : listOfPerson.getPokemon()) {
                        System.out.printf("%s %s%n",pokemon.getName(),pokemon.getType());
                    }
                }
                System.out.println("Parents:");
                if(listOfPerson.getParents()!=null){
                    for (Parents parent : listOfPerson.getParents()) {
                        System.out.printf("%s %s%n",parent.getName(),parent.getBirthday());
                    }
                }
                System.out.println("Children:");
                if(listOfPerson.getChildren()!=null){
                    for (Children child : listOfPerson.getChildren()) {
                        System.out.printf("%s %s%n",child.getName(),child.getBirthday());
                    }

                }

            }
        }

    }
}
