class Demo {
    private int id;
    private String name;
    private int marks;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else {
            return 'C';
        }
    }
}

public class student {
    public static void main(String[] args) {
        Demo s = new Demo();

        s.setId(1);
        s.setName("Rahul");
        s.setMarks(85);

        System.out.println("Student: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
        System.out.println("Grade: " + s.calculateGrade());
    }
}
