package gerenciadoresArquivo;

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

/**
 * Classe que utilizada para informar a localização de um arquivo
 * por meio da exibição de um fileChooser
 * @author Willian Alves Lima
 */
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.io.File;

public class EscolherArquivo {
	
	/**
	 *	@return  arguivo.getPath 
         *      informando o caminho do arquivo de selecionado
	 */
    public static String caminho(){
        JFileChooser fileChooser = new JFileChooser();
    
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setDialogTitle("Abrir arquivo de origem:");
        int result = fileChooser.showOpenDialog(null);
       if(result == JFileChooser.CANCEL_OPTION) return null;
       File arquivo = fileChooser.getSelectedFile();
       if(arquivo == null || arquivo.getName().equals(""))
           JOptionPane.showMessageDialog(null, "Nome de arqvivo inválido!");
       else return arquivo.getPath();
     return null;
    }       
}
