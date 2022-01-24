package stringex000;

public class Str_Take02 {
    public static void main(String[] args) {
        // equals 같다 ==
        String str1 = "java";
        String str2 = "java";
        boolean equals = str1.equals(str2);// 글자넣고 싶으면 if에 syso넣어도 되겠네.
        System.out.println("equals:" + equals);

        // length = 글자 수 세기
        String str = "abcdef";
        int length = str.length();
        System.out.println("length: " + length);

        // replace 지정한 문자가 있으면 새로 지정한 문자로 교체
        String rep = "A*B*C*D";
        String replace = rep.replace("*", "-");
        System.out.println("replace:" + replace);

        // replaceAll 정규표현식을 지정한 문자로 바꾸어 출력
        String repAll = "AB CD";
        String replaceAll = repAll.replaceAll("\\p{Space}", "*");
        System.out.println("replaceAll: " + replaceAll);
    }
}
