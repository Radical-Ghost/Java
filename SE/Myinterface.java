// Define the Sports interface
interface Sports {
    void calculateScore();
}

// Create the Student class
class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Create the Test class which inherits from Student
class Test extends Student {
    int marks;

    public Test(String name, int rollNumber, int marks) {
        super(name, rollNumber);
        this.marks = marks;
    }

    public void displayTestInfo() {
        System.out.println("Test Marks: " + marks);
    }
}

// Create the Result class which implements the Sports interface
class Result implements Sports {
    int sportsScore;

    public Result(int sportsScore) {
        this.sportsScore = sportsScore;
    }

    @Override
    public void calculateScore() {
        System.out.println("Calculating Sports Score...");
    }

    public void displaySportsScore() {
        System.out.println("Sports Score: " + sportsScore);
    }
}

// Create the Hybrid class with the main method
public class Myinterface {
    public static void main(String[] args) {
        // Create an object of the Result class
        Result result = new Result(95);

        // Display student information
        Student student = new Student("khushi", 221); // Create a Student object
        student.displayStudentInfo();

        // Display test information
        Test test = new Test("khushi", 221, 85); // Create a Test object
        test.displayTestInfo();

        // Calculate and display sports score
        result.calculateScore();
        result.displaySportsScore();
    }
}
