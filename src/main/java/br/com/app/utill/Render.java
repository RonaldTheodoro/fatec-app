package br.com.app.utill;

public class Render {

    public static String jspPath(Object clazz, String jsp) {
        String className = getClassName(clazz);
        return String.format("WEB-INF/jsp/%s/%s", className, jsp);
    }
    
    private static String getClassName(Object clazz) {
        return clazz.getClass().getSimpleName().toLowerCase();
    }

}
