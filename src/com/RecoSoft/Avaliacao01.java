package com.RecoSoft;

import javax.swing.*;


public class Avaliacao01 {
    public static void main(String[] args) {

        boolean continuar = true;
        int finalizar = 0, dia, mes, ano, aniversarios, mediaIdade = 0, peso, maiorPeso = Integer.MIN_VALUE, menorPeso = Integer.MAX_VALUE, altura, somaAltura=0, count20=0;
        String texto = "", CPF ="";

        int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de alunos na turma?"));
                while(qtdAlunos<1){
                    qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("A turma não pode ter um número negativo de alunos.\nQual a quantidade de alunos na turma?"));
                }
        while(continuar==true && finalizar<qtdAlunos){

            CPF = JOptionPane.showInputDialog("Favor digitar o CPF do aluno:");
            texto+="CPF: "+CPF+"\n";
            ano = Integer.parseInt(JOptionPane.showInputDialog("Favor inserir o ano do seu nascimento:"));
            while (ano<1869 || ano>2019) {
                ano = Integer.parseInt(JOptionPane.showInputDialog("O ano que você digitou não corresponde ao de uma pessoa viva, favor tentar novamente:"));
            }
            mes = Integer.parseInt(JOptionPane.showInputDialog("Favor inserir o mês do seu nascimento:"));
            while (mes<1 || mes>12) {
                mes = Integer.parseInt(JOptionPane.showInputDialog("O mês que você digitou não corresponde a um mês existente, favor tentar novamente:"));
            }
            dia = Integer.parseInt(JOptionPane.showInputDialog("Favor inserir o dia do seu nascimento:"));
                if(mes==2) {
                    //Chama o método ehBissexto pra saber se são 28 ou 29 dias
                    if(ehBissexto(ano)) {
                        while (dia<1 || dia>29) {
                            dia = Integer.parseInt(JOptionPane.showInputDialog("Em anos bissextos fevereiro tem 29 dias, tente novamente:"));
                        }
                    } else {
                        while (dia<1 || dia>28) {
                            dia = Integer.parseInt(JOptionPane.showInputDialog("Fevereiro tem 28 dias, tente novamente:"));
                        }
                    }
                }
            texto+="Data de nascimento: "+dia+"/"+mes+"/"+ano+"\n";
            aniversarios = idade(dia,mes,ano);
            if(aniversarios>20){
                count20++;
            }
            texto+="Idade: "+aniversarios+"\n";
            mediaIdade+=aniversarios;

            altura = Integer.parseInt(JOptionPane.showInputDialog("Qual a altura do aluno em centímetros: "));
            while(altura<70 || altura>300){
                altura = Integer.parseInt(JOptionPane.showInputDialog("Esta altura é irreal. Tente novamente: "));
            }
            texto+="Altura: "+altura+" cm.\n";
            somaAltura+=altura;

            peso = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu peso?"));
                while (peso<0 || peso>800) {
                    peso = Integer.parseInt(JOptionPane.showInputDialog("O peso digitado está fora da realidade, favor tentar novamente:"));
                }
                if(peso>maiorPeso){
                    maiorPeso = peso;
                }
                if(peso<menorPeso){
                    menorPeso = peso;
                }
            texto+="Peso: "+peso+"\n";
            texto+="\n";

            finalizar++;

            String resp = JOptionPane.showInputDialog("Deseja continuar?\nDigite s para sim e n para não.");
            if(resp.equals("n")) {
                continuar = false;
            }

        }

        mediaIdade = mediaIdade/finalizar;

        JOptionPane.showMessageDialog(null,texto);
        JOptionPane.showMessageDialog(null,"A média da idade dos alunos foi "+mediaIdade);
        JOptionPane.showMessageDialog(null,"O maior peso entre os alunos foi "+maiorPeso+" kg\ne o menor foi "+menorPeso+" kg");
        JOptionPane.showMessageDialog(null, "A soma de todas as alturas registrada foi de "+somaAltura);
        JOptionPane.showMessageDialog(null,"O número de alunos com idade superior a 20 anos é "+count20);

    }

    //Método busca se o ano é bissexto
    public static boolean ehBissexto (int ano) {

        if((ano%4==0 && ano%100!=0) || (ano%400==0)){
            return true;
        } else {
            return false;
        }

    }

    //Método que calcula a idade do aluno, contado a data de hoje como 02/05/2019
    public static int idade (int dia, int mes, int ano){
        int idadeReal = 0;

        if(mes>5){
            idadeReal = 2019-ano;
        } else if (mes == 5 && dia == 2) {
            idadeReal = 2019-ano;
        } else {
            idadeReal = 2019-ano-1;
        }
        return idadeReal;
    }
}
