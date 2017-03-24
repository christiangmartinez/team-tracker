import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void member_instantiatesCorrectly_true() {
    Member testMember = new Member("Chulo", "Chulo's house", "Being a dog", "Portland");
    assertTrue(testMember instanceof Member);
  }

  @Test
  public void getterMethods_returnMemberVariables_mVariables() {
    Member testMember = new Member("Chulo", "Chulo's house", "Being a dog", "Portland");
    assertEquals("Chulo", testMember.getName());
    assertEquals("Chulo's house", testMember.getWork());
    assertEquals("Being a dog", testMember.getSpecialty());
    assertEquals("Portland", testMember.getHome());
  }

}
