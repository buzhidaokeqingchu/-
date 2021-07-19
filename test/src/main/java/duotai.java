public class duotai {
    public static void main(String[] args)
    {
        fu a = new fu("父类对象");
        zi b = new zi("子类对象");
        fu c = new zi("父类引用的子类对象，也就是多态");
        a.fufangfa();
        b.zifangfa();
        c.fufangfa();  //c对象无法调用子类独有的方法，且调用同名的父类方法会被子类覆盖

    }

}

class fu
{
    String fu;
    public fu(String fu)
    {
        this.fu=fu;
    }
    public fu()
    {

    }
    void fufangfa()
    {
        System.out.println("父类方法："+fu);
    }
}

class zi extends fu
{
    String zi;
    public zi(String zi)
    {
        this.zi=zi;
    }
    void fufangfa()
    {
        System.out.println("重写父类方法："+zi);
    }
    void zifangfa()
    {
        System.out.println("子类独有的方法："+zi);
    }
}