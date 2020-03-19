package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@javafs(123)
public class dfna {
    @SuppressWarnings("all")
    public static   void main(String[] arge) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, ClassNotFoundException {
//        String names = "Huanglinqing";
//
//        Class c1s = names.getClass();
//        System.out.println(c1s);
//        Class nm=dfna.class;
//        System.out.println(nm);
//        String name="java.lang.String";
//        Class c1=null;
//        try{
//            c1=Class.forName("test.fgf");
//            Field fl=c1.getDeclaredField("age");
//            Object object = c1.newInstance();
//            fl.set(object,"嘻嘻嘻");
//            System.out.println(fl.get(object));
//            Method method=c1.getDeclaredMethod("dg",null);
//            Object objects=c1.newInstance();
//            method.invoke(objects,null);
//            Method[] methods = c1.getDeclaredMethods();
//            for (Method method:methods) {
//                System.out.println(method.getName());
//            }

//        }catch (Exception e){
//        }

//        javafs sd=dfna.class.getAnnotation(javafs.class);
//        System.out.println(sd.name());
        Class dc=fgf.class;
        Method field=dc.getDeclaredMethod("setUp",null);
        javafs df=field.getAnnotation(javafs.class);
        System.out.println(df.value()[1]);
        //fgf fgfs=field.getAnnotation(fgf);

    }
}
