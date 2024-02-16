package phanso;
import java.util.Scanner;

public class phanso{
    private
        int tu;
        int mau;
    public phanso()
    {
        this.tu=0;
        this.mau=1;
    }
    public phanso(int tu,int mau)
    {
        this.tu=tu;
        this.mau=mau;
    }
    public int get_tu()
    {
        return this.tu;
    }
    public int get_mau()
    {
        return this.mau;
    }
    public phanso nhap()
    {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            try{
                this.tu=sc.nextInt();
                this.mau=sc.nextInt();
                if(this.tu!=0&&this.mau!=0) break;
            }
            catch(java.util.InputMismatchException e)
            {
                System.out.println("nhap lai");
            }
        }
        sc.close();
        return this;
    }

    public void display()
    {
        System.out.println(this.tu+"/"+this.mau);
    }

    public int ucln()
    {
        int res=1;
        for(int i=1;i<=this.tu;i++) if(this.tu%i==0&&this.mau%i==0) res=i;
        return res;
    }

    public phanso rutgon()
    {
        int ucln=this.ucln();
        this.tu/=ucln;
        this.mau/=ucln;
        return this;
    }

};
