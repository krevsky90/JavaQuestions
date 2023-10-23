/**
 * Created by grinia on 28.06.2014.
 * http://www.quizful.net/interview/java/passing-parameters-by-reference-or-by-value
 * <p>
 * "Хороший" собеседующий всегда найдёт способ умерить пыл кандидата...
 * public class Test {
 * static String str = "Value 1";
 * <p>
 * public static void changeIt(String s) {
 * s = "Value 2";
 * }
 * <p>
 * public static void main(String[] args) {
 * changeIt(str);
 * System.out.println(str);
 * }
 * }
 * Как думаете, что будет передано в метод и что напечатает код?
 * <p>
 * Ответ - Value 1.
 * Раньше я думал, что раз String не примитив,
 * то будет происходить передача по ссылке и новое значение ("Value 2") будет успешно присвоено.
 * В Java все передается по значению: и примитивы, и ссылки.
 * Т.о. внутрь функции передается копия ссылки.
 * Присваивание данной копии значения другой ссылки (в нашем случае ссылка на "Value 2") не влияет на объект,
 * на который она изначально ссылалась.
 * Объект можно изменить по ссылке (если он не immutable как String):
 */
public class Question3 {
    static String str = "Value 1";

    public static void changeIt(String s) {
        s = "Value 2";
    }

    public static void main(String[] args) {
        changeIt(str);
        System.out.println(str);
        Byte[] b = new Byte[]{};

        System.out.println(factorial(60));
    }

    public static double factorial(double n) {
        if (n < 2) {
            return n;
        }

        return n * factorial(n - 1);
    }
}
