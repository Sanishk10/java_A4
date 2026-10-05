import java.io.*;

class PersistenceManager {
    public static void saveStudent(Student student, String file) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(student);
        }
    }

    public static Student loadStudent(String file) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (Student) in.readObject();
        }
    }

    public static void writeText(String file, String text) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
            writer.newLine();
        }
    }
}
