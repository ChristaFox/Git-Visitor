import java.util.List;

public class GitTree extends GitObject implements GitTreeNode {

    public GitTree(String hash) {
        super(hash);
    }

    public void addChild(GitTreeEntry child) {
    }

    @Override
    public List<GitTreeEntry> getChildren() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
    }
}
