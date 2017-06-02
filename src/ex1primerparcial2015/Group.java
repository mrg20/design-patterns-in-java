package ex1primerparcial2015;

public class Group {//It does not extends AbstractTableModel because we do not want to breake the SRP (SOLID)
    void addStudent(Student s){

    }

    int numStudents(){
        return 0;
    }

    Student getStudent(int numberOfStudent){
        return new Student();
    }

}
