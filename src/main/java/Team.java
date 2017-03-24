import java.util.List;
import java.util.ArrayList;

public class Team {
  private String mTeamName;
  private static List<Team> instances = new ArrayList<Team>();
  private int mId;


  public Team(String name) {
    mTeamName = name;
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mTeamName;
  }

  public int getId() {
    return mId;
  }

  public static List<Team> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public static Team find(int id) {
    return instances.get(id - 1);
  }

}
