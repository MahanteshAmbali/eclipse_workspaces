
package com.tesco.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tesco.client package. 
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

    private final static QName _ValidateCriditCard_QNAME = new QName("http://impl.service.tesco.com/", "validateCriditCard");
    private final static QName _ValidateCriditCardResponse_QNAME = new QName("http://impl.service.tesco.com/", "validateCriditCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tesco.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateCriditCard }
     * 
     */
    public ValidateCriditCard createValidateCriditCard() {
        return new ValidateCriditCard();
    }

    /**
     * Create an instance of {@link ValidateCriditCardResponse }
     * 
     */
    public ValidateCriditCardResponse createValidateCriditCardResponse() {
        return new ValidateCriditCardResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCriditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.tesco.com/", name = "validateCriditCard")
    public JAXBElement<ValidateCriditCard> createValidateCriditCard(ValidateCriditCard value) {
        return new JAXBElement<ValidateCriditCard>(_ValidateCriditCard_QNAME, ValidateCriditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCriditCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.tesco.com/", name = "validateCriditCardResponse")
    public JAXBElement<ValidateCriditCardResponse> createValidateCriditCardResponse(ValidateCriditCardResponse value) {
        return new JAXBElement<ValidateCriditCardResponse>(_ValidateCriditCardResponse_QNAME, ValidateCriditCardResponse.class, null, value);
    }

}
