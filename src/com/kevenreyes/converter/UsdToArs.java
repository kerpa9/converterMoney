package com.kevenreyes.converter;

import java.util.Scanner;

import com.kevenreyes.services.ConsultApi;

public class UsdToArs {

    private Scanner value = new Scanner(System.in);
    private ConsultApi consultApi = new ConsultApi();
    String URL_BASE = "https://v6.exchangerate-api.com/v6/c9aa051fcbbe8daf18c41a0a/pair/USD/ARS/";

    public void converterUsdToArs() {
        System.out.println("<-----------------------------USD TO ARS----------------------------->");
        System.out.println("Please enter the value to convert from USD to ARS");
        Double valueUsd = value.nextDouble();
        String url = URL_BASE + valueUsd;
        var json = consultApi.apiConsult(url);
        System.out.println(json);


    }

}
