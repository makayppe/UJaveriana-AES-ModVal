//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.12 at 10:28:47 AM COT 
//


package co.edu.javeriana.aes.modval.timestamp.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.edu.javeriana.aes.modval.timestamp.entity package. 
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

    private final static QName _Timestamp_QNAME = new QName("http://www.javeriana.edu.co/aes/modval/services", "Timestamp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.javeriana.aes.modval.timestamp.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Timestamp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javeriana.edu.co/aes/modval/services", name = "Timestamp")
    public JAXBElement<Timestamp> createTimestamp(Timestamp value) {
        return new JAXBElement<Timestamp>(_Timestamp_QNAME, Timestamp.class, null, value);
    }

}