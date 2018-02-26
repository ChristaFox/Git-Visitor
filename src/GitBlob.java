import java.util.List;

public class GitBlob extends GitObject implements GitTreeNode {

    private String data;
    private List<GitTreeEntry> list;

	public GitBlob(String hash, String data) {
        super(hash);
        this.data = data;
    }

    public String getData() {
        return "blob " + (data.length() + 1) + "\n" + data + "\n";
    }

    @Override
    public List<GitTreeEntry> getChildren() {
    		
        return list;
    }

    @Override
    public void accept(Visitor v) {
    		v.visit(this);
    }
}
