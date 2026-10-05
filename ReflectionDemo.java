import java.lang.reflect.*;

class ReflectionDemo {
    public static void showReflection(Object object) {
        Class<?> clazz = object.getClass();
        System.out.println("RTTI/Reflection class = " + clazz.getName());
        System.out.println("Declared fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("  " + Modifier.toString(field.getModifiers()) + " " + field.getName());
        }
        System.out.println("Declared methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("  " + method.getName());
        }
    }
}
