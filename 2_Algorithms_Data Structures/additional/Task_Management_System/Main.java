/*

Singly Linked List
    - Each node contains data and a reference to the next node only. One-way traversal.
Doubly Linked List
    - Each node contains data, a reference to the next node, and a reference to the previous node.
Circular Linked List
    - Last node points back to the head node, forming a loop.

    Add Task: O(n) -> Need to traverse to the end of the list.
    Search Task: O(n) -> Linear search through the list.
    Traverse: O(n) -> Visit each node.
    Delete Task: O(n) -> Linear search to find node and relink.

    Advantages of Linked Lists over Arrays:
        -> 	Grows/shrinks as needed
        -> Easy at head O(1)
        -> Efficient deletes

 */


public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();


        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(3, "Write Documentation", "Pending"));


        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("Searching Task with ID 2:");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Task not found.");

        System.out.println("Deleting Task with ID 1:");
        boolean deleted = taskList.deleteTask(1);
        System.out.println(deleted ? "Task deleted successfully." : "Task not found.");

        System.out.println("Tasks after deletion:");
        taskList.traverseTasks();
    }
}
