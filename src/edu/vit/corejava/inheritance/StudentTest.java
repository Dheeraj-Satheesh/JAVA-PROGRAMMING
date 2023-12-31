package edu.vit.corejava.inheritance;
import java.time.LocalDate;
import java.util.ArrayList;
class Person{
    private String name;
    private LocalDate Dob;
    public Person(){}
    public Person(String name,LocalDate Dob){
        this.name=name;
        this.Dob=Dob;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setDob(LocalDate Dob)
    {
        this.Dob=Dob;
    }
    public LocalDate getDob()
    {
        return this.Dob;
    }
    public String toString()
    {
        return "Person[name: "+this.name+" Dob: "+this.Dob+" ]";
    }
}
class Student extends Person{
    private String regNumber;
    private String degree;
    public Student(){}
    public Student(String regNumber,String degree)
    {
        this.regNumber=regNumber;
        this.degree=degree;
    }
    public Student(String name,LocalDate Dob,String regNumber,String degree)
    {
        super(name,Dob);
        this.regNumber=regNumber;
        this.degree=degree;
    }
    public void setRegNumber(String regNumber)
    {
        this.regNumber=regNumber;
    }
    public void setDegree(String degree)
    {
        this.degree=degree;
    }
    public String getRegNumber()
    {
        return regNumber;
    }
    public String getDegree()
    {
        return degree;
    }
    public String display()//here both getName() and super.getName() both are valid
    {
        return "Student[name: %s Dob: %s regNumber: %s degree: %s ]".formatted(super.getName(),getDob(),this.regNumber,this.degree);
    }
    public String toString()//here both getName() and super.getName() both are valid
    {
        return "Student[name: %s Dob: %s regNumber: %s degree: %s ]".formatted(super.getName(),getDob(),this.regNumber,this.degree);
    }
    /*
    instead we can also use this toString() method
    @Override
    public String toString()
    {
        return (super.toString()+"\n register number: "+this.regNumber+" degree: "+this.degree;
    }
     */
}
public class StudentTest {
    public static void main(String[] args)
    {
        Person person=new Person("vishwa",LocalDate.of(2022,9,13));
        System.out.println(person.toString());
        System.out.println(person.getDob());
        System.out.println(person.getName());

        Student student=new Student("21bci0026","BCI");
        System.out.println(student.getDegree());
        System.out.println(student.getRegNumber());

        Student student1=new Student("ram",LocalDate.of(2021,10,12),"21bce0029","bce");
        System.out.println(student1.toString());
        System.out.println("***********************array list concept*******************");
        ArrayList<Student> btech=new ArrayList<Student>();
        btech.add(student);
        btech.add(student1);
        for(Student i:btech)
        {
            System.out.println(i.toString());
        }

    }
}