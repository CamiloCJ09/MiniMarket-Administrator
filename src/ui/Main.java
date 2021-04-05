package ui;

import exceptions.DocTypeException;
import exceptions.WrongDayException;
import model.MiniMarket;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private MiniMarket miniMarket;
    private Scanner sc;

    public Main(){
        miniMarket = new MiniMarket();
        sc = new Scanner(System.in);
    }

    public static void main(String [] args){
        int operation = 0;
        Main myMain = new Main();
        do{
            operation = myMain.showMenu();
            myMain.executeOption(operation);
        }while(operation != 0);
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
                try{
                    String docuT = "";
                    System.out.println("Ingrese el tipo de documento\n(1) TI -Tarjeta de identidad-" +
                            "\n(2) CC -Cédula de ciudadanía-\n(3) PP -Pasaporte-\n(4) CE -Cédula de extranjería-");
                    int documentType = sc.nextInt();
                    switch(documentType){
                        case 1:
                            docuT = "TI";
                            break;
                        case 2:
                            docuT = "CC";
                            break;
                        case 3:
                            docuT = "PP";
                            break;
                        case 4:
                            docuT = "CE";
                            break;
                    }
                    sc.nextLine();
                    System.out.println("Ingrese el numero");
                    String docNum = sc.nextLine();

                    miniMarket.addClient(docuT,docNum, LocalDate.now().getDayOfMonth());
                }catch(WrongDayException wde){
                    System.out.println("No puede acceder este dia");
                    //wde.printStackTrace();
                }catch(DocTypeException dte){
                    System.out.println("No puede acceder con ese documento");
                    //dte.printStackTrace();
                }
                break;
            case 2:
                System.out.println("La cantidad de intentos de ingreso son: "+miniMarket.getAtemps());
                break;
        }
    }
}
