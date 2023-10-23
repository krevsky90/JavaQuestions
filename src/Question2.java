/**
 * Created by grinia on 28.06.2014.
 * http://www.quizful.net/interview/java/rewrite-a-code-without-semicolon
 * <p/>
 * Дан код:
 * public class HelloWorld {
 * public static void main(String[] args) {
 * System.out.println("Hello world");
 * }
 * }
 * Необходимо переписать код так, что бы в нем не было точки с запятой.
 */
public class Question2 {
    public static void main(String[] args) {
        if (System.out.printf("Hello world") == null) {
        }
    }
}
