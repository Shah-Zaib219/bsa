/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_;
import java.lang.String;
/**
 *
 * @author Z_A_I_B
 */
class CONVERTER {
    String dna;
    String remove(String str){
        dna=str;
        str="";
        char[] ch=dna.toCharArray();
        try{
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='A'||ch[i]=='T'||ch[i]=='G'||ch[i]=='C')
            {
               str+=ch[i];
            }
        }
        }catch(Exception e){
            
        }
        return str;
    }
    String removeT(String str){
        dna=str;
        str="";
        char[] ch=dna.toCharArray();
        try{
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='A'||ch[i]=='U'||ch[i]=='G'||ch[i]=='C')
            {
               str+=ch[i];
            }
        }
        }catch(Exception e){
            
        }
        return str;
    }
}

