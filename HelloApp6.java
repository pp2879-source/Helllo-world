public class HelloApp6 {
    public static void main(String[] args) {

        String result;

        // Check if no arguments are passed
        if (args.length == 0) {
            result = "World";
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing comma and space
            if (nameBuilder.length() > 0) {
                result = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                result = "World";
            }
        }

        // Print greeting
        System.out.println("Hello, " + result + "!");
    }
}