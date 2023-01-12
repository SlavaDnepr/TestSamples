public class Matrix {

    private double[][] matrix;

    private int rows;

    private int columns;

    public Matrix(double[][] matrix) {
        /*if (matrix == null)
            throw new MatrixException();
*/
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    public Matrix(int rows, int columns) {
        /*if (rows <= 0 || columns <= 0)
            throw new MatrixException();
*/
        this.matrix = new double[rows][columns];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                this.matrix[i][j] = 0;

        this.rows = rows;
        this.columns = columns;
    }

    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return this.columns;
    }

    public Matrix multiply(Matrix matrix) {
        return this;
    }

    public Matrix subtract(Matrix matrix) {
        return this;
    }

    public Matrix add(Matrix matrix) {
        return this;
    }

    public double[][] toArray() {
        return this.matrix;
    }

    public double get(int i, int j) {
        return this.matrix[i][j];
    }

    public void set(int i, int j, double value) {
        this.matrix[i][j] = value;
    }
}
