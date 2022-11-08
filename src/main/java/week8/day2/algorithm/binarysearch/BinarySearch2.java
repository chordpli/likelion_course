package week8.day2.algorithm.binarysearch;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int targetNo = 11;

        System.out.printf("length:%d\n", numbers.length);
        int startIdx = 0;
        int endIdx = numbers.length - 1;

        while (startIdx <= endIdx) {
            int midIndex = (startIdx + endIdx) / 2; // start:0 end:10
            System.out.println(midIndex);

            if (midIndex == targetNo) {
                System.out.printf("%d는 %d에 있습니다.", targetNo, midIndex);
                break;
            } else if (midIndex > targetNo) {
                // ---3---5----- 중간값 이상은 모두 버립니다. 5포함.
                endIdx = midIndex - 1;
            } else if (midIndex < targetNo) {
                // ------5---7-- 중간값 이하는 모두 버립니다. 5포함.
                startIdx = midIndex + 1;
            }
        }
    }
}
