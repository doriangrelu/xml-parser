package Core;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class XMLTransformer {
    private XMLReader _reader;
    private XMLParams _params;

    XMLTransformer(XMLParams params) {
        this._params = params;
    }

    public void transform(Document doc)
    {
        this.transform(doc, null);
    }

    public void transform(Document doc, Node node)
    {

    }

}
