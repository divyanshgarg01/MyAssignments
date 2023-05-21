
import java.util.Map;
import java.util.TreeMap;

enum Gender {
    Male,
    Female
}

class Contact  {
    long phoneNumber;
    String name, email;
    Gender gender;

    //constructor
    public Contact(long phoneNumber, String name, String email, Gender gender) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name : ").append(name);
        sb.append(",  PhoneNumber : ").append(phoneNumber);
        sb.append(",  Email : ").append(email);
        sb.append(",  Gender : ").append(gender);

        return sb.toString();
    }
}
public class question1 {
    public static void main(String[] args) {

        TreeMap<Long, Contact> map = new TreeMap<>();

        map.put((long) 994567892, new Contact(994567892, "Tushar", "tushar@gmail.com", Gender.Male));
        map.put((long) 994567891, new Contact(994567891, "John Doe", "john@gmail.com", Gender.Male));
        map.put((long) 994567893, new Contact(994567893, "Jane Doe", "jane@gmail.com", Gender.Female));
        map.put((long) 994567894, new Contact(994567894, "Emma", "emma@gmail.com", Gender.Female));
        map.put((long) 994567895, new Contact(994567895, "Ram", "ram@gmail.com", Gender.Male));

        // Fetch all the keys and print them
        for (long key : map.keySet()) {
            System.out.println(key);
        }

        // Fetch all the values and print them
        for (Contact contact : map.values()) {
            System.out.println(contact.toString());
        }

        for (Map.Entry<Long, Contact> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue().toString());
        }
    }
}