
package br.gov.se.seplag.correioscep;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.se.seplag.correioscep package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.se.seplag.correioscep
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParametroConsultarEnderecoPorCEP }
     * 
     */
    public ParametroConsultarEnderecoPorCEP createParametroConsultarEnderecoPorCEP() {
        return new ParametroConsultarEnderecoPorCEP();
    }

    /**
     * Create an instance of {@link ResultadoConsultarEnderecoPorCEP }
     * 
     */
    public ResultadoConsultarEnderecoPorCEP createResultadoConsultarEnderecoPorCEP() {
        return new ResultadoConsultarEnderecoPorCEP();
    }

}
