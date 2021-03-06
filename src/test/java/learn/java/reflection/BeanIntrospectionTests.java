package learn.java.reflection;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

import learn.java.entity.Person;

public class BeanIntrospectionTests {

	@Test
	public void testProperties() throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Person fest = new Person();
		PropertyDescriptor[] propDesc = Introspector.getBeanInfo(fest.getClass()).getPropertyDescriptors();
		for(PropertyDescriptor pd : propDesc){
			System.out.println(String.format("%s - %s", pd.getName(), pd.getReadMethod().invoke(fest, new Object[]{})));
		}
		
	}

}
