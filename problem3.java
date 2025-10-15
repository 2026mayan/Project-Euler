package Problems;
public class problem3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        long largestPrimeFactor = 0;
        while (number % 2 == 0){
            largestPrimeFactor = 2;
            number /= 2;
        }
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrimeFactor = i;
                number /= i;
            }
        }
        if (number > 2){
            largestPrimeFactor = number;
        }
        System.out.println(largestPrimeFactor);
    }
}
