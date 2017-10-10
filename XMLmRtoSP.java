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
package xmlmrtosp;

import gerenciadoresArquivo.EscolherArquivo;
import gerenciadoresArquivo.GravaArquivo;
import leitoresXML.ReadConfCons;

/**
 * Classe principal da solução XMLmRtoSP
 * @author Willian Alves Lima
 */
public class XMLmRtoSP {
     
    /**
     *  @param args the command line arguments
     */
    public static void main(String[] args) {

        ReadConfCons leitorMr = new ReadConfCons(EscolherArquivo.caminho());
        //Lê arquivo confCons.xml (com 01 linha de conexões e vários Nodes 
        leitorMr.ler();
        /* Grava o arquivo Sessions.xml com base nas configurações constantes
         * no arquivo confCons.xml escolhido.
         */
        GravaArquivo.gravar(leitorMr.getConnections().toSessionsXML());
    }
}
