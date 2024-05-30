public class Point {
    String question;
    String answer;
    Point next;

    public Point(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
    }
}