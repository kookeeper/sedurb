package br.gov.se.seplag.handlers;

import java.io.PrintStream;
import java.io.StringWriter;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;


/*
 * This simple SOAPHandler will output the contents of incoming
 * and outgoing messages.
 */
public class SOAPLoggingHandler implements LogicalHandler<LogicalMessageContext> {

    public boolean handleFault(LogicalMessageContext context) {
        logToSystemOut(context);
        return true;
    }

    public boolean handleMessage(LogicalMessageContext context) {
        logToSystemOut(context);

        // If the payload is modified, Do lm.setPayload(source) to be safe,
        // Without it, behavior may vary on the kind of source returned in lm.getPayload().
        // See LogicalMessage JavaDoc for more details.
        // lm.setPayload(modifiedPayload);

        return true;
    }

    // change this to redirect output if desired
    private static PrintStream out = System.out;

    public void close(MessageContext messageContext) {
    }

    /*
     * Check the MESSAGE_OUTBOUND_PROPERTY in the context
     * to see if this is an outgoing or incoming message.
     * Write a brief message to the print stream and
     * output the message. The writeTo() method can throw
     * SOAPException or IOException
     */

    private void logToSystemOut(LogicalMessageContext context) {
        
        Boolean outboundProperty =
            (Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty) {
            out.println("\nOutbound message:");
        } else {
            out.println("\nInbound message:");
        }
        LogicalMessage lm = context.getMessage();
        Source payload = lm.getPayload();

        try {
            TransformerFactory tfactory = TransformerFactory.newInstance();
            Transformer xform = tfactory.newTransformer();

            java.io.StringWriter writer = new StringWriter();
            Result result = new StreamResult(writer);

            xform.transform(payload, result);
            
            out.println(writer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
