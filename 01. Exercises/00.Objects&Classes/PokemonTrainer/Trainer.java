package PokemonTrainer;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private int numberOfBadjes;

    public String getName() {
        return name;
    }

    public int getNumberOfBadjes() {
        return numberOfBadjes;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    ArrayList<Pokemon> pokemons;

    public Trainer(String name,  ArrayList<Pokemon> pokemons){
        this.name=name;
        this.numberOfBadjes=0;
        this.pokemons=pokemons;
    }

    public int incrementNumbetOfBadjes(int amount){
        return this.numberOfBadjes+=amount;
    }


}
