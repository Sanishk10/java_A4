import java.io.Serializable;

class Member implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private static int memberCount = 0;

    protected String id;
    protected String name;
    protected String email;

    public Member(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        memberCount++;
    }

    public static int getMemberCount() { return memberCount; }

    public static void displayMemberCount() {
        System.out.println("Static member counter = " + memberCount);
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + email);
    }

    // Shallow clone: nested object references are shared.
    @Override
    public Member clone() throws CloneNotSupportedException {
        return (Member) super.clone();
    }
}
