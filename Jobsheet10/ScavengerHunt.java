public class ScavengerHunt {
    Point head;

    public ScavengerHunt() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addPoint(String question, String answer) {
        Point newPoint = new Point(question, answer);
        if (isEmpty()) {
            head = newPoint;
        } else {
            Point current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }

    public void printPoints() {
        if (isEmpty()) {
            System.out.println("Tidak ada point dalam scavenger hunt.");
        } else {
            Point current = head;
            while (current != null) {
                System.out.println("Pertanyaan: " + current.question);
                System.out.println("Jawaban: " + current.answer);
                current = current.next;
            }
        }
    }

}
