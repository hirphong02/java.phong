package com.thuchanh3;

public enum Gender {

    MALE ("m", "main"), FEMALE ("f", "female");
    private String code;
    private String text;

    private Gender(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public Gender getGenderByCode() {
        for (Gender gender : Gender.values() ) {
            if (gender.code.equals(this.code)){
                return gender;
            }
        }
        return null;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
