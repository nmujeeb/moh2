package moh.sample.SampleThreads;

import junit.framework.TestCase;

public class FormatNumberTest extends TestCase {

	public void testApp()
    {
		FormatNumber fnTask = new FormatNumber();
        assertEquals("Test Failed", 125.78, fnTask.formatNumber(125.777));
    }
}
