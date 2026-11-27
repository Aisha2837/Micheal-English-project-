import java.util.HashMap;

public class RecordSystem {

    // fields
    private HashMap<Integer, Student> students;
    private HashMap<String, Module> modules;


    // constructor
    public RecordSystem() {
        this.students = new HashMap<>();
        this.modules = new HashMap<>();
    }


    // store student
    public void storeStudent(Student student) {
        if (students.containsKey(student.getStudentID())) {
            System.out.println("Student ID already exists");
            return;
        }
        students.put(student.getStudentID(), student);
    }


    // store module
    public void storeModule(Module module) {
        if (modules.containsKey(module.getModuleCode())) {
            System.out.println("Module code already exists");
            return;
        }
        modules.put(module.getModuleCode(), module);
    }

}
