package main;

import controller.HibernateUtil;
import model.Department;
import model.Student;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args){

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Department department=new Department();
        department.setDepartmentID(2234);

        Student student=new Student();
        student.setStudentID(107);
        student.setName("Nimal");
        student.setAge(23);
        student.setDep(department);


        session.save(student);
        session.save(department);

        //Commit the transaction
        session.getTransaction().commit();
        //session.close();

//        session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//
//        //Get only the reference of EmployeeEntity for now
//        Student empGet = (Student) session.byId( Student.class ).getReference( 100 );
//
//        System.out.println("No data initialized till now; Lets fetch some data..");
//
//
//        //Now EmployeeEntity will be loaded from database when we need it
//        System.out.println(empGet.getName());
//        System.out.println(empGet.getAge());
//
//        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }


}
