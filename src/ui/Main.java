package ui;

import model.MiniMarket;
import java.util.Scanner;

public class Main {

    private MiniMarket miniMarket;
    private Scanner sc;

    public Main(){
        miniMarket = new MiniMarket();
        sc = new Scanner(System.in);
    }

    public static void main(String [] args){
        //Todo: Menú
        System.out.println("Hi");
    }

    public int showMenu() {
        int option = 0;
        System.out.println(
                "Menú principal, seleccione una opción\n" +
                        "(1) Registrar ingreso \n" +
                        "(2) Consultar cantidad de intentos de ingreso \n" +
                        "(0) Para salir"
        );
        option = sc.nextInt();
        sc.nextLine();
        return option;
    }
    public void executeOption(int operation){
        switch (operation){
            case 1:
                System.out.println("Ingrese el tipo de documento\n(1) TI -Tarjeta de identidad-" +
                        "\n(2) CC \n(3)\n(4)");

                break;
            case 2:

                break;
        }
    }
}
