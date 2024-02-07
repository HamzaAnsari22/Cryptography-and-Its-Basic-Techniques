package dm;
import java.util.*;
import java.*;
public class Ceaser_Shift_Cipher {
    private String M;
    private int aa,s,t;
    public Ceaser_Shift_Cipher(String M,int aa)
    {
        this.M=M;
        this.aa=aa;
    }
     public Ceaser_Shift_Cipher(String M,int aa,int sc,int kk)
    {
        this.M=M;
        this.aa=aa;
        s=kk;
        t=sc;
    }
      public String cc[]=new String[100]; 
        
public String display(){
     char back[]=new char[M.length()];
     char asciii[]=new char[M.length()];
 int k=3;
        if (t==3)
        {
            k=0;
            k=s;   
        }
         if(k>26)
        {
            k=k%26;
        } 
        if(aa==2)
        {
            k=-k;
        }
       
       
       
    
       
        int ascii;
    for(int i=0;i<M.length();i++)
    {
    asciii[i]=M.charAt(i);
    ascii=(int) asciii[i] ;
   if(ascii>=65 && ascii<=90)
    {
     if((ascii+k)>90)
     {
         ascii-=26;
     }
     else if((ascii+k)<65)
     {
         ascii+=26;
     }
    } 
    else if(ascii>=97 && ascii<=122)
    {
     if((ascii+k)>122)
     {
         ascii-=26;
     }
     else if((ascii+k)<97)
     {
         ascii+=26;
     }
    }
    else
    {
        ascii-=k;
    }
    ascii+=k;
    asciii[i]=(char) ascii;
    //    System.out.print(ascii+" ");
    }
   // System.out.println("");
    for(int i=0;i<M.length();i++)
    {
    back[i]=asciii[i];
    back[i]=(char) back[i] ;   
    char a=back[i];
    cc[i]=Character.toString(a);
        //System.out.print(back[i]);
    }
       // System.out.println("\n");
          return "";
    }
      
}