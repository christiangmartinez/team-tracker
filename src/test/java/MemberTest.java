import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Before
  public void tearDown() {
    Member.clear();
  }

  @Test
  public void member_instantiatesCorrectly_true() {
    Member testMember = new Member("Chulo", "Chulo's house", "Being a dog", "Portland");
    assertTrue(testMember instanceof Member);
  }

  @Test
  public void member_memberInstatiatesWithVariables_mVariables() {
    Member testMember = new Member("Chulo", "Chulo's house", "Being a dog", "Portland");
    assertEquals("Chulo", testMember.getName());
    assertEquals("Chulo's house", testMember.getWork());
    assertEquals("Being a dog", testMember.getSpecialty());
    assertEquals("Portland", testMember.getHome());
    assertEquals(1 , testMember.getId());
  }

  @Test
  public void all_returnsAllInstancesOfMember_true() {
    Member firstMember = new Member("Chulo", "Chulo's house", "Being a dog", "Portland");
    Member secondMember = new Member("Valentina", "Valentina's house", "Being a cat", "Portland");
    assertTrue(Member.all().contains(firstMember));
    assertTrue(Member.all().contains(secondMember));
  }

  @Test
  public void clear_emptiesList_0() {
    Member testMember = new Member("Chulo", "Chulo's house", "Being a dog", "Portland");
    Member.clear();
    assertEquals(0, Member.all().size());
  }

  @Test
  public void find_returnsMemberById_secondMember() {
    Member firstMember = new Member("Chulo", "Chulo's house", "Being a dog", "Portland");
    Member secondMember = new Member("Valentina", "Valentina's house", "Being a cat", "Portland");
    assertEquals(secondMember, Member.find(secondMember.getId()));
  }

}
