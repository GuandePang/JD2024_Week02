package Practice01;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object object) throws IllegalAccessException{
        Field[] fields = object.getClass().getFields();
        for(Field field: fields){
            if(field.isAnnotationPresent(NotNull.class)){
                field.setAccessible(true);
                Object value = field.get(object);
                if(value == null || ((String)value).isEmpty()){
                    NotNull annotation = field.getAnnotation(NotNull.class);
                    throw new IllegalAccessException(annotation.message());
                }
            }

            if(field.isAnnotationPresent(MaxLength.class)){
                field.setAccessible(true);
                Object value = field.get(object);
                MaxLength annotation = field.getAnnotation(MaxLength.class);
                if(value != null && ((String)value).length() > annotation.maxLength()){
                    throw new IllegalAccessException(annotation.message());
                }
            }

            if(field.isAnnotationPresent(Password.class)){
                field.setAccessible(true);
                Object value = field.get(object);
                Password annotation = field.getAnnotation(Password.class);
                String passwordPattern = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&*]).{1,}$";
                if(value != null && !((String)value).matches(passwordPattern)){
                    throw new IllegalAccessException(annotation.message());
                }
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException{
        Practice01 practice01 = new Practice01("Guande Pang", "Guande2001!@#");
        validate(practice01);
    }
}
