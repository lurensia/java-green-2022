package stringex000;

public class Str_Take03 {
    public static void main(String[] args) {

        // split 지정한 문자로 문자열을 나눌 수 있다.
        String spl = "가:나:다:라:마:바:사자카타파하";
        String[] split = spl.split(":");
        System.out.println("split: " + split[1]);

        // substring 문자열에 지정한 범위에 속하는 문자열을 반환한다.(끝나는 범위는 제외)
        String subStr = "ABCDEFG";
        String substring = subStr.substring(0, 2);
        System.out.println("substring: " + substring);

        // toLowerCase 문자열의 대문자를 소문자로 전환
        // toUpperCase 문자열의 소문자를 대문자로 전환
        String loc = "AdMin";
        String upc = "AdMin";
        String toLowerCase = loc.toLowerCase();
        String toUpperCase = upc.toUpperCase();
        System.out.println("toLowerCase: " + toLowerCase);
        System.out.println("toUpperCase: " + toUpperCase);
    }
}
