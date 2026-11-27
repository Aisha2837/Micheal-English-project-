import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    //Attributes
    private String name;
    private final String studentID;
    private String program;

    private List<Module> modules;
    private Map<Module, String> grades;
    private Map<Module, List<String>> attemptedGrades;

    private Transcript transcript;

    //Constructor
    public Student(String name, String studentID, String program, Transcript transcirpt) {
        this.name = name;
        this.studentID = studentID;
        this.program = program;

        this.transcript = transcript;

        this.modules = new ArrayList<>();
        this.grades = new HashMap<>();
        this.attemptedGrades = new HashMap<>();

    }
}

