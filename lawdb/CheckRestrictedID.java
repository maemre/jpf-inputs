import java.util.*;

public class CheckRestrictedID
{
    ArrayList<Integer> ids;
    
    public CheckRestrictedID() {
        this.ids = new ArrayList<Integer>();
    }
    
    public void add(final int id) {
        this.ids.add(id);
    }
    
    public boolean isRestricted(final int id) {
        return this.ids.contains(id);
    }
    
    public boolean remove(final Integer key) {
        return this.ids.remove(key);
    }
}
