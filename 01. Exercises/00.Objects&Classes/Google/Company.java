package Google;

public class Company {
    public String getName() {
        return name;
    }

    private String name;

    public String getDepartment() {
        return department;
    }

    private String department;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Company(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }



}
