/*
 * Copyright (C) 2017 Willian Alves Lima
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package leitoresXML;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import objetosXML.SupperPutty.ArrayOfSessionData;
import objetosXML.SupperPutty.SessionData;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Willian Alves Lima
 */
public class ReadSessions {
    private String arquivo ="";
    private ArrayOfSessionData sessions = new ArrayOfSessionData();
    
    public ReadSessions(String arquivo){
        this.arquivo = arquivo;
    }
    
    public ArrayOfSessionData getSessions(){
        return sessions;
    }   
    
    
    public void ler() {
   
    try {

	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();

	DefaultHandler handler = new DefaultHandler() {

	boolean bArrayOfSessionData = false;
	boolean bSessionData = false;
        
        
       

	public void startElement(String uri, String localName,String qName,
                Attributes attributes) throws SAXException {
                

		if (qName.equalsIgnoreCase("ARRAYOFSESSIONDATA")) {
			bArrayOfSessionData = true;
                        
                        
		}

		if (qName.equalsIgnoreCase("SESSIONDATA")) {
                        SessionData sessionData = new SessionData();
			bSessionData = true;
                        
                       
                        sessionData.setSessionId(attributes.getValue("SessionId")); 
                        sessionData.setSessionName(attributes.getValue("SessionName"));
                        sessionData.setImageKey(attributes.getValue("ImageKey"));
                        sessionData.setHost(attributes.getValue("Host"));
                        sessionData.setPort(attributes.getValue("Port"));
                        sessionData.setProto(attributes.getValue("Proto"));
                        sessionData.setPuttySession(attributes.getValue("PuttySession"));
                        sessionData.setUsername(attributes.getValue("Username"));
                        sessionData.setExtraArgs(attributes.getValue("ExtraArgs"));             
                        sessions.addSessionData(sessionData);
                }
                
		 

	}

	public void endElement(String uri, String localName,
		String qName) throws SAXException {
                
            
	}

	public void characters(char ch[], int start, int length) throws SAXException {

		if (bArrayOfSessionData) {
		
                    bArrayOfSessionData = false;
     
		}

		if (bSessionData) {
                    
                    bSessionData = false;
		}
                
	}

     };

       saxParser.parse("file:/" + arquivo, handler);

     } catch (Exception e) {
       e.printStackTrace();
     }

   }
}
