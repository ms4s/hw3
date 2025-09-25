package Project.First.HomeWork3;


public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("1.");
        int[][] arr = {{2, -5},{-1, 7}};
        sumOfPositiveElements(arr);
        System.out.println("2.");
        square(3);
        System.out.println("3.");
        int[][] mainArr = {{4, 2, 7}, {7, 4, 9},{1, 3, 8}};
        diagonal(mainArr);
        System.out.println("4.");
        int[][] find = {{1,2,3},{4,500,6},{7,8,0}};
        findMax(find);
        System.out.println("5.");
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        sumSecondString(array);
    }

    public static void sumOfPositiveElements(int [][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] > 0){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void square(int intSize) {
        for (int i = 0; i < intSize; i++) {
            for (int j = 0; j < intSize; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diagonal(int[][] mainArr) {
        for (int i = 0; i < mainArr.length; i++) {
            for (int j = 0; j < mainArr[i].length; j++) {
                if (i == j){
                        mainArr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < mainArr.length; i++) {
            for (int j = 0; j < mainArr[i].length; j++) {
                System.out.print(mainArr[i][j]);
            }
            System.out.println();
        }
    }

    public static void findMax(int[][] find) {
        int max = 0;
        for (int i = 0; i < find.length; i++) {
            for (int j = 0; j < find[i].length; j++) {
                if (find[i][j] > max) {
                    max = find[i][j];
                }
            }
        }
        System.out.println(max);;
    }

    public static int sumSecondString(int[][]array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[1][i] > 0) {
                result += array[1][i];
            }
            else {
                return -1;
            }
        }
        System.out.println(result);
    return result;
    }
}

