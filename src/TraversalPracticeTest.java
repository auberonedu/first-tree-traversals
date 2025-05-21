// JUnit test class for TraversalPractice methods
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;

public class TraversalPracticeTest {

    /**
     * Splits the captured output into lines, handling different newline conventions.
     */
    private List<String> getLines(String output) {
        String trimmed = output.trim();
        if (trimmed.isEmpty()) {
            return Collections.emptyList();
        }
        return Arrays.asList(trimmed.split("\\R"));
    }

    // Tests for printLargeNodesPostOrder

    @Test
    public void testPrintLargeNodesPostOrder_ComplexTree() {
        TreeNode node = new TreeNode(-3,
            new TreeNode(4,
                new TreeNode(1001),
                new TreeNode(9999,
                    new TreeNode(8888, null, new TreeNode(-2)),
                    new TreeNode(7777)
                )
            ),
            new TreeNode(5000,
                new TreeNode(-9, new TreeNode(-5), null),
                new TreeNode(-3000)
            )
        );
        String output = captureOutput(() -> TraversalPractice.printLargeNodesPostOrder(node));
        List<String> lines = getLines(output);
        List<String> expected = Arrays.asList("1001", "8888", "7777", "9999", "5000");
        assertEquals(expected, lines);
    }

    @Test
    public void testPrintLargeNodesPostOrder_SingleNodeMatch() {
        TreeNode node = new TreeNode(2000);
        String output = captureOutput(() -> TraversalPractice.printLargeNodesPostOrder(node));
        List<String> lines = getLines(output);
        assertEquals(Collections.singletonList("2000"), lines);
    }

    @Test
    public void testPrintLargeNodesPostOrder_SingleNodeNoMatch() {
        TreeNode node = new TreeNode(1000);
        String output = captureOutput(() -> TraversalPractice.printLargeNodesPostOrder(node));
        List<String> lines = getLines(output);
        assertTrue(lines.isEmpty());
    }

    @Test
    public void testPrintLargeNodesPostOrder_NullNode() {
        String output = captureOutput(() -> TraversalPractice.printLargeNodesPostOrder(null));
        List<String> lines = getLines(output);
        assertTrue(lines.isEmpty());
    }

    @Test
    public void testPrintLargeNodesPostOrder_BalancedTree() {
        TreeNode node = new TreeNode(2000,
            new TreeNode(1500),
            new TreeNode(2500)
        );
        String output = captureOutput(() -> TraversalPractice.printLargeNodesPostOrder(node));
        List<String> lines = getLines(output);
        List<String> expected = Arrays.asList("1500", "2500", "2000");
        assertEquals(expected, lines);
    }

    // Tests for printNegativeNodesInOrder

    @Test
    public void testPrintNegativeNodesInOrder_ComplexTree() {
        TreeNode node = new TreeNode(-3,
            new TreeNode(4,
                new TreeNode(1001),
                new TreeNode(9999,
                    new TreeNode(8888, null, new TreeNode(-2)),
                    new TreeNode(7777)
                )
            ),
            new TreeNode(5000,
                new TreeNode(-9, new TreeNode(-5), null),
                new TreeNode(-3000)
            )
        );
        String output = captureOutput(() -> TraversalPractice.printNegativeNodesInOrder(node));
        List<String> lines = getLines(output);
        List<String> expected = Arrays.asList("-2", "-3", "-5", "-9", "-3000");
        assertEquals(expected, lines);
    }

    @Test
    public void testPrintNegativeNodesInOrder_SingleNodeMatch() {
        TreeNode node = new TreeNode(-5);
        String output = captureOutput(() -> TraversalPractice.printNegativeNodesInOrder(node));
        List<String> lines = getLines(output);
        assertEquals(Collections.singletonList("-5"), lines);
    }

    @Test
    public void testPrintNegativeNodesInOrder_SingleNodeNoMatch() {
        TreeNode node = new TreeNode(0);
        String output = captureOutput(() -> TraversalPractice.printNegativeNodesInOrder(node));
        List<String> lines = getLines(output);
        assertTrue(lines.isEmpty());
    }

