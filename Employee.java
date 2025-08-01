public class Employee {
    private int id ;
    private String name ; 
    private String department ; 
    private double salary;

    public Employee( int id , String name , String department, double salary)
    {
        this.id = id ; 
        this.name = name ; 
        this.department = department ;
        this.salary= salary ; 
    }
    //Getter Setters
    public int getId(){return id ;}
    public String getName(){return name ;}
    public String getDepartment(){return department ;}
    public double getSalary(){return salary ;}
    
    public void setSalary(double salary){
        this.salary = salary ;
    
    }
   /// overriding toString  make object visible  on printing   with System.out.println(employee_object)
    @Override
    public String toString(){
        return String.format("Employee{id = %d , name = '%s' , department = '%s' , salary = %.2f}",id,name , department , salary);
    }



}
