package Problems;
public class problem2 {
    public static void main(String[] args) {
        int limit = 4000000;
        int sum = 0;
        int a = 1;
        int b = 2;
        while (b <= limit) {
            if (b % 2 == 0){
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(sum);
    }
}
