// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {

        Parser parser = Parser.builder().build();
        Node links = parser.parse(markdown);
        linkVisitor visitor = new linkVisitor();
        links.accept(visitor);
        return visitor.links;
    }
    public static void main(String[] args) throws IOException {
		Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}