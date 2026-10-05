interface Reportable {
    void generateReport();
}

interface Displayable {
    void displayDetails();
}

// Java interfaces can use multiple interface inheritance.
interface AdvancedReportable extends Reportable, Displayable {
}

class NIRFReport implements AdvancedReportable {
    private final String title;

    public NIRFReport(String title) { this.title = title; }

    @Override
    public void generateReport() { System.out.println("Generating NIRF report: " + title); }

    @Override
    public void displayDetails() { System.out.println("Report contains students, staff, programmes and activities."); }
}

class MessageService {
    // Class as a type + message passing: accepts any Reportable object.
    public static void sendReport(Reportable report) {
        report.generateReport();
    }
}
