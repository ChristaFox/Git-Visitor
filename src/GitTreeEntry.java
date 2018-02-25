
public class GitTreeEntry implements Visitable {

    private int mode;
	private String filename;
	private GitTreeNode treeNode;

	public GitTreeEntry(int mode, String filename, GitTreeNode treeNode) {
		this.mode = mode;
		this.filename = filename;
		this.treeNode = treeNode;
    }

    public int getMode() {
        return 100644;
    }

    public String getFilename() {
        return filename;
    }

    @Override
    public void accept(Visitor v) {
    }
}
