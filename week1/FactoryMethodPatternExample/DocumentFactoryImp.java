public class DocumentFactoryImp extends DocumentFactory {

    @Override
    public Document createDocument(String type) {

        switch (type) {
            case "PDF":
                return new PdfDocumentImp();
            case "EXCEL":
                return new ExcelDocumentImp();
            case "WORD":
                return new WordDocumentImp();
            default:
                return new PdfDocumentImp();
        }
    }

}
