import java.util.ArrayList;

/**
 * Created by mbzhu on 12/12/2017.
 */

public class FriendList {

    private ArrayList<Friend> friendList = new ArrayList<>();

    public void addFriend(String n, boolean wantToFind){
        friendList.add(new Friend(n, wantToFind));
    }

    public String[] viewFriends(){
        String[] xlist = new String[friendList.size()];
        for(int i = 0; i < friendList.size(); i++){
            xlist[i] = friendList.get(i).toString();
        }
        return xlist;
    }
}
