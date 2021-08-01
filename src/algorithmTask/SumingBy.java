package algorithmTask;

public class SumingBy {
    public void sumiingByColumn(int[][] matrix){
        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++)
                total += matrix[row][column];
            System.out.println("Sum for column " + column + " is "
                    + total);
        }
    }
    public void sumingByRow(int[][] matrix){
        for (int column = 0; column < matrix.length; column++) {
            int total = 0;
            for (int row = 0; row < matrix[0].length; row++)
                total += matrix[column][row];
            System.out.println("Sum for column " + column + " is "
                    + total);
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1,3,4,5},{2,3,4,5},{3,4,5,6}};
        SumingBy sumingBy = new SumingBy();
        sumingBy.sumiingByColumn(array);
        System.out.println();
        sumingBy.sumingByRow(array);
    }
}
