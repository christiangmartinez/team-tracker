import java.util.List;
import java.util.ArrayList

public class Member {
  private String mName;
  private String mWork;
  private String mSpecialty;
  private String mHome;
  private static List<Member> instances = new ArrayList<Member>();

  public Member(String name, String work, String specialty, String home) {
    mName = name;
    mWork = work;
    mSpecialty = specialty;
    mHome = home;
    instances.add(this);
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

}
