import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    //Attributes
    private String name;
    private final String studentID;
    private Program program;

    private List<Module> modules;
    private Map<Module, String> grades;
    private Map<Module, List<String>> attemptedGrades;

    private Transcript transcript;

    //Constructor
    public Student(String name, String studentID, Program program, Transcript transcirpt) {
        this.name = name;
        this.studentID = studentID;
        this.program = program;

        this.transcript = transcript;

        this.modules = new ArrayList<>();
        this.grades = new HashMap<>();
        this.attemptedGrades = new HashMap<>();

    }

    //Getters

    public String getName() {
        return name;
    }

    public String getStudentID(){
        return studentID;
    }

    public Program getProgram(){
        return program;
    }

    public List<Module> getModules() {
        return new ArrayList<>(modules);
    }
    public String getGrade(Module module){
        return grades.get(module);
    }
    public Transcript getTranscript() {
        return transcript;
    }

    //Setters
    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid student name");
        }

        this.name = name;
    }

    public void changeProgram(Program newProgram){
        if (newProgram == null) {
            throw new IllegalArgumentException("Invalid program");
        }
        if (this.program == newProgram){
            return;
        }

        this.program = newProgram;
    }
}


