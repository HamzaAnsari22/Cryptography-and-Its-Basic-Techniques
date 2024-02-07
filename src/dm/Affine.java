/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dm;
import java.util.*;
import java.*;
/**
 *
 * @author Microsoft
 */
public class Affine {
   
  
     public String ED[]=new String[100];
 
public String afncifr(int a,String str,int k,int flag){
    
     char back[]=new char[str.length()];
     char asciii[]=new char[str.length()];
    int asci;
    for (int i=0;i<str.length();i++) 
    {
          asciii[i]=str.charAt(i);
        
    asci=(int) asciii[i] ;
        
        if (asci>=65 && asci<=90)
        {
            asci-=65;
            if (flag==1)
            {
                asci=(a*asci+k);
                if (asci<0)
        {
            asci*=-1;
            asci=asci%26;
            asci*=-1;
            if (asci<0)
            asci+=26;
        }
                else
                    asci%=26;
              
                
            }
            else if (flag==2)
            {
                bezout b=new bezout(26,a);
                b.Display();
                int ab=b.s1;
                System.out.println(ab);
                if (ab<0)
        {
            System.out.println(ab);
            ab*=-1;
            ab=ab%26;
            ab*=-1;
            System.out.println(ab);
            if (ab<0)
            ab+=26;
            
            
        }
                else
                    ab%=26;
                asci=(ab*(asci-k));
         
                if (asci<0)
        {
            asci*=-1;
            asci=asci%26;
            asci*=-1;
            if (asci<0)
            asci+=26;
        }
                else
                    asci%=26;
                
            }
            asci+=65;
        }
        else if (asci>=97 && asci<=122)
        {
            asci-=97;
            if (flag==1)
            {
                asci=(a*asci+k);
                if (asci<0)
        {
            asci*=-1;
            asci=asci%26;
            asci*=-1;
            if (asci<0)
            asci+=26;
        }
                else
                    asci%=26;
              
                
            }
            else if (flag==2)
            { 
                
               bezout b=new bezout(26,a);
                b.Display();
                int ab=b.s1;
                if (ab<0)
        {
            ab*=-1;
            ab=ab%26;
            ab*=-1;
            if (ab<0)
            ab+=26;
        }
                else
                    ab%=26;
                asci=(ab*(asci-k));
                if (asci<0)
        {
            asci*=-1;
            asci=asci%26;
            asci*=-1;
            if (asci<0)
            asci+=26;
        }
                else
                    asci%=26;                
            }
            asci+=97;
        }
       asciii[i]=(char)asci;
}
 
  for(int i=0;i<str.length();i++)
    {
    back[i]=asciii[i];
    back[i]=(char) back[i] ;   
    char ss=back[i];
    ED[i]=Character.toString(ss);
    }
    return "";
}       
}
