package br.gov.se.seplag.passelivre;

import br.gov.se.seplag.RequestFixo;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation=RequestFixo.WSDL_LOCATION + "V1/PasseLivre?Wsdl",
  targetNamespace="http://www.seplag.se.gov.br/PasseLivre", name="PasseLivre")
public class PasseLivre_Service
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("br.gov.se.seplag.passelivre.PasseLivre_Service");
      URL baseUrl = PasseLivre_Service.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            PasseLivre_Service.class.getResource(RequestFixo.WSDL_LOCATION + "V1/PasseLivre?Wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, RequestFixo.WSDL_LOCATION + "V1/PasseLivre?Wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, RequestFixo.WSDL_LOCATION + "V1/PasseLivre?Wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://osb.itconsulting.com.br:8011/V1/PasseLivre?Wsdl",
          e);
    }
  }

  public PasseLivre_Service()
  {
    super(wsdlLocationURL,
          new QName("http://www.seplag.se.gov.br/PasseLivre",
                    "PasseLivre"));
  }

  public PasseLivre_Service(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="PasseLivreSOAP")
  public br.gov.se.seplag.passelivre.PasseLivre getPasseLivreSOAP()
  {
    return (br.gov.se.seplag.passelivre.PasseLivre) super.getPort(new QName("http://www.seplag.se.gov.br/PasseLivre",
                                                                            "PasseLivreSOAP"),
                                                                  br.gov.se.seplag.passelivre.PasseLivre.class);
  }

  @WebEndpoint(name="PasseLivreSOAP")
  public br.gov.se.seplag.passelivre.PasseLivre getPasseLivreSOAP(WebServiceFeature... features)
  {
    return (br.gov.se.seplag.passelivre.PasseLivre) super.getPort(new QName("http://www.seplag.se.gov.br/PasseLivre",
                                                                            "PasseLivreSOAP"),
                                                                  br.gov.se.seplag.passelivre.PasseLivre.class,
                                                                  features);
  }
}
