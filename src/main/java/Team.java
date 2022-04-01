import java.util.HashMap;
import java.util.Map;
/**
 * @author Dorkó Arnold
 */
public class Team {
    // (name, position)
    protected HashMap<String, String> T;
    public Team(){
        this.T = new HashMap<>();
    }
    /**
     * Adds a new member into the team
     * @param member1 Person's name
     * @param position1 Person's position
     */
    public void newMember(String member1, String position1) {
        T.put(member1, position1);
    }
    /**
     * Removes a person from the team
     * @param member1 Person's name
     */
    public void leaveTeam(String member1) {
        T.remove(member1);
    }
    /**
     * Returns a string with name and position of all people in the team
     * @return name + position of people
     */
    public String getMembers() {
        StringBuilder s = new StringBuilder();

        for(Map.Entry<String, String> entry : T.entrySet()){
            s.append(entry.getKey()).append(" ").append(entry.getValue()).append("\r\n");
        }
        return s.toString().stripTrailing();
    }
}
