package gr.odeioformix.formixmanage.service;

import gr.odeioformix.formixmanage.model.Student;
import java.util.List;
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
