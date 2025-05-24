public class ceiling {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char ans = Ceiling(letters, target); // Change to char
        System.out.println(ans);
    }

    static char Ceiling(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Use modulo to wrap around if target is greater than all elements
        return letters[start % letters.length];
    }
}
