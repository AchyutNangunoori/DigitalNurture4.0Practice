public class ExcelDocumentFactory extends DocumentFactory
{
    public Document createDocument()
    {
        System.out.println("Creating Excel Document");
        return new ExcelDocument();
    }
}