package exceptions;

@SuppressWarnings("serial")
public class WrongDayException extends Exception{

    private int day;
    private String document;

    public WrongDayException(int day, String document){
        super("Lo sentimos, el numero de documento no tiene permitido el ingreso el dia de hoy");
        this.day = day;
        this.document = document;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
