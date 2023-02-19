public class Main {
    public static void main(String[] args) {
        int lines = 2;
        int columns = 2;

        double[][] matrix1 = {
                {1, 3},
                {2, 5}};
        double[][] matrix2 = {
                {2, 3},
                {4, 1}};

        Matrix matrixClass1 = new Matrix(matrix1);
        matrixClass1.columns = 2;
        matrixClass1.lines = 2;

        Matrix matrixClass2 = new Matrix(matrix2);
        matrixClass2.columns = 2;
        matrixClass2.lines = 2;

        //Вывод на печать матриц
        matrixClass1.print();
        matrixClass2.print();

        //Сумма двух матриц
        matrixClass1.summation(matrixClass1, matrixClass2);

        //Произведение первой матрицы на число
        matrixClass1.multiplication(matrixClass1, 4);
        //Произведение второй матрицы на число
        matrixClass2.multiplication(matrixClass2, 2);

        //Произведение двух матриц
        matrixClass1.multiplyMatrix(matrixClass1, matrixClass2);
    }
}