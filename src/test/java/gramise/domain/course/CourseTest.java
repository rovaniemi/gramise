package gramise.domain.course;

import org.junit.*;

import java.util.ArrayList;

public class CourseTest {

    public CourseTest(){

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getterAndSetterTest(){

        Course course = new Course();

        Assert.assertEquals(null, course.getName());
        Assert.assertEquals(null, course.getDescription());
        Assert.assertEquals(null, course.getExercises());
        Assert.assertEquals(0, course.getMaxPoints());

        course.setName("course");
        course.setDescription("awesome course");
        course.setMaxPoints(1000);
        course.setExercises(new ArrayList<>());

        Assert.assertEquals("course", course.getName());
        Assert.assertEquals("awesome course", course.getDescription());
        Assert.assertEquals(1000, course.getMaxPoints());
        Assert.assertEquals(new ArrayList<>(), course.getExercises());
    }
}