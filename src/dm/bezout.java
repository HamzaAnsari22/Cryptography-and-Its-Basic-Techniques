/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dm;

/**
 *
 * @author Microsoft
 */
public class bezout {
      int x,y,ss,tt;
        public bezout(int a,int b)
        {
            x=a;
            y=b;
            tt=a;
            ss=b;
        }
      
        
        int i=0;
        int s=0,s1=1,t=1,t1=0;
         public String bz[]=new String[50];
        public String Display(){
        while(x!=0)
        {
            int temp,q=y/x;
            temp=y;
            y=x;
            x=temp-(q*x);
            temp=s1;
            s1=s;
            s=temp-(q*s);
            temp=t1;
            t1=t;
            t=temp-(q*t);           
        }
        
        if(tt<ss)
        {
            if(s1<0)
            bz[i]=" "+y+"= "+t1+"("+tt+")"+s1+"("+ss+")";
            else
            bz[i]=" "+y+"= "+t1+"("+tt+")+"+s1+"("+ss+")";  
        }
        else{
            
             if(s1<0)
            bz[i]=" "+y+"= "+t1+"("+tt+")"+s1+"("+ss+")";
            else
            bz[i]=" "+y+"= "+t1+"("+tt+")+"+s1+"("+ss+")";  }
        i++;
        bz[i]=t1+" and "+s1+" are Bezout Coefficients \nfor Given Numbers";
        return "";
        }
}
