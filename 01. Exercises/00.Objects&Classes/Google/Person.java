package Google;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Parents> parents;
    private ArrayList<Children> children;
    private Car car;
    private Company company;
    private ArrayList<Pokemon> pokemon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Parents> getParents() {
        return parents;
    }

    public void setParents(ArrayList<Parents> parents) {
        this.parents = parents;
    }

    public ArrayList<Children> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Children> children) {
        this.children = children;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
}
