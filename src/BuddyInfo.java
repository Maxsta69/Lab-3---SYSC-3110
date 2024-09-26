import java.util.ArrayList;
import java.util.List;

public class BuddyInfo {

    private String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        BuddyInfo friend = new BuddyInfo("Homer");
        System.out.println("Hello " + friend.name + "!");
    }
}