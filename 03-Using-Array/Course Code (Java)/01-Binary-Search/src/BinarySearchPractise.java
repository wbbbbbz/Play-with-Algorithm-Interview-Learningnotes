public class BinarySearchPractise {

    private BinarySearchPractise(){}

    // 使用非递归方法进行二分查找
    public static int binarySearch(Comparable[] arr, int n, Comparable target) {

        // 非递归方法，通过while语句，需要维护left, right, mid指针
        if (arr == null || arr.length == 0)
            return -1;
        // right是包括的
        // mid是偏左的
        int left = 0;
        int right = arr.length - 1;
        while (left < arr.length && right >= 0 && left < right) {
            int mid = left + (right - left) / 2;
            if (target.compareTo(arr[mid]) == 0)
                return mid;
            // 如果target比mid还小，就要到左边进行寻找
            // 此时只更改right
            else if (target.compareTo(arr[mid]) < 0)
                right = mid - 1;
            else
                left = mid + 1;
        }
        if (left == right && left >= 0 && left < arr.length && target.compareTo(arr[left]) == 0) {
            return left;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = (int) Math.pow(10, 7);
        Integer data[] = Util.generateOrderedArray(n);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
            if (i != binarySearch(data, n, i))
                throw new IllegalStateException("find i failed!");
        long endTime = System.currentTimeMillis();

        System.out.println("Binary Search test complete.");
        System.out.println("Time cost: " + (endTime - startTime) + " ms");
    }

}