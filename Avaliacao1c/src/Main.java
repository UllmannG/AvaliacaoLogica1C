import java.util.Arrays;

public class Main {
    public static int[] sortEvenOdd(int[] nums){
        int evenCount = 0;

        for (int num : nums) {
            if (num % 2 ==0){
                evenCount++;
            }
        }
        int[] evens = new int[evenCount];
        int[] odds = new int[nums.length - evenCount];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int num : nums){
            if( num % 2 == 0){
                evens[evenIndex++] = num;
            } else{
                odds[oddIndex++] =num;
            }
        }

        Arrays.sort(evens);
        Arrays.sort(odds);

        int[] sortedNums = new int[nums.length];
        System.arraycopy(evens, 0,sortedNums, 0, evenCount);
        System.arraycopy(odds, 0, sortedNums, evenCount, odds.length);
        return sortedNums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4,6,5};
        int[] sortedNums = sortEvenOdd(nums);
        System.out.println("Lista ordenada: "+ Arrays.toString(sortedNums));
    }
}