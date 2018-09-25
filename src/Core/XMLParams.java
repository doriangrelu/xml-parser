package Core;

import java.util.ArrayList;

public class XMLParams {
    private ArrayList<String> _elementsCollection;
    private String _namespace;

    XMLParams(String elements, String namespace) {
        this._namespace = namespace;
        this._parseElements(elements);
    }

    public ArrayList<String> getElementsCollection() {
        return _elementsCollection;
    }

    public String getNamespace() {
        return _namespace;
    }

    private void _parseElements(String elements) {
        String[] elementsSplited = elements.split(",");
        int i;
        for (i = 0; i < elementsSplited.length; i++) {
            this._elementsCollection.add(elementsSplited[i].trim());
        }
    }

}
