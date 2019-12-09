package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {

    @Id
    private int departmentID;
    private String depName;

    @OneToOne(mappedBy="department")
    private Student s;

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepName() {
        return depName;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
