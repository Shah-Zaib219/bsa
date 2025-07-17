/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Z_A_I_B
 */
public class SS implements Serializable{
    String an;
    String s;
    int a;
        SS(String str,String r, int n){
            an=str;
            s=r;
            a=n;
        }       
        void add(String str,String r, int n){
            an=str;
            s=r;
            a=n;
            SS[] ss=new SS[500];
            try{ 
             FileOutputStream fw = new FileOutputStream("F://sequence.ser");
            ObjectOutputStream aa= new ObjectOutputStream(fw);
            ss[a]=new SS(an,s,a);
                aa.writeObject(ss[a]); 
    }catch(Exception e){
        
    }
        }
            SS(String n){
            an=n;
        }
        String retr(String p){
            an=p;
            String str="";
            try{ 
             FileInputStream fin = new FileInputStream("F://sequence.ser");
            ObjectInputStream din= new ObjectInputStream(fin);
                for(int i=0; i<20; i++){
                SS ob1 = (SS) din.readObject();
                if(ob1.an.equals(an)){
                    str=ob1.s;
                    return str;
                }
                }
                fin.close();;
din.close(); 
    }catch(Exception e){
        
    }
         return "Sequence Not Found";   
        }
}
