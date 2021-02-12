package se.lexicon.g34.bl.model;

public class Name {
    private String names;

    public Name() {
    }

    public Name(String names) {
        this.names = names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return names;
    }
}
