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
package objetosXML.SupperPutty;

import java.util.ArrayList;

/**
 * Sessions - configurações SuperPutty
 * @author Willian Alves Lima
 */
public class ArrayOfSessionData {
    private ArrayList<SessionData> arrayOfSessionData = new ArrayList<>();  
    private String xmlns_xsi="http://www.w3.org/2001/XMLSchema-instance";
    private String xmlns_xsd="http://www.w3.org/2001/XMLSchema";
    //métodos públicos

    public ArrayList<SessionData> getArrayOfSessionData() {
        return arrayOfSessionData;
    }

    public void setArrayOfSessionData(ArrayList<SessionData> arrayOfSessionData) {
        this.arrayOfSessionData = arrayOfSessionData;
    }
    
    public void addSessionData(SessionData sessionData){
        this.arrayOfSessionData.add(sessionData);
    }

    public String getXmlns_xsi() {
        return xmlns_xsi;
    }

    public void setXmlns_xsi(String xmlns_xsi) {
        this.xmlns_xsi = xmlns_xsi;
    }

    public String getXmlns_xsd() {
        return xmlns_xsd;
    }

    public void setXmlns_xsd(String xmlns_xsd) {
        this.xmlns_xsd = xmlns_xsd;
    }
    
    public String toTagXML(){ 
        // Barra mais aspas duplas incluem aspas duplas em string ex \"terra\"   = "terra" 
        return "<ArrayOfSessionData xmlns:xsi=\"" +xmlns_xsi +"\" xmlns:xsd=\""+ xmlns_xsd  +"\">";
    }
    public String toXML(){    
        StringBuilder sessionsXML = new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        sessionsXML.append(toTagXML()).append("\n");
        if(!arrayOfSessionData.isEmpty()){
            for(SessionData sessionData : arrayOfSessionData)
                sessionsXML.append("  ").append(sessionData.toTagXML()).append("\n");
        }
        sessionsXML.append("</ArrayOfSessionData>");
        return sessionsXML.toString();
    }
        
}
