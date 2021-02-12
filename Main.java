package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here

        String nombreAlumno;
        int [] calificaciones = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Actividad 1");
        System.out.println("");
        System.out.println("Este programa calcula el promedio y calificacion de un alumno");
        System.out.println("--------------------------------------------------");

        // Introduccion de nombre y valores de las calificaciones de las materias
        System.out.println("Teclea el nombre del alumno: ");
        nombreAlumno = sc.nextLine();

        for(int i=0; i <= 4; i++){
            System.out.println("Introduce la calificacion de la materia " + (i+1)+": ");
            calificaciones[i] = sc.nextInt();
        }
        System.out.println("--------------------------------------------------");

        int promedio = promedio(calificaciones);
        char valor = calificacionFinal(promedio);
        resultados(nombreAlumno, calificaciones, promedio, valor);

    }

    public static int promedio(int [] calificacion){
        int promedio = 0;

        for(int i=0; i <= 4; i++){
            promedio += calificacion[i];
        }
        promedio = promedio/5;

        return promedio;
    }

    public static char calificacionFinal(int pPromedio){
        char letraCalificacion = 'z';

        if (pPromedio<= 50){
            letraCalificacion = 'F';
        }
        else if (pPromedio > 50  && pPromedio <= 60){
            letraCalificacion = 'E';
        }
        else if (pPromedio > 60  && pPromedio <= 70){
            letraCalificacion = 'D';
        }
        else if (pPromedio > 70  && pPromedio <= 80){
            letraCalificacion = 'C';
        }
        else if (pPromedio > 80  && pPromedio <= 90){
            letraCalificacion = 'B';
        }
        else if (pPromedio > 90  && pPromedio <= 100){
            letraCalificacion = 'A';
        }

        return letraCalificacion;

    }

    public static void resultados(String pNombre, int [] pCali, int pPromedio, char letra){
        System.out.println("NOmbre del Estudiante: " + pNombre);
        for(int i=0; i <= 4; i++){
            System.out.println("Calificacion " + (i+1)+ ": " + pCali[i]);
        }
        System.out.println("Promedio: "+ pPromedio);
        System.out.println("Calificacion: "+ letra);

    }
}