package exceptions;

public class WrongDayException extends Exception{

    private int day;

    public WrongDayException(int day){
        super("Lo sentimos, el numero de documento no tiene permitido el ingreso el dia de hoy");
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
