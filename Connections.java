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
package objetosXML.mRmote;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ConfCons - configuração mRemote
 * Elemento do tipo Connections."
 * @author Willian
 */
public class Connections implements ColecaoDeNodes{
   private String Name="Nome Connections";
   private String Export="False";
   private String Protected="vVTV7zCWIUs0Jnl6JKCpjtQb5S/WI6Jrh3YPr0dfZ75JrLYsUZQ0Ks277J5EA1np";
   private String ConfVersion="2.5";
   private ArrayList<Node> nodes = new ArrayList<>(); 
   private Iterator<Node> iterator = null; 
   
   private String xmlns_xsi="http://www.w3.org/2001/XMLSchema-instance";
   private String xmlns_xsd="http://www.w3.org/2001/XMLSchema";
   
   //métodos públicos

   @Override
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getExport() {
        return Export;
    }

    public void setExport(String Export) {
        this.Export = Export;
    }

    public String getProtected() {
        return Protected;
    }

    public void setProtected(String Protected) {
        this.Protected = Protected;
    }

    public String getConfVersion() {
        return ConfVersion;
    }

    public void setConfVersion(String ConfVersion) {
        this.ConfVersion = ConfVersion;
    }

   @Override
    public ArrayList<Node> getNodes() {
        return nodes;
    }

   @Override
    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }
   
   @Override
    public void addNodes(Node novoNode){
        this.nodes.add(novoNode);
    }

   @Override
   public String toString(){
       StringBuilder connexoes = new StringBuilder();
       connexoes.append("Nome        : " ).append(Name).append("\n");
       connexoes.append("Export      : " ).append(Export).append("\n");
       connexoes.append("Protected   : " ).append(Protected).append("\n");
       connexoes.append("ConfVersion : " ).append(ConfVersion).append("\n");
       return connexoes.toString();
   }
   
   @Override
   public Iterator<Node> createIterator(){
      if(iterator == null){  
           if(nodes.isEmpty()) iterator =  new NullIterator();
           iterator = new NodeCompositeIterator(nodes.iterator());
      }     
      return iterator;     
    }
       
   public void print(){
        System.out.println(toString());
       Iterator<Node> iteratorSimples = nodes.iterator();
		while (iteratorSimples.hasNext()) {
			Node node = iteratorSimples.next();
			node.print();
		} 
        
    }
   /**.
    * tranforma o Objeto Connections e seus nodes filhos em uma 
    * String contendo a estrutura do arquivo de configuração de conexões 
    * do SuperPutty (Sessions.xml)
    * Cada Node do tipo connection é representado na forma da tag xml 
    * SessionData.
    * @return linhas do arquivo xml de configuração do SuperPutty
    */
   public String toSessionsXML(){
        StringBuilder linha = new StringBuilder();
        //início do arquivo
        linha.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        linha.append("<ArrayOfSessionData xmlns:xsi=\"").append(xmlns_xsi).append("\" xmlns:xsd=\"").append(xmlns_xsd).append("\">\n");
        
        
            Iterator<Node> iteratorLinha = nodes.iterator();
            
            while (iteratorLinha.hasNext()) {
                    Node node = iteratorLinha.next();
                    //linha SessionData criada para cado Node do tipo Connection
                    linha.append(node.linha("  <SessionData SessionId=\""));
            }
            //final do arquivo
            linha.append("</ArrayOfSessionData>");
            return linha.toString();
   }
   
   
}
