package desiginmode.behaviour.interpreter;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Jay
 * @date 2019/7/5 23:06
 * @description
 */
public class InterpreterTest {
    /**
     * 测试解释器模式
     */
    @Test
    public void testInterpreter() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")
                    + "/src/main/java/com/pc/interpreter/example/program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
