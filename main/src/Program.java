import java.util.HashMap;
import java.util.ArrayList;

public class Program {

    private int programID;
    private String programName;
    private String programType;
    private String programLevel;
    private int duration;

    private Department department;

    private ArrayList<Module> modules;

    private static HashMap<Integer, String> levels = new HashMap<>();

public Program(int programID, String programName, String programType, String programLevel, Department department)){
    this.programID = programID;
    this.programName = programName;
    this.programType = programType;
    this.programLevel = programLevel;
    this.department = department;

    this.modules = new ArrayList<>();

    if ("Undergraduate".equals(programLevel)){
        this.duration = 4;
    } else if ("Postgraduate".equals(programLevel)){
        this.duration = 1;
    } else {
        throw new IllegalArgumentException("Invalid programme level");
    }

    levels.put(programID, programLevel);

    }

}
