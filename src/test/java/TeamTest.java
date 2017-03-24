import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Before
  public void tearDown() {
    Team.clear();
  }

  @Test
  public void team_instantiatesCorrectly_true() {
    Team testTeam = new Team("best team");
    assertTrue(testTeam instanceof Team);
  }

  @Test
  public void getName_teamInstantiatesWithName_bestTeam() {
    Team testTeam = new Team("best team");
    assertEquals("best team", testTeam.getName());
  }

  @Test
  public void all_returnsAllInstancesOfTeam_true() {
    Team firstTeam = new Team("best team");
    Team secondTeam = new Team("A-team");
    assertTrue(Team.all().contains(firstTeam));
    assertTrue(Team.all().contains(secondTeam));
  }

  @Test
  public void clear_emptiesList_0() {
    Team testTeam = new Team("best team");
    Team.clear();
    assertEquals(0, Team.all().size());
  }

  @Test
  public void getId_teamInstantiatesWithId_1() {
    Team testTeam = new Team("best team");
    assertEquals(1, testTeam.getId());
  }

  @Test
  public void find_returnsTeamById_secondTeam() {
    Team firstTeam = new Team("best team");
    Team secondTeam = new Team("A-team");
    assertEquals(secondTeam, Team.find(secondTeam.getId()));
  }

  @Test
  public void getMembers_initiallyReturnsEmptyList_ArrayList() {
    Team testTeam = new Team("best team");
    assertEquals(0, testTeam.getMembers().size());
  }

  @Test
  public void addMember_addsMemberToTeam_true() {
    Team testTeam = new Team("best team");
    Member testMember = new Member("Chulo", "Chulo's house", "Being a dog", "Portland");
    testTeam.addMember(testMember);
    assertTrue(testTeam.getMembers().contains(testMember));
  }

}
