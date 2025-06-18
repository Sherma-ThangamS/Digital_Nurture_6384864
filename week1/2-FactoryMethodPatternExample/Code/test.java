package Code;

public class test {

    public static void main(String[] args) {

        DocumentFactory documentFactory = new DocumentFactoryImp();

        Document pdfObj = documentFactory.createDocument("PDF");
        Document excelObj = documentFactory.createDocument("EXCEL");
        Document wordObj = documentFactory.createDocument("WORD");

        if (pdfObj instanceof PdfDocumentImp) {
            System.out.println("PDF Implementation");
        }

        if (excelObj instanceof ExcelDocumentImp) {
            System.out.println("Excel Implementation");
        }

        if (wordObj instanceof WordDocumentImp) {
            System.out.println("Word Implementation");
        }

    }

}
