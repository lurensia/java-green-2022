// package postapp;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.net.HttpURLConnection;
// import java.net.URL;

// import com.google.gson.Gson;

// public class PostApp {
// public static void main(String[] args) {
// try {
// String addr = "http://lalacoding.site/init/post";
// URL url = new URL(addr);

// // conn 은 bytestream= 아직 방향을 인정함
// HttpURLConnection conn = (HttpURLConnection) url.openConnection();
// BufferedReader br = new BufferedReader(new
// InputStreamReader(conn.getInputStream(), "utf-8"));

// String responseJson = br.readLine();
// // System.out.println(responseJson);

// Gson gson = new Gson();
// ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
// // 1.통신검증
// if (dto.getCode() != 1) {
// System.out.println("통신실패 " + dto.getMsg());
// return;
// }

// // 2.프로그램 만들기
// // 1 화면에 회원 정보를 출력하겠다

// for (int i = dto.getData().size() - 1; i >= 0; i--) {
// System.out.println("목록 번호 :" + dto.getData().get(i).getId());
// System.out.println("목록 제목 :" + dto.getData().get(i).getTitle());
// System.out.println("목록 내용 :" + dto.getData().get(i).getContent());
// System.out.println("=================");
// }

// } catch (Exception e) {
// // TODO: handle exception
// e.printStackTrace();
// }
// }

// }