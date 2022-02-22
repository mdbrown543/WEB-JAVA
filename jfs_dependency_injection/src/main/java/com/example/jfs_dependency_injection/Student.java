package jfs_dependency_injection.src.main.java.com.example.jfs_dependency_injection;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;

    public Student(Long id,String name,String email,LocalDate dob){
        this.id = id;
        this.email = email;
        this.name = name;
        this.dob = dob;
    }

    public Long getId(){return id;}
    public void setId(Long newId){this.id = newId;}

    public String getName(){return name;}
    public void setName(String newName{this.name = newName;}

    public String getEmail(){return email;}
    public void setEmail(String newEmail){this.email = newEmail;}

    public LocalDate getDob(){return dob;}
    public void setDob(LocalDate newDob){this.dob = newDob;}

}






















