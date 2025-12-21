import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User{
    
    String id;
    String name;

    public User(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Id: "+ id+", Name: " + name;
    }

}

public class SerachOpti {
    
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        // time complexity it takes is O(n) where n is the number of elements present in the list.
        userList.add(new User("U001", "Edward"));
        userList.add(new User("U002", "Jacob"));
        userList.add(new User("U003", "Carlisle"));

        // time complexity it takes is O(1) where n is the number of elements present in the list.
        Map<String,User> userMap = new HashMap<>();
        for (User u : userList) {
            userMap.put(u.id, u);
        }

        String searchId = "U003";
        Long startTime = System.nanoTime();
        User result = userMap.get(searchId);
        Long endTime = System.nanoTime();
        if (result != null) {
            System.out.println("User not found with id: "+ searchId);
            System.out.println("Serach Time: "+ (endTime-startTime));
        }
    }
}
