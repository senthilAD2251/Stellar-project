import java.util.Scanner;

public class Main {
    static class Course {
        int courseId;
        String courseName;
        int duration; // in weeks

        Course(int courseId, String courseName, int duration) {
            this.courseId = courseId;
            this.courseName = courseName;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return "Course ID: " + courseId + ", Name: " + courseName + ", Duration: " + duration + " weeks";
        }
    }

    static Course courses[] = new Course[100];
    static int courseCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Course Management System ---");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Delete Course");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addCourse(sc);
                    break;
                case 2:
                    viewCourses();
                    break;
                case 3:
                    deleteCourse(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    private static void addCourse(Scanner scanner) {
        System.out.print("Enter Course ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Course Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Course Duration (in weeks): ");
        int duration = scanner.nextInt();
        courses[courseCount++] = new Course(id, name, duration);
        System.out.println("Course added successfully.");
    }

    private static void viewCourses() {
        if (courseCount == 0) {
            System.out.println("No courses found.");
        } else {
            System.out.println("\n--- List of Courses ---");
            for (int i = 0; i < courseCount; i++) {
                System.out.println(courses[i]);
            }
        }
    }

    private static void deleteCourse(Scanner scanner) {
        if (courseCount == 0) {
            System.out.println("No courses to delete.");
            return;
        }

        System.out.print("Enter Course ID to delete: ");
        int id = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < courseCount; i++) {
            if (courses[i].courseId == id) {
                for (int j = i; j < courseCount - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[--courseCount] = null;
                found = true;
                System.out.println("Course deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Course with ID " + id + " not found.");
        }
    }
}
