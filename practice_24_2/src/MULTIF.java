public class MULTIF implements Chair {
    @Override
    public void sit(Chair chair) {
        System.out.println("This MULTIF");
    }

    @Override
    public String GetType() {
        return "multif";
    }
}