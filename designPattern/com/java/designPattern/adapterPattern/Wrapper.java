package com.java.designPattern.adapterPattern;

/**
 * 对象的适配器模式
 * 将Adapter.class换成这个
 * 不继承Source类，而是持有对象的实例，已达到解决兼容性的问题。
 *
 *
 */
public class Wrapper implements Targetable{
	private Source source;
	public Wrapper(Source source){
		super();//调用source的构造方法。为啥要调用它的构造？
		this.source=source;
	}
	@Override
	public void method1() {
		System.out.println("This is the targetable method");
		
	}

	@Override
	public void method2() {
		source.method1();
	}
}


/*接口的适配器模式。懒得实现接口的所有方法时候用的，先拿个抽象类把接口的所有方法写进去，
然后继承抽象类实现想用的方法*/

/*public interface Sourceable {  

    public void method1();  
    public void method2();  
}  


public abstract class Wrapper2 implements Sourceable{  

    public void method1(){}  
    public void method2(){}  
}  
public class SourceSub1 extends Wrapper2 {  
    public void method1(){  
        System.out.println("the sourceable interface's first Sub1!");  
    }  
}  
public class SourceSub2 extends Wrapper2 {  
    public void method2(){  
        System.out.println("the sourceable interface's second Sub2!");  
    }  
}  
public class WrapperTest {  

    public static void main(String[] args) {  
        Sourceable source1 = new SourceSub1();  
        Sourceable source2 = new SourceSub2();  

        source1.method1();  
        source1.method2();  
        source2.method1();  
        source2.method2();  
    }  
}  
*/