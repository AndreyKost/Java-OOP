package sortByNameAndAge;



public class Person {
    private String firstName;

    public void setLastName(String lastName) {
        if(lastName.length()<3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    private String lastName;

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if(age<=0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary<460){
            throw new IllegalArgumentException("Salary can't be less than 460 leva");
        }
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        if(firstName.length()<3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    private double salary;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public void increaseSalary(double bonus){
        double sumToIncrease;
        if(getAge()<30){
            sumToIncrease=getSalary()*(bonus/200.0);
        } else {
            sumToIncrease = getSalary() * (bonus / 100.0);
        }
        this.salary+=sumToIncrease;
    }

    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.",getFirstName(),getLastName(),getAge());
    }


    public String getSalaryString() {
        return String.format("%s %s gets %s leva",getFirstName(),getLastName(),getSalary());
    }
}
