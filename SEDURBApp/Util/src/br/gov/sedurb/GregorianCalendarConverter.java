package br.gov.sedurb;

import java.text.SimpleDateFormat;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import javax.xml.datatype.XMLGregorianCalendar;

public class GregorianCalendarConverter implements Converter {
    public GregorianCalendarConverter() {
        super();
    }

    public Object getAsObject(FacesContext facesContext,
                              UIComponent uIComponent, String string) {
        return null;
    }

    public String getAsString(FacesContext facesContext,
                              UIComponent uIComponent, Object object) {
        
        return new SimpleDateFormat("dd/MM/yyyy hh:mm").format(((XMLGregorianCalendar)object).toGregorianCalendar().getTime());

    }
}
