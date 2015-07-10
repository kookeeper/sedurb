
package br.gov.se.seplag.anexoprocessosatendimento;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.se.seplag.anexoprocessosatendimento package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.se.seplag.anexoprocessosatendimento
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultadoListarPorAtendimento }
     * 
     */
    public ResultadoListarPorAtendimento createResultadoListarPorAtendimento() {
        return new ResultadoListarPorAtendimento();
    }

    /**
     * Create an instance of {@link ResultadoIncluirPorAtendimento }
     * 
     */
    public ResultadoIncluirPorAtendimento createResultadoIncluirPorAtendimento() {
        return new ResultadoIncluirPorAtendimento();
    }

    /**
     * Create an instance of {@link ListaCodigoProtocolo }
     * 
     */
    public ListaCodigoProtocolo createListaCodigoProtocolo() {
        return new ListaCodigoProtocolo();
    }

    /**
     * Create an instance of {@link ParametroIncluirPorAtendimento }
     * 
     */
    public ParametroIncluirPorAtendimento createParametroIncluirPorAtendimento() {
        return new ParametroIncluirPorAtendimento();
    }

    /**
     * Create an instance of {@link ParametroListarPorAtendimento }
     * 
     */
    public ParametroListarPorAtendimento createParametroListarPorAtendimento() {
        return new ParametroListarPorAtendimento();
    }

    /**
     * Create an instance of {@link ResultadoListarAnexosValidos }
     * 
     */
    public ResultadoListarAnexosValidos createResultadoListarAnexosValidos() {
        return new ResultadoListarAnexosValidos();
    }

    /**
     * Create an instance of {@link ParametroListarAnexosValidos }
     * 
     */
    public ParametroListarAnexosValidos createParametroListarAnexosValidos() {
        return new ParametroListarAnexosValidos();
    }

}
