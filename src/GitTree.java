import java.util.ArrayList;
import java.util.List;

public class GitTree extends GitObject implements GitTreeNode {
	
	private List<GitTreeEntry> entries = new ArrayList<>();

    public GitTree(String hash) {
        super(hash);
    }

    public void addChild(GitTreeEntry child) {
    		entries.add(child);
    }

    @Override
    public List<GitTreeEntry> getChildren() {
        return entries;
    }

    @Override
    public void accept(Visitor v) {
    		v.postVisit(this);
    		v.preVisit(this);
    }
}
