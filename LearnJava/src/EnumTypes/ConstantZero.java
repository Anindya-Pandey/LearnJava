package EnumTypes;

public enum ConstantZero {
    ONE("field1Value1", 10) {
        public void setField3() {
            this.field3 = "ConstantZeroOne";
        }
    },
    TWO("field1Value2", 20) {
        public void setField3() {
            this.field3 = "ConstantZeroTwo";
        }
    },
    THREE("field1Value3", 30) {
        public void setField3() {
            this.field3 = "ConstantZeroThree";
        }
    };

    String field1;
    int field2;
    String field3;

    private ConstantZero (String field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public int getField2() {
        return field2;
    }

    public abstract void setField3();

    @Override
    public String toString() {
        return this.field3;
    }
}