    @Test
    public void testPrintNegativeNodesInOrder_NullNode() {
        String output = captureOutput(() -> TraversalPractice.printNegativeNodesInOrder(null));
        List<String> lines = getLines(output);
        assertTrue(lines.isEmpty());
    }

    @Test
    public void testPrintNegativeNodesInOrder_BalancedTree() {
        TreeNode node = new TreeNode(-1,
            new TreeNode(-3),
            new TreeNode(-2)
        );
        String output = captureOutput(() -> TraversalPractice.printNegativeNodesInOrder(node));
        List<String> lines = getLines(output);
        List<String> expected = Arrays.asList("-3", "-1", "-2");
        assertEquals(expected, lines);
    }

    // Tests for printOddNodesPreOrder

    @Test
    public void testPrintOddNodesPreOrder_ComplexTree() {
        TreeNode node = new TreeNode(-3,
            new TreeNode(4,
                new TreeNode(1001),
                new TreeNode(9999,
                    new TreeNode(8888, null, new TreeNode(-2)),
                    new TreeNode(7777)
                )
            ),
            new TreeNode(5000,
                new TreeNode(-9, new TreeNode(-5), null),
                new TreeNode(-3000)
            )
        );
        String output = captureOutput(() -> TraversalPractice.printOddNodesPreOrder(node));
        List<String> lines = getLines(output);
        List<String> expected = Arrays.asList("-3", "1001", "9999", "7777", "-9", "-5");
        assertEquals(expected, lines);
    }

    @Test
    public void testPrintOddNodesPreOrder_SingleNodeMatch() {
        TreeNode node = new TreeNode(3);
        String output = captureOutput(() -> TraversalPractice.printOddNodesPreOrder(node));
        List<String> lines = getLines(output);
        assertEquals(Collections.singletonList("3"), lines);
    }

    @Test
    public void testPrintOddNodesPreOrder_SingleNodeNoMatch() {
        TreeNode node = new TreeNode(2);
        String output = captureOutput(() -> TraversalPractice.printOddNodesPreOrder(node));
        List<String> lines = getLines(output);
        assertTrue(lines.isEmpty());
    }

    @Test
    public void testPrintOddNodesPreOrder_NullNode() {
        String output = captureOutput(() -> TraversalPractice.printOddNodesPreOrder(null));
        List<String> lines = getLines(output);
        assertTrue(lines.isEmpty());
    }

    @Test
    public void testPrintOddNodesPreOrder_BalancedTree() {
        TreeNode node = new TreeNode(2,
            new TreeNode(3),
            new TreeNode(4)
        );
        String output = captureOutput(() -> TraversalPractice.printOddNodesPreOrder(node));
        List<String> lines = getLines(output);
        assertEquals(Collections.singletonList("3"), lines);
    }


    /** The below are utility classes that help with testing. You do not need to modify them, but you can look with interest! */
    /**
     * Simple PrintStream that writes output to both the console and an internal buffer.
     */
    private static class TeePrintStream extends PrintStream {
        private final PrintStream second;

        public TeePrintStream(PrintStream main, PrintStream second) {
            super(main);
            this.second = second;
        }

        @Override
        public void write(byte[] buf, int off, int len) {
            super.write(buf, off, len);
            second.write(buf, off, len);
        }

        @Override
        public void write(int b) {
            super.write(b);
            second.write(b);
        }
    }

    /**
     * Captures the output of a Runnable while still printing to the console.
     * @param runnable the code that prints to System.out
     * @return the captured output as a String
     */
    private String captureOutput(Runnable runnable) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream second = new PrintStream(baos, true);
        TeePrintStream tee = new TeePrintStream(originalOut, second);
        System.setOut(tee);
        try {
            runnable.run();
        } finally {
            System.out.flush();
            System.setOut(originalOut);
        }
        return baos.toString();
    }
}
