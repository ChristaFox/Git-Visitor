import java.util.List;

public class GitBlob extends GitObject implements GitTreeNode {

    private String data;

	public GitBlob(String hash, String data) {
        super(hash);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public List<GitTreeEntry> getChildren() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
    }
}
