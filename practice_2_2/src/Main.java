// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Ball and book classes test
        Ball ball = new Ball(4);
        ball.display_info();
        }
    }
class Ball {
    int radius;
    int diameter;

    Ball(int radius) {
        this.radius = radius;
        this.diameter = this.radius * 2;
        System.out.println("\nBall object was created");
    }

    void display_info() {
        System.out.printf("Radius: %s \tDiameter: %d\n", this.radius, this.diameter);
    }
}