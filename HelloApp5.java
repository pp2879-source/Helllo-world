public class HelloApp5 {
    public static void main(String[] args) {

        String result;

        // Check if no arguments are passed
        if (args.length == 0) {
            result = "World";
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            int count = 0;

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name);

                // Add comma only if not last element
                if (count < args.length - 1) {
                    nameBuilder.append(", ");
                }
                count++;
            }

            result = nameBuilder.toString();
        }

        // Print greeting
        System.out.println("Hello, " + result + "!");
    }
}