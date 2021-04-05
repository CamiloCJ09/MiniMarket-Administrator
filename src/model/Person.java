package model;

public class Person {

    private DocType documentType;
    private String documentNumber;

    public Person(String documentType, String documentNumber){
        this.documentType = DocType.valueOf(documentType);
        this.documentNumber = documentNumber;
    }

    public DocType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocType documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
