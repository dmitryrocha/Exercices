package com.RecoSoft;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaAluno {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();
        boolean sair = false;
        int opcao = 0, novaNota;
        while (!sair) {
            System.out.println("Digite 1 para adicionar nota e 2 para finalizar:");
            opcao = sc.nextInt();
            if (opcao == 1) {
                notas.add(addNotas());
            } else if (opcao == 2) {
                sair = true;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
        System.out.println("Suas notas este semestre foram "+notas.toString());
        mediaAritimetica(notas);

    }

    private static int addNotas() {
        Scanner sc = new Scanner(System.in);
        int nota = 0;
        System.out.println("Favor adicionar uma nota entre 0 e 100: ");
        nota = sc.nextInt();
        while (nota < 0 || nota > 100) {
            System.out.println("Nota adicionada inválida, favor inserir nota entre 0 e 100: ");
            nota = sc.nextInt();
        }

        return nota;
    }

    private static void mediaAritimetica(ArrayList<Integer> notas) {
        int soma = 0;
        double media;
        for (int i = 0; i < notas.size(); i++) {
            soma+=notas.get(i);
        }
        media = (double)soma/(notas.size());
        System.out.println("Sua média neste semestre foi "+media);
    }
}
    //    private ArrayList<Integer> notas() {
//        ArrayList<Integer> listaNotas = new ArrayList<Integer>();
//        boolean sair = false;
//        int opcao = 0, nota = 0;
//
//        while(sair) {
//            System.out.println("Digite 1 para adicionar nota e 2 para finalizar:");
//            opcao = sc.nextInt();
//            if(opcao == 1){
//                System.out.println("Favor adicionar uma nota entre 0 e 100: ");
//                nota = sc.nextInt();
//                while (nota<0 || nota>100){
//                    System.out.println("Nota adicionada inválida, favor inserir nota entre 0 e 100: ");
//                    nota = sc.nextInt();
//                }
//            } else if (opcao == 2) {
//                sair = true;
//            } else {
//                System.out.println("Opção inválida, tente novamente.");
//            }
//
//            listaNotas.add(nota);
//
//        }
//        return listaNotas;
//    }
//
