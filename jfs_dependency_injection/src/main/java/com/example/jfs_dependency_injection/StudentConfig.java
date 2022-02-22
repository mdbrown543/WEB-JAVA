package jfs_dependency_injection.src.main.java.com.example.jfs_dependency_injection;

@Configuration
public class StudentConfig {
    public List<Student> students = new ArrayList<>();

    public Student student1() {
        return new Student(1L, “studentone”, “studentone@gmail.com”,
        LocalDate.of(1998, Month.August, 25));
    }

    @Bean
    public void addStudents() {
        students.addAll(List.of(student1(), student2()));
    }
}














