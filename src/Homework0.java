public class Homework0 {
    public static void main(String[] args) throws Exception {
        //Test #1, Result of 11.75:
        //String[] input_strings = {"Beagle", "Great Dane", "Golden Retriever", "German Shepherd"};

        //Test #2, Result of 3.5:
        //String[] input_strings = {"a", "bb", "ccc", "dddd", "eeeee", "ffffff"};

        //Test #3
        String[] input_strings = {"Hello World", "", "Java", "Testing 123"};

        float mean_output = mean_string_length(input_strings);

        System.out.println("The mean length of each string in the given array of strings is " + mean_output);
    }

    public static float mean_string_length(String[] inputs) throws Exception {
        float mean = 0.00f;
        int arraytext = 0;
        int arraysize = inputs.length;

        for (String input : inputs) {
            arraytext += input.length();
        }

        mean = arraytext / (float) arraysize;

        return mean;
    }
}