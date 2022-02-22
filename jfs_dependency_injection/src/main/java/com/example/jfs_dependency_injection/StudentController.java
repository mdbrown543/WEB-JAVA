package jfs_dependency_injection.src.main.java.com.example.jfs_dependency_injection;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    private StudentService studentService = new StudentService();

    @GetMapping(path = “students”)
    public List<students> getStudents(){
        return studentService.getStudents();
    }

}

















