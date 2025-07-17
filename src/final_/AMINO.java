package final_;
import java.util.*;
class AMINO{
     String dna;
   String Amino(String str){
       dna=str;
       str="";
       char[] ch=dna.toCharArray();
       int i=0;
       try{
       while(i<ch.length){
           if(ch[i]=='A'){
              if((ch[i]=='A'&&ch[i+1]=='U'&&ch[i+2]=='U')||(ch[i]=='A'&&ch[i+1]=='U'&&ch[i+2]=='C')||(ch[i]=='A'&&ch[i+1]=='U'&&ch[i+2]=='A')){
                  str+="lle"+" ";
              }
              else if((ch[i]=='A'&&ch[i+1]=='U'&&ch[i+2]=='G')){
                  str+="Met"+" ";
              }
              else if((ch[i]=='A'&&ch[i+1]=='C'&&ch[i+2]=='U')||(ch[i]=='A'&&ch[i+1]=='C'&&ch[i+2]=='C')||(ch[i]=='A'&&ch[i+1]=='C'&&ch[i+2]=='A')||(ch[i]=='A'&&ch[i+1]=='C'&&ch[i+2]=='G')){
                  str+="Thr"+" ";
              }
              else if((ch[i]=='A'&&ch[i+1]=='A'&&ch[i+2]=='U')||(ch[i]=='A'&&ch[i+1]=='A'&&ch[i+2]=='C')){
                  str+="Asn"+" ";
              }
              else if((ch[i]=='A'&&ch[i+1]=='A'&&ch[i+2]=='A')||(ch[i]=='A'&&ch[i+1]=='A'&&ch[i+2]=='G')){
                  str+="Lys"+" ";
              }
              else if((ch[i]=='A'&&ch[i+1]=='G'&&ch[i+2]=='U')||(ch[i]=='A'&&ch[i+1]=='G'&&ch[i+2]=='C')){
                  str+="Ser"+" ";
              }
              else if((ch[i]=='A'&&ch[i+1]=='G'&&ch[i+2]=='A')||(ch[i]=='A'&&ch[i+1]=='G'&&ch[i+2]=='G')){
                  str+="Arg"+" ";
              }
           }
           else if(ch[i]=='U'){
               if((ch[i]=='U'&&ch[i+1]=='U'&&ch[i+2]=='U')||(ch[i]=='U'&&ch[i+1]=='U'&&ch[i+2]=='C')){
                  str+="Phe"+" ";
              }
               else if((ch[i]=='U'&&ch[i+1]=='U'&&ch[i+2]=='A')||(ch[i]=='U'&&ch[i+1]=='U'&&ch[i+2]=='G')){
                  str+="Leu"+" ";
              }
               else if((ch[i]=='U'&&ch[i+1]=='A'&&ch[i+2]=='U')||(ch[i]=='U'&&ch[i+1]=='A'&&ch[i+2]=='C')){
                  str+="Tyr"+" ";
              }
               else if((ch[i]=='U'&&ch[i+1]=='G'&&ch[i+2]=='U')||(ch[i]=='U'&&ch[i+1]=='G'&&ch[i+2]=='C')){
                  str+="Cys"+" ";
              }
               else if((ch[i]=='U'&&ch[i+1]=='G'&&ch[i+2]=='G')){
                  str+="Trp"+" ";
              }
               else if((ch[i]=='U'&&ch[i+1]=='C'&&ch[i+2]=='U')||(ch[i]=='U'&&ch[i+1]=='C'&&ch[i+2]=='C')){
                  str+="Ser"+" ";
              }
               else if((ch[i]=='U'&&ch[i+1]=='C'&&ch[i+2]=='A')||(ch[i]=='U'&&ch[i+1]=='C'&&ch[i+2]=='G')){
                  str+="Ser"+" ";
              }
               else if((ch[i]=='U'&&ch[i+1]=='A'&&ch[i+2]=='A')||(ch[i]=='U'&&ch[i+1]=='A'&&ch[i+2]=='G')||(ch[i]=='U'&&ch[i+1]=='G'&&ch[i+2]=='A')){
                  str+="Stop";
                  break;
              }
           }
           else if(ch[i]=='G'){
             if((ch[i]=='G'&&ch[i+1]=='U'&&ch[i+2]=='U')||(ch[i]=='G'&&ch[i+1]=='U'&&ch[i+2]=='C')||(ch[i]=='G'&&ch[i+1]=='U'&&ch[i+2]=='A')||(ch[i]=='G'&&ch[i+1]=='U'&&ch[i+2]=='G')){
                  str+="Val"+" ";
              }
              else if((ch[i]=='G'&&ch[i+1]=='C'&&ch[i+2]=='U')||(ch[i]=='G'&&ch[i+1]=='C'&&ch[i+2]=='C')||(ch[i]=='G'&&ch[i+1]=='C'&&ch[i+2]=='A')||(ch[i]=='G'&&ch[i+1]=='C'&&ch[i+2]=='G')){
                  str+="Ala"+" ";
              }
              else if((ch[i]=='G'&&ch[i+1]=='A'&&ch[i+2]=='U')||(ch[i]=='G'&&ch[i+1]=='A'&&ch[i+2]=='C')){
                  str+="Asp"+" ";
              }
              else if((ch[i]=='G'&&ch[i+1]=='A'&&ch[i+2]=='A')||(ch[i]=='G'&&ch[i+1]=='A'&&ch[i+2]=='G')){
                  str+="Glu"+" ";
              }
              else if((ch[i]=='G'&&ch[i+1]=='G'&&ch[i+2]=='U')||(ch[i]=='G'&&ch[i+1]=='G'&&ch[i+2]=='C')){
                  str+="Gly"+" ";
              }
              else if((ch[i]=='G'&&ch[i+1]=='G'&&ch[i+2]=='A')||(ch[i]=='G'&&ch[i+1]=='G'&&ch[i+2]=='G')){
                  str+="Gly"+" ";
              }  
           }
           else if(ch[i]=='C'){
               if((ch[i]=='C'&&ch[i+1]=='U'&&ch[i+2]=='U')||(ch[i]=='C'&&ch[i+1]=='U'&&ch[i+2]=='C')||(ch[i]=='C'&&ch[i+1]=='U'&&ch[i+2]=='A')||(ch[i]=='C'&&ch[i+1]=='U'&&ch[i+2]=='G')){
                  str+="Leu"+" ";
              }
              else if((ch[i]=='C'&&ch[i+1]=='C'&&ch[i+2]=='U')||(ch[i]=='C'&&ch[i+1]=='C'&&ch[i+2]=='C')||(ch[i]=='C'&&ch[i+1]=='C'&&ch[i+2]=='A')||(ch[i]=='C'&&ch[i+1]=='C'&&ch[i+2]=='G')){
                  str+="Pro"+" ";
              }
              else if((ch[i]=='C'&&ch[i+1]=='A'&&ch[i+2]=='U')||(ch[i]=='C'&&ch[i+1]=='A'&&ch[i+2]=='C')){
                  str+="His"+" ";
              }
              else if((ch[i]=='C'&&ch[i+1]=='A'&&ch[i+2]=='A')||(ch[i]=='C'&&ch[i+1]=='A'&&ch[i+2]=='G')){
                  str+="Gln"+" ";
              }
              else if((ch[i]=='C'&&ch[i+1]=='G'&&ch[i+2]=='U')||(ch[i]=='C'&&ch[i+1]=='G'&&ch[i+2]=='C')){
                  str+="Arg"+" ";
              }
              else if((ch[i]=='C'&&ch[i+1]=='G'&&ch[i+2]=='A')||(ch[i]=='C'&&ch[i+1]=='G'&&ch[i+2]=='G')){
                  str+="Arg"+" ";
              }  
           } 
           i+=3;
       }
   }catch(Exception e){
       
   }
       return str;
   }
 }