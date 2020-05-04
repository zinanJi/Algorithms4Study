import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by zinan.ji on 2020-05-04.
 */
public class Stats {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<>();
        int N = 5;
        for (int i = 0; i < N; i++) {
            numbers.add(StdIn.readDouble());
        }

        double sum = 0.0;
        for (double x : numbers) {
            sum += x;
        }
        double mean = sum / N;

        sum = 0.0;
        for (double x : numbers) {
            sum += (x - mean) * (x - mean);
        }
        double std = Math.sqrt(sum / (N - 1));
        StdOut.printf("Mean:%.2f\n", mean);
        StdOut.printf("Std dev:%.2f\n", std);

    }
}
