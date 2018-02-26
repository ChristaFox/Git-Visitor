
public class GitCommit extends GitObject {

    private String author;
	private String comment;
	private GitTree tree;

	public GitCommit(String hash, String author, String comment, GitTree tree) {
        super(hash);
        this.author = author;
        this.comment = comment;
        this.setTree(tree);
    }

    public String getAuthor() {
        return author;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public void accept(Visitor v) {
    		v.postVisit(this);
    }

	public GitTree getTree() {
		
		return tree;
	}

	public void setTree(GitTree tree) {
		this.tree = tree;
	}
}
