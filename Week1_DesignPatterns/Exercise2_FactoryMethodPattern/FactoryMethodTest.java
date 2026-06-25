public class FactoryMethodTest {

    public static void main(String[] args) {

        Document word = DocumentFactory.createDocument("Word");
        Document pdf = DocumentFactory.createDocument("PDF");
        Document excel = DocumentFactory.createDocument("Excel");

        word.open();
        pdf.open();
        excel.open();
    }
}