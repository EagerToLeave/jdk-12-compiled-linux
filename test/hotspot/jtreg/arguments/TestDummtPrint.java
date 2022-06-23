/*
 * @test TestDummyPrint
 * @summary Test whether flag -XX:+DummyPrint arguments work correctly
 * @library /test/lib
 * @run main/othervm TestDummyPrint
 */

import jdk.test.lib.process.OutputAnalyzer;
import jdk.test.lib.process.ProcessTools;

public class TestDummyPrint{
    static class Wrap{
        public static void main(String... args){
         }
    }

    static void runWIthFlag(boolean enableFlag){
        ProcessBuilder pb = ProcessTools.createJavaProcessBuilder(enableFlag? "-XX:+DummyPrint",
        Wrap.class.getName());

        OutputAnalyzer out = new OutputAnalyzer(pb.start());
        if(enableFlag){
            out.shouldContain("Hello world");
        }else{
            out.shouldNotContain("Hello world");
        }
    }

    public static void main(String[] args) throws Throwable{
        runWIthFlag(true);
        // runWIthFlag(false);
    }
}