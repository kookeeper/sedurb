
package br.gov.se.seplag.cicsergipe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import br.gov.se.seplag.commons.v1.MetaInfoRegistro;
import br.gov.se.seplag.ebo.v1.Cidadao;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.se.seplag.cicsergipe package. 
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

    private final static QName _ParametroRegistrarCidadaoCidadao_QNAME = new QName("http://www.seplag.se.gov.br/CICSergipe", "cidadao");
    private final static QName _ParametroObterCidadaoDocumentoCPF_QNAME = new QName("http://www.seplag.se.gov.br/CICSergipe", "documentoCPF");
    private final static QName _ResultadoObterCidadaoMetaInfoCidadao_QNAME = new QName("http://www.seplag.se.gov.br/CICSergipe", "metaInfoCidadao");
    private final static QName _ResultadoRegistrarCidadaoCodigoProtocolo_QNAME = new QName("http://www.seplag.se.gov.br/CICSergipe", "codigoProtocolo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.se.seplag.cicsergipe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParametroValidarInformacaoCidadao }
     * 
     */
    public ParametroValidarInformacaoCidadao createParametroValidarInformacaoCidadao() {
        return new ParametroValidarInformacaoCidadao();
    }

    /**
     * Create an instance of {@link ResultadoRegistrarCidadao }
     * 
     */
    public ResultadoRegistrarCidadao createResultadoRegistrarCidadao() {
        return new ResultadoRegistrarCidadao();
    }

    /**
     * Create an instance of {@link ParametroObterCidadao }
     * 
     */
    public ParametroObterCidadao createParametroObterCidadao() {
        return new ParametroObterCidadao();
    }

    /**
     * Create an instance of {@link ResultadoObterCidadao }
     * 
     */
    public ResultadoObterCidadao createResultadoObterCidadao() {
        return new ResultadoObterCidadao();
    }

    /**
     * Create an instance of {@link ParametroRegistrarCidadao }
     * 
     */
    public ParametroRegistrarCidadao createParametroRegistrarCidadao() {
        return new ParametroRegistrarCidadao();
    }

    /**
     * Create an instance of {@link ResultadoValidarInformacaoCidadao }
     * 
     */
    public ResultadoValidarInformacaoCidadao createResultadoValidarInformacaoCidadao() {
        return new ResultadoValidarInformacaoCidadao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cidadao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/CICSergipe", name = "cidadao", scope = ParametroRegistrarCidadao.class)
    public JAXBElement<Cidadao> createParametroRegistrarCidadaoCidadao(Cidadao value) {
        return new JAXBElement<Cidadao>(_ParametroRegistrarCidadaoCidadao_QNAME, Cidadao.class, ParametroRegistrarCidadao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/CICSergipe", name = "documentoCPF", scope = ParametroObterCidadao.class)
    public JAXBElement<String> createParametroObterCidadaoDocumentoCPF(String value) {
        return new JAXBElement<String>(_ParametroObterCidadaoDocumentoCPF_QNAME, String.class, ParametroObterCidadao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cidadao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/CICSergipe", name = "cidadao", scope = ResultadoObterCidadao.class)
    public JAXBElement<Cidadao> createResultadoObterCidadaoCidadao(Cidadao value) {
        return new JAXBElement<Cidadao>(_ParametroRegistrarCidadaoCidadao_QNAME, Cidadao.class, ResultadoObterCidadao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaInfoRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/CICSergipe", name = "metaInfoCidadao", scope = ResultadoObterCidadao.class)
    public JAXBElement<MetaInfoRegistro> createResultadoObterCidadaoMetaInfoCidadao(MetaInfoRegistro value) {
        return new JAXBElement<MetaInfoRegistro>(_ResultadoObterCidadaoMetaInfoCidadao_QNAME, MetaInfoRegistro.class, ResultadoObterCidadao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaInfoRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/CICSergipe", name = "metaInfoCidadao", scope = ResultadoValidarInformacaoCidadao.class)
    public JAXBElement<MetaInfoRegistro> createResultadoValidarInformacaoCidadaoMetaInfoCidadao(MetaInfoRegistro value) {
        return new JAXBElement<MetaInfoRegistro>(_ResultadoObterCidadaoMetaInfoCidadao_QNAME, MetaInfoRegistro.class, ResultadoValidarInformacaoCidadao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/CICSergipe", name = "documentoCPF", scope = ParametroValidarInformacaoCidadao.class)
    public JAXBElement<String> createParametroValidarInformacaoCidadaoDocumentoCPF(String value) {
        return new JAXBElement<String>(_ParametroObterCidadaoDocumentoCPF_QNAME, String.class, ParametroValidarInformacaoCidadao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/CICSergipe", name = "codigoProtocolo", scope = ResultadoRegistrarCidadao.class)
    public JAXBElement<String> createResultadoRegistrarCidadaoCodigoProtocolo(String value) {
        return new JAXBElement<String>(_ResultadoRegistrarCidadaoCodigoProtocolo_QNAME, String.class, ResultadoRegistrarCidadao.class, value);
    }

}
