public class Matrix {

    private final int rows;
    private final int columns;
    private final int[][] matrix;

    /****************** Constructors ******************/
    public Matrix() {
        this.rows    = 1;
        this.columns = 1;
        this.matrix  = new int[rows][columns];
    }

    public Matrix(int rows, int columns) throws MatrixException {

        if(rows <= 0 || columns <= 0) {
            throw new MatrixException("Заданы неверные размеры матрицы");
        }

        this.rows    = rows;
        this.columns = columns;
        this.matrix  = new int[rows][columns];
    }

    public Matrix(int size) throws MatrixException {
        if(size <= 0) {
            throw new MatrixException("Заданы неверные размеры матрицы");
        }

        this.rows = this.columns = size;
        this.matrix = new int[size][size];
    }

    public Matrix(int[][] matrix) {
        this.rows    = matrix.length;
        this.columns = matrix[0].length;
        this.matrix  = matrix;
    }
    /************************************************************************/

    public static Matrix sum(Matrix matrix1, Matrix matrix2) throws MatrixException {
        if (matrix1.rows != matrix2.rows || matrix1.columns != matrix2.columns) {
            throw new MatrixException("Размеры матриц не совпадают");
        } else {
            Matrix matrix = new Matrix(matrix1.rows, matrix1.columns);
            for(int i = 0; i < matrix1.rows; i++) {
                for(int j = 0; j < matrix1.columns; j++) {
                    matrix.matrix[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
                }
            }
            return matrix;
        }
    }

    public static final Matrix multiply(Matrix matrix1, Matrix matrix2) throws MatrixException {

        if(!check(matrix1, matrix2, true)) {
            throw new MatrixException("Размеры матриц не совпадают");
        }
        else {

            int size;
            int n;

            if(!matrix1.checkSquare()) {
                size = Math.min(matrix1.rows, matrix1.columns);
                n = Math.max(matrix1.rows, matrix1.columns);
            }
            else {
                size = matrix1.rows;
                n = matrix1.rows;
            }

            Matrix matrix = new Matrix(size);
            matrix.fill(0);

            for(int i = 0; i < size; i++) {
                for(int j = 0; j < size; j++) {
                    for(int k = 0; k < n; k++) {
                        matrix.matrix[i][j] += matrix1.matrix[i][k]*matrix2.matrix[k][j];
                    }
                }
            }

            return matrix;
        }
    }

    public final void print() {

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public final void fill(int number) {

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = number;
            }
        }
    }

    private final static boolean check(Matrix matrix1, Matrix matrix2, boolean forMultiply) {
        final boolean b = (matrix1.rows == matrix2.rows) && (matrix1.columns == matrix2.columns);
        if(forMultiply) {
            return b ||
                    (matrix1.columns == matrix2.rows);
        }
        else {
            return b;
        }
    }

    public final boolean checkSquare() {
        return rows == columns;
    }
}



