package GenerationAndIO;

import java.lang.reflect.Field;
import java.util.ArrayList;

public interface Inputtable {

    default ArrayList<Field> getAllInheritedFields(Class<?> classType) {

        ArrayList<Field> fields = new ArrayList<Field>();

        Class<?> currentClass = classType;

        while (currentClass != null && currentClass != Object.class) {

            for (int i = currentClass.getDeclaredFields().length - 1; i >= 0; i--) {
                fields.add(0, currentClass.getDeclaredFields()[i]);
            }
            currentClass = currentClass.getSuperclass();
        }

        return fields;
    }

    default boolean setField(int index, String s) {

        ArrayList<Field> fields = getAllInheritedFields(this.getClass());

        if (index >= fields.size())
            return false;

        //System.out.println(fields.get(index).getName() + " " + fields.get(index).getType());

        fields.get(index).setAccessible(true);

        Class<?> type = fields.get(index).getType();

        try {
            if (type == int.class) {
                fields.get(index).set(this, Integer.parseInt(s));
            } else if (type == double.class) {
                fields.get(index).set(this, Double.parseDouble(s));
            } else if (type == long.class) {
                fields.get(index).set(this, Long.parseLong(s));
            } else if (type == boolean.class) {
                fields.get(index).set(this, Boolean.parseBoolean(s));
            } else if (type.equals(String.class)) {
                fields.get(index).set(this, s);
            } else {
                fields.get(index).set(this, null);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
