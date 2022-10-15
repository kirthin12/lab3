import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


class ListTests
{
    @Test
    public void testFilter ()
    {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add ("Bye");
        list.add ("Hello");
        list.add ("Hello World");

        List<String> helloList = new ArrayList<>();
        helloList.add("Hello");
        helloList.add("Hello");
        helloList.add("Hello");

        StringChecker filter  = new StringChecker() {
            public boolean checkString(String s) {
                return s.equals(helloList);
            }
        };

        assertEquals(helloList, )
    }  
}
