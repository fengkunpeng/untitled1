import java.util.Arrays;
public class Test11 {
    void foo(int[] nums) {
//        for (int i = 0;i < nums.length; i++)
//            nums[i]++;
        nums = new int []{2,3,4};
        //nums的内容没有改变,只是这个变量现在引用了一个新的数组
        //原始的123数组还是存在的,只是这个变量不在引用它了
        System.out.println("in foo:" + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        int[] nums = {1,2,3};
        t.foo(nums);
        //当给方法传递的参数是引用类型时,如果在方法中修改了该引用类型所引用
        //对象中的内容时,在方法结束后,引用类型的引用内容是会发生改变的

        System.out.println("in main:" + Arrays.toString(nums));
    }
}
