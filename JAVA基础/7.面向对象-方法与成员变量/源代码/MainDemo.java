/*
	public static void main(String[] args) 分析
*/

class MainDemo {
	public static void main(String[] args) {
		//public:表示公共的，可以由外界调用。
		//static:表示静态的，类加载时加载，由类名调用。这里与public一起使用，表示公共的类方法，由外界的jvm调用。
		//void:方法返回空
		//main:方法名称，它是程序执行的入口，默认做为jvm调用时的入口方法。
		//String[] args:参数是字符串数组类型，参数名为args
		
		System.out.println(args);//打印字符串数组的内存地址
		System.out.println(args.length);//打印字符串数组的总个数
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		
		//在命令行窗口中执行以下命令，看程序输出
		//java MainDemo
		
		//在命令行窗口中执行以下命令，看程序输出
		//java MainDemo hello java 宜达互联
		
		
		//由此，可以推出，参数args是用于接受键盘录入信息的。实际上这些都是早期的一些做法，现在都不用了。
		//原因是我们有了Scanner键盘录入对象，替代了早期的这种用法。Scanner是java5.0这个版本引入的。
	}
}