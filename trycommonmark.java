import java.util.ArrayList;
import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
class linkVisitor extends AbstractVisitor {
    ArrayList<String> links = new ArrayList<>();

    @Override
    public void visit(Link link) {
        // This is called for all Text nodes. Override other visit methods for other node types.

        // Count words (this is just an example, don't actually do it this way for various reasons).
        if(link.getDestination() != null) {
            this.links.add(link.getDestination());
        }
        // Descend into children (could be omitted in this case because Text nodes don't have children).
        visitChildren(link);
    }
}
class tryCommonMark {
}
