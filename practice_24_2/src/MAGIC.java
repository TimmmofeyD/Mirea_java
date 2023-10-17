public class MAGIC implements Chair {
    @Override
    public void sit(Chair chair) {
        System.out.println("this MAGIC");
    }

    @Override
    public String GetType() {
        return "magic";
    }
}