public class Test
{
    public static void main(String[] args)
    {
        DocumentFactory wordDoc = new WordDocumentFactory();
        System.out.println("Document Created is: " + wordDoc.createDocument().getType() + "\n");
        
        DocumentFactory PdfDoc = new PdfDocumentFactory();
        System.out.println("Document Created is: " + PdfDoc.createDocument().getType() + "\n");
        
        DocumentFactory ExcelDoc = new ExcelDocumentFactory();
        System.out.println("Document Created is: " + ExcelDoc.createDocument().getType());
    }
}