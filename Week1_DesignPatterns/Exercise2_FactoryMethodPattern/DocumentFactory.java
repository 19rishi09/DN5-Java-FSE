public class DocumentFactory {

    public static Document createDocument(String type) {

        if (type.equalsIgnoreCase("Word")) {
            return new WordDocument();
        }

        if (type.equalsIgnoreCase("PDF")) {
            return new PdfDocument();
        }

        if (type.equalsIgnoreCase("Excel")) {
            return new ExcelDocument();
        }

        return null;
    }
}