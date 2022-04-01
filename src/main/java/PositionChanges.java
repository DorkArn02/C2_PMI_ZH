import java.util.Map;
/**
 * @author Dorkó Arnold
 */
public class PositionChanges extends Team{
    /**
     * Changes the specified person's position
     * @param member1 Person's name
     * @param position2 Person's position
     */
    public void promote(String member1, String position2) {
        for(Map.Entry<String, String> entry : T.entrySet()){
            if(entry.getKey().equals(member1)){
                entry.setValue(position2);
            }
        }
    }
}
