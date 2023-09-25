import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

import model.Snake;

public class Controller implements KeyListener, ActionListener {
    private Renderer renderer;
    private Timer mainTimer;
    private Snake snake;

    public Controller() {
        snake = new Snake();
        renderer = new Renderer(this);

        this.renderer.addKeyListener(this);
        this.mainTimer = new Timer(50, this);
        mainTimer.start();
    }

    public void stopGame() {
        mainTimer.stop();
    }

    public void startGame() {
        mainTimer.start();
    }

    public void keyPressed(KeyEvent e) {
        snake.onMove(e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        renderer.moveForward();
    }

    public Snake getSnake() {
        return snake;
    }

}