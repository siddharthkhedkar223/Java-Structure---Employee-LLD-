import java.util.ArrayList;
import java.util.List;

public class EmployeeService{
    private List<Employee> employees= new ArrayList<>();
    
    //Add Employee
    public void addEmployee(Employee e){
        employees.add(e);

    }

    //Get all employees
    public List<Employee> getAllEmployees(){
        return employees;
    }

    //GEt Employee by id 
    public Employee getEmployeeById(int id) {
        for( Employee e : employees)
        {
            if( e.getId()==id)
            {
               return e ;
            }
        }
        return null ; 
    }
    public boolean updateSalary(int id ,double salary )
    {
       for( Employee e : employees)
       {
            if( e.getId()==id)
            {
                e.setSalary(salary);
                return true ;
            }
       }
       return false  ;
    }

    public boolean deleteEmployee( int id )
    {
        for( Employee  e : employees)
        {
            if( e.getId()==id)
            {
                employees.remove( e);
                return true ; 
            }
        }
        return false  ;

    }
}