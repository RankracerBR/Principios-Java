package methods;

abstract class GFChelp{
    abstract void check(String n);   
}

public class GFC extends GFChelp{
    public static void main(String[] args){
        GFC ob = new GFC();

        ob.check("GFC");
    }

    @Override void check(String n)
    {
        System.out.println(n);
    }
}