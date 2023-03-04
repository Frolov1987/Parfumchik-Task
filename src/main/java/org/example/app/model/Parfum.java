package org.example.app.model;

public class Parfum {
    private final String name;
    private final String sex;
    private final String type;
    private final String subtype;

    public Parfum(String name, String sex, String type, String subtype) {
        this.name = name;
        this.sex = sex;
        this.type = type;
        this.subtype = subtype;

    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getType() {
        return type;
    }

    public String getSubtype() {
        return subtype;
    }

}
