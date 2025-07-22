public class EmployeeManager {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        // Add Employees
        service.addEmployee(new Employee(1, "Alice", "HR", 50000));
        service.addEmployee(new Employee(2, "Bob", "Engineering", 70000));
        service.addEmployee(new Employee(3, "Charlie", "Finance", 60000));

        // Print All
        System.out.println("📋 All Employees:");
        for (Employee e : service.getAllEmployees()) {
            System.out.println(e);
        }

        // Update Salary
        System.out.println("\n💰 Updating Bob's salary to 75000...");
        service.updateSalary(2, 75000);

        // Delete an Employee
        System.out.println("\n❌ Deleting Alice...");
        service.deleteEmployee(1);

        // Print Final List
        System.out.println("\n✅ Final Employees:");
        for (Employee e : service.getAllEmployees()) {
            System.out.println(e);
        }
    }
}

/*
 ✅ Conceptual Summary of Java LLD Architecture

1️⃣ Object Layer (Model / POJO)
- Represents real-world entities (e.g., Employee, Student, etc.)
- Encapsulates data using private fields and provides access via getters/setters
- Acts as the basic data unit of the system

2️⃣ Service Layer (Business Logic)
- Contains logic to create, read, update, and delete objects
- Acts as a bridge between the object layer and the controlling logic
- Keeps logic reusable, testable, and separated from user interaction

3️⃣ Driver Layer (main() / Execution Layer)
- Acts as the entry point of the application
- Calls the service layer to perform operations on model objects
- Simulates the actual flow of the system

🧠 Key Principle: Separation of Concerns
Each layer has a specific role, making the system modular, clean, and maintainable.
*/
