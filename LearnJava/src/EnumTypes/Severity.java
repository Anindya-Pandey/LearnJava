package EnumTypes;

public enum Severity {
    LOW(0), MEDIUM(1), HIGH(2), URGENT(3);

    int severityValue;

    private Severity(int severityValue) {
        this.severityValue = severityValue;
    }

    public int getSeverityValue() {
        return this.severityValue;
    }
}
