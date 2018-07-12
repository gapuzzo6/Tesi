/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author giuseppeapuzzo
 */
public class Scrittura {
    public static void main(String[] args) throws IOException {
        PDDocument doc = null;
        try{
            doc = new PDDocument();
            PDPage page =  new PDPage();
            doc.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(doc, page);
            PDFont font = PDType1Font.HELVETICA_BOLD;
            contentStream.beginText();
            contentStream.setFont( font, 12 );
            contentStream.moveTextPositionByAmount( 100, 700 );
            contentStream.drawString( "Cazzo nel culo" );
            contentStream.endText();
            contentStream.close();
            doc.save("out.pdf");
            doc.close();
        } catch (IOException e) {   
            e.printStackTrace();    
        }

    }
    
}
