class CommandLineDemo2 {
    public static void main(String args[]) {
        // Check if enough arguments are provided
        if (args.length < 3) {
            System.out.println("Usage: java CommandLineDemo2 <name> <roll_no> <dept>");
            return;
        }

        String name = args[0];
        String roll_no = args[1];
        String dept = args[2];

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Department: " + dept);
    }
}

