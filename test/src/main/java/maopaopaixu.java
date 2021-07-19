public class maopaopaixu
{
    public static void main(String[] args)
    {
        //冒泡排序从大到小练习
        int[] a=new int[899];
        int i,j,tem;
        for (i=0;i<a.length;i++)
        {
            a[i]=i;
        }
        for(i=0;i<a.length-1;i++)      //可以这么理解，每次进行一次全体交换，都会导致一个小的数到数组的正确位置，要排n个数，所以次数为n-1，因为当n-1个数排好了，剩下的那个数不需要排
        {
            for(j=0,tem=0;j<a.length-1;j++)  //执行次数比数组长度小一次，因为每次交换相邻元素，所以交换n-1次
            {
                if(a[j]<a[j+1])
                {
                    tem=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                }
            }
        }
        System.out.println(a[0]+"\n"+a[85]+"\n"+a[756]);

        //冒泡排序从小到大练习
        for (i=0;i<a.length;i++)
        {
            a[i]=a.length-i-1;
        }
        for(i=0;i<a.length-1;i++)      //可以这么理解，每次进行一次全体交换，都会导致一个小的数到数组的正确位置，要排n个数，所以次数为n-1，因为当n-1个数排好了，剩下的那个数不需要排
        {
            for(j=0,tem=0;j<a.length-1;j++)  //执行次数比数组长度小一次，因为每次交换相邻元素，所以交换n-1次
            {
                if(a[j]>a[j+1])
                {
                    tem=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                }
            }
        }
        System.out.println(a[0]+"\n"+a[85]+"\n"+a[756]);
    }
}

