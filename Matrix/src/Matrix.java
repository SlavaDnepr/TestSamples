public final class Matrix {

    private final double[][] matrix;

    private final int rows;

    private final int columns;

    public Matrix(double[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            throw new MatrixException();

        for (int i = 0; i < matrix.length; i++)
            if (matrix[i].length == 0 || matrix[0].length != matrix[i].length)
                throw new MatrixException();

        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    public Matrix(int rows, int columns) {
        if (rows <= 0 || columns <= 0)
            throw new MatrixException();

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

    public Matrix add(Matrix matrix) {
        if (this.getRows() != matrix.getRows() || this.getColumns() != matrix.getColumns())
            throw new MatrixException();

        Matrix resultMatrix = new Matrix(matrix.getRows(), matrix.getColumns());

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                resultMatrix.set(i, j, this.get(i,j) + matrix.get(i, j));

        return resultMatrix;
    }

    public Matrix subtract(Matrix matrix) {
        if (this.getRows() != matrix.getRows() || this.getColumns() != matrix.getColumns())
            throw new MatrixException();

        Matrix resultMatrix = new Matrix(matrix.getRows(), matrix.getColumns());

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                resultMatrix.set(i, j, this.get(i,j) - matrix.get(i, j));

        return resultMatrix;
    }

    public Matrix multiply(Matrix matrix) {
        if (this.getRows() != matrix.getColumns() || this.getColumns() != matrix.getRows())
            throw new MatrixException();

        Matrix resultMatrix = new Matrix(this.getRows(), matrix.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                double sum = 0;
                for (int k = 0; k < this.getColumns(); k++) {
                     sum += this.get(i, k) * matrix.get(k, j);
                }
                resultMatrix.set(i, j, sum);
            }
        }

        return resultMatrix;
    }

    public double[][] toArray() {
        return this.matrix;
    }

    public double get(int i, int j) {
        if (i < 0 || j < 0 || i >= rows || j >= columns)
            throw new MatrixException();

        return this.matrix[i][j];
    }

    public void set(int i, int j, double value) {
        if (i < 0 || j < 0 || i >= rows || j >= columns)
            throw new MatrixException();

        this.matrix[i][j] = value;
    }
}
