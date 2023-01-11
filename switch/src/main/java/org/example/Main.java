package org.example;

public class Main {
    public static void main(String[] args) {
        String estacion = "primavera";
        switch (estacion){
            case "invierno":
                System.out.println("La estacion es: " + estacion);
                break;
            case "verano":
                System.out.println("La estacion es: " + estacion);
                break;
            case "otoño":
                System.out.println("La estacion es: " + estacion);
                break;
            case "primavera":
                System.out.println("La estacion es: " + estacion);
                break;
            default:
                System.out.println("La estacion es: desconocida");
                break;
        }
    }
}