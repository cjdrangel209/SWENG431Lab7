
package part2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *
 * @author Cory Drangel
 */
public class NewClass {
    int w, h, d;
    
    public static void main(String[] args) throws ClassNotFoundException{
        Class c = Class.forName("part2.NewClass");
        System.out.println(c.getPackageName());
        System.out.println(c.getSimpleName());
        System.out.println(Modifier.toString(c.getModifiers()));
        
        Method[] ma = c.getDeclaredMethods();
        for(Method m: ma){
            Class[] ca = m.getParameterTypes();
            for(Class cls: ca){
                System.out.println(cls.getName());
            }
        }
    }
    
    public void m1(int i, int j, int k){
        
    }
    
    public int m2(int i){
        return 0;
    }
    
    protected Integer m3(double d){
        return null;
    }
    
}
