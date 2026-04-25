import java.util.*;

class Student {
    int id;
    String name;
}

class Employee {
    int id;
    String name;
    double salary;
}

public class Main {
    public static void main(String[] args){

        Student s=new Student();
        s.id=1;
        s.name="Niketan";
        System.out.println(s.id+" "+s.name);

        Employee[] e=new Employee[2];

        for(int i=0;i<2;i++){
            e[i]=new Employee();
            e[i].id=i+1;
            e[i].name="Emp"+(i+1);
            e[i].salary=10000*(i+1);
        }

        for(Employee emp:e){
            System.out.println(emp.id+" "+emp.name+" "+emp.salary);
        }
    }
}
output:
1 Niketan
1 Emp1 10000.0
2 Emp2 20000.0
