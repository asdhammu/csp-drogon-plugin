package unittests;

import com.asdhammu.cspdrogon.language.CSPDrogonParserDefinition;
import com.intellij.testFramework.ParsingTestCase;

public class CspParserTests extends ParsingTestCase {

    public CspParserTests() {
        super("", "csp", new CSPDrogonParserDefinition());
    }


    public void testParsingTestData(){
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "/src/test/testData/";
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}
