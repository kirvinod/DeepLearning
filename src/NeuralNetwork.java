import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class NeuralNetwork {

    double inputs[] = {0.05,0.10};
    double weights[] ={0.15,0.20,0.25,0.30,0.40,0.45,0.50,0.55};
    double biases[] = {0.35,0.60};


    double outputs[] = {0.01,0.99};


    public NeuralNetwork() {
        //System.out.println(Arrays.toString(weights));
    }

    public void train() {


        //hidden layer
        double h1 = inputs[0] * weights[0] + inputs[1] * weights[1] + biases[0];
        double hout1 = sigmoid(h1);
        double h2 = inputs[0] * weights[2] + inputs[1] * weights[3] + biases[0];
        double hout2 = sigmoid(h2);

        //output layer
        double o1 = hout1 * weights[4] + hout2 * weights[5] + biases[1];
        double oOut1 = sigmoid(o1);
        double o2 = hout1 * weights[6] + hout2 * weights[7] + biases[1];
        double oOut2 = sigmoid(o2);


        //error
        double err1 = Math.pow(outputs[0] - oOut1, 2)/2;
        double err2 = Math.pow(outputs[1] - oOut2, 2)/2;
        double totalErr = err1 + err2;


        System.out.println(totalErr);






    }

    public double sigmoid(double num) {
        return 1d / (1 + Math.exp(-num));
    }


    private double getRandomNum() {
        return ThreadLocalRandom.current().nextDouble(-1, 1);
    }
}
