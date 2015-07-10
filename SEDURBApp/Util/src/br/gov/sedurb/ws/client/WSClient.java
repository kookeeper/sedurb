package br.gov.sedurb.ws.client;

import javax.xml.ws.BindingProvider;

public abstract class WSClient<T> {

    public T getPort() {
        
        T port = criarPortType();
        
        ((BindingProvider) port).getRequestContext().put("com.sun.xml.ws.connect.timeout", 1 * 10 * 1000);

        return port;
    }

    public abstract T criarPortType();
    
    public String erroGenerico(Exception e) {
        return "Ocorreu um erro ao consumir o serviço '" + this.getClass().getSimpleName() + "': " + e.getMessage();
    }
}
