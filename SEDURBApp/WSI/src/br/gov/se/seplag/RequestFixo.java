package br.gov.se.seplag;

import br.gov.se.seplag.commons.v1.CabecalhoSeplag;
import br.gov.se.seplag.commons.v1.PaginacaoRequest;

import java.math.BigInteger;

public class RequestFixo {

    public static final String WSDL_LOCATION = "http://osb02.itconsulting.com.br:8011/";

    public static CabecalhoSeplag cabecalho() {
        br.gov.se.seplag.commons.v1.ObjectFactory factory = new br.gov.se.seplag.commons.v1.ObjectFactory();

        CabecalhoSeplag cabecalho = factory.createCabecalhoSeplag();
        cabecalho.setLoginUsuario(factory.createCabecalhoSeplagLoginUsuario("marcio.dantas"));
        cabecalho.setCanalAtendimento(factory.createCabecalhoSeplagCanalAtendimento("Ceac"));
        cabecalho.setNomeAplicacao(factory.createCabecalhoSeplagNomeAplicacao("Ceac"));

        return cabecalho;
    }

    public static PaginacaoRequest paginacao() {
        PaginacaoRequest paginacao = new PaginacaoRequest();
        paginacao.setPagina(BigInteger.valueOf(1L));
        paginacao.setQtdeRegistrosPorPagina(BigInteger.valueOf(200L));
        
        return paginacao;
    }
}
