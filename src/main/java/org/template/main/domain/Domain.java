package org.template.main.domain;

public class Domain {
    private String text;

    public Domain(String text) throws Exception {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
