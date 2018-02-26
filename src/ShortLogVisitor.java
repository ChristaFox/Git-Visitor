import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ShortLogVisitor extends AbstractVisitor {
	
	StringBuilder report = new StringBuilder();
	private List<GitTreeEntry> trees = new ArrayList<>();
	private Iterator<GitTreeEntry> iter = trees.iterator();
	private GrepLogAuthorFilter filter;
	
    public String getReport() {
    		//listed by author
    		//most commits to least commits
    		//
    		StringBuilder sb = new StringBuilder();
    		sb.append(getAuthor)
		trees.forEach(action);
    		report.append(getAutho)
    		report.append(b);
        return report;
    }

}
