/*
	注释：用于解释说明程序的文字
	
	Java中注释的分类及格式
		单行注释：//
		多行注释：/星 星/
			注意：多行不可以嵌套使用，而单行是可以的
		文档注释：被javadoc工具解析生成一个说明书，面向对象部分讲解。
*/

//这是我的注释案例
class ZhuShiDemo {
	//main方法是主方法
	//是程序的入口
	//被jvm调用 //111 // 222 //333
	// main方法是主方法,是程序的入口,被jvm调用
	public static void main(String[] args) {
		//这是一个打印语句，打印了一些内容
		System.out.println("好好学习,天天向上");
		//System.out.println("good good study,day day up!");
		
		/*
			这是一组打印信息
			使用了多行注释进行解释当前这一组代码的功能
		*/
		/*
		System.out.println("好好学习,天天向上1");
		System.out.println("好好学习,天天向上2");
		System.out.println("好好学习,天天向上3");
		System.out.println("好好学习,天天向上4");
		System.out.println("好好学习,天天向上5");
		System.out.println("好好学习,天天向上6");
		System.out.println("好好学习,天天向上7");
		*/
	}
}