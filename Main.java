import java.io.*;
import java.util.*;

public class Main {

    private static final String OUTPUT_FOLDER = "../output";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            printHeader();
            printMenu();

            System.out.print("Enter your choice: ");

            try {

                choice = sc.nextInt();
                sc.nextLine();

                System.out.println();

                switch (choice) {

                    case 1:
                        studentDemo();
                        break;

                    case 2:
                        staffDemo();
                        break;

                    case 3:
                        academicActivities();
                        break;

                    case 4:
                        nonAcademicActivities();
                        break;

                    case 5:
                        coursesDemo();
                        break;

                    case 6:
                        collectionsDemo();
                        break;

                    case 7:
                        exceptionDemo();
                        break;

                    case 8:
                        persistenceAndCloning();
                        break;

                    case 9:
                        reflectionDemo();
                        break;

                    case 10:
                        System.out.println(
                                "Thank you for using the DCST NIRF System!"
                        );
                        break;

                    default:
                        System.out.println(
                                "Invalid choice. Please select 1-10."
                        );
                }

            } catch (InputMismatchException e) {

                System.out.println(
                        "Please enter a number only."
                );

                sc.nextLine();
                choice = 0;
            }

            if (choice != 10) {

                System.out.println();
                System.out.println(
                        "Press ENTER to return to the main menu..."
                );

                sc.nextLine();
            }

        } while (choice != 10);

        sc.close();
    }


    // ==========================================================
    // MAIN HEADER
    // ==========================================================

    public static void printHeader() {

        System.out.println();
        System.out.println(
                "=========================================================="
        );

        System.out.println(
                "          DCST - NIRF STUDENT INFORMATION SYSTEM"
        );

        System.out.println(
                "                 Goa University"
        );

        System.out.println(
                "=========================================================="
        );
    }


    // ==========================================================
    // MAIN MENU
    // ==========================================================

    public static void printMenu() {

        System.out.println();
        System.out.println(
                "-------------------- MAIN MENU --------------------"
        );

        System.out.println(
                "1. Student & Object Referencing"
        );

        System.out.println(
                "2. Staff & Inheritance"
        );

        System.out.println(
                "3. Academic Activities"
        );

        System.out.println(
                "4. Non-Academic Activities"
        );

        System.out.println(
                "5. Programmes & Courses"
        );

        System.out.println(
                "6. Generics & Collections"
        );

        System.out.println(
                "7. Exception Handling"
        );

        System.out.println(
                "8. Persistence & Cloning"
        );

        System.out.println(
                "9. Reflection"
        );

        System.out.println(
                "10. Exit"
        );

        System.out.println(
                "---------------------------------------------------"
        );
    }


    // ==========================================================
    // 1. STUDENT & OBJECT REFERENCING
    // ==========================================================

    public static void studentDemo() {

        System.out.println(
                "================ STUDENT DETAILS ================"
        );

        Address address =
                new Address("Goa");

        Student student1 =
                new Student(
                        "S001",
                        "Rahul",
                        "rahul@unigoa.ac.in",
                        "M.C.A.",
                        address
                );

        student1.addInterest(
                "Programming"
        );

        student1.addInterest(
                "Artificial Intelligence"
        );


        // Two references pointing to same object
        Student student2 = student1;


        System.out.println(
                "Student ID   : " +
                student1.id
        );

        System.out.println(
                "Name         : " +
                student1.name
        );

        System.out.println(
                "Email        : " +
                student1.email
        );

        System.out.println(
                "Programme    : " +
                student1.getProgramme()
        );

        System.out.println(
                "Address      : " +
                student1.getAddress()
        );

        System.out.println(
                "Interests    : " +
                student1.getInterests()
        );


        System.out.println();
        System.out.println(
                "Object Referencing:"
        );

        System.out.println(
                "student1 == student2 : " +
                (student1 == student2)
        );

        System.out.println(
                "Both references point to the SAME object."
        );


        System.out.println();
        System.out.println(
                "Static Member Count:"
        );

        Member.displayMemberCount();
    }


    // ==========================================================
    // 2. STAFF & INHERITANCE
    // ==========================================================

    public static void staffDemo() {

        System.out.println(
                "================ STAFF & INHERITANCE ================"
        );


        TeachingStaff teacher =
                new TeachingStaff(
                        "T001",
                        "Dr. Sharma",
                        "sharma@unigoa.ac.in",
                        "Data Science"
                );


        NonTeachingStaff staff =
                new NonTeachingStaff(
                        "NT001",
                        "Mr. John",
                        "john@unigoa.ac.in",
                        "Administration"
                );


        System.out.println(
                "Teaching Staff:"
        );

        teacher.performDuty();

        teacher.conductResearch();


        System.out.println();

        System.out.println(
                "Non-Teaching Staff:"
        );

        staff.performDuty();


        System.out.println();

        System.out.println(
                "Multiple Interface Inheritance:"
        );

        System.out.println(
                "TeachingStaff implements:"
        );

        System.out.println(
                "- Mentor"
        );

        System.out.println(
                "- Researcher"
        );


        System.out.println();

        System.out.println(
                "Abstract Class:"
        );

        System.out.println(
                "TeachingStaff and NonTeachingStaff "
                + "extend the abstract Staff class."
        );


        System.out.println();

        System.out.println(
                "Polymorphism:"
        );

        Member member = teacher;

        member.display();
    }


    // ==========================================================
    // 3. ACADEMIC ACTIVITIES
    // ==========================================================

    public static void academicActivities() {

        System.out.println(
                "================ ACADEMIC ACTIVITIES ================"
        );


        int count = 1;


        for (
                AcademicActivity activity :
                AcademicActivity.values()
        ) {

            System.out.println(
                    count +
                    ". " +
                    activity.getDisplayName()
            );

            count++;
        }


        System.out.println();

        System.out.println(
                "Academic activities support teaching, "
                + "assessment, projects and placements."
        );
    }


    // ==========================================================
    // 4. NON-ACADEMIC ACTIVITIES
    // ==========================================================

    public static void nonAcademicActivities() {

        System.out.println(
                "================ NON-ACADEMIC ACTIVITIES ================"
        );


        int count = 1;


        for (
                NonAcademicActivity activity :
                NonAcademicActivity.values()
        ) {

            System.out.println(
                    count +
                    ". " +
                    activity.getDisplayName()
            );

            count++;
        }


        System.out.println();

        System.out.println(
                "These activities support student "
                + "development beyond academics."
        );
    }


    // ==========================================================
    // 5. PROGRAMMES & COURSES
    // ==========================================================

    public static void coursesDemo() {

        System.out.println(
                "================ PROGRAMMES & COURSES ================"
        );


        List<Course> courses =
                new ArrayList<>();


        courses.add(
                new Course(
                        "MCA",
                        "Master of Computer Applications",
                        Arrays.asList(
                                "Object Oriented Technology",
                                "Data Structures",
                                "Database Management",
                                "Computer Networks",
                                "Software Engineering"
                        )
                )
        );


        courses.add(
                new Course(
                        "MSCAI",
                        "M.Sc. Artificial Intelligence",
                        Arrays.asList(
                                "Artificial Intelligence",
                                "Machine Learning",
                                "Deep Learning",
                                "Natural Language Processing"
                        )
                )
        );


        courses.add(
                new Course(
                        "MSCDS",
                        "M.Sc. Data Science",
                        Arrays.asList(
                                "Statistics",
                                "Data Mining",
                                "Machine Learning",
                                "Data Visualization"
                        )
                )
        );


        courses.add(
                new Course(
                        "MSCIDS",
                        "M.Sc. (Integrated) Data Science",
                        Arrays.asList(
                                "Programming",
                                "Mathematics",
                                "Statistics",
                                "Data Science"
                        )
                )
        );


        courses.add(
                new Course(
                        "PHDCS",
                        "Ph.D. Computer Science",
                        Arrays.asList(
                                "Research Methodology",
                                "Advanced Computer Science",
                                "Research Work"
                        )
                )
        );


        for (Course course : courses) {

            System.out.println();

            System.out.println(
                    course.getCode() +
                    " - " +
                    course.getName()
            );

            System.out.println(
                    "Subjects:"
            );


            for (
                    String subject :
                    course.getSubjects()
            ) {

                System.out.println(
                        "   • " +
                        subject
                );
            }
        }


        System.out.println();

        System.out.println(
                "Note: Subject lists are representative "
                + "for the OOP case study."
        );
    }


    // ==========================================================
    // 6. GENERICS & COLLECTIONS
    // ==========================================================

    public static void collectionsDemo() {

        System.out.println(
                "================ GENERICS & COLLECTIONS ================"
        );


        // Generic class
        GenericBox<String> box =
                new GenericBox<>(
                        "M.C.A."
                );


        System.out.println(
                "Generic Class:"
        );

        System.out.println(
                "GenericBox<String> = " +
                box.getValue()
        );


        // LIST

        List<String> students =
                new ArrayList<>();


        students.add("Rahul");

        students.add("Priya");

        students.add("Amit");


        System.out.println();

        System.out.println(
                "List:"
        );

        CollectionUtils.printList(
                students
        );


        // QUEUE

        Queue<String> queue =
                new LinkedList<>();


        queue.add("Student 1");

        queue.add("Student 2");

        queue.add("Student 3");


        System.out.println();

        System.out.println(
                "Queue:"
        );

        System.out.println(
                queue
        );

        System.out.println(
                "Queue Head: " +
                queue.peek()
        );


        // SET

        Set<String> years =
                new LinkedHashSet<>();


        years.add("2023-24");

        years.add("2024-25");

        years.add("2025-26");

        years.add("2024-25");


        System.out.println();

        System.out.println(
                "Set:"
        );

        System.out.println(
                years
        );

        System.out.println(
                "Duplicate year automatically removed."
        );


        // MAP

        Map<String, Integer> studentsCount =
                new LinkedHashMap<>();


        studentsCount.put(
                "M.C.A.",
                60
        );

        studentsCount.put(
                "M.Sc. AI",
                30
        );

        studentsCount.put(
                "M.Sc. Data Science",
                30
        );


        System.out.println();

        System.out.println(
                "Map:"
        );

        System.out.println(
                studentsCount
        );
    }


    // ==========================================================
    // 7. EXCEPTION HANDLING
    // ==========================================================

    public static void exceptionDemo() {

        System.out.println(
                "================ EXCEPTION HANDLING ================"
        );


        // Custom exception

        try {

            validateProgramme(
                    "Unknown Programme"
            );

        }
        catch (
                InvalidProgrammeException e
        ) {

            System.out.println(
                    "Custom Exception:"
            );

            System.out.println(
                    e.getMessage()
            );

        }
        finally {

            System.out.println(
                    "Finally block executed."
            );
        }


        // Runtime exception

        try {

            int number =
                    10 / 0;

            System.out.println(
                    number
            );

        }
        catch (
                ArithmeticException e
        ) {

            System.out.println();

            System.out.println(
                    "Runtime Exception:"
            );

            System.out.println(
                    "Cannot divide a number by zero."
            );
        }


        System.out.println();

        System.out.println(
                "Exception handling prevents the "
                + "program from crashing."
        );
    }


    // ==========================================================
    // 8. PERSISTENCE & CLONING
    // ==========================================================

    public static void persistenceAndCloning() {

        System.out.println(
                "================ PERSISTENCE & CLONING ================"
        );


        Student original =
                new Student(
                        "S100",
                        "Ananya",
                        "ananya@unigoa.ac.in",
                        "M.Sc. Data Science",
                        new Address("Panaji")
                );


        original.addInterest(
                "Machine Learning"
        );


        original.addInterest(
                "Data Analytics"
        );


        try {

            // --------------------------------------------------
            // PERSISTENCE
            // --------------------------------------------------

            String file =
                    OUTPUT_FOLDER +
                    "/student.ser";


            PersistenceManager.saveStudent(
                    original,
                    file
            );


            Student loaded =
                    PersistenceManager.loadStudent(
                            file
                    );


            System.out.println(
                    "Persistence:"
            );

            System.out.println(
                    "Student saved and loaded successfully."
            );

            System.out.println(
                    "Loaded Student: " +
                    loaded.name
            );


            // --------------------------------------------------
            // SHALLOW CLONING
            // --------------------------------------------------

            Student shallow =
                    (Student) original.clone();


            System.out.println();

            System.out.println(
                    "Shallow Cloning:"
            );

            System.out.println(
                    "Original and clone have "
                    + "different objects."
            );

            System.out.println(
                    "Address shared: " +
                    (
                        original.getAddress()
                        ==
                        shallow.getAddress()
                    )
            );


            // --------------------------------------------------
            // DEEP CLONING
            // --------------------------------------------------

            Student deep =
                    original.deepClone();


            System.out.println();

            System.out.println(
                    "Deep Cloning:"
            );

            System.out.println(
                    "Address shared: " +
                    (
                        original.getAddress()
                        ==
                        deep.getAddress()
                    )
            );

            System.out.println(
                    "Deep clone creates a separate Address object."
            );


            // --------------------------------------------------
            // FILE I/O
            // --------------------------------------------------

            String textFile =
                    OUTPUT_FOLDER +
                    "/nirf_summary.txt";


            PersistenceManager.writeText(
                    textFile,
                    "DCST NIRF OOP Case Study Report"
            );


            System.out.println();

            System.out.println(
                    "File I/O:"
            );

            System.out.println(
                    "Summary written to nirf_summary.txt"
            );


        }
        catch (
                IOException |
                ClassNotFoundException |
                CloneNotSupportedException e
        ) {

            System.out.println(
                    "Error: " +
                    e.getMessage()
            );
        }
    }


    // ==========================================================
    // 9. REFLECTION
    // ==========================================================

    public static void reflectionDemo() {

        System.out.println(
                "================ REFLECTION / RTTI ================"
        );


        Student student =
                new Student(
                        "S200",
                        "Karan",
                        "karan@unigoa.ac.in",
                        "M.C.A.",
                        new Address("Goa")
                );


        System.out.println(
                "Runtime Type Information:"
        );


        ReflectionDemo.showReflection(
                student
        );


        System.out.println();

        System.out.println(
                "Reflection allows Java to inspect "
                + "a class at runtime."
        );
    }


    // ==========================================================
    // CUSTOM EXCEPTION
    // ==========================================================

    public static void validateProgramme(
            String programme)
            throws InvalidProgrammeException {


        Set<String> validProgrammes =
                new HashSet<>();


        validProgrammes.add(
                "M.C.A."
        );

        validProgrammes.add(
                "M.Sc. Artificial Intelligence"
        );

        validProgrammes.add(
                "M.Sc. Data Science"
        );

        validProgrammes.add(
                "M.Sc. (Integrated) Data Science"
        );

        validProgrammes.add(
                "Ph.D. Computer Science"
        );


        if (
                !validProgrammes.contains(
                        programme
                )
        ) {

            throw new InvalidProgrammeException(
                    "Invalid programme: " +
                    programme
            );
        }
    }
}