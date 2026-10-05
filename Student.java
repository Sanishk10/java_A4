import java.io.Serializable;
import java.util.List;

class Student extends Member implements Serializable {
    private static final long serialVersionUID = 1L;
    private String programme;
    private List<String> interests;
    private Address address;

    public Student(String id, String name, String email, String programme, Address address) {
        super(id, name, email);
        this.programme = programme;
        this.address = address;
        this.interests = new java.util.ArrayList<>();
    }

    public String getProgramme() { return programme; }
    public Address getAddress() { return address; }
    public void addInterest(String interest) { interests.add(interest); }
    public List<String> getInterests() { return interests; }

    // Deep clone: nested mutable objects are copied too.
    public Student deepClone() {
        Student copy = new Student(id, name, email, programme, new Address(address.getCity()));
        copy.interests = new java.util.ArrayList<>(interests);
        return copy;
    }

    @Override
    public void display() {
        System.out.println("Student: " + id + " | " + name + " | " + programme + " | " + address);
    }
}

class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    private String city;

    public Address(String city) { this.city = city; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    @Override public String toString() { return city; }
}
