package Core;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class XMLReader {

    private Document _XMLDocument;

    /**
     *
     * @param fileName
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    XMLReader(String fileName) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        this._XMLDocument = db.parse(fileName);
    }

    /**
     *
     * @return Document
     */
    public Document getDocument() {
        return this._XMLDocument;
    }

    /**
     *
     * @return Element
     */
    public Element getDocumentElement() {
        return this._XMLDocument.getDocumentElement();
    }

}
