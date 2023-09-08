public class Main {
    public static void main(String[] args) {
        MovableCircle movable_circle = new MovableCircle(10, 0, 0, 1, 1);
        System.out.println(movable_circle);
        movable_circle.moveUp();
        movable_circle.moveUp();
        movable_circle.moveRight();
        System.out.println(movable_circle);
    }
}

interface Movable {
    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}
class MovablePoint implements Movable {
    private int x;
    private int y;
    private final int xSpeed;
    private final int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        System.out.println("\nMovablePoint object was created");
    }

    public String toString() {
        return "MovablePoint object - x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ", ySpeed: " + this.ySpeed;
    }

    public void moveUp() {
        this.y += this.ySpeed;
        System.out.println("MovablePoint object moved up by " + this.ySpeed);
    }

    public void moveDown() {
        this.y -= this.ySpeed;
        System.out.println("MovablePoint object moved down by " + this.ySpeed);
    }

    public void moveLeft() {
        this.x -= this.xSpeed;
        System.out.println("MovablePoint object moved left by " + this.xSpeed);
    }

    public void moveRight() {
        this.x += this.xSpeed;
        System.out.println("MovablePoint object moved right by " + this.xSpeed);
    }
}

class MovableCircle implements Movable {
    private final int radius;
    private final MovablePoint center;

    MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
        System.out.println("MovableCircle object was created");
    }

    public String toString() {
        return "MovableCircle object - radius: " + this.radius + ", center: " + center;
    }

    public void moveUp() {
        this.center.moveUp();
        System.out.println("MovableCircle object moved up");
    }

    public void moveDown() {
        this.center.moveDown();
        System.out.println("MovableCircle object moved down");
    }

    public void moveLeft() {
        this.center.moveLeft();
        System.out.println("MovableCircle object moved left");
    }

    public void moveRight() {
        this.center.moveRight();
        System.out.println("MovableCircle object moved right");
    }
}