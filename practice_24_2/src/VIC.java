public class VIC implements Chair {

    @Override
    public void sit(Chair chair) {
        System.out.println("This VIC");
    }

    @Override
    public String GetType() {
        return "vic";
    }
}