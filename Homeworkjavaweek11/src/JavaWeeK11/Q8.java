package JavaWeeK11;
/* 8. Write the program that tell you which line pass through particular stations.
Just use Zone 1 stations name.  */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Which stations are in Zone 1?
Zone 1 covers the West End, the Holborn district, Kensington,
Paddington, Euston, Old Street, Angel, Pimlico, Tower Gateway, Al`dgate East,  Vauxhall,
Elephant & Castle,  Borough, London Bridge, Earl's Court, Marylebone, Edgware Road, Lambeth North and Waterloo. */
public class Q8 {
    public static void main(String[] args) {
        Map<String, String> stationLinesMap = new HashMap<>();

       stationLinesMap.put("Paddington", "Bakerloo, Circle, District, Hammersmith & City");
        stationLinesMap.put("Angel", "Victoria, Circle, District");
        stationLinesMap.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo & City");
        stationLinesMap.put("Euston", "Northern, Victoria");
        stationLinesMap.put("London Bridge", "Circle, Hammersmith & City, Metropolitan, Northern, Piccadilly, Victoria");

        Scanner scanner = new Scanner(System.in);  // Getting user input for the station
        System.out.print("Enter a Zone1 tube station: ");
        String userStation = scanner.nextLine();

        if (stationLinesMap.containsKey(userStation)) { // Checking with if
            String tubeLines = stationLinesMap.get(userStation);
            System.out.println("Tube lines passing through zone1 : " + tubeLines);
        } else {
            System.out.println("The station " + userStation + " is not in the map.");
        }
    }
}
