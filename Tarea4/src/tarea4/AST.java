/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author yeferal
 */
public class AST {
    
    //5 1 2 + 4 * + 3 +
    
    private String salida, nodos, estructura;
    private int contador;
    private Nodo razi;
    
    public void recorrerArbol(Nodo nodo){
        razi = nodo;
        salida = "";
        nodos = "";
        estructura = "";
        contador = 1;
        recorrer(nodo);
        salida = "digraph dot\n{\n";
        salida += nodos;
        salida += estructura;
        salida += "}";
        
        //System.out.println("\n\n"+salida);
        
        genearGrafico();
    }
    
    public void recorrer(Nodo nodo){
        if(nodo !=null){
            nodo.setId(contador);
            contador++;
            nodos += "\tnode"+nodo.getId()+"[label=\""+nodo.getTexto()+"\"];\n";
            if(nodo.hijoIz!=null){
                  recorrer(nodo.getHijoIz());
                  estructura += "\tnode"+nodo.getId()+" -> node"+nodo.getHijoIz().getId()+";\n";
                  //salida = nodo.getTexto()+salida;
            }
            
             if(nodo.hijoDr!=null){
                  recorrer(nodo.getHijoDr());
                  estructura += "\tnode"+nodo.getId()+" -> node"+nodo.getHijoDr().getId()+";\n";
                  //salida = salida+nodo.getTexto();
            }
             
             //salida = nodo.getTexto()+salida;
            
        }else{
            //salida = nodo.getTexto()+salida;
        }
        
    }
    
    
    public String getSalida(){
        return salida;
    }
    public Nodo getRaiz(){
        return razi;
    }
    
    public void genearGrafico(){
        crearArchivo(salida,"./arbol.dot");
        try {
            String dotPath = "dot";
          
            String fileInputPath = "./arbol.dot";
            String fileOutputPath = "./arbol.jpg";
             
            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
                          
            Runtime rt = Runtime.getRuntime();
              
            rt.exec( cmd );
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }

    public void crearArchivo(String contenido,String ruta){
        try {
            
            
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mostrar(){

            try {
            Desktop.getDesktop().open(new File("./arbol.jpg"));
        } catch (IOException ex) {
            
        }
    }

    
}
