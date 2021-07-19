class animal
{
    String animal;
    public animal(String animal)
    {
        this.animal=animal;
        System.out.println(animal);
    }
    public animal() {                   //子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表。
        //如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器。
    }
    public void yanjing()
    {
        System.out.println("眼睛");
    }
    public void naodai()
    {
        System.out.println(animal+"脑袋");
    }
    public void zuiba()
    {
        System.out.println("嘴巴");
    }
}

class cat extends animal
{
    public void weiba()
    {
        System.out.println("尾巴");
    }
    public void yanjing()
    {
        System.out.println("猫眼睛");
    }
    public void yanjingTest()
    {
        this.yanjing();     //调用自己类的方法
        super.yanjing();   //调用父类的方法
    }
}

class dog extends animal
{
    public dog(String name)   //super用的参数为本身构造函数的参数，然后调用父类相同类型形参的构造函数
    {
        super(name);
    }
    public void erduo()
    {
        System.out.println("耳朵");
    }

}

public class jicheng
{
    public static void main(String[] args)
    {
        animal a = new animal("动物");
        cat b = new cat();
        dog c = new dog("狗");
        a.naodai();
        b.yanjing();
        b.yanjingTest();
        c.erduo();
    }
}
