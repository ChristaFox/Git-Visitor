
public class GrepLogAuthorFilter implements GrepLogFilter {

    public GrepLogAuthorFilter(String author) {
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
