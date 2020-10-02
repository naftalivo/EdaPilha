/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edapilha;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author User
 */
public class Pilha {
    
    private List<Object> lista = new ArrayList();
    private Pilha aux;
   // private LinkedList <Aluno> alunos = new LinkedList();
    
   // private Aluno aluno;
   
    
 
    
    public void addList(Object[] a){
        lista.clear();
        for (Object aux : a){
          lista.add(a);  
        }
          
    }
    public void push(Object a){
        lista.add(a);
        
        
    }
    
    public Object peek(){
        return lista.get(lista.size()-1);
        
    }
    public void remove(){
        lista.remove(lista.size()-1);
    }
    
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    
    public int size(){
        return lista.size();
    }
    
    public boolean contains(Aluno a){
        return lista.contains(a);
        
    }
    
    public Object firstElement(){
        return lista.get(0);
        
    }
    
    public void clear(){
        for(int i=lista.size()-1;i<=0;i--)
            lista.remove(i);
    }
    
    public Object[] toArray(){
       return  lista.toArray();
    }

    @Override
    public String toString() {
        String str="";
        for (Object a : lista){
            str += a.toString()+",";
        }
        return "["+str+"]";
    }
    
    public int capacity(){
        return 10;
    }
    
    private List<Object> getList(){
        return lista;
    }
    
    public String iverter(){
        aux = new Pilha();

        for(int i = lista.size()-1;i >= 0;i--)   
            aux.push(getList().get(i)); 
       
        return aux.toString();        
    }
     
    private Pilha getInvertida(){
        return aux;
    }
    
    
    
}
