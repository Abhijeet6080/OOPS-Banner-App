public class BannerApp {
    public static void main(String[] args) {
        // Constants
        double radiusKm = 6378.0;
        double kmToMiles = 0.621371;
        
        // Calculate Volume in km^3: (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Convert radius to miles and calculate Volume in miles^3
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        // Output exactly as required (formatted to avoid long decimals)
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f%n", volumeKm3, volumeMiles3);
    }
}
