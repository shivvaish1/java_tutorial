public class prime {
    public class ArmstrongNumbers {
        // Function to check if a number is an Armstrong number
        static boolean isArmstrong(int number) {
            int originalNumber = number;
            int numDigits = String.valueOf(number).length();
            int sum = 0;
    
            while (number != 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numDigits);
                number /= 10;
            }
    
            return sum == originalNumber;
        }
    
        public static void main(String[] args) {
            int number = 371; // Change this to any positive integer
            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    }
    
}
