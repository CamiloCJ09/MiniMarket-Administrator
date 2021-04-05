package model;

import exceptions.DocTypeException;
import exceptions.WrongDayException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniMarketTest {

    private MiniMarket miniMarket;

    public void setupScenary1(){
        miniMarket = new MiniMarket();
    }

    @Test
    public void addTest1(){

        setupScenary1();

        String docType = "CC";
        String docNum = "1000604256";
        int num = 18;

        try{
            boolean ans = miniMarket.addClient(docType, docNum, num);
            assertTrue(ans);

        }catch(DocTypeException dte){
            fail("Tipo de documento erroneo");
        }catch(WrongDayException wde){
            fail("No tiene acceso el dia de hoy");
        }

    }
    @Test
    public void addTest2(){

        setupScenary1();

        String docType = "TI";
        String docNum = "1193266644";
        int num = 20;

        try{
            boolean ans = miniMarket.addClient(docType, docNum, num);
            assertFalse(ans);
        }catch(DocTypeException | WrongDayException exc){
        }
    }

    @Test
    public void addTest3(){

        setupScenary1();

        String docType = "CC";
        String docNum = "1006101347";
        int num = 14;

        try{
            boolean ans = miniMarket.addClient(docType, docNum, num);
            assertFalse(ans);
        }catch(DocTypeException | WrongDayException exc){
        }

    }
}