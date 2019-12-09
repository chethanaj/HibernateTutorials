package model;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    private int studentID;
    private String name;
    private int age;

    @OneToOne
    @JoinColumn(name="depId")
    private Department department;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDep() {
        return department;
    }

    public void setDep(Department dep) {
        this.department = dep;
    }
}
