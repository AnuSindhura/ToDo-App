import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class TaskTest
{
    Date date;
    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Task tasktest;
    @BeforeEach
    void setup() throws ParseException
    {
        date = formatter.parse("2020-03-26");
        Task tasktest = new Task("Test","Test Project","Open",date);
    }
    @Test
    void getTaskName() throws ParseException
    {
        Task tasktest = new Task("Test","Test Project","Open",date);
        assertEquals("Test",tasktest.getTaskName());
    }
    @Test
    void getProjectName() 	{
        Task tasktest = new Task("Test","Test Project","Open",date);
        assertEquals("Test Project",tasktest.getProjectName());
    }
    void getSatus()
    {
        Task tasktest = new Task("Test","Test Project","Open",date);
        assertEquals("Open",tasktest.getSatus());
    }
    @Test
    void getTaskDate()
    {
        Task tasktest = new Task("Test","Test Project","Open",date);
        assertEquals(date,tasktest.getTaskDate());
    }
    @Test
    void setgetTaskName() throws ParseException
    {
        Task tasktest = new Task("Test","Test Project","Open",date);
        tasktest.setTaskName("Test");
        assertEquals("Test",tasktest.getTaskName());
        tasktest.setProjectName("Test Project");
        assertEquals("Test Project",tasktest.getProjectName());
        tasktest.setStatus("Open");
        assertEquals("Open",tasktest.getSatus());
        date = formatter.parse("2020-03-26");
        tasktest.setTaskDate(date);
        assertEquals(date,tasktest.getTaskDate());
    }
    @Test
    void setgetTaskNameFailureCheck() throws ParseException
    {
        Task tasktest = new Task("Test","Test Project","Open",date);
        tasktest.setTaskName("Test");
        assertEquals("Test",tasktest.getTaskName());
        tasktest.setProjectName("Test Project");
        assertEquals("Test Project",tasktest.getProjectName());
        tasktest.setStatus("Open");
        assertEquals("Open",tasktest.getSatus());
        date = formatter.parse("2020-03-26");
        tasktest.setTaskDate(date);
        assertEquals(date,tasktest.getTaskDate());
    }
}
