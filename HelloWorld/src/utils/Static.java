package utils;

public class Static {
	static int staticProperty = 0;
	int instanceProperty = 1;
	int getInstanceProperty () {
		return this.instanceProperty;
	}
	int getStaticProperty () {
		return staticProperty;
	}
	public static void  main(String args[]) {
		// static 方法不能使用this关键字
		// static 方法只能通过实例方法或者类名调用
		System.out.println(Static.staticProperty);
		Static staticInstance = new Static();
		System.out.println(staticInstance.getStaticProperty());
		System.out.println(staticInstance.instanceProperty);
	}

}
