/**
 * @Author ZhangGJ
 * @Date 2019/04/03
 */
public class ExerciseSixteen {
    public static void main(String[] args) {
        // Doing it the hard way:
        String sa1[] = new String[4];
        sa1[0] = "These";
        sa1[1] = "are";
        sa1[2] = "some";
        sa1[3] = "strings";
        for (int i = 0; i < sa1.length; i++) {
            System.out.println(sa1[i]);
        }
        // Using aggregate initialization to
        // make it easier:
        String sa2[] = {"These", "are", "some", "strings"};
        for (int i = 0; i < sa2.length; i++) {
            System.out.println(sa2[i]);
        }
    }
}
