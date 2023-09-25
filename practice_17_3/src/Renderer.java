import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.Snake;
import model.Fruit;

class Renderer extends JFrame {
    private final int WIDTH = 500;
    private final int HEIGHT = 300;
    private final Snake snake;

    private final Controller controller;
    public JPanel pamel1, panel2;
    public JButton[] ButtonBody = new JButton[200];
    public JButton bonusfood;
    public JTextArea textArea;
    public Fruit fruit;
    public int score;
    public Random random = new Random();
    public JMenuBar mybar;
    public JMenu game, help;

    public void initializeValues() {
        score = 0;
    }

    @SuppressWarnings("deprecation")
    Renderer(Controller controller) {
        super("Snake: PSU edition");
        this.controller = controller;
        snake = controller.getSnake();

        fruit = new Fruit();
        setBounds(200, 200, 506, 380);
        creatbar();
        initializeValues();
        // GUI панельки
        pamel1 = new JPanel();
        panel2 = new JPanel();
        // Текстовое поле очков
        setResizable(false);
        textArea = new JTextArea("Scores : " + score);
        textArea.setEnabled(false);
        textArea.setBounds(400, 400, 100, 100);
        textArea.setBackground(Color.black);
        // Змея ест и ростет
        bonusfood = new JButton();
        bonusfood.setEnabled(false);
        // Создаем начальную 3-ех кнопочную змею
        createFirstSnake();

        pamel1.setLayout(null);
        panel2.setLayout(new GridLayout(0, 1));
        pamel1.setBounds(0, 0, WIDTH, HEIGHT);
        pamel1.setBackground(Color.blue);
        panel2.setBounds(0, HEIGHT, WIDTH, 30);
        panel2.setBackground(Color.black);

        panel2.add(textArea); // will contain score board
        // end of UI design
        getContentPane().setLayout(null);
        getContentPane().add(pamel1);
        getContentPane().add(panel2);
        show();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    // Создаем начальную змейку(из 3 кнопок)
    public void createFirstSnake() {

        for (int i = 0; i < 3; i++) {
            ButtonBody[i] = new JButton(" " + i);
            ButtonBody[i].setEnabled(false);
            pamel1.add(ButtonBody[i]);
            ButtonBody[i].setBounds(snake.x[i], snake.y[i], 10, 10);
            snake.x[i + 1] = snake.x[i] - 10;
            snake.y[i + 1] = snake.y[i];
        }
    }

    // Создаем меню бар
    public void creatbar() {
        mybar = new JMenuBar();

        game = new JMenu("Игра");

        JMenuItem newgame = new JMenuItem("Новая игра");
        JMenuItem exit = new JMenuItem("Выход");
        newgame.addActionListener(e -> reset());

        exit.addActionListener(e -> System.exit(0));

        game.add(newgame);
        game.addSeparator();// Разделитель
        game.add(exit);

        mybar.add(game);

        help = new JMenu("Помощь");

        JMenuItem creator = new JMenuItem("Автор");

        creator.addActionListener(e -> JOptionPane.showMessageDialog(pamel1, "Лищенко Тимофей Викторович"));

        help.add(creator);
        mybar.add(help);

        setJMenuBar(mybar);
    }

    // Начало новой игры
    void reset() {
        initializeValues();
        pamel1.removeAll();

        controller.stopGame();

        createFirstSnake();
        textArea.setText("Scores: " + score);

        controller.startGame();
    }

    // кушаем растем
    void growup() {
        ButtonBody[snake.getLength()] = new JButton(" " + snake.getLength());
        ButtonBody[snake.getLength()].setEnabled(false);
        pamel1.add(ButtonBody[snake.getLength()]);
        ButtonBody[snake.getLength()].setBounds(snake.getPointBody()[snake.getLength() - 1].x, snake.getPointBody()[snake.getLength() - 1].y, 10, 10);
        snake.setLength(snake.getLength() + 1);
    }

    void moveForward() {
        for (int i = 0; i < snake.getLength(); i++) {
            snake.getPointBody()[i] = ButtonBody[i].getLocation();
        }

        snake.x[0] += snake.getDirectionX();
        snake.y[0] += snake.getDirectionY();
        ButtonBody[0].setBounds(snake.x[0], snake.y[0], 10, 10);
        // Для эффекта летницы
        for (int i = 1; i < snake.getLength(); i++) {
            ButtonBody[i].setLocation(snake.getPointBody()[i - 1]);
        }

        if (snake.x[0] == WIDTH) {
            controller.stopGame();
        } else if (snake.x[0] == 0) {
            controller.stopGame();
        } else if (snake.y[0] == HEIGHT) {
            controller.stopGame();
        } else if (snake.y[0] == 0) {
            controller.stopGame();
        }

        createFruit();

        collisionFruit();
        pamel1.repaint();

    }

    private void collisionFruit() {
        if (fruit.isFood()) {
            if (fruit.getPoint().x == snake.x[0] && fruit.getPoint().y == snake.y[0]) {
                pamel1.remove(bonusfood);
                score += 1;
                growup();
                textArea.setText("Scores: " + score);
                fruit.setFood(false);

            }
        }
    }

    private void createFruit() {
        if (!fruit.isFood()) {
            pamel1.add(bonusfood);
            bonusfood.setBounds((10 * random.nextInt(50)), (10 * random.nextInt(25)), 10,
                    10);
            fruit.setPoint(bonusfood.getLocation());
            fruit.setFood(true);
        }
    }

}