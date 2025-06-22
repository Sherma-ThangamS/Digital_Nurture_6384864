/*

    How Arrays Are Represented in Memory:  Arrays are stored in contiguous memory locations.

    Each element can be accessed using an index: address = base_address + (index × size_of_element)

    Fast random access: O(1) time to access any index.

    Time Complexity : O(1)

     Limitations of Arrays in Java :
        Fixed Size
        Inefficient Deletion/Insertion requires shifting elements (O(n) time).

 */


public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        ems.addEmployee(new Employee(101, "Alice", "Manager", 75000));
        ems.addEmployee(new Employee(102, "Bob", "Developer", 60000));
        ems.addEmployee(new Employee(103, "Charlie", "Analyst", 55000));

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("Search for employee with ID 102:");
        Employee e = ems.searchEmployee(102);
        System.out.println(e != null ? e : "Employee not found.");

        System.out.println("Deleting employee with ID 101:");
        boolean deleted = ems.deleteEmployee(101);
        System.out.println(deleted ? "Deleted successfully." : "Employee not found.");

        System.out.println("Employees after deletion:");
        ems.traverseEmployees();
    }
}
