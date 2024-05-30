public class Akar14 {
    public double num;

    public double akarBF(double num) {
        double low = 0, high = num, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return mid;
            } else if (mid * mid < num) {
                low = mid + 0.00001; 
            } else {
                high = mid - 0.00001; 
            }
        }
        return low;
    }

    public double akarDC(double num, double low, double high) {
        double mid = low + (high - low) / 2;
        if (high - low < 0.00001) {
            return mid;
        }
        if (mid * mid == num) {
            return mid;
        } else if (mid * mid < num) {
            return akarDC(num, mid, high);
        } else {
            return akarDC(num, low, mid);
        }
    }
}
