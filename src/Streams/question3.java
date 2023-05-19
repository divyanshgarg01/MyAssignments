package Streams

import java.util.ArrayList;
import java.util.Comparator;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}

public class question3{
    public static List<Transaction> sortTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Delhi"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());
    }

    public static int highestTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .orElse(0);
    }

    public static int smallestTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .orElse(0);
    }

    public static void main(String[] args) {

        Trader trader1 = new Trader("John", "Delhi");
        Trader trader2 = new Trader("Alice", "Mumbai");
        Trader trader3 = new Trader("Bob", "Chennnai");
        Trader trader4 = new Trader("Mike", "Punjab");


        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(trader1, 2011, 100));
        transactions.add(new Transaction(trader2, 2011, 200));
        transactions.add(new Transaction(trader3, 2011, 300));
        transactions.add(new Transaction(trader4, 2011, 400));



        List<Transaction> sorted2011Transactions = sortTransactions(transactions);
        System.out.println("Transactions in 2011, sorted by value: " + sorted2011Transactions);

        List<Integer> delhiTransactionValues = transactionsValuesDelhi(transactions);
        System.out.println("Values of transactions from traders in Delhi: " + delhiTransactionValues);

        int highestValue = highestTransaction(transactions);
        System.out.println("Highest transaction value: " + highestValue);

        int smallestValue = smallestTransaction(transactions);
        System.out.println("Smallest transaction value: " + smallestValue);
    }
}
