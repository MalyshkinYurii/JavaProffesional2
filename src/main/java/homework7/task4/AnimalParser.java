package homework7.task4;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class AnimalParser {
    public static void main(String[] args) {
        final String file = "H:\\Malyshkin_Java_Professional2\\src\\main\\java\\homework7\\task4\\test.xml";
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
                boolean name = false;
                boolean breed = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("name")) {
                        name = true;
                    }
                    if (qName.equalsIgnoreCase("breed")) {
                        breed = true;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (name) {
                        System.out.println("Name: " + new String(ch, start, length));
                        name = false;
                    }
                    if (breed) {
                        System.out.println("Breed: " + new String(ch, start, length));
                        breed = false;
                    }

                }
            };
            saxParser.parse(file, handler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }
}
