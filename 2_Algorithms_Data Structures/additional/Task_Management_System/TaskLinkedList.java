public class TaskLinkedList {
    private Node head;

    // Add Task at the end
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Search Task by ID
    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.taskId == taskId) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    // Traverse Tasks
    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    // Delete Task by ID
    public boolean deleteTask(int taskId) {
        if (head == null) return false;

        if (head.task.taskId == taskId) {
            head = head.next;
            return true;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.task.taskId == taskId) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }

        return false;
    }
}
