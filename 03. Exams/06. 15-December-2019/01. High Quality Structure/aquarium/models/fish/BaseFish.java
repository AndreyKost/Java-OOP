package aquarium.models.fish;

public abstract class BaseFish implements Fish {
    private String name;
    private String species;
    private int size;
    private double price;

    protected BaseFish(String name, String species, double price) {
        setName(name);
        setSpecies(species);
        this.price = price;
    }

    private void setSpecies(String species) {
        if (species== null || species.isEmpty()) {
            throw new NullPointerException("Fish species cannot be null or empty.");
        }
        this.species = species;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Fish price cannot be below or equal to 0.");
        }
        this.price = price;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setName(String name) {
        if (name== null || name.isEmpty()) {
            throw new NullPointerException("Fish name cannot be null or empty.");
        }
        this.name = name;
    }

    @Override
    public void eat() {
        this.size+=5;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
