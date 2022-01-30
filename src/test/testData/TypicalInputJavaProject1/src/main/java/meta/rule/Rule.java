package meta.rule;

import java.util.Objects;

public class Rule {
    private String description;
    private boolean checkable;

    public Rule(String description, boolean checkable) {
        this.description = description;
        this.checkable = checkable;
    }

    public Rule() {
        this("", true);
    }

    public Rule(String description) {
        this(description, true);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCheckable() {
        return checkable;
    }

    public void setCheckable(boolean checkable) {
        this.checkable = checkable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rule rule = (Rule) o;
        return checkable == rule.checkable && Objects.equals(description, rule.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, checkable);
    }

    @Override
    public String toString() {
        return "Rule{" +
                "description='" + description + '\'' +
                ", checkable=" + checkable +
                '}';
    }
}
