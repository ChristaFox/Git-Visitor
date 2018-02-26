import java.util.List;
import java.util.ArrayList;

public class GrepLogVisitor extends AbstractVisitor {

    public GrepLogVisitor(GrepLogFilter filter) {
    		List<GitTreeEntry> trees = new ArrayList<>();
    		//Visitor v = new Vistor();
    		for (GitTreeEntry e : trees) {
    			if (filter.matchesBlob(e)) {
    				
    			}
    			//e.accept(v);
    			//if (filter.matchesBlob(e)) {
    				//filter.matchesBlob(blob)
    				//e.
		}
	}

    public String getOutput() {
        return null;
    }
}
