import org.testng.Assert;
import org.testng.annotations.*;

public class TC1 {


    @BeforeClass
    void beforeClass() {

        System.out.println("This will execute before every Class");


    }


    @AfterClass
    void afterClass() {

        System.out.println("This will execute after every Class");


    }


    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will execute before every method");

    }

    @AfterMethod
    void afterMethod() {

        System.out.println("This will execute after every method");

    }


    @Test
    void test1() {
        System.out.println("This is test1...");
        /*Assert.fail();

         */
    }

    @Test(dependsOnMethods = {"test1"},alwaysRun = true)
    void test2() {
        System.out.println("This is Test2...");

    }


    @BeforeTest
    void beforeTest() {
        System.out.println("This will execute before the test");

    }


    @AfterTest
    void afterTest() {
        System.out.println("This will execute before the test");

    }


}
