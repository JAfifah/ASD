public class dragon {
    int x;
    int y;
    int width;
    int height;

    public dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }//afifah14

    public void moveLeft() {
        x--;
        if (x < 0) {
            detectCollision();
        }
    }

    public void moveRight() {
        x++;
        if (x > width) {
            detectCollision();
        }
    }

    public void moveUp() {
        y--;
        if (y < 0) {
            detectCollision();
        }
    }

    public void moveDown() {
        y++;
        if (y > height) {
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Position: (" + x + ", " + y + ")");
    }

    private void detectCollision() {
        System.out.println("Game Over");
    }

    public static void main(String[] args) {
        dragon myDragon = new dragon(0,0, 10, 10);

        myDragon.moveRight();
        myDragon.moveDown();
        myDragon.printPosition();

        myDragon.moveLeft();
        myDragon.moveUp();
    }
}
//afifah 14