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

import java.util.*;

/**
 * A classe implementa o padrão Composite Iterator para 
 * para maipulação de Nodes 
 * @author Willian Alves Lima
 */
public class NodeCompositeIterator implements Iterator<Node>{
    Stack<Iterator<Node>> stack = new Stack<>();

    public NodeCompositeIterator(Iterator<Node> iterator){
        stack.push(iterator);
    }
    @Override
    public Node next() {
        if(hasNext()){
            Iterator<Node> iterator =  stack.peek();
            Node component =  iterator.next();
                
                  stack.push(component.createIterator());
            
            return component;
        } else {
            return null;
        }
        
    }    
    @Override
    public boolean hasNext(){
        if(stack.empty()) {
            return false;
        } else {
            Iterator<Node> iterator =  stack.peek();
            if(!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
