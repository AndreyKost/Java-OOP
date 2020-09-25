package Google;

public class Parents {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    private String birthday;

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }


    public Parents(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
