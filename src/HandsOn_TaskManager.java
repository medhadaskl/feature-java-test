import java.util.Scanner;

public class HandsOn_TaskManager {
    static class Task {
        private final int id;
        private final String name;
        private boolean Completed;

        public Task(int id, String name) {
            this.id = id;
            this.name = name;
            this.Completed = false;
        }

        public int getId() {
            return id;
        }

        public void markAsCompleted() {
            this.Completed = true;
        }

        @Override
        public String toString() {
            return id + ". " + name + " => " + (Completed ? "Completed" : "Not completed");
        }
    }

     class TaskManager {
        Task[] tasks = new Task[20];
        int taskCount = 0;
        int nextId = 1;

        public void addTask(String name) {
            if (taskCount < tasks.length) {
                Task task = new Task(nextId++, name);
                tasks[taskCount++] = task;
                System.out.println("added successfully.");
            } else {
                System.out.println("list is full.");
            }
        }

        public void listTasks() {
            if (taskCount == 0) {
                System.out.println("No tasks added.");
                System.out.println("--------------------------------");
                return;
            }

            for (int i = 0; i < taskCount; i++) {
                System.out.println(tasks[i]);
            }
        }

        public void markTaskAsCompleted(int id) {
            Task task = findTaskById(id);
            if (task != null) {
                task.markAsCompleted();
                System.out.println("Task marked as completed.");
            } else {
                System.out.println("Task not found.");
            }
        }

        public void deleteTask(int id) {
            int index = findTaskIndexById(id);
            if (index != -1) {
                for (int i = index; i < taskCount - 1; i++) {
                    tasks[i] = tasks[i + 1];
                }
                tasks[--taskCount] = null;
                System.out.println("Task deleted successfully.");
            } else {
                System.out.println("Task not found.");
            }
        }

        private Task findTaskById(int id) {
            for (int i = 0; i < taskCount; i++) {
                if (tasks[i].getId() == id) {
                    return tasks[i];
                }
            }
            return null;
        }

        private int findTaskIndexById(int id) {
            for (int i = 0; i < taskCount; i++) {
                if (tasks[i].getId() == id) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        HandsOn_TaskManager obj = new HandsOn_TaskManager();
        TaskManager taskManager = obj.new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Here is your Task Manager");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter task : ");
                    String name = scanner.nextLine();
                    taskManager.addTask(name);
                    break;
                case "2":
                    taskManager.listTasks();
                    break;
                case "3":
                    System.out.print("Enter task ID to mark as completed: ");
                    int completeId = Integer.parseInt(scanner.nextLine());
                    taskManager.markTaskAsCompleted(completeId);
                    break;
                case "4":
                    System.out.print("Enter task ID to delete: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    taskManager.deleteTask(deleteId);
                    break;
                case "5":scanner.close();
                    return;
                default: System.out.println("Invalid,Please enter again.");
                    break;

            }

        }
    }
}
