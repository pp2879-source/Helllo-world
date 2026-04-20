public class HelloApp7 {
    public static void main(String[] args) {

        String result;

        // Check if no arguments
        if (args.length == 0) {
            result = "World";
        } else {
            // Join all names with delimiter
            result = String.join(", ", args);
        }

        // Print greeting
        System.out.println("Hello, " + result + "!");
    }
}