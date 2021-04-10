package model;

import exceptions.DocTypeException;
import exceptions.WrongDayException;

import java.util.ArrayList;

public class MiniMarket {

    private ArrayList<Person> clientsArray;
    private int atemps;

    public MiniMarket(){
        clientsArray = new ArrayList<>();
        atemps = 0;
    }

    public boolean addClient(String docType, String num, int dayNum) throws WrongDayException, DocTypeException {
        atemps++;
        boolean isAdded = false;
        int docNum;
        if(num.length()==1){
            docNum = Integer.parseInt(num);
        }else{
            docNum = Integer.parseInt(String.valueOf(num.charAt(num.length()-2)));
        }
        if(!(((dayNum%2==0 && !(docNum%2==0))) || (!(dayNum%2==0) && (docNum%2==0)))){
            throw new WrongDayException(dayNum, num);
        }else if(docType.equals(DocType.TI.toString())){
            throw new DocTypeException(DocType.TI.toString());
        }
        clientsArray.add(new Person(docType, num));
        isAdded = true;
        return isAdded;
    }

    public int getAtemps() {
        return atemps;
    }

    public void setAtemps(int atemps) {
        this.atemps = atemps;
    }

    public ArrayList<Person> getClientsArray() {
        return clientsArray;
    }

    public void setClientsArray(ArrayList<Person> clientsArray) {
        this.clientsArray = clientsArray;
    }
}
