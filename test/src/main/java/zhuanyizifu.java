//转义字符练习

public class zhuanyizifu {
    String a,b;
    public zhuanyizifu(String a,String b) {      //构造方法
        this.a=a;
        this.b=b;
    }
    private void huanhang()
    {
        System.out.println("换行字符演示："+a+"\n"+b);//换行字符为\n
    }
    private void duiqi()
    {
        System.out.println("对齐字符演示："+a+"\t"+b);//制表位，实现对齐功能\t
    }
    public static void main(String[] args)
    {
        zhuanyizifu main = new zhuanyizifu("我是刘非","刘非是一个人");
        main.huanhang();
        main.duiqi();
    }
}