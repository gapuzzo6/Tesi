/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.File;
import java.io.IOException;
import static java.lang.Boolean.TRUE;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author giuseppeapuzzo
 */
public class Tesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        PDDocument doc = null;
        File f = new File("out.pdf");
        try{
            doc = PDDocument.load(f);
            PDPage page =  (PDPage) doc.getDocumentCatalog().getPages().get(0);
            doc.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(doc, page, TRUE, TRUE);
            PDFont font = PDType1Font.HELVETICA_BOLD;
            contentStream.beginText();
            contentStream.setFont( font, 12 );
            contentStream.moveTextPositionByAmount( 260, 700 );
            contentStream.drawString( "Cazzo nella figa" );
            contentStream.endText();
            contentStream.close();
            doc.save("outMOD.pdf");
            doc.close();
        } catch (IOException e) {   
            e.printStackTrace();    
        }

    }
}
