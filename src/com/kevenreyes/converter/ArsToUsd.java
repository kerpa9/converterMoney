package com.kevenreyes.converter;
import java.util.Scanner;
import com.kevenreyes.services.ConsultApi;


public class ArsToUsd {

    private Scanner value = new Scanner(System.in);
    private ConsultApi consultApi = new ConsultApi();
    String URL_BASE = "https://v6.exchangerate-api.com/v6/c9aa051fcbbe8daf18c41a0a/pair/ARS/USD/";


    public void converterArsToUsd() {
        System.out.println("<----------------------ARS TO USD---------------------->");

        System.out.println("Please enter the value to convert from ARS to USD.");
        Double valueArs = value.nextDouble();
        String url = URL_BASE + valueArs;
        var json = consultApi.apiConsult(url);
        System.out.println(json);
    }

}
