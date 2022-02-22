package com.company.lecture23;

public class flow1 extends Exception
{
    String msg;
    flow1(String s)
    {
        msg=s;
    }

    public String toString()
    {
        return msg;
    }
}
class stackit
{
    int st[];
    int top;

    stackit(int x)
    {
        st=new int[x];
        top=-1;
    }

    public void push(int p)
    {
        try
        {
            if(top==st.length-1)
                throw new flow1("Stack is Full!!");
            else
                st[++top]=p;
        }
        catch(flow1 f)
        {
            System.out.println(f);
        }
    }

    public int pop()
    {
        try
        {
            if(top==-1)
            {
                throw new flow1("Stack is underflow!!");
            }
            else
                return st[top--];
        }
        catch(flow1 f)
        {
            System.out.println(f);
        }
        return -1;     // This is necessary as return type of the function is int

    }

}


class stackdemo {

    public static void main(String[] args) {
        stackit o1=new stackit(10);
        stackit o2=new stackit(5);

        for(int i=0;i<10;i++)
            o1.push(i);
        for(int i=0;i<5;i++)
            o2.push(i);

        System.out.println("1ST STACK:");
        for(int i=0;i<10;i++)
            System.out.print(o1.pop()+" ");
        System.out.println();


        System.out.println("2ND STACK:");
        for(int i=0;i<8;i++)     //condition is running till 7th index
            System.out.print(o2.pop()+" ");  // Stck goes underflow when we try to pop at index 5 and hence Exception
        //System.out.println();

    }

}
