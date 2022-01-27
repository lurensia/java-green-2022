package cloud;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import cloud.CloudDto.Response.Body.Items.Item;

public class CloudApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======부산진구(부전1동)의 날씨를 출력합니다. 오늘의 날자를 입력하세요.========");
        System.out.println("주의! 오늘의 날자만 적어주세요.");
        System.out.println("ex)20220125");
        String baseDate = sc.nextLine();
        if (baseDate.length() != 8) {
            System.out.println("잘못된 입력입니다.");
            System.exit(0);
        }

        System.out.println("현재(혹은 이전)시간을 입력해주세요.");
        System.out.println("ex) 오후 8시27분의 경우 2027");
        String baseTime = sc.nextLine();
        if (baseTime.length() != 4) {
            System.out.println("잘못된 입력입니다.");
            System.exit(0);
        }

        Map<String, String> CloudMap = DownloadCloud.getCloudList(baseDate, baseTime);

        System.out.println("부산진구 부전1동의 현재 온도는" + CloudMap.get("T1H") + "℃ 입니다.");

    }
}
