package ca.bytetube.day07;

public class FindTargetInSortedMatrix {

    public static boolean findTargetInSortedMatrix(int[][] matrix,int target){
        if (matrix == null) return false;

        //从右上角开始
        int r = 0;
        int c = matrix[0].length - 1;
        while (r <= matrix.length -1 && c >= 0){
            if (matrix[r][c] == target) {
                return true;
            }else if (matrix[r][c] > target) {
                c--;
            }else {//matrix[r][c] < target
                r++;
            }
        }

        return false;

    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(findTargetInSortedMatrix(matrix,19));
    }
}
