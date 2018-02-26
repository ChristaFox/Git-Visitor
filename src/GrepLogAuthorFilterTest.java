import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrepLogAuthorFilterTest {
	
	private Git g = new Git();
	private GitTree tree;
	private GitCommit firstCommit = new GitCommit("fodkd67i", "tim", "first commit", tree);
	private GrepLogVisitor visitor;

	@BeforeEach
	void setUp() throws Exception {
		g.addCommit(firstCommit);
		GrepLogFilter filter = new GrepLogAuthorFilter("tim");
		visitor = new GrepLogVisitor(filter);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		firstCommit.accept(visitor);
		System.out.print(visitor.getOutput());
		//assertEquals("", visitor.getOutput());
	}
//    public void testAuthorFilter() {
//        GrepLogFilter filter = new GrepLogAuthorFilter("tim");
//        GrepLogVisitor v = new GrepLogVisitor(filter);
//        root.accept(v);
//        assertEquals("Hint: GrepLogVisitor output for AuthorFilter incorrect",
//                "commit 277b404b0fa457559b8a851d7c8214987a18b065\n"
//                + "Author: tim\n"
//                + "\n"
//                + "    Fixed DST bug\n"
//                + "\n"
//                + "commit bf77c3ce7d11f1a067b88da74d39f96ebd9e5a8b\n"
//                + "Author: tim\n"
//                + "\n"
//                + "    Added users table\n"
//                + "\n"
//                + "commit e63c139cc82b2cf1224a82df40351682669ec90f\n"
//                + "Author: tim\n"
//                + "\n"
//                + "    Set up AWS\n"
//                + "\n",
//                v.getOutput());
//    }

}
