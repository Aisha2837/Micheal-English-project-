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
}
