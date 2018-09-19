import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Field;


public class Inspector {

    private Class inspectedClass;


    public Inspector(Class inspectedClass) {
        this.inspectedClass = inspectedClass;
    }

    public void displayInformation(){
        System.out.println("Information of the 'com.company.Inspector' class:");
        System.out.println("SuperClass: " + inspectedClass.getSuperclass());

        Method[] methods = inspectedClass.getMethods();
        System.out.println(methods.length+ " methods:");
        for (Method method : methods){
            System.out.println("- "+method.getName());

        }
        Field[] fields = inspectedClass.getDeclaredFields();
        System.out.println(fields.length + ": fields");
        for(Field field : fields){
            System.out.println(field.getName());
        }
    }
}
