
package br.com.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _YahooMethodResponse_QNAME = new QName("http://ws.com.br/", "yahooMethodResponse");
    private final static QName _YahooMethod_QNAME = new QName("http://ws.com.br/", "yahooMethod");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link YahooMethod }
     * 
     */
    public YahooMethod createYahooMethod() {
        return new YahooMethod();
    }

    /**
     * Create an instance of {@link YahooMethodResponse }
     * 
     */
    public YahooMethodResponse createYahooMethodResponse() {
        return new YahooMethodResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YahooMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com.br/", name = "yahooMethodResponse")
    public JAXBElement<YahooMethodResponse> createYahooMethodResponse(YahooMethodResponse value) {
        return new JAXBElement<YahooMethodResponse>(_YahooMethodResponse_QNAME, YahooMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YahooMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com.br/", name = "yahooMethod")
    public JAXBElement<YahooMethod> createYahooMethod(YahooMethod value) {
        return new JAXBElement<YahooMethod>(_YahooMethod_QNAME, YahooMethod.class, null, value);
    }

}
