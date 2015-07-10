
package br.gov.se.seplag.docsprocsnecessariosatendimento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.se.seplag.docsprocsnecessariosatendimento package. 
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

    private final static QName _ResultadoListarPorTipoAtendimento_QNAME = new QName("http://www.seplag.se.gov.br/DocsProcsNecessariosAtendimento", "resultadoListarPorTipoAtendimento");
    private final static QName _ParametroListarPorTipoAtendimento_QNAME = new QName("http://www.seplag.se.gov.br/DocsProcsNecessariosAtendimento", "parametroListarPorTipoAtendimento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.se.seplag.docsprocsnecessariosatendimento
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultadoListarPorTipoAtendimento }
     * 
     */
    public ResultadoListarPorTipoAtendimento createResultadoListarPorTipoAtendimento() {
        return new ResultadoListarPorTipoAtendimento();
    }

    /**
     * Create an instance of {@link ParametroListarPorTipoAtendimento }
     * 
     */
    public ParametroListarPorTipoAtendimento createParametroListarPorTipoAtendimento() {
        return new ParametroListarPorTipoAtendimento();
    }

    /**
     * Create an instance of {@link ListaProcedimentos }
     * 
     */
    public ListaProcedimentos createListaProcedimentos() {
        return new ListaProcedimentos();
    }

    /**
     * Create an instance of {@link ListaDocumentos }
     * 
     */
    public ListaDocumentos createListaDocumentos() {
        return new ListaDocumentos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoListarPorTipoAtendimento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/DocsProcsNecessariosAtendimento", name = "resultadoListarPorTipoAtendimento")
    public JAXBElement<ResultadoListarPorTipoAtendimento> createResultadoListarPorTipoAtendimento(ResultadoListarPorTipoAtendimento value) {
        return new JAXBElement<ResultadoListarPorTipoAtendimento>(_ResultadoListarPorTipoAtendimento_QNAME, ResultadoListarPorTipoAtendimento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametroListarPorTipoAtendimento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/DocsProcsNecessariosAtendimento", name = "parametroListarPorTipoAtendimento")
    public JAXBElement<ParametroListarPorTipoAtendimento> createParametroListarPorTipoAtendimento(ParametroListarPorTipoAtendimento value) {
        return new JAXBElement<ParametroListarPorTipoAtendimento>(_ParametroListarPorTipoAtendimento_QNAME, ParametroListarPorTipoAtendimento.class, null, value);
    }

}
