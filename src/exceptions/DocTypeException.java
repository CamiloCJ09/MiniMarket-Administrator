package exceptions;

@SuppressWarnings("serial")
public class DocTypeException extends Exception {

    private String docType;

    public DocTypeException(String docType){
        super("El tipo de documento ingresado no es valido");
        this.docType = docType;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }
}
