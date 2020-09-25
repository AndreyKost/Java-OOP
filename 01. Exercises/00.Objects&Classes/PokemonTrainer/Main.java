package PokemonTrainer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Trainer> listOfTrainers = new LinkedHashSet<>();

        String line = scanner.nextLine();
        while (!line.equals("Tournament")) {
            String tokens[] = line.split(" ");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            ArrayList<Pokemon> pokemons = new ArrayList<>();
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            pokemons.add(pokemon);

            boolean isExist=false;
            for (Trainer listOfTrainer : listOfTrainers) {
                if(listOfTrainer.getName().equals(trainerName)){
                    isExist=true;
                }
            }

            if(isExist){
                for (Trainer listOfTrainer : listOfTrainers) {
                    if(listOfTrainer.getName().equals(trainerName)){
                        listOfTrainer.getPokemons().add(pokemon);
                    }
                }

            } else{ Trainer trainer = new Trainer(trainerName, pokemons);
                listOfTrainers.add(trainer);
            }


            line = scanner.nextLine();
        }

        boolean isValid=false;
        String line1 = scanner.nextLine();
        while (!line1.equals("End")) {
            String pokeEl=line1;
            for (Trainer listOfTrainer : listOfTrainers) {
                isValid=false;
                for (int i = 0; i <listOfTrainer.getPokemons().size() ; i++) {
                    if(listOfTrainer.getPokemons().get(i).getElement().equals(pokeEl)){
                        isValid=true;
                    }
                }
                if(isValid){
                    listOfTrainer.incrementNumbetOfBadjes(1);
                } else {
                    for (int i = 0; i <listOfTrainer.getPokemons().size() ; i++) {
                        listOfTrainer.getPokemons().get(i).decreaseHealth(10);
                    }
                    for (int i = 0; i <listOfTrainer.getPokemons().size() ; i++) {
                        if(listOfTrainer.getPokemons().get(i).getHealth()<=0){
                            listOfTrainer.getPokemons().remove(i);
                            i--;
                        }
                    }
                }
            }

            line1 = scanner.nextLine();
        }


        listOfTrainers.stream().sorted((f,s)-> {
            int result=Integer.compare(s.getNumberOfBadjes(),f.getNumberOfBadjes());
            return result;
        }).forEach(entry -> {
            System.out.printf("%s %d %d%n",entry.getName(),entry.getNumberOfBadjes(),entry.getPokemons().size());
        });

    }
}
