public class Client implements Chair {
    private final Factory chairFactory;
    private String name;

    public Client(Factory chairFactory, String name) {
        this.chairFactory = chairFactory;
        this.name = name;

    }

    public Chair orderChair(ChairTypes type) {
        Chair chair = chairFactory.createChair(type);


        System.out.println("Thanks for order: " + chair.GetType() + " see you again!");
        return chair;
    }

    @Override
    public void sit(Chair chair) {
        System.out.println("So you sit on " + " " + chair.GetType());
    }

    @Override
    public String GetType() {
        return null;
    }
}