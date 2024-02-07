
package dm;
import java.util.*;
public class GCD {
    private int x,y;
    public GCD(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public String gcc[]=new String[50];
   int t=0,r=0;
      public int getr()
        {
         return r;   
        }
    public String cal()
    {
    int i=0,a=x,b=y;
    while(y!=0)
    {    
        t=x%y;
        if(t==0)
        {
        gcc[i]=x+"="+x/y+"("+y+")+"+t;
        i++;
        break;
        }
        if(y<x)
        gcc[i]=x+"="+x/y+"("+y+")+"+t;
        r=t;
        i++;
        x=y;
        y=t;  
    }   
    gcc[i]="\nGCD Is : "+r;
     
    if(r==1)
    {
        i++;
        gcc[i]="Number "+a+" and "+b+" is Relatively Prime";
    }
    return "";
    }
}
