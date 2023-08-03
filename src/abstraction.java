abstract class Parent
{
    protected String name;// if declared as private then we cannot access in the following sub-class
    protected Integer age;
    protected Parent(){}
    protected Parent(String name, Integer age)
    {
        this.name=name;
        this.age=age;
    }
    abstract protected void setName(String name);// abstract method, and has no body
    abstract protected String getName();
    abstract protected void setAge(Integer age);
    abstract protected Integer getAge();
}
class Son extends Parent
{
    protected Son(){}
    protected Son(String name,Integer age)
    {
        super(name,age);
    }
    @Override
    public void setName(String name)
    {
        this.name=name;
    }
    //@Override
    public void setAge(Integer age)
    {
        this.age=age;
    }
   // @Override
    public String getName()
    {
        return this.name;
    }
    //@Override
    public Integer getAge()
    {
        return this.age;
    }
}
public class abstraction{
    public static void main(String[] args)
    {
        Son son=new Son("ram",24);
        System.out.println(son.getAge());
        System.out.println(son.getName());
        son.setName("bheem");
        System.out.println(son.getName());
    }
}