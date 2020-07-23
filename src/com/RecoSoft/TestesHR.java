package com.RecoSoft;

import java.awt.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestesHR {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, -1 , -2 , 0, 0, -9};
        int positivo = 0;
        int negativo = 0;
        int zero = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                positivo++;
            } else if (arr[i] < 0) {
                negativo++;
            } else {
                zero++;
            }
        }
        String maiorQ = Integer.toString(positivo);
        String menorQ = Integer.toString(negativo);
        String igual = Integer.toString(zero);
        String ene = Integer.toString(arr.length);
        BigDecimal dPositivo = new BigDecimal(maiorQ);
        BigDecimal dNegtivo = new BigDecimal(menorQ);
        BigDecimal dZero = new BigDecimal(igual);
        BigDecimal divididoPor = new BigDecimal(ene);
        dPositivo = dPositivo.divide(divididoPor);
        System.out.println(dPositivo);
        DecimalFormat formatador = new DecimalFormat("#0.000000");
        System.out.println(formatador.format(dPositivo));

         }

}

