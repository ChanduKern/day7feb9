class Book {
    private String title;
    private boolean isIssued;

    public Book(String title) {
        this.title = title;
        this.isIssued = false;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued: " + title);
        } else {
            System.out.println("Book is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not issued.");
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");

        b1.issueBook();
        b1.issueBook();
        b1.returnBook();
        b1.returnBook();
    }
}
