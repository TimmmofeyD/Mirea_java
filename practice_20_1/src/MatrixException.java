public class MatrixException extends Exception {

    private String cause;

    MatrixException(String cause) {
        this.cause = cause;
    }

    public String cause() {
        return this.cause;
    }
}
