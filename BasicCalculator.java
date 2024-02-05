class calculator
 {
    float a;
    float b;
    public void add(float a,float b)
    {
        float c=a+b;
        System.out.println("the sum of the float value is:"+c);
    }
    public void sub(float a,float b)
    {
        float c=a-b;
        System.out.println("the sub of the float value is:"+c);
    }
    public void multi(float a,float b)
    {
        float c=a*b;
        System.out.println("the multi of the float value is:"+c);
    }
    public void div(float a,float b)
    {
        float c=a/b;
        System.out.println("the div of the float value is:"+c);
    }
    public static void main(String args[])
    {
        calculator c=new calculator();
        c.add(10,20);
        c.sub(10,5);
        c.multi(5,4);
        c.div(10,5);
    }
}