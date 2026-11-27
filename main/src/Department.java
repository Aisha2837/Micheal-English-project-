import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Department {

    // fields
    private int departmentID;
    private String name;
    private HashMap<Integer, Programme> programmes;


    // constructor
    public Department(int departmentID, String name) {
        this.departmentID = departmentID;
        this.name = name;
        this.programmes = new HashMap<>();
    }

    // add new programme
    public boolean addProgramme(Programme programme) {
        if (programmes.containsKey(programme.getProgrammeID())) {
            return false;
        }
        programmes.put(programme.getProgrammeID(), programme);
        return true;
    }


    // review student progression
    public ArrayList<Student> reviewProgression(int programmeID, Collection<Student> allStudents) {
        ArrayList<Student> programmeStudents = new ArrayList<>();
        if (!programmes.containsKey(programmeID)) {
            return programmeStudents;
        }
        for (Student student : allStudents) {
            if (student.getProgrammeID() == programmeID) {
                programmeStudents.add(student);
            }
        }
        return programmeStudents;
    }

}
