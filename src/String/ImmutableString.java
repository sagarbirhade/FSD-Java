package String;

public final class ImmutableString {

    private final String value;

    public ImmutableString(String value) {
        this.value = value.intern(); // Use intern() for efficiency (optional)
    }

    public String getValue() {
        return new String(value); // Return a copy to avoid modification
    }

    // Disallow modification attempts
    public void setValue(String newValue) {
        throw new UnsupportedOperationException("Immutable object cannot be modified");
    }

    // Disallow modification through concatenation
    public ImmutableString concat(String other) {
        return new ImmutableString(value + other);
    }

    // Other methods like length(), charAt() etc. can be implemented similarly
    // by returning copies of internal data.
}



