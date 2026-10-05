import java.util.*;

class Course {
    private final String code;
    private final String name;
    private final List<String> subjects;

    public Course(String code, String name, List<String> subjects) {
        this.code = code;
        this.name = name;
        this.subjects = new ArrayList<>(subjects);
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public List<String> getSubjects() { return subjects; }

    public void printCourse() {
        System.out.println(code + " - " + name);
        for (String subject : subjects) System.out.println("    * " + subject);
    }
}

class GenericBox<T> {
    private T value;
    public GenericBox(T value) { this.value = value; }
    public T getValue() { return value; }
    public void setValue(T value) { this.value = value; }
}

class CollectionUtils {
    public static <T> void printList(List<T> items) {
        for (T item : items) System.out.println("  - " + item);
    }

    public static <T> int count(Collection<T> items) { return items.size(); }
}
