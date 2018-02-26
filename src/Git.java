import java.util.List;

public class Git implements Visitable {

    private List<GitCommit> commits;

	public Git() {
    }

    public List<GitCommit> getCommits() {
        return commits;
    }

    public void addCommit(GitCommit commit) {
    }

    @Override
    public void accept(Visitor v) {
    }

}
