import java.util.List;
import java.util.ArrayList;

public class Member {
  private String mName;
  private String mWork;
  private String mSpecialty;
  private String mHome;
  private static List<Member> instances = new ArrayList<Member>();
  private int mId;

  public Member(String name, String work, String specialty, String home) {
    mName = name;
    mWork = work;
    mSpecialty = specialty;
    mHome = home;
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mName;
  }

  public String getWork() {
    return mWork;
  }

  public String getSpecialty() {
    return mSpecialty;
  }

  public String getHome() {
    return mHome;
  }

  public int getId() {
    return mId;
  }

  public static List<Member> all() {
    return instances;
  }

  public static void clear () {
    instances.clear();
  }

  public static Member find(int id) {
    return instances.get(id - 1);
  }

}
