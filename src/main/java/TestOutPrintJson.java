import com.google.gson.Gson;

public class TestOutPrintJson {
    public static void main(String[] args) {
        UserRegister userRegister = new UserRegister("Natalia", "Mishyna");
        Gson gson = new Gson();
        String json = gson.toJson(userRegister);
        UserRegister res = gson.fromJson(json, UserRegister.class);
        System.out.println(res);
     }
}
