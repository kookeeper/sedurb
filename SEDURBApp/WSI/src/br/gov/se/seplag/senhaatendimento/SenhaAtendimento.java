package br.gov.se.seplag.senhaatendimento;

import br.gov.se.seplag.RequestFixo;
import br.gov.se.seplag.commons.v1.CabecalhoSeplag;
import br.gov.se.seplag.commons.v1.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebService(wsdlLocation=RequestFixo.WSDL_LOCATION + "V1/SenhaAtendimento?wsdl",
  targetNamespace="http://www.seplag.se.gov.br/SenhaAtendimento", name="SenhaAtendimento")
@XmlSeeAlso(
  { ObjectFactory.class, br.gov.se.seplag.ebo.v1.ObjectFactory.class, br.gov.se.seplag.senhaatendimento.ObjectFactory.class })
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE)
public interface SenhaAtendimento
{
  @WebMethod(operationName="EmitirSenhaAtendimento", action="http://www.seplag.se.gov.br/SenhaAtendimento/EmitirSenhaAtendimento")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://www.seplag.se.gov.br/SenhaAtendimento/EmitirSenhaAtendimento", fault =
      { @FaultAction(value="http://www.seplag.se.gov.br/SenhaAtendimento/SenhaAtendimento/EmitirSenhaAtendimento/Fault/erroInfo",
          className = ErroInfoMessage.class) }, output="http://www.seplag.se.gov.br/SenhaAtendimento/SenhaAtendimento/EmitirSenhaAtendimentoResponse")
  @WebResult(targetNamespace="http://www.seplag.se.gov.br/SenhaAtendimento",
    partName="parameters", name="ResultadoEmitirSenhaAtendimento")
  public ResultadoEmitirSenhaAtendimento emitirSenhaAtendimento(@WebParam(targetNamespace="http://www.seplag.se.gov.br/SenhaAtendimento",
      partName="parameters", name="ParametroEmitirSenhaAtendimento")
    ParametroEmitirSenhaAtendimento parameters, @WebParam(targetNamespace="http://www.seplag.se.gov.br/commons/v1",
      partName="cabecalho", name="cabecalhoSeplag", header=true)
    CabecalhoSeplag cabecalho)
    throws ErroInfoMessage;
}