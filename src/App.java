import com.kevenreyes.services.ConsultApi;

public class App {
    public static void main(String[] args) throws Exception {

        String url = "https://v6.exchangerate-api.com/v6/c9aa051fcbbe8daf18c41a0a/pair/EUR/GBP/2";

        ConsultApi consultApi = new ConsultApi();

        var json = consultApi.apiConsult(url);

        System.out.println(json);

    }
}
