package br.gov.sedurb.ws.client;


import br.gov.se.seplag.RequestFixo;
import br.gov.se.seplag.cicsergipe.CICSergipe;
import br.gov.se.seplag.cicsergipe.CICSergipe_PortType;
import br.gov.se.seplag.cicsergipe.ErroInfoMessage;
import br.gov.se.seplag.cicsergipe.ParametroObterCidadao;
import br.gov.se.seplag.cicsergipe.ParametroRegistrarCidadao;
import br.gov.se.seplag.cicsergipe.ResultadoObterCidadao;
import br.gov.se.seplag.cicsergipe.ResultadoRegistrarCidadao;
import br.gov.se.seplag.commons.v1.ErroInfo;
import br.gov.sedurb.bean.CidadaoBean;
import br.gov.sedurb.util.JSFUtils;

import javax.xml.ws.WebServiceRef;

import oracle.xml.parser.v2.XMLElement;

// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

public class CICSergipeSOAPClient extends WSClient<CICSergipe_PortType> {

    private br.gov.se.seplag.cicsergipe.ObjectFactory factory =
        new br.gov.se.seplag.cicsergipe.ObjectFactory();

    @WebServiceRef
    private CICSergipe cICSergipe;
    private static CICSergipeSOAPClient obj;

    public static CICSergipeSOAPClient getInstance() {
        if (obj == null) {
            obj = new CICSergipeSOAPClient();
        }

        return obj;
    }

    private CICSergipeSOAPClient() {
        super();
    }

    public CidadaoBean obterCidadao(String cpf) throws ErroInfoMessage {

        ParametroObterCidadao parameters =
            factory.createParametroObterCidadao();
        parameters.setDocumentoCPF(factory.createParametroObterCidadaoDocumentoCPF(cpf));

        try {
            ResultadoObterCidadao cidadao =
                getPort().obterCidadao(parameters, RequestFixo.cabecalho());

            return new CidadaoBean(cidadao.getCidadao().getValue());
        } catch (Exception e) {
            if (e instanceof ErroInfoMessage) {
                throw (ErroInfoMessage)e;
            }
            JSFUtils.addFacesErrorMessage(erroGenerico(e));
        }

        return null;

    }

    public String registrarCidadao(CidadaoBean bean) {

        ParametroRegistrarCidadao parameters =
            factory.createParametroRegistrarCidadao();
        parameters.setCidadao(factory.createParametroRegistrarCidadaoCidadao(bean.getEntity()));

        String codigoProtocolo = null;
        try {

            ResultadoRegistrarCidadao resultado =
                getPort().registrarCidadao(parameters,
                                           RequestFixo.cabecalho());

            codigoProtocolo = resultado.getCodigoProtocolo().getValue();

        } catch (ErroInfoMessage e) {
            JSFUtils.addFacesErrorMessage("Erro ao tentar utilizar o serviço " +
                                          this.getClass().getSimpleName() +
                                          ":" + e.getMessage());
        } catch (Exception e) {
            JSFUtils.addFacesErrorMessage(erroGenerico(e));
        }

        return codigoProtocolo;

    }

    public CICSergipe_PortType criarPortType() {

        cICSergipe = new CICSergipe();
        CICSergipe_PortType port = cICSergipe.getCICSergipeSOAP_Port();

        return port;

    }
}