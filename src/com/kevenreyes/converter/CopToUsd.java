package com.kevenreyes.converter;

import java.util.Scanner;

import com.kevenreyes.services.ConsultApi;

public class CopToUsd {

    private Scanner value = new Scanner(System.in);
    String URL_BASE = "https://v6.exchangerate-api.com/v6/c9aa051fcbbe8daf18c41a0a/pair/COP/USD/";

    public void converterCopToUsd() {
        System.out.println("<----------------------COP TO USD---------------------->");

        System.out.println("Please enter the value to convert from COP to USD.");

        Double valueCop = value.nextDouble();
        String url = URL_BASE + valueCop;

        var json= ConsultApi.apiConsult(url);
        System.out.println(json);

    }

}
