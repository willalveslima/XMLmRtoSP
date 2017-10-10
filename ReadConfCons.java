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

import java.util.Stack;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import objetosXML.mRmote.ColecaoDeNodes;
import objetosXML.mRmote.Connections;
import objetosXML.mRmote.Node;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Willian Alves Lima
 */
public class ReadConfCons {
    private String arquivo ="";
    private Connections connection = new Connections();
    private Stack<ColecaoDeNodes> stackNodes = new Stack<>();
    private int espacos = 0;
    
    public ReadConfCons(String arquivo){
        this.arquivo = arquivo;
    }
    
    public Connections getConnections(){
        return connection;
    }   
    
    
    public void ler() {
   
    try {

	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();

	DefaultHandler handler = new DefaultHandler() {

	boolean bconnections = false;
	boolean bnode = false;
        
        
       

	public void startElement(String uri, String localName,String qName,
                Attributes attributes) throws SAXException {
                
                if (qName.equalsIgnoreCase("CONNECTIONS")) {
			bconnections = true;
                        connection.setName(attributes.getValue("Name"));
                        connection.setExport(attributes.getValue("Export"));
                        connection.setProtected(attributes.getValue("Protected"));
                        connection.setConfVersion(attributes.getValue("ConfVersion"));
                        stackNodes.push(connection);
		}

		if (qName.equalsIgnoreCase("NODE")) {
                        Node novoNode = new Node();
			bnode = true;
                                               
                        novoNode.setAutomaticResize(attributes.getValue("AutomaticResize"));
                        novoNode.setName(attributes.getValue("Name"));                                          
                        novoNode.setType(attributes.getValue("Type"));
                        novoNode.setExpanded(attributes.getValue("Expanded"));
                        novoNode.setDescr(attributes.getValue("Descr"));
                        novoNode.setIcon(attributes.getValue("Icon"));
                        novoNode.setPanel(attributes.getValue("Panel"));
                        novoNode.setUsername(attributes.getValue("Username"));
                        novoNode.setDomain(attributes.getValue("Domain"));
                        novoNode.setPassword(attributes.getValue("Password"));
                        novoNode.setHostname(attributes.getValue("Hostname"));
                        novoNode.setProtocol(attributes.getValue("Protocol"));
                        novoNode.setPuttySession(attributes.getValue("PuttySession"));
                        novoNode.setPort(attributes.getValue("Port"));
                        novoNode.setConnectToConsole(attributes.getValue("ConnectToConsole")); 
                        novoNode.setUseCredSsp(attributes.getValue("UseCredSsp"));
                        novoNode.setRenderingEngine(attributes.getValue("RenderingEngine"));
                        novoNode.setICAEncryptionStrength(attributes.getValue("ICAEncryptionStrength"));
                        novoNode.setRDPAuthenticationLevel(attributes.getValue("RDPAuthenticationLevel"));
                        novoNode.setLoadBalanceInfo(attributes.getValue("LoadBalanceInfo"));
                        novoNode.setColors(attributes.getValue("Colors"));
                        novoNode.setResolution(attributes.getValue("Resolution"));
                        novoNode.setAutomaticResize(attributes.getValue("AutomaticResize"));
                        novoNode.setDisplayWallpaper(attributes.getValue("DisplayWallpaper"));
                        novoNode.setDisplayThemes(attributes.getValue("DisplayThemes"));
                        novoNode.setEnableFontSmoothing(attributes.getValue("EnableFontSmoothing"));
                        novoNode.setEnableDesktopComposition(attributes.getValue("EnableDesktopComposition"));
                        novoNode.setCacheBitmaps(attributes.getValue("CacheBitmaps"));
                        novoNode.setRedirectDiskDrives(attributes.getValue("RedirectDiskDrives"));
                        novoNode.setRedirectPorts(attributes.getValue("RedirectPorts"));
                        novoNode.setRedirectPrinters(attributes.getValue("RedirectPrinters"));
                        novoNode.setRedirectSmartCards(attributes.getValue("RedirectSmartCards"));
                        novoNode.setRedirectSound(attributes.getValue("RedirectSound"));
                        novoNode.setRedirectKeys(attributes.getValue("RedirectKeys"));
                        novoNode.setConnected(attributes.getValue("Connected"));
                        novoNode.setPreExtApp(attributes.getValue("PreExtApp"));
                        novoNode.setPostExtApp(attributes.getValue("PostExtApp"));
                        novoNode.setMacAddress(attributes.getValue("MacAddress"));
                        novoNode.setUserField(attributes.getValue("UserField"));
                        novoNode.setExtApp(attributes.getValue("ExtApp"));
                        novoNode.setVNCCompression(attributes.getValue("VNCCompression"));
                        novoNode.setVNCEncoding(attributes.getValue("VNCEncoding"));
                        novoNode.setVNCAuthMode(attributes.getValue("VNCAuthMode"));
                        novoNode.setVNCProxyType(attributes.getValue("VNCProxyType"));
                        novoNode.setVNCProxyIP(attributes.getValue("VNCProxyIP"));
                        novoNode.setVNCProxyPort(attributes.getValue("VNCProxyPort"));
                        novoNode.setVNCProxyUsername(attributes.getValue("VNCProxyUsername"));
                        novoNode.setVNCProxyPassword(attributes.getValue("VNCProxyPassword"));
                        novoNode.setVNCColors(attributes.getValue("VNCColors"));
                        novoNode.setVNCSmartSizeMode(attributes.getValue("VNCSmartSizeMode"));
                        novoNode.setVNCViewOnly(attributes.getValue("VNCViewOnly"));
                        novoNode.setRDGatewayUsageMethod(attributes.getValue("RDGatewayUsageMethod"));
                        novoNode.setRDGatewayHostname(attributes.getValue("RDGatewayHostname"));
                        novoNode.setRDGatewayUseConnectionCredentials(attributes.getValue("RDGatewayUseConnectionCredentials"));
                        novoNode.setRDGatewayUsername(attributes.getValue("RDGatewayUsername"));
                        novoNode.setRDGatewayPassword(attributes.getValue("RDGatewayPassword"));
                        novoNode.setRDGatewayDomain(attributes.getValue("RDGatewayDomain"));
                        novoNode.setInheritCacheBitmaps(attributes.getValue("InheritCacheBitmaps"));
                        novoNode.setInheritColors(attributes.getValue("InheritColors"));
                        novoNode.setInheritDescription(attributes.getValue("InheritDescription"));
                        novoNode.setInheritDisplayThemes(attributes.getValue("InheritDisplayThemes"));
                        novoNode.setInheritDisplayWallpaper(attributes.getValue("InheritDisplayWallpaper"));
                        novoNode.setInheritEnableFontSmoothing(attributes.getValue("InheritEnableFontSmoothing"));
                        novoNode.setInheritEnableDesktopComposition(attributes.getValue("InheritEnableDesktopComposition"));
                        novoNode.setInheritDomain(attributes.getValue("InheritDomain"));
                        novoNode.setInheritIcon(attributes.getValue("InheritIcon"));
                        novoNode.setInheritPanel(attributes.getValue("InheritPanel"));
                        novoNode.setInheritPassword(attributes.getValue("InheritPassword"));
                        novoNode.setInheritPort(attributes.getValue("InheritPort"));
                        novoNode.setInheritProtocol(attributes.getValue("InheritProtocol"));
                        novoNode.setInheritPuttySession(attributes.getValue("InheritPuttySession"));
                        novoNode.setInheritRedirectDiskDrives(attributes.getValue("InheritRedirectDiskDrives"));
                        novoNode.setInheritRedirectKeys(attributes.getValue("InheritRedirectKeys"));
                        novoNode.setInheritRedirectPorts(attributes.getValue("InheritRedirectPorts"));
                        novoNode.setInheritRedirectPrinters(attributes.getValue("InheritRedirectPrinters"));
                        novoNode.setInheritRedirectSmartCards(attributes.getValue("InheritRedirectSmartCards"));
                        novoNode.setInheritRedirectSound(attributes.getValue("InheritRedirectSound"));
                        novoNode.setInheritResolution(attributes.getValue("InheritResolution"));
                        novoNode.setInheritAutomaticResize(attributes.getValue("InheritAutomaticResize"));
                        novoNode.setInheritUseConsoleSession(attributes.getValue("InheritUseConsoleSession"));
                        novoNode.setInheritUseCredSsp(attributes.getValue("InheritUseCredSsp"));
                        novoNode.setInheritRenderingEngine(attributes.getValue("setInheritRenderingEngine"));
                        novoNode.setInheritUsername(attributes.getValue("InheritUsername"));
                        novoNode.setInheritICAEncryptionStrength(attributes.getValue("InheritICAEncryptionStrength"));
                        novoNode.setInheritRDPAuthenticationLevel(attributes.getValue("InheritRDPAuthenticationLevel"));
                        novoNode.setInheritLoadBalanceInfo(attributes.getValue("InheritLoadBalanceInfo"));
                        novoNode.setInheritPreExtApp(attributes.getValue("InheritPreExtApp"));
                        novoNode.setInheritPostExtApp(attributes.getValue("InheritPostExtApp"));
                        novoNode.setInheritMacAddress(attributes.getValue("InheritMacAddress"));
                        novoNode.setInheritUserField(attributes.getValue("InheritUserField"));
                        novoNode.setInheritExtApp(attributes.getValue("InheritExtApp"));
                        novoNode.setInheritVNCCompression(attributes.getValue("InheritVNCCompression"));
                        novoNode.setInheritVNCEncoding(attributes.getValue("InheritVNCEncoding"));
                        novoNode.setInheritVNCAuthMode(attributes.getValue("InheritVNCAuthMode"));
                        novoNode.setInheritVNCProxyType(attributes.getValue("InheritVNCProxyType"));
                        novoNode.setInheritVNCProxyIP(attributes.getValue("InheritVNCProxyIP"));
                        novoNode.setInheritVNCProxyPort(attributes.getValue("InheritVNCProxyPort"));
                        novoNode.setInheritVNCProxyUsername(attributes.getValue("InheritVNCProxyUsername"));
                        novoNode.setInheritVNCProxyPassword(attributes.getValue("InheritVNCProxyPassword"));
                        novoNode.setInheritVNCColors(attributes.getValue("InheritVNCColors"));
                        novoNode.setInheritVNCSmartSizeMode(attributes.getValue("InheritVNCSmartSizeMode"));
                        novoNode.setInheritVNCViewOnly(attributes.getValue("InheritVNCViewOnly"));
                        novoNode.setInheritRDGatewayUsageMethod(attributes.getValue("InheritRDGatewayUsageMethod"));
                        novoNode.setInheritRDGatewayHostname(attributes.getValue("InheritRDGatewayHostname"));
                        novoNode.setInheritRDGatewayUseConnectionCredentials(attributes.getValue("InheritRDGatewayUseConnectionCredentials"));
                        novoNode.setInheritRDGatewayUsername(attributes.getValue("InheritRDGatewayUsername"));
                        novoNode.setInheritRDGatewayPassword(attributes.getValue("setInheritRDGatewayPassword"));
                        novoNode.setInheritRDGatewayDomain(attributes.getValue("InheritRDGatewayDomain"));
                        stackNodes.peek().addNodes(novoNode);
                        stackNodes.push(novoNode);
                        
                }
                
		// for(int x = 0; x < espacos; x++) System.out.print(" ");
                //System.out.println("Start : " + stackNodes.peek().getName() );
                //espacos++;

	}

	public void endElement(String uri, String localName,
		String qName) throws SAXException {
                  
               espacos--;
               //for(int x = 0; x < espacos; x++) System.out.print(" ");
               //   System.out.println("END: " + stackNodes.peek().getName());
               stackNodes.pop();
	}

	public void characters(char ch[], int start, int length) throws SAXException {

		if (bconnections) {
			
                        bconnections = false;
                       
		}

		if (bnode) {
                    
                   bnode = false;
                  
		}
                 //System.out.println("Dados vazios:" );
	}

     };

       saxParser.parse("file:/" + arquivo, handler);

     } catch (Exception e) {
       e.printStackTrace();
     }

   }
}
