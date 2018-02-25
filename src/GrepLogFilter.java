
public interface GrepLogFilter {
    public boolean matchesCommit(GitCommit commit);
    public boolean matchesFileEntry(GitTreeEntry entry);
    public boolean matchesBlob(GitBlob blob);
}
