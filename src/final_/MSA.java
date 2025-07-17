/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_;

/**
 *
 * @author Z_A_I_B
 */
public class MSA {
    String a,b,c,d;
    int l1,l2,l3,l4;
    String msaa(String[] str){
        String s="";
        a=str[0];
        char[] c1=a.toCharArray();
        l1=c1.length;
        b=str[1];
        char[] c2=b.toCharArray();
        l2=c2.length;
        c=str[2];
        char[] c3=c.toCharArray();
        l3=c3.length;
        d=str[3];
        char[] c4=d.toCharArray();
        l4=c4.length;
        char[] ch5=new char[l1];
        try{
        for(int i=0; i<=l1; i++){
            if(c1[i]==c2[i]&&c1[i]==c3[i]&&c1[i]==c4[i]){
                s+="*";
            }
            else if(c1[i]==c2[i]&&c1[i]==c3[i]||c1[i]==c2[i]&&c1[i]==c4[i]||c1[i]==c3[i]&&c1[i]==c4[i]){
                s+="-";
            }
            else if(c1[i]==c2[i]||c1[i]==c3[i]||c1[i]==c4[i]){
                s+="-";
            }
            else{
                s+=" ";
            }
        }
        }catch(Exception e){
            
        } 
        return s;
    }
}
