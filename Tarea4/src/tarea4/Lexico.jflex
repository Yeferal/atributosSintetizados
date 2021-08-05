package tarea4;
import java_cup.runtime.*;
import java.util.ArrayList;

%%
%{
    //coidgo de usuario en sintaxis java
    

%}

    //directivas
%public 
%class AnalizadorLexico
%cupsym Simbolos
%cup
%char
%line
%column
%full
//%ignorecase
//%unicode

//expreciones regulares

Letra               = [a-zA-Z]
Digito              = [0-9]
Numero              = {Digito} {Digito}*
Palabra             = {Letra}+
Espacio             = [" "\t\r\b\n]+
//Salto               = [\n\t\r" "]+
%%

<YYINITIAL> {
    {Espacio}                       {/*Ignore*/}
    ({Numero})*         {System.out.print(yytext()); return new Symbol(Simbolos.NUM, yycolumn, yyline, new Integer(yytext()));}
    "*"                 {System.out.print("*"); return new Symbol(Simbolos.POR, yycolumn, yyline, yytext());}
    "("               {System.out.print("("); return new Symbol(Simbolos.P_A , yycolumn, yyline, yytext());}
    "+"               {System.out.print("+"); return new Symbol(Simbolos.MAS , yycolumn, yyline, yytext());}
    ")"               {System.out.print(")"); return new Symbol(Simbolos.P_C , yycolumn, yyline, yytext());}
    (({Palabra})({Numero})*)*        {System.out.println(yytext()); return new Symbol(Simbolos.ID , yycolumn, yyline, yytext());}
    .                           {System.out.println("CUALQUIER_SIM: "+yytext()); 
                                    //ErrorG e = new ErrorG(yyline+1, yycolumn+1,yytext(),"Lexico","Error Lexico token: " + yytext()+"   Linea: " + (yyline+1) + " ,    Columna: " + (yycolumn+1));
                                    //listaErrores.add(e);
                                    //return new Symbol(Simbolos.CUALQUIER_SIM , yycolumn, yyline, yytext());
                                    }
    
}
