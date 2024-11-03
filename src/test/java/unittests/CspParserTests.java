package unittests;

import com.asdhammu.cspdrogon.language.CSPDrogonParserDefinition;
import com.intellij.testFramework.ParsingTestCase;

public class CspParserTests extends ParsingTestCase {

    public CspParserTests() {
        super("", "csp", new CSPDrogonParserDefinition());
    }

    public void testHtmlData(){
        doTest(true);
    }

    public void testDrogonDirectives() {
        doTest(true);
    }

    public void testCommentData(){
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "testData";
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}
