import java.util.*;

enum ActivityType { ACADEMIC, NON_ACADEMIC }
enum StaffType { TEACHING, NON_TEACHING }

enum AcademicActivity {
    ISA("Internal Semester Assessment (ISA)"),
    MIDPOINT("Midpoint Examination"),
    SEA("Semester End Assessment (SEA)"),
    STUDY_TOUR("Study Tour / Educational Visit"),
    PLACEMENT("Placement and Internship Activities"),
    WORKSHOP("Technical Workshops"),
    SEMINAR("Seminars and Guest Lectures"),
    HACKATHON("Hackathons and Coding Competitions"),
    PROJECT("Mini / Major Project and Research Activities");

    private final String displayName;
    AcademicActivity(String displayName) { this.displayName = displayName; }
    public String getDisplayName() { return displayName; }
}

enum NonAcademicActivity {
    INFOFEST("InfoFest"),
    PLATEAUNIA("Plateaunia"),
    PLAY_ON("Play-On / Sports Activities"),
    CULTURAL("Cultural and Literary Activities"),
    FRESHERS("Student Orientation / Freshers Activities"),
    CLUBS("Student Clubs and Technical Clubs"),
    SOCIAL("Social Outreach / Community Activities"),
    FESTIVALS("University Festivals and Celebrations");

    private final String displayName;
    NonAcademicActivity(String displayName) { this.displayName = displayName; }
    public String getDisplayName() { return displayName; }
}
