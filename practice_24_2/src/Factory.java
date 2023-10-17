public class Factory {
    public Chair createChair(ChairTypes type) {

        return switch (type) {
            case VIC -> new VIC();
            case MULTIF -> new MULTIF();
            case MAGIC -> new MAGIC();
        };
    }
}