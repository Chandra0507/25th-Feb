

  package pack;
  
  import java.io.File; import java.io.FileInputStream; import
  java.io.FileOutputStream; import java.io.OutputStream; import
  java.io.InputStream;
  
  import org.apache.poi.xwpf.converter.pdf.PdfConverter; import
  org.apache.poi.xwpf.converter.pdf.PdfOptions; import
  org.apache.poi.xwpf.usermodel.XWPFDocument;
  
  
  public class WordToPdf { public static void main(String[] args) throws
  Throwable { try { InputStream docFile = new FileInputStream(new
  File("C:/Users/TG1689/Desktop/Table/chan.docx")); XWPFDocument doc = new
  XWPFDocument(docFile); PdfOptions pdfOptions = PdfOptions.create();
  
  
  OutputStream out = new FileOutputStream(new
  File("C:/Users/TG1689/Desktop/Table/chan.pdf"));
  PdfConverter.getInstance().convert(doc, out, pdfOptions);
  
  //doc.close();-------this method is not presenting in the 3.9 version
  out.close(); System.out.println("Done"); } catch(Exception e) {
  e.printStackTrace(); }
  System.out.println("pdf generate go and check your location"); } }
  
  
 
