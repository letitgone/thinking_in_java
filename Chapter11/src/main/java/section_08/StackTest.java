package section_08;

/**
 * @Author ZhangGJ
 * @Date 2019/05/27
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
