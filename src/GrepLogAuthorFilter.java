import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GrepLogAuthorFilter implements GrepLogFilter {
	
	private List<GitTreeEntry> trees = new ArrayList<GitTreeEntry>();
	private Iterator<GitTreeEntry> iter = trees.iterator();
	

    public GrepLogAuthorFilter(String author) {
    		//visit each commit for a target author
    		//only have access to getAuthor in a commit
    		//only pertain to commits
    }

    @Override
    public boolean matchesCommit(GitCommit commit) {
        return false;
    }

    @Override
    public boolean matchesFileEntry(GitTreeEntry entry) {
        return false;
    }

    @Override
    public boolean matchesBlob(GitBlob blob) {
        return false;
    }

}
