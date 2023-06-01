package personTestsWithData;

import com.software.person.Man;
import com.software.person.Woman;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WomanTestsWithData {

    @Test(dataProvider = "womanData")
    public void testIsRetired(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
        Woman woman = new Woman(firstName, lastName, age, weight, height);
        Assert.assertEquals(woman.isRetired(), expectedRetired);
    }

    @Test(dataProvider = "partnershipData")
    public void testRegisterPartnership(String womanFirstName, String womanLastName, int womanAge, int womanWeight, int womanHeight,
                                        String manFirstName, String manLastName, int manAge, int manWeight, int manHeight,
                                        String expectedLastName) {
        Woman woman = new Woman(womanFirstName, womanLastName, womanAge, womanWeight, womanHeight);
        Man man = new Man(manFirstName, manLastName, manAge, manWeight, manHeight);
        woman.registerPartnership(man);

        Assert.assertEquals(woman.getLastName(), expectedLastName);
    }

    @Test(dataProvider = "partnershipData")
    public void testDeregisterPartnership(String womanFirstName, String womanLastName, int womanAge, int womanWeight, int womanHeight,
                                          String manFirstName, String manLastName, int manAge, int manWeight, int manHeight,
                                          String expectedLastName) {
        Woman woman = new Woman(womanFirstName, womanLastName, womanAge, womanWeight, womanHeight);
        Man man = new Man(manFirstName, manLastName, manAge, manWeight, manHeight);
        woman.registerPartnership(man);
        woman.deregisterPartnership(true);

        Assert.assertEquals(woman.getLastName(), woman.getPreviousLastName());
    }
    @DataProvider(name = "womanData")
    public Object[][] provideWomanData() {
        return new Object[][]{
                {"Olga", "Danyluk", 66, 62, 168, true},
        };
    }

    @DataProvider(name = "partnershipData")
    public Object[][] providePartnershipData() {
        return new Object[][]{
                {"Olga", "Danyluk", 66, 62, 168, "Oleg", "Prutyla", 66, 75, 185, "Prutyla"},
        };
    }
        @Test(dataProvider = "womanData")
        public void testGetFirstName(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Woman woman = new Woman(firstName, lastName, age, weight, height);
            Assert.assertEquals(woman.getFirstName(), firstName);
        }

        @Test(dataProvider = "womanData")
        public void testGetLastName(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Woman woman = new Woman(firstName, lastName, age, weight, height);
            Assert.assertEquals(woman.getLastName(), lastName);
        }

        @Test(dataProvider = "womanData")
        public void testGetAge(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Woman woman = new Woman(firstName, lastName, age, weight, height);
            Assert.assertEquals(woman.getAge(), age);
        }

        @Test(dataProvider = "womanData")
        public void testGetWeight(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Woman woman = new Woman(firstName, lastName, age, weight, height);
            Assert.assertEquals(woman.getWeight(), weight);
        }

        @Test(dataProvider = "womanData")
        public void testGetHeight(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Woman woman = new Woman(firstName, lastName, age, weight, height);
            Assert.assertEquals(woman.getHeight(), height);
        }

        @Test(dataProvider = "womanData")
        public void testSetFirstName(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Woman woman = new Woman(firstName, lastName, age, weight, height);
            woman.setFirstName("Anna");
            Assert.assertEquals(woman.getFirstName(), "Anna");
        }

        @Test(dataProvider = "womanData")
        public void testSetLastName(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Woman woman = new Woman(firstName, lastName, age, weight, height);
            woman.setLastName("Kosaka");
            Assert.assertEquals(woman.getLastName(), "Kosaka");
        }

        @Test(dataProvider = "womanData")
        public void testSetAge(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Woman woman = new Woman(firstName, lastName, age, weight, height);
            woman.setAge(75);
            Assert.assertEquals(woman.getAge(), 75);
        }

        @Test(dataProvider = "womanData")
        public void testSetWeight(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Woman woman = new Woman(firstName, lastName, age, weight, height);
            woman.setWeight(63);
            Assert.assertEquals(woman.getWeight(), 63);
        }

        @Test(dataProvider = "womanData")
        public void testSetHeight(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Woman woman = new Woman(firstName, lastName, age, weight, height);
            woman.setHeight(170);
            Assert.assertEquals(woman.getHeight(), 170);
        }
    }
