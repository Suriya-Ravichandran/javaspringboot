
public class code {
    public static int countPairs(int[] arr) {
        int n = arr.length;
        int count=0;
        for (int i = 0; i < n; i++) {
            String oprResult = removeEvenDigits(arr[i]); // Apply OPR on arr[i]
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + Integer.parseInt(oprResult)) == (arr[j] + Integer.parseInt(removeEvenDigits(arr[j])))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String removeEvenDigits(int num) {
        String numStr = Integer.toString(num);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++) {
            if (i % 2 == 0) {
                result.append(numStr.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        int count = countPairs(arr);
        System.out.println("Number of pairs satisfying the condition: " + count);
    }
}
