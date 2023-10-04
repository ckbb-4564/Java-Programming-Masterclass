public class SpeedConverter {
    public static long toMilesPerHour(double kmPerHour) {
        if (kmPerHour < 0) {
            return -1;
        } else {
            double milesDivider = 1.609;
            long milesPerHour = Math.round(kmPerHour / milesDivider);
            return milesPerHour;
        }
    }// write your code here

    public static void printConversion(double kmPerHour) {
        if (kmPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kmPerHour);
            System.out.println(kmPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}