// package jsonex01;

// import java.util.HashMap;
// import org.json.simple.JSONObject;
// import net.nurigo.java_sdk.api.Message;
// import net.nurigo.java_sdk.exceptions.CoolsmsException;

// /**
// * @class ExampleSend
// * @brief This sample code demonstrate how to send sms through CoolSMS Rest
// API
// * PHP
// */
// public class MySMS {
// public static void send(String to, String from, String text) {
// String api_key = "NCSHFL9AN35JZSAX";
// String api_secret = "HQ6VMT8WBPALGRFCKMRCZMQVDLIWTDHB";
// Message coolsms = new Message(api_key, api_secret);

// // 4 params(to, from, type, text) are mandatory. must be filled
// HashMap<String, String> params = new HashMap<String, String>();
// params.put("to", to);
// params.put("from", from);
// params.put("type", "SMS");
// params.put("text", text);
// params.put("app_version", "test app 1.2"); // application name and version

// try {
// JSONObject obj = (JSONObject) coolsms.send(params);
// System.out.println(obj.toString());
// } catch (CoolsmsException e) {
// System.out.println(e.getMessage());
// System.out.println(e.getCode());
// }
// }
// }
// // 선생님 전화번호 010-2222-7460