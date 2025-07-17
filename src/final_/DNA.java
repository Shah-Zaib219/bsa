/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_;
import java.util.*;

/**
 *
 * @author Z_A_I_B
 */  
public class DNA {
    String DNA;
    int length(String str){
        DNA=str;
        int l=DNA.length();
        return l;
    }
    String Rep(String Str){
        DNA=Str;
        char[] ch=DNA.toCharArray();
        Str="";
        for(int i=0; i<DNA.length(); i++)
        {
            if(ch[i]=='A'){
                Str+='T';
            }
            else if(ch[i]=='T'){
                Str+='A';
            }
            else if(ch[i]=='G'){
                Str+='C';
            }
            else if(ch[i]=='C'){
                Str+='G';
            }
        }
        return Str;
    }
    //Replication method end
    String Transc(String Str){
        DNA=Str;
        Str="";
         char[] ch=DNA.toCharArray();
        Str="";
        for(int i=0; i<DNA.length(); i++)
        {
            if(ch[i]=='A'){
                Str+='U';
            }
            else if(ch[i]=='T'){
                Str+='A';
            }
            else if(ch[i]=='G'){
                Str+='C';
            }
            else if(ch[i]=='C'){
                Str+='G';
            }
        }
        return Str;
    }
    //END
    String Repr(String Str){
        DNA=Str;
        char[] ch=DNA.toCharArray();
        Str="";
        for(int i=0; i<DNA.length(); i++)
        {
            if(ch[i]=='A'){
                Str+='U';
            }
            else if(ch[i]=='T'){
                Str+='A';
            }
            else if(ch[i]=='G'){
                Str+='C';
            }
            else if(ch[i]=='C'){
                Str+='G';
            }
        }
        return Str;
    }
    //Transcription method end 
    String Reprr(String Str){
        DNA=Str;
        char[] ch=DNA.toCharArray();
        Str="";
        for(int i=0; i<DNA.length(); i++)
        {
            if(ch[i]=='A'){
                Str+='U';
            }
            else if(ch[i]=='U'){
                Str+='A';
            }
            else if(ch[i]=='G'){
                Str+='C';
            }
            else if(ch[i]=='C'){
                Str+='G';
            }
        }
        return Str;
    }
}
