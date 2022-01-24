package stringex000;

public class Str_Take01 {
    public static void main(String[] args) {
        // startsWith 그 문자열의 가장 앞 글자가 같은가? 같으면 참
        String str = "apple";
        boolean stratsWith = str.startsWith("a");
        System.out.println("startsWith : " + stratsWith);

        // endsWith 그 문자열의 가장 뒷 글자가 같은가? 같으면 참
        String end = "test";
        boolean endsWith = end.endsWith("t");
        System.out.println("endsWith: " + endsWith);

        // indexOf 문자열에서 ?는 최초 어디에 있는가.
        String num1 = "AdnroidApp";
        int indexOf = num1.indexOf("A");
        System.out.println("indexOf: " + indexOf);

        // lastindexOf 문자열에서 ?는 마지막 어느 순서에 있는가.
        String num2 = "AdnroidApp";
        int lastindexOf = num2.lastIndexOf("A");
        System.out.println("lastindexOf: " + lastindexOf);
    }

}
