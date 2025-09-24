/*
 * one java file can only have one public class
 * the name of the public class must be the same as the file name
 * other classes in the same file must not be public. in this case, the file name is Inheritance.java, so the public class must be Inheritance.
 * other classes have no "public" modifier
 */
class Person{
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
class Employee extends Person{
    private String company;
    private double salary;
    public Employee(String name,int age,String company,double salary){
        super(name,age);
        this.company = company;
        this.salary = salary;
    }
    public String company(){
        return this.company;
    }
    public double salary(){
        return this.salary;
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Employee onEmployee = new Employee("zhangsan",20,"alibaba",10000);
        System.out.println(onEmployee.getName());
        System.out.println(onEmployee.getAge());
        System.out.println(onEmployee.company());
        System.out.println(onEmployee.salary());

    }
}