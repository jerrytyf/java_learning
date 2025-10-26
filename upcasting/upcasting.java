class Person{
    private String name;
    private String address;
    private int age;
    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
}
class Employee extends Person{
    private String job;
    private double salary;
    public Employee(String name, String address, int age, String job, double salary){
        super(name, address, age);
        this.job = job;
        this.salary = salary;
    }
    public String getJob(){
        return job;
    }
    public double getSalary(){
        return salary;
    }
}
public class upcasting{
    public static void main(String[] args){
        Person p = new Employee("张三", "北京", 30, "工程师", 5000);
        System.out.println(p.getName());
        System.out.println(p.getAddress());
        System.out.println(p.getAge());
        System.out.println(((Employee)p).getJob());
        System.out.println(((Employee)p).getSalary());
    }
}