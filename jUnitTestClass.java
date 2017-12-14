/**
 * Created by mbzhu on 12/12/2017.
 */

import android.location.Location;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class jUnitTestClass {
    @Test
    public void FriendConstructor(){
        Friend x =  new Friend("bob", true);
        assertTrue(true == x.findOrNot());
        assertTrue(x.toString().equals("bob"));
    }

    @Test
    public void addFriendTest(){
        FriendList x = new FriendList();
        x.addFriend("bob", true);
        assertTrue(x.viewFriends().length == 1);
        x.addFriend("sam", true);
        assertTrue(x.viewFriends().length == 2);
        x.addFriend("joe", true);
        assertTrue(x.viewFriends().length == 3);
    }

    @Test
    public void viewFriendTest(){
        FriendList x = new FriendList();
        x.addFriend("bob", true);
        x.addFriend("sam", true);
        x.addFriend("joe", true);
        String[] xy = {"bob","sam","joe"};
        assertTrue(x.viewFriends().equals(xy));
    }
}
