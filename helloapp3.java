public class helloapp3 {
    public static void main(String[] args) {

        String result;

        // Check if arguments are provided
        if (args.length == 0) {
            result = "World";
        } else {
            // Join all names with comma and space
            result = String.join(", ", args);
        }

        // Display greeting
        System.out.println("Hello, " + result + "!");
    }
}