abstract class Staff extends Member {
    protected StaffType staffType;

    public Staff(String id, String name, String email, StaffType staffType) {
        super(id, name, email);
        this.staffType = staffType;
    }

    public abstract void performDuty();
}

class TeachingStaff extends Staff implements Mentor, Researcher {
    private String specialization;

    public TeachingStaff(String id, String name, String email, String specialization) {
        super(id, name, email, StaffType.TEACHING);
        this.specialization = specialization;
    }

    @Override
    public void performDuty() { System.out.println(name + " teaches and evaluates students."); }

    @Override
    public void mentor(Student student) { System.out.println(name + " mentors " + student.name + "."); }

    @Override
    public void conductResearch() { System.out.println(name + " conducts research in " + specialization + "."); }
}

class NonTeachingStaff extends Staff {
    private String role;

    public NonTeachingStaff(String id, String name, String email, String role) {
        super(id, name, email, StaffType.NON_TEACHING);
        this.role = role;
    }

    @Override
    public void performDuty() { System.out.println(name + " performs " + role + " duties."); }
}

interface Mentor {
    void mentor(Student student);
}

interface Researcher {
    void conductResearch();
}
