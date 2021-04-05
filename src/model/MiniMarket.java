package model;

import java.util.ArrayList;

public class MiniMarket {

    private ArrayList<Person> clientsArray;
    private int atemps;

    public MiniMarket(){
        clientsArray = new ArrayList<>();
        atemps = 0;
    }

    public boolean addClient(String docType, long docNum, int dayNum){
        boolean ret = false;
        if((dayNum%2==0) && (!(docNum%2==0) && (!(docType.equals("TI"))))){
            clientsArray.add(new Person(docType, docNum));
            ret = true;
        }else if((!(dayNum%2==0)) && ((docNum%2==0) && (!(docType.equals("TI"))))){
            clientsArray.add(new Person(docType, docNum));
            ret = true;
        }
        atemps++;
        return ret;
    }
}
