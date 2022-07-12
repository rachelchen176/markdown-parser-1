import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1); //test if 1+1 = 2, return true if pass the test
    }

    @Test
    public void getLinks() throws IOException{
        List<String> check = List.of("https://something.com","some-thing.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(check,links);
    }

    /*@Test
    public void getLinks2() throws IOException{
        List<String> check = List.of("https://google.com","some-thing.html");
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(check,links);
    }*/

    @Test
    public void getLinks3() throws IOException{
        List<String> check = List.of("more text here");
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(check,links);
    }

    /*@Test
    public void getLinks4() throws IOException{
        List<String> check = List.of("link goes here!");
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(check,links);
    } */

}