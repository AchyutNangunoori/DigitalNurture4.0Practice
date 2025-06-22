public class PdfDocumentFactory extends DocumentFactory
{
    public Document createDocument()
    {
        System.out.println("Creating PDF Document");
        return new PdfDocument();
    }
}