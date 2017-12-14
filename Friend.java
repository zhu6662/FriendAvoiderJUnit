/**
 * Created by mbzhu on 12/12/2017.
 */

public class Friend{
    private String name;
    private boolean wantToFind;

    public Friend(String n, boolean w){
        name = n;
        wantToFind = w;
    }

    @Override
    public String toString(){
        return name;
    }

    public boolean findOrNot(){
        return wantToFind;
    }
}
