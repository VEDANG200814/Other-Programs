public class overloading {
    void sumSeries(int n,double x){
        double s = 0.0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
            s-=x/i;
            else
            s+=x/i;
        }
        System.out.println("Sum of series is: "+s);
    }
    void sumSeries(){
        int s=0,j=1,f=1;
        for(int i=1;i<=20;i++){
            for(;j<=20;j++)
            f*=j;
            s+=f;
        }
        System.out.println("Sum of series is: "+s);
    }
}