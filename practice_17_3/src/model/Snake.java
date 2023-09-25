package model;

import java.awt.Point;
import java.awt.event.KeyEvent;

public class Snake {
    private final Point[] pointBody = new Point[300];
    private int length;

    private boolean isLeft;
    private boolean isRight;
    private boolean isUp;
    private boolean isDown;

    private int directionX;
    private int directionY;

    public int[] x = new int[300];
    public int[] y = new int[300];

    public Snake() {
        isLeft = false;
        isRight = true;
        isUp = true;
        isDown = true;
        setDirectionX(10);
        setDirectionY(0);
        length = 3;
        y[0] = 100;
        x[0] = 150;
    }

    public void onMove(int side) {
        switch (side) {
            case KeyEvent.VK_LEFT -> {
                if (isLeft) {
                    setDirectionX(-10);
                    setDirectionY(0);
                    isRight = false;
                    isUp = true;
                    isDown = true;
                }
            }
            case KeyEvent.VK_UP -> {
                if (isUp) {
                    setDirectionX(0);
                    setDirectionY(-10);
                    isDown = false;
                    isRight = true;
                    isLeft = true;
                }
            }
            case KeyEvent.VK_DOWN -> {
                if (isDown) {
                    setDirectionX(0);
                    setDirectionY(+10);
                    isUp = false;
                    isRight = true;
                    isLeft = true;
                }
            }
            case KeyEvent.VK_RIGHT -> {
                if (isRight) {
                    setDirectionX(+10);
                    setDirectionY(0);
                    isLeft = false;
                    isUp = true;
                    isDown = true;
                }
            }
            default -> {
            }
        }

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Point[] getPointBody() {
        return pointBody;
    }

    public int getDirectionX() {
        return directionX;
    }

    public void setDirectionX(int directionX) {
        this.directionX = directionX;
    }

    public int getDirectionY() {
        return directionY;
    }

    public void setDirectionY(int directionY) {
        this.directionY = directionY;
    }

}