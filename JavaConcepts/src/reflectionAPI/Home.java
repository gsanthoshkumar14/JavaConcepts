package reflectionAPI;

import java.lang.reflect.Method;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		Class clazz = t.getClass();
		System.out.println(clazz.getName());
		Method[] arrOfMethod = clazz.getDeclaredMethods();
		
		for(Method m : arrOfMethod) {
			System.out.println(m.getName() + " " + m.getReturnType());
		}
	}

}
