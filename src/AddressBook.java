import java.util.ArrayList;

/**
 * SYSC3110 Lab2
 *
 * A class with a list of buddies.
 *
 * @author Ian Holmes 101149794
 * @version 1.0
 */
public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo newBud) {
        if (newBud != null) {
            buddies.add(newBud);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddies.size()) {
            return buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        BuddyInfo badBud = addressBook.removeBuddy(0);
    }
}
