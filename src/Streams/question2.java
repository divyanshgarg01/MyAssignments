package Streams

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

public class question2{

    public static List<String> printUniqueCities(List<Trader> traders) {
        return traders.stream()
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
        return traders.stream()
                .filter(trader -> trader.getCity().equalsIgnoreCase("Pune"))
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public static String allTraderNames(List<Trader> traders) {
        return traders.stream()
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.joining(", "));
    }

    public static boolean areAnyTradersFromIndore(List<Trader> traders) {
        return traders.stream()
                .anyMatch(trader -> trader.getCity().equalsIgnoreCase("Indore"));
    }

    public static void main(String[] args) {
        List<Trader> traders = new ArrayList<>();
        traders.add(new Trader("John", "Pune"));
        traders.add(new Trader("Alice", "Mumbai"));
        traders.add(new Trader("Bob", "Delhi"));
        traders.add(new Trader("David", "Pune"));
        traders.add(new Trader("Emma", "Indore"));

        // What are all the unique cities where the traders work?
        List<String> uniqueCities = printUniqueCities(traders);
        System.out.println("Unique Cities: " + uniqueCities);

        // Find all traders from Pune and sort them by name.
        List<String> tradersFromPuneSortedByName = tradersFromPuneSortByName(traders);
        System.out.println("Traders from Pune (Sorted by Name): " + tradersFromPuneSortedByName);

        // Return a string of all traders' names sorted alphabetically.
        String allTraderNames = allTraderNames(traders);
        System.out.println("All Trader Names: " + allTraderNames);

        // Are any traders based in Indore?
        boolean anyTradersFromIndore = areAnyTradersFromIndore(traders);
        System.out.println("Any Traders from Indore? " + anyTradersFromIndore);
    }
}

