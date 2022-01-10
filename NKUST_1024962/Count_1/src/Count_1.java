public class Count_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i % 2 == 0 ? -1 * i * i : i * i;
        }
        System.out.println(sum);
    }
}