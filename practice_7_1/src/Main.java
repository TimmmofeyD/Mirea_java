interface Movable {
    void up();

    void down();

    void left();

    void right();
}


class MovableRectangle implements Movable {
    private int x;
    private int y;
    private final int width;
    private final int length;

    public MovableRectangle(int x, int y, int width, int length) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
    }

    public void ToString() {
        System.out.println("Length rectangle: " + this.length);
        System.out.println("Width rectangle: " + this.width);
        System.out.println("Coordinate rectangle: " + this.x + ", " + this.y);
    }

    @Override
    public void up() {
        this.y++;
    }

    @Override
    public void down() {
        this.y--;
    }

    @Override
    public void left() {
        this.x--;
    }

    @Override
    public void right() {
        this.x++;
    }

    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 1, 1);
        rectangle.ToString();
        rectangle.up();
        rectangle.left();
        rectangle.down();
        rectangle.right();
        rectangle.down();
        rectangle.ToString();
    }
}