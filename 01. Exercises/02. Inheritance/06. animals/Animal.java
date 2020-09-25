package animals;

public abstract class Animal {
    private String name;
    private int age;

    public void setGender(String gender) {
        validateString(gender);
        this.gender = gender;
    }

    private String gender;

    public String getGender() {
        return gender;
    }

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateString(name);
        this.name=name;
    }

    private void validateString(String name) {
        if(name==null || name.trim().isEmpty()){
                throw new IllegalArgumentException("Invalid input!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            throw new IllegalArgumentException("Invalid input!");
        }
            this.age = age;
    }


    public abstract String produceSound();

    @Override
    public String toString(){
        return String.format("%s%n%s %d %s%n%s", this.getClass().getSimpleName()
        ,this.getName()
        ,this.getAge()
        ,this.getGender()
        ,produceSound());
    }

}
