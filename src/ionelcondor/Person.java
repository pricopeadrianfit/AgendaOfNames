package ionelcondor;

/**
 * Created by ADI on 11/7/2015.
 */
public class Person {
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
