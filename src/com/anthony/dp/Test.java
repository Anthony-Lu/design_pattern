package com.anthony.dp;

public class Test {

	public static void main(String[] args) {
		/*
		long start = System.currentTimeMillis();
		System.out.println(start);
		Vector<Object> students = new Vector<>();
		Teacher teacher = new Teacher();
		for(int i = 0;i<10;i++){
			Student student = new Student("Andy chen" + i,teacher);
			students.add(student);
			teacher.attach(student);
		}
		
		System.out.println("Welcome to Andy.Chen Blog!" +"\n"   
                +"Observer Patterns." +"\n"  
                +"-------------------------------");  
		
		teacher.setPhone("12345678");
		for(int i = 0;i<3;i++){
			((Student)students.get(i)).show();
		}
		
		teacher.setPhone("87654321");
		for(int i = 0;i<3;i++){
			
			((Student)students.get(i)).show();
			
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end);
		
		System.out.println(start - end );*/
		
			/*Tank2 tank2 = new Tank2(new Tank());
			tank2.move();*/
		/*int myAtoi = myAtoi("123456");
		System.out.println(myAtoi);*/
		
		
		//((TEST)null).foo();
		int x = 5, y = 10; // 定义两个变量
		x = x ^ y;
		y = x ^ y; // y=(x^y)^y
		x = x ^ y; // x=(x^y)^x
		//System.out.println("x=" + x + "y=" + y);
		buddleSort(new int[]{1,4,5,12,0});
	          

	}
	
	public static void foo() {
		System.out.println("foo");
		
	}
	static{
		System.out.println("static");
	}
	public static int myAtoi(String str) {
        int index=0;
        int sign=1;
        int digit=0;
        int total=0;
        char ch;
        //分为四步 第一步为判断字符串是否为空 
        if(str.length()==0){
        return 0;
    }
    //第二步   判断字符串中是否含有空格，如果有就跳过
    while(str.charAt(index)==' ' && index<str.length())
    {
        index ++;
    }
    //第三步 判断字符串为正还是负
    if(str.charAt(index)=='+'||str.charAt(index)=='-'){
        if(str.charAt(index)=='+')
         sign=1;
         else{
             sign=-1;
         }
         index++;
    }
    //第四步 进行处理
    while(index<str.length())
    {
        ch=str.charAt(index);
        if(ch<'0'||ch>'9')
        break;
         digit=ch-'0';
        if(Integer.MAX_VALUE/10<total || Integer.MAX_VALUE/10==total&&Integer.MAX_VALUE%10<digit)
        return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
       
        total=total*10+digit;
        index++;
    
    }
        return sign*total;
}
	
	
	public static void buddleSort(int[] a){
		for(int i = 0;i<a.length - 1;i++){
			for(int j = 0;j<a.length - 1 - i;j++) {
				if(a[j] > a[j+1]) {
					a[j] = a[j] ^ a[j+1];
					
					a[j+1] = a[j] ^ a[j + 1];
					
					a[j] = a[j] ^ a[j+1];
					
					int x = 0,y = 0;
					x = x+y;
					y = x-y;
					x = x-y;
				}
			}
			
			//System.out.println(a[i]);
		}
		
		for(int i = 0;i < a.length;i++) {
			System.out.println(a[i]);
		}
		//System.out.println();
		//int a 
	}
}
