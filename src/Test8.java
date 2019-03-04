public class Test8 {
    public static void main(String[] args) {

        //System.out.println(Math.random());


        /*for (var i = 0; i < 30; i++)
            System.out.printf("%-3d",(int) (Math.random() * 10));*/

        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++){
                System.out.printf("%-3d", nums[i][j]);

            }
                System.out.println();
        }
    }
}
