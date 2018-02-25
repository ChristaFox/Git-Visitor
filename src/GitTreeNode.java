import java.util.List;

public interface GitTreeNode extends Visitable {
    public List<GitTreeEntry> getChildren();
}
