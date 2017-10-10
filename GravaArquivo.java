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
package gerenciadoresArquivo;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.io.File;
import java.util.Formatter; //para formatar arquivo

/**
 * Classe para gravaçõo de um arquivo de texto.
 * 
 * @author Willian Alve Lima 
 * 
 *
 */
public class GravaArquivo{
    
  /**
   * Realiza a gravação do arquivo
   * @param texto - String com os valores a serem gravados em arquivo de texto	
   */
  public static void gravar( String texto){
    
	  String nomeArq =  "Sessions.xml" ; //Nome de arquivo default 
	  JFileChooser fileChooser = new JFileChooser();
	  fileChooser.setSelectedFile(new File(nomeArq));
	  int result = fileChooser.showSaveDialog(null);
      if(result == JFileChooser.APPROVE_OPTION){
    	  try
    	    {
    		  File arquivo = fileChooser.getSelectedFile();
    	      Formatter saida = new Formatter(arquivo.getPath());
    	      saida.format(texto);
    	      saida.close();
    	      JOptionPane.showMessageDialog(null,"Arquivo '"+arquivo.getName()+"' criado!","Arquivo",1);
    	      
    	     
    	    }
    	    //mostrando erro em caso de nao for possivel gerar o arquivo
    	    catch(Exception erro){
    	      JOptionPane.showMessageDialog(null,"Arquivo nao pode ser gerado!","Erro",0);
       	    }
      }else if(result == JFileChooser.CANCEL_OPTION){
          JOptionPane.showMessageDialog(null, "Criação de arquivo cancelada!");
      }
  }
    
}
