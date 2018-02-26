import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShortLogVisitorTests {
	
	private Git g = new Git();
	private GitTree tree;
	private GitCommit firstCommit = new GitCommit("hash", "tim", "first commit", tree);
	private GrepLogVisitor visitor;

	@BeforeEach
	void setUp() throws Exception {
		g.addCommit(firstCommit);
		GrepLogFilter filter = new GrepLogAuthorFilter("tim");
		visitor = new GrepLogVisitor(filter);
	}
	@BeforeEach
	void setUp() throws Exception {
		
//		tim (3):
//		     Fixed DST bug
//		     Added users table
//		     Set up AWS
//
//		corey (2):
//		     Added unit tests
//		     Initial revision
//
//		justin (1):
//		     Updated docker image
		

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetReport() {
		fail("Not yet implemented");
	}

}
