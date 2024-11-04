package com.kevenreyes.converter;

import java.util.Scanner;

import com.kevenreyes.services.ConsultApi;

public class BlrToUsd {

    private Scanner value = new Scanner(System.in);
    String URL_BASE = "https://v6.exchangerate-api.com/v6/c9aa051fcbbe8daf18c41a0a/pair/BRL/USD/";

    public void converterBlrToUsd() {
        System.out.println("<----------------------BRL TO USD---------------------->");
        System.out.println("Please enter the value to convert from BRL to USD.");
        Double valueBlr = value.nextDouble();
        String url = URL_BASE + valueBlr;
        var json = ConsultApi.apiConsult(url);
        System.out.println(json);

    }

}
