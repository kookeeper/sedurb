
package br.gov.se.seplag.commons.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.se.seplag.commons.v1 package. 
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

    private final static QName _CabecalhoSeplag_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "cabecalhoSeplag");
    private final static QName _ErroInfo_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "erroInfo");
    private final static QName _MetaInfoRegistroUsuarioAlteracao_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "usuarioAlteracao");
    private final static QName _MetaInfoRegistroUsuarioInclusao_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "usuarioInclusao");
    private final static QName _MetaInfoRegistroDataHoraAlteracao_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "dataHoraAlteracao");
    private final static QName _MetaInfoRegistroDataHoraInclusao_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "dataHoraInclusao");
    private final static QName _ErroInfoDescricao_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "descricao");
    private final static QName _ErroInfoCodigo_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "codigo");
    private final static QName _ErroInfoDadosAdicionais_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "dadosAdicionais");
    private final static QName _ErroInfoDataTransacao_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "dataTransacao");
    private final static QName _CabecalhoSeplagVersao_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "versao");
    private final static QName _CabecalhoSeplagLoginUsuario_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "loginUsuario");
    private final static QName _CabecalhoSeplagCodigoFuncionalidade_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "codigoFuncionalidade");
    private final static QName _CabecalhoSeplagNomeServico_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "nomeServico");
    private final static QName _CabecalhoSeplagCodigoSessao_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "codigoSessao");
    private final static QName _CabecalhoSeplagEnderecoIP_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "enderecoIP");
    private final static QName _CabecalhoSeplagToken_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "token");
    private final static QName _CabecalhoSeplagNomeAplicacao_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "nomeAplicacao");
    private final static QName _CabecalhoSeplagCanalAtendimento_QNAME = new QName("http://www.seplag.se.gov.br/commons/v1", "canalAtendimento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.se.seplag.commons.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetaInfoRegistro }
     * 
     */
    public MetaInfoRegistro createMetaInfoRegistro() {
        return new MetaInfoRegistro();
    }

    /**
     * Create an instance of {@link CabecalhoSeplag }
     * 
     */
    public CabecalhoSeplag createCabecalhoSeplag() {
        return new CabecalhoSeplag();
    }

    /**
     * Create an instance of {@link ErroInfo }
     * 
     */
    public ErroInfo createErroInfo() {
        return new ErroInfo();
    }

    /**
     * Create an instance of {@link ErrosInfo }
     * 
     */
    public ErrosInfo createErrosInfo() {
        return new ErrosInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CabecalhoSeplag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "cabecalhoSeplag")
    public JAXBElement<CabecalhoSeplag> createCabecalhoSeplag(CabecalhoSeplag value) {
        return new JAXBElement<CabecalhoSeplag>(_CabecalhoSeplag_QNAME, CabecalhoSeplag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErroInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "erroInfo")
    public JAXBElement<ErroInfo> createErroInfo(ErroInfo value) {
        return new JAXBElement<ErroInfo>(_ErroInfo_QNAME, ErroInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "usuarioAlteracao", scope = MetaInfoRegistro.class)
    public JAXBElement<String> createMetaInfoRegistroUsuarioAlteracao(String value) {
        return new JAXBElement<String>(_MetaInfoRegistroUsuarioAlteracao_QNAME, String.class, MetaInfoRegistro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "usuarioInclusao", scope = MetaInfoRegistro.class)
    public JAXBElement<String> createMetaInfoRegistroUsuarioInclusao(String value) {
        return new JAXBElement<String>(_MetaInfoRegistroUsuarioInclusao_QNAME, String.class, MetaInfoRegistro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "dataHoraAlteracao", scope = MetaInfoRegistro.class)
    public JAXBElement<XMLGregorianCalendar> createMetaInfoRegistroDataHoraAlteracao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MetaInfoRegistroDataHoraAlteracao_QNAME, XMLGregorianCalendar.class, MetaInfoRegistro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "dataHoraInclusao", scope = MetaInfoRegistro.class)
    public JAXBElement<XMLGregorianCalendar> createMetaInfoRegistroDataHoraInclusao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MetaInfoRegistroDataHoraInclusao_QNAME, XMLGregorianCalendar.class, MetaInfoRegistro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErroInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "erroInfo", scope = ErrosInfo.class)
    public JAXBElement<ErroInfo> createErrosInfoErroInfo(ErroInfo value) {
        return new JAXBElement<ErroInfo>(_ErroInfo_QNAME, ErroInfo.class, ErrosInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "descricao", scope = ErroInfo.class)
    public JAXBElement<String> createErroInfoDescricao(String value) {
        return new JAXBElement<String>(_ErroInfoDescricao_QNAME, String.class, ErroInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "codigo", scope = ErroInfo.class)
    public JAXBElement<String> createErroInfoCodigo(String value) {
        return new JAXBElement<String>(_ErroInfoCodigo_QNAME, String.class, ErroInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "dadosAdicionais", scope = ErroInfo.class)
    public JAXBElement<Object> createErroInfoDadosAdicionais(Object value) {
        return new JAXBElement<Object>(_ErroInfoDadosAdicionais_QNAME, Object.class, ErroInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "dataTransacao", scope = ErroInfo.class)
    public JAXBElement<XMLGregorianCalendar> createErroInfoDataTransacao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ErroInfoDataTransacao_QNAME, XMLGregorianCalendar.class, ErroInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "versao", scope = CabecalhoSeplag.class)
    public JAXBElement<String> createCabecalhoSeplagVersao(String value) {
        return new JAXBElement<String>(_CabecalhoSeplagVersao_QNAME, String.class, CabecalhoSeplag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "loginUsuario", scope = CabecalhoSeplag.class)
    public JAXBElement<String> createCabecalhoSeplagLoginUsuario(String value) {
        return new JAXBElement<String>(_CabecalhoSeplagLoginUsuario_QNAME, String.class, CabecalhoSeplag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "codigoFuncionalidade", scope = CabecalhoSeplag.class)
    public JAXBElement<String> createCabecalhoSeplagCodigoFuncionalidade(String value) {
        return new JAXBElement<String>(_CabecalhoSeplagCodigoFuncionalidade_QNAME, String.class, CabecalhoSeplag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "nomeServico", scope = CabecalhoSeplag.class)
    public JAXBElement<String> createCabecalhoSeplagNomeServico(String value) {
        return new JAXBElement<String>(_CabecalhoSeplagNomeServico_QNAME, String.class, CabecalhoSeplag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "codigoSessao", scope = CabecalhoSeplag.class)
    public JAXBElement<String> createCabecalhoSeplagCodigoSessao(String value) {
        return new JAXBElement<String>(_CabecalhoSeplagCodigoSessao_QNAME, String.class, CabecalhoSeplag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "enderecoIP", scope = CabecalhoSeplag.class)
    public JAXBElement<String> createCabecalhoSeplagEnderecoIP(String value) {
        return new JAXBElement<String>(_CabecalhoSeplagEnderecoIP_QNAME, String.class, CabecalhoSeplag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "token", scope = CabecalhoSeplag.class)
    public JAXBElement<String> createCabecalhoSeplagToken(String value) {
        return new JAXBElement<String>(_CabecalhoSeplagToken_QNAME, String.class, CabecalhoSeplag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "nomeAplicacao", scope = CabecalhoSeplag.class)
    public JAXBElement<String> createCabecalhoSeplagNomeAplicacao(String value) {
        return new JAXBElement<String>(_CabecalhoSeplagNomeAplicacao_QNAME, String.class, CabecalhoSeplag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "canalAtendimento", scope = CabecalhoSeplag.class)
    public JAXBElement<String> createCabecalhoSeplagCanalAtendimento(String value) {
        return new JAXBElement<String>(_CabecalhoSeplagCanalAtendimento_QNAME, String.class, CabecalhoSeplag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.seplag.se.gov.br/commons/v1", name = "dataTransacao", scope = CabecalhoSeplag.class)
    public JAXBElement<XMLGregorianCalendar> createCabecalhoSeplagDataTransacao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ErroInfoDataTransacao_QNAME, XMLGregorianCalendar.class, CabecalhoSeplag.class, value);
    }

}
