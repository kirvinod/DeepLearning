public class MultiHiddenLayer {

    public static void main(String[] args) {

        int layerSize = 2;
        int nodeSizeInLayer = 2;

        double[] inputs = {1,1};

        double[][] weights = { {2,4}, {4,-5}, {0,1}, {1,1}, {5,1}};


        for (int layer = 0; layer < layerSize; layer++) {
            for (int node = 0; node < nodeSizeInLayer; node++) {
                System.out.println(layer);
                System.out.println(node);
                System.out.println("========");
            }

        }



//        double firstNodeValue = inputs[0] * weights[0][0] + inputs[1] * weights[0][1];
//
//        double secondNodeValue = inputs[0] * weights[1][0] + inputs[1] * weights[1][1];
//
//        double output = (firstNodeValue * weights[2][0]) + (secondNodeValue * weights[2][1]);
//
//        System.out.println(output);

    }

}
