package com.kevenreyes.converter;

import java.util.Scanner;

import com.kevenreyes.services.ConsultApi;

public class UsdToBlr {

    private Scanner value = new Scanner(System.in);
    private ConsultApi consultApi = new ConsultApi();
    String URL_BASE = "https://v6.exchangerate-api.com/v6/c9aa051fcbbe8daf18c41a0a/pair/USD/BRL/";

    public void converterUsdToBrl() {
        System.out.println("<----------------------USD TO BRL---------------------->");

        System.out.println("Please enter the value to convert from USD to BRL.");
        Double valueUsd = value.nextDouble();
        String url = URL_BASE + valueUsd;
        var json = consultApi.apiConsult(url);
        System.out.println(json);

    }

}
