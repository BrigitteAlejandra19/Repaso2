package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Empleado {
    Integer bonoPresnecial;
    int diasFalta;

    public Empleado() {

    }

    public Integer getBonoPresnecial() {
        return bonoPresnecial;
    }

    public int getDiasFalta() {
        return diasFalta;
    }

    public Integer calcularBono(){
        this.diasFalta = diasFalta;
        System.out.println("Empleado por favor ingrese los dìas que falto a trabajar:");
        Scanner dias = new Scanner(System.in);
        diasFalta=dias.nextInt();

        if (diasFalta==0){
            bonoPresnecial = 200;
                 } else if (diasFalta==1){
                       bonoPresnecial= 100;
                        }else bonoPresnecial=0;


            System.out.println("Su bono es:" +bonoPresnecial);
        return bonoPresnecial;

    }
/* public void ordenarNumeros(){
    //Repaso ejercicios realizado en PsInt
    //Ingresar 3 numeros distintos y ordenarlos de mayor a menor

    Integer numeros;
    Integer x=0;
    Integer z;


    Scanner numero = new Scanner(System.in);
    System.out.println("Ingresae la cantidad de numeros:");
    x= numero.nextInt();

    for(int i=1;i<=x;i++){
    System.out.println ("Ingrese el numero["+i+"]=");
    numeros = numero.nextInt();
    }
    numeros.compareTo(numeros);

 */

    public void indicarDiasDelMes() {
        Integer mes;
        Scanner meses = new Scanner (System.in);
        System.out.println("Ingrese el mes que desea saber la cantidad de dias");
        mes = meses.nextInt();

        switch(mes){

            case 1:
                System.out.println("Febrero tiene 28 dias");
                break;
            case 2:
                System.out.println("Febrero tiene 28 dias");
                break;
             case 3:
                System.out.println("marzo tiene 31 dias");
                break;
            case 4:
                System.out.println("Abril tiene 30 dias");
                break;
            case 5:
                System.out.println("Mayo tiene 31 dias");
                break;
            case 6:
                System.out.println("Junio tiene 30 dias");
                break;
            case 7:
                System.out.println("Julio tiene 31 dias");
                break;
            case 8:
                System.out.println("Agosto tiene 31 dias");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 dias");
                break;
            case 10:
                System.out.println("Octubre tiene 31 dias");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 dias");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 dias");
                break;
            default:
                System.out.println("el numero que ingreso no es un mes");
        }
    }
    public void indicarEdad(){

        System.out.println("Ingresa tu edad: ");
        Scanner edadEntrante = new Scanner(System.in);
        Integer edad = edadEntrante.nextInt();
        int intentos = 0;

        while (edad<18 && intentos<2){
            intentos = intentos++;
            System.out.println("Eres menor de edad no puedes trabajar. Intentos:  ["+intentos+"]");
            edad = edadEntrante.nextInt();
        }
        System.out.println("si puede trabajar");



    }


}












