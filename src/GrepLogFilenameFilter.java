
public class GrepLogFilenameFilter implements GrepLogFilter {
    public GrepLogFilenameFilter(String filename) {
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
