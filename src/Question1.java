/**
 * Created by grinia on 28.06.2014.
 * <p/>
 * http://www.quizful.net/interview/java/java-null-reference
 * <p/>
 * Измените код так, чтобы он вернул hello world на консоль.
 * public class NullReferenceTest {
 * .....
 * public static void main(String[] args) {
 * NullReferenceTest nullReferenceTest = null;
 * System.out.println(nullReferenceTest./<some descriptor>/);
 * }
 * }
 * Ограничения - нельзя создавать новые объекты. Нельзя изменять текущий код, можно только добавить немного своего.
 * <p>
 * Explanation: http://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#d5e23450
 * When a target reference is computed and then discarded because the invocation mode is static, the reference is not examined to see whether it is null:
 * <p>
 * Answer:
 * Через null ссылку можно обратиться к статике, следовательно могут быть такие варианты:
 * 1) Добавить в класс NullReferenceTest статическое поле string со значение "hello world"
 * 2) Добавить статический метод
 */
public class Question1 {
    public static String hello = "Hello, world";//main solution!

    //my solution
//    static {
//        System.out.println("Hello world");
//        System.exit(0);
//    }

    public static void main(String[] args) {
        Question1 nullReferenceTest = null;
        System.out.println(nullReferenceTest.hello);
    }
}
