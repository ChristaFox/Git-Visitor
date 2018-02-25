
public interface Visitor {
    public void preVisit(GitCommit commit);
    public void postVisit(GitCommit commit);

    public void preVisit(GitTree tree);
    public void postVisit(GitTree tree);

    public void preVisit(GitTreeEntry entry);
    public void postVisit(GitTreeEntry entry);

    public void visit(GitBlob blob);
}
