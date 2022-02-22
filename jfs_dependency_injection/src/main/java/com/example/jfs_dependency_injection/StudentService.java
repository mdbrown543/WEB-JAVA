package jfs_dependency_injection.src.main.java.com.example.jfs_dependency_injection;

@Service
public class StudentService {

    @Autowired
    private StudentConfig studentConfig = new StudentConfig();
    public List<Student> getStudents() {
        return studentConfig.students;
    }

}

















