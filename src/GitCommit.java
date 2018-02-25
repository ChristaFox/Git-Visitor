
public class GitCommit extends GitObject {

    public GitCommit(String hash, String author, String comment, GitTree tree) {
        super(hash);
    }

    public String getAuthor() {
        return null;
    }

    public String getComment() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
    }
}
