import java.util.Objects;

public class Person {
    private String firstName = "";
    private String lastName = "";
    private String maleName = "";

    public void setFirstName(String first_name) {
        if (!Objects.equals(first_name, "")) {
            this.firstName = first_name;
        } else {
            this.firstName = " ";
        }
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public void setMaleName(String male_name) {
        if (!Objects.equals(male_name, "")) {
            this.maleName = male_name;
        } else {
            this.maleName = " ";
        }
    }

    public String getInfo() {
        return lastName + " " + firstName.charAt(0) + " " + maleName.charAt(0);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setLastName("Лищенко");
        person.setFirstName("Тимофей");
        person.setMaleName("Викторович");
        System.out.println(person.getInfo());
    }
}