import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class NeuralNetwork {

    double weights[] = new double[3];

    double trainingInputs[][] = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
    double trainingOutput[][] = {{0},{1},{1},{0}};

    int trainingIterations = 1;

    public NeuralNetwork() {

        weights[0] = -0.16595599;
        weights[1] = 0.44064899;
        weights[2] = -0.99977125;

        System.out.println("Beginning Randomly Generated Weights:");
        System.out.println(Arrays.toString(weights));
    }

    public void train() {

        for (int i = 0; i < trainingIterations; i++) {
            System.out.println("============ Training EPOCH #"+i + " ============");

        }

    }

    private double getRandomNum() {
        return ThreadLocalRandom.current().nextDouble(-1, 1);
    }
}
