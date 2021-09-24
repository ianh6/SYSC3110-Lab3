/**
 * SYSC3110 Lab2
 *
 * A class with information about a buddy.
 *
 * @author Ian Holmes 101149794
 * @version 1.0
 */
public class BuddyInfo {

    private String name;            // name of the buddy
    private String address;         // address of the buddy
    private String phoneNum;        // the buddy's phone number

    /**
     * Default Constructor for BuddyInfo
     */
    public BuddyInfo() {
        this("", "", "123-456-7890");
    }

    /**
     * Constructor for BuddyInfo with custom attributes.
     *
     * @param name String, the name of the buddy
     * @param address String, the address of the buddy
     * @param phoneNum String, the phone number of the buddy
     */
    public BuddyInfo(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    /**
     * Gets the buddy's name.
     * @return String, the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the buddy's address.
     * @return String, the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the buddy's phone number.
     * @return String, the phone number
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Main method.
     * @param args String[], arguments for main method
     */

    /*
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "123 Springfield Dr.", "700-800-9000");

        System.out.print("Hello ");
        System.out.println(buddy.getName());
    }
    */
}
