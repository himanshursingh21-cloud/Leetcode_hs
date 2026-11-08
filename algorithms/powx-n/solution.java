class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            N = -N;
        }
        
        double ans = 1.0;
        double current_product = x;
        
        // Iterative binary exponentiation
        while (N > 0) {
            // If the current bit is 1, multiply the current product into the answer
            if (N % 2 == 1) {
                ans = ans * current_product;
            }
            // Square the base for the next bit
            current_product = current_product * current_product;
            // Shift to the next bit
            N /= 2;
        }
        
        // Perform the division exactly once at the end to prevent compounding errors
        if (n < 0) {
            return 1.0 / ans;
        }
        
        return ans;
    }
}