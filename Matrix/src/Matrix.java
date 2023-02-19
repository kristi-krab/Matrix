public class Matrix {
    int lines;
    int columns;
    double[][] matrixA = new double[this.lines][this.columns];
    public Matrix(double[][] matrix) {
        this.matrixA = matrix;
    }
    //метод вывода на печать матрицы
    public void print() {
        System.out.println("Вывод матрицы: ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    //медод сложения двух матриц
    public void summation(Matrix matrix1, Matrix matrix2) {
        System.out.println("Сложение первой матррицы со второй: ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((matrix1.matrixA[i][j] + matrix2.matrixA[i][j]) + " ");
            }
            System.out.print("\n");
        }
    }
    //медод умножения матрицы на число
    public void multiplication(Matrix matrix, double num) {
        System.out.println("Умножение на число ("+(int)num+"): ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((matrix.matrixA[i][j] * num) + " ");
            }
            System.out.print("\n");
        }
    }
    //метод умножения двух матриц
    public void multiplyMatrix(Matrix matrix1, Matrix matrix2)
    {
        System.out.println("Умножение двух матриц: ");
        double[][]result = new double[lines][columns];
        for(int i=0;i<lines;i++)
        {
            for(int j=0;j<columns;j++)
            {
                for(int a=0;a<lines;a++)
                {
                    result[i][j] += matrix1.matrixA[i][a] * matrix2.matrixA[a][j];
                }
            }
        }
        for(int i=0;i<lines;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
