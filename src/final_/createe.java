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

public class createe implements Serializable{
    String name;
    int n;
    String reg;
    String pa;
        createe(String str, int s, String r, String p){
            name=str;
            reg=r;
            n=s;
            pa=p;
        }       
        void add(String str, int s, String r, String p){
            name=str;
            n=s;
            reg=r;
            pa=p;
            createe[] C=new createe[2];
            try{ 
             FileOutputStream fw = new FileOutputStream("F://test_s.ser");
            ObjectOutputStream dw= new ObjectOutputStream(fw);
                C[n] = new createe(name, n, reg, pa);
                dw.writeObject(C[n]); 
                fw.close();;
dw.close(); 
    }catch(Exception e){
        
    }
            
        }
        createe(String str, String p){
            name=str;
            pa=p;
        }
        int retr(String str,String p){
            name=str;
            pa=p;
            try{ 
             FileInputStream fin = new FileInputStream("F://test_s.ser");
            ObjectInputStream din= new ObjectInputStream(fin);
                for(int i=0; i<2; i++){
                createe ob1 = (createe) din.readObject();
                if(ob1.name.equals(name)&&ob1.pa.equals(pa)){
                    return 1;
                }
                }
                fin.close();;
din.close(); 
    }catch(Exception e){
        
    }
         return 0;   
        }
}
