package personTestsWithData;

import com.software.person.Man;
import com.software.person.Woman;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ManTestsWithData {

    @Test(dataProvider = "manData")
    public void testIsRetired(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
        Man man = new Man(firstName, lastName, age, weight, height);
        Assert.assertEquals(man.isRetired(), expectedRetired);
    }

    @Test(dataProvider = "partnershipData")
    public void testRegisterPartnership(String manFirstName, String manLastName, int manAge, int manWeight, int manHeight,
                                        String womanFirstName, String womanLastName, int womanAge, int womanWeight, int womanHeight,
                                        String expectedLastName) {
        Man man = new Man(manFirstName, manLastName, manAge, manWeight, manHeight);
        Woman woman = new Woman(womanFirstName, womanLastName, womanAge, womanWeight, womanHeight);

        man.registerPartnership(woman);

        Assert.assertEquals(woman.getLastName(), expectedLastName);
    }

    @Test(dataProvider = "partnershipData")
    public void testDeregisterPartnership(String manFirstName, String manLastName, int manAge, int manWeight, int manHeight,
                                          String womanFirstName, String womanLastName, int womanAge, int womanWeight, int womanHeight,
                                          String expectedLastName) {
        Man man = new Man(manFirstName, manLastName, manAge, manWeight, manHeight);
        Woman woman = new Woman(womanFirstName, womanLastName, womanAge, womanWeight, womanHeight);
        man.registerPartnership(woman);
        man.deregisterPartnership(true);

        Assert.assertEquals(woman.getLastName(), woman.getPreviousLastName());
    }

    @DataProvider(name = "manData")
    public Object[][] provideManData() {
        return new Object[][]{
                {"Oleg", "Prutyla", 66, 75, 185, true},
        };
    }

    @DataProvider(name = "partnershipData")
    public Object[][] providePartnershipData() {
        return new Object[][]{
                {"Oleg", "Prutyla", 66, 75, 185, "Olga", "Danyluk", 66, 62, 168, "Prutyla"},
        };
    }
        @Test(dataProvider = "manData")
        public void testGetFirstName(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Man man = new Man(firstName, lastName, age, weight, height);
            Assert.assertEquals(man.getFirstName(), firstName);
        }

        @Test(dataProvider = "manData")
        public void testGetLastName(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Man man = new Man(firstName, lastName, age, weight, height);
            Assert.assertEquals(man.getLastName(), lastName);
        }

        @Test(dataProvider = "manData")
        public void testGetAge(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Man man = new Man(firstName, lastName, age, weight, height);
            Assert.assertEquals(man.getAge(), age);
        }

        @Test(dataProvider = "manData")
        public void testGetWeight(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Man man = new Man(firstName, lastName, age, weight, height);
            Assert.assertEquals(man.getWeight(), weight);
        }

        @Test(dataProvider = "manData")
        public void testGetHeight(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Man man = new Man(firstName, lastName, age, weight, height);
            Assert.assertEquals(man.getHeight(), height);
        }

        @Test(dataProvider = "manData")
        public void testSetFirstName(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Man man = new Man(firstName, lastName, age, weight, height);
            man.setFirstName("Ivan");
            Assert.assertEquals(man.getFirstName(), "Ivan");
        }

        @Test(dataProvider = "manData")
        public void testSetLastName(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Man man = new Man(firstName, lastName, age, weight, height);
            man.setLastName("Kos");
            Assert.assertEquals(man.getLastName(), "Kos");
        }

        @Test(dataProvider = "manData")
        public void testSetAge(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Man man = new Man(firstName, lastName, age, weight, height);
            man.setAge(78);
            Assert.assertEquals(man.getAge(), 78);
        }

        @Test(dataProvider = "manData")
        public void testSetWeight(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Man man = new Man(firstName, lastName, age, weight, height);
            man.setWeight(67);
            Assert.assertEquals(man.getWeight(), 67);
        }

        @Test(dataProvider = "manData")
        public void testSetHeight(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
            Man man = new Man(firstName, lastName, age, weight, height);
            man.setHeight(173);
            Assert.assertEquals(man.getHeight(), 173);
        }
    }

