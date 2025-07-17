/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_;

/**
 *
 * @author Z_A_I_B
 */
class DOTPLOT1{
     String a,b;
     int o,t;
     char[]s;
     char[]s1;
     char[][] al;
     String alli="";
    DOTPLOT1(String str, String str1){
        a=str;
        o=a.length();
        b=str1;
        t=b.length();
        s=a.toCharArray();
        s1=b.toCharArray();
        al=new char[o][t];
    }
    String all(){
        try{
     for(int i=0; i<1; i++){ 
         for(int j=1;j<o; j++){
             al[i][j]=s[j-1];
         }
         for(int j=1;j<t; j++){
             al[j][i]=s1[j-1];
         }
     }
     int k=1;
     for(int i=1; i<o; i++){
         for(int j=1; j<t; j++){
             if(al[0][j]==al[i][0]){
             al[i][j]='*';
         }
             else
             al[i][j]='O';    
         }
     }
     for(int i=0; i<o; i++){
         for(int j=0; j<t; j++){
             alli+=al[i][j]+" ";
         }
         alli+="\n";
     }
        }catch(Exception e){
            
        }
        return alli;
    }
}
/*
public class DOTPLOT1 {
   public static void main(String[] str){
       
       A a=new A("ATCG ","GTCA ");
       String an=a.all();
       System.out.print(an);
   }
}*/
