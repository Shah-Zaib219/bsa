/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_;

/**
 *
 * @author Z_A_I_B
 */
public class ORFS {
    static int c=0;
    String dna;
   String F1(String str){
       dna=str;
       str="";
       char[] ch=dna.toCharArray();
       int i=0;
       c=0;
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
                  c++;
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
       if(ch.length%3!=0&&c==0){
          int j=ch.length%3;
          int a=ch.length-j-1;
          for(; a<=ch.length;a++){
              str+=ch[a]+" ";
          }
      }
   }catch(Exception e){
       
   }
       return str;
   }
   //ONE END
   String F2(String str){
       dna=str;
       str="";
       char[] ch=dna.toCharArray();
       int i=0;
       c=1;
       str+=ch[i]+" ";
       i++;
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
                  c++;
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
       if((ch.length)%3!=1&&c==1){
          int j=((ch.length-1)%3);
          int a=ch.length-j-1;
          for(; a<ch.length;a++){
              str+=ch[a]+" ";
          }
      }
   }catch(Exception e){
       
   }
       return str;
   }
   //F2 END
   String F3(String str){
       dna=str;
       str="";
       char[] ch=dna.toCharArray();
       int i=0;
       c=0;
       str+=ch[i]+" ";
       i++;
       str+=ch[i]+" ";
       i++;
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
                  c++;
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
       if((ch.length-2)%3!=0&&c==0){
          int j=(ch.length-2)%3;
          int a=ch.length-j;
          for(int k=a; k<ch.length;k++){
              str+=ch[k]+" ";
          }
      }
   }catch(Exception e){
       
   }
       return str;
   }
   String F4(String str){
       dna=str;
       str="";
       char[] ch=dna.toCharArray();
       int i=ch.length;
       i=i-1;
       c=0;
       try{
       while(i>=0){
           if(ch[i]=='A'){
              if((ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='C')||(ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='A')){
                  str+="lle"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Met"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='C')||(ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Thr"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="Asn"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='G')){
                  str+="Lys"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Ser"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='A')||(ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Arg"+" ";
              }
           }
           else if(ch[i]=='U'){
               if((ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='C')){
                  str+="Phe"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='A')||(ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Leu"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="Tyr"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Cys"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Trp"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='C')){
                  str+="Ser"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Ser"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='G')||(ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='A')){
                  str+="Stop";
                  c++;
                  break;
              }
           }
           else if(ch[i]=='G'){
             if((ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='C')||(ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Val"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='C')||(ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Ala"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="Asp"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='G')){
                  str+="Glu"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Gly"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Gly"+" ";
              }  
           }
           else if(ch[i]=='C'){
               if((ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='C')||(ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Leu"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='C')||(ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Pro"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="His"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='G')){
                  str+="Gln"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Arg"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Arg"+" ";
              }  
           } 
           i-=3;
       }
   }catch(Exception e){
       
   }
       if(ch.length%3!=0&&c==0){
          int a=(ch.length)%3-1;
          for(int j=a; j>=0;j--){
              str+=ch[j]+" ";
          }
      }
       String s[] = str.split(" "); 
      String ans = ""; 
      for (int l = s.length - 1; l >= 0; l--) { 
        ans+=s[l]+" "; 
      } 
       return ans;
   }
      String F5(String str){
       dna=str;
       str="";
       char[] ch=dna.toCharArray();
       int i=ch.length;
       i=i-1;
       str+=ch[i]+" ";
       i--;
       c=1;
       try{
       while(i>=0){
           if(ch[i]=='A'){
              if((ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='C')||(ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='A')){
                  str+="lle"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Met"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='C')||(ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Thr"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="Asn"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='G')){
                  str+="Lys"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Ser"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='A')||(ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Arg"+" ";
              }
           }
           else if(ch[i]=='U'){
               if((ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='C')){
                  str+="Phe"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='A')||(ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Leu"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="Tyr"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Cys"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Trp"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='C')){
                  str+="Ser"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Ser"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='G')||(ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='A')){
                  str+="Stop";
                  c++;
                  break;
              }
           }
           else if(ch[i]=='G'){
             if((ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='C')||(ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Val"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='C')||(ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Ala"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="Asp"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='G')){
                  str+="Glu"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Gly"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Gly"+" ";
              }  
           }
           else if(ch[i]=='C'){
               if((ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='C')||(ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Leu"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='C')||(ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Pro"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="His"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='G')){
                  str+="Gln"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Arg"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Arg"+" ";
              }  
           } 
           i-=3;
       }
   }catch(Exception e){
       
   }
       if((ch.length-1)%3!=0&&c==1){
          int a=(ch.length-1)%3;
          for(int j=a-1; j>=0;j--){
              str+=ch[j]+" ";
          }
      }
       String s[] = str.split(" "); 
      String ans = ""; 
      for (int l = s.length - 1; l >= 0; l--) { 
        ans+=s[l]+" "; 
      } 
       return ans;
   }
         String F6(String str){
       dna=str;
       str="";
       char[] ch=dna.toCharArray();
       int i=ch.length;
       i=i-1;
       str+=ch[i]+" ";
       i--;
       str+=ch[i]+" ";
       i--;
       c=2;
       try{
       while(i>=0){
           if(ch[i]=='A'){
              if((ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='C')||(ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='A')){
                  str+="lle"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Met"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='C')||(ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='A'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Thr"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="Asn"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='A'&&ch[i-1]=='A'&&ch[i-2]=='G')){
                  str+="Lys"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Ser"+" ";
              }
              else if((ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='A')||(ch[i]=='A'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Arg"+" ";
              }
           }
           else if(ch[i]=='U'){
               if((ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='C')){
                  str+="Phe"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='A')||(ch[i]=='U'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Leu"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="Tyr"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Cys"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Trp"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='C')){
                  str+="Ser"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='U'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Ser"+" ";
              }
               else if((ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='U'&&ch[i-1]=='A'&&ch[i-2]=='G')||(ch[i]=='U'&&ch[i-1]=='G'&&ch[i-2]=='A')){
                  str+="Stop";
                  c++;
                  break;
              }
           }
           else if(ch[i]=='G'){
             if((ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='C')||(ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Val"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='C')||(ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Ala"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="Asp"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='A'&&ch[i-2]=='G')){
                  str+="Glu"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Gly"+" ";
              }
              else if((ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='A')||(ch[i]=='G'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Gly"+" ";
              }  
           }
           else if(ch[i]=='C'){
               if((ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='C')||(ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='U'&&ch[i-2]=='G')){
                  str+="Leu"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='C')||(ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='C'&&ch[i-2]=='G')){
                  str+="Pro"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='C')){
                  str+="His"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='A'&&ch[i-2]=='G')){
                  str+="Gln"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='U')||(ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='C')){
                  str+="Arg"+" ";
              }
              else if((ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='A')||(ch[i]=='C'&&ch[i-1]=='G'&&ch[i-2]=='G')){
                  str+="Arg"+" ";
              }  
           } 
           i-=3;
       }
   }catch(Exception e){
       
   }
       if((ch.length-2)%3!=0&&c==2){
          int a=(ch.length-2)%3;
          for(int j=a-1; j>=0;j--){
              str+=ch[j]+" ";
          }
      }
       String s[] = str.split(" "); 
      String ans = ""; 
      for (int l = s.length - 1; l >= 0; l--) { 
        ans+=s[l]+" "; 
      } 
       return ans;
   }
}
