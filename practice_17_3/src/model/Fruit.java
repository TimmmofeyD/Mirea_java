package model;

import java.awt.Point;

public class Fruit {
    private Point point;
    private boolean food;

    public Fruit() {
        point = new Point();
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }
}