package learn.java.reflection;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

import learn.java.entity.Festival;

public class BeanIntrospectionTests {

	@Test
	public void testProperties() throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Festival fest = new Festival("Tech Week", 100);
		PropertyDescriptor[] propDesc = Introspector.getBeanInfo(fest.getClass()).getPropertyDescriptors();
		for(PropertyDescriptor pd : propDesc){
			System.out.println(String.format("%s - %s", pd.getName(), pd.getReadMethod().invoke(fest, new Object[]{})));
		}
		
	}

}
