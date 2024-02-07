/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dm;
import java.*;
import java.math.BigInteger;
//import sun.security.util.BigInt;
/**
 *
 * @author Microsoft
 */
public class Rsafinal {
     int p,q,e;
        String M,n,f="",aa="",t="";
         long C;
      public String res[]=new String[100];
      public String des[]=new String[100];
    public Rsafinal(String M,int p,int q,int e)
    {
        this.M=M;
        this.p=p;
        this.q=q;
        this.e=e;
        
    }
public  String cal(int n,String M,String nn)
{
     BigInteger bigint = new BigInteger(M);
     BigInteger mod1=new BigInteger(nn);
 
        bigint = bigint.pow(n);
    
    bigint=bigint.mod(mod1);
    return bigint.toString();
}
    
    public String Encryption()
    {
        n=""+p*q;    
        M=M.toUpperCase();
        String xx="";
        int ee;
        char cc[]=new char[M.length()];
        for(int i=0;i<M.length();i++)
        {
            xx=String.valueOf((int)(M.charAt(i)-65));
            ee=Integer.parseInt(xx);
            if(ee<10)
            {
                xx="0"+xx;
            }
            aa+=xx;
        }
        int k=0,pp=4;
        String u="";
        String tt[]=new String[M.length()];
        for(int i=0;i<2;i++)
        {
        if(aa.length()%2==0)
        {          
            u=cal(e,aa.substring(k, pp),n);
            int rr=Integer.parseInt(u);
            if(rr<1000&&rr>100)
            {
                u="0"+rr;
            }
            else if(rr<100)
            {
                u="00"+rr;
            }
            
            else if(rr>9999)
            {           
                rr=rr%(p*q);
                u=""+rr;
            }
            k+=4;
            pp+=4;
           f+=u;           
        }
        }
        char asd[]=new char[f.length()];
        int yuu[]=new int[f.length()];
        int yt=0,rt=2;
       for(int i=0;i<(f.length()/2);i++)
       {        
          yuu[i]=Integer.parseInt(f.substring(yt,rt));
           yt+=2;
           rt+=2;
           if(yuu[i]>=26)
           {
               yuu[i]=yuu[i]%26;             
               yuu[i]+=65;             
           }
           else
           yuu[i]+=65;          
           asd[i]=(char)yuu[i];
       }
       for(int i=0;i<asd.length;i++)
       {
           if(asd[i]!=0)
           {
               res[i]=Character.toString(asd[i]);
           }
       }
    return "";
    }
    public String decrytion()
    {
        n=""+p*q;
         int phi1=(p-1)*(q-1);
             char cc[]=new char[M.length()];

        bezout b=new bezout(phi1,e);
        b.Display();
        int ab=b.s1;
        while(ab<0)
        {
            ab+=phi1;
        }
        int k=0,pp=4;
        String u="";
        String tt[]=new String[M.length()];
        for(int i=0;i<2;i++)
        {
        if(M.length()%2==0)
        {            
            u=cal(ab,M.substring(k, pp),n);
            int rr=Integer.parseInt(u);
            if(rr<1000&&rr>100)
            {
                u="0"+rr;
            }
            else if(rr>=10 && rr<100)
            {
                u="00"+rr;
            }
            else if(rr<10)
            {
                u="000"+rr;
            }            
            else if(rr>9999)
            {               
                rr=rr%(p*q);
                u=""+rr;
            }
            k+=4;
            pp+=4;
           t+=u;            
        }
        }
        char asd[]=new char[t.length()];
        int yuu[]=new int[t.length()];
        int yt=0,rt=2;
    
       for(int i=0;i<4;i++)
       {
          yuu[i]=Integer.parseInt(t.substring(yt,rt));
           yt+=2;
           rt+=2;
           if(yuu[i]>=26)
           {
               yuu[i]=yuu[i]%26; 
               yuu[i]+=65;
           }
           else
           yuu[i]+=65; 
           asd[i]=(char)yuu[i];        
       }
       for(int i=0;i<asd.length;i++)
       {
           if(asd[i]!=0)
           {               
              des[i]=Character.toString(asd[i]);
            
           }
       }
  
        return "";
    }
}
