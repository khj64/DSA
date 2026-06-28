import java.util.HashSet;

public class Optimal3 {

    public static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};

        System.out.println("Optimal:");
        System.out.println(containsDuplicate(arr));
    }
}