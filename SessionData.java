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

/**
 * Sessions - configurações SuperPutty
 * @author Willian Alves Lima
 */
public class SessionData {
    private String 
            //Cada Pasta é representada por uma entrada do caracter "/" 
        SessionId="Nivel 01/Nivel 02/nivel 03/Nome host",
            // Nome da sessão
        SessionName="Nome host",
        ImageKey="application_osx_terminal",
        Host="192.168.1.1",  
        Port="22",
        Proto="SSH",
        PuttySession="Default Settings", 
        Username="",
        ExtraArgs="";
   
    //métodos públicos

    public String getSessionId() {
        return SessionId;
    }

    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public String getSessionName() {
        return SessionName;
    }

    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    public String getImageKey() {
        return ImageKey;
    }

    public void setImageKey(String ImageKey) {
        this.ImageKey = ImageKey;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String Port) {
        this.Port = Port;
    }

    public String getProto() {
        return Proto;
    }

    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    public String getPuttySession() {
        return PuttySession;
    }

    public void setPuttySession(String PuttySession) {
        this.PuttySession = PuttySession;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getExtraArgs() {
        return ExtraArgs;
    }

    public void setExtraArgs(String ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }
    
    @Override
    public String toString(){
        StringBuilder session = new StringBuilder("");
        session.append("ID       :").append(SessionId).append("\n"); 
        session.append("Name     :").append(SessionName).append("\n");
        session.append("Image    :").append(ImageKey).append("\n");
        session.append("Host     :").append(Host).append("\n");
        session.append("Port     :").append(Port).append("\n");
        session.append("Proto    :").append(Proto).append("\n");
        session.append("Session  :").append(PuttySession).append("\n");
        session.append("Username :").append(Username).append("\n");
        session.append("Args     :").append(ExtraArgs).append("\n");
                
        return session.toString();
    }
    public String toTagXML(){
        StringBuilder tagXML = new StringBuilder();
        tagXML.append("<SessionData SessionId=\"").append(SessionId).append("\" "); 
        tagXML.append("SessionName=\"").append(SessionName).append("\" ");
        tagXML.append("ImageKey=\"").append(ImageKey).append("\" "); 
        tagXML.append("Host=\"").append(Host).append("\" ");
        tagXML.append("Port=\"").append(Port).append("\" ");
        tagXML.append("Proto=\"").append(Proto).append("\" ");
        tagXML.append("PuttySession=\"").append(PuttySession).append("\" ");
        tagXML.append("Username=\"").append(Username).append("\" ");
        tagXML.append("ExtraArgs=\"").append(ExtraArgs).append("\" />");
        
        return tagXML.toString();
    }
}
