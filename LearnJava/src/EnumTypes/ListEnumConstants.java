package EnumTypes;

public class ListEnumConstants {
    public static void main(String[] args) {
        for (Gender g : Gender.values()) {
            String name = g.name();
            int ordinal = g.ordinal();
            System.out.println(name + ordinal);
        }

        for (Severity s : Severity.values()) {
            String name = s.name();
            int ordinal = s.ordinal();
            System.out.println(name + ordinal);
        }

        for (ConstantZero cz : ConstantZero.values()) {
            String name = cz.name();
            int ordinal = cz.ordinal();
            String field1 = cz.getField1();
            int field2 = cz.getField2();
            cz.setField3();
            String field3 = cz.toString();
            System.out.println(name + ordinal + field1 + field2 + field3);
        }
    }
}
