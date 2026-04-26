public class looping {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 3)
                continue;
            System.out.println(i);
        }
        for (int i = 0; i <= 5; i++) {
            if (i == 3)
                break;
            System.out.println(i);
        }

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            default:
                System.out.println("Invalid day");
        }

        try {
            // int res = 57 / 0;
        } catch (Exception e) {

            System.out.println("Exception: " + e);
        }
    }
}
