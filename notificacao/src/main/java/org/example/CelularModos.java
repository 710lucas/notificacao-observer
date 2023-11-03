package org.example;

public enum CelularModos {
    
    SILENCIOSO("Silencioso"),
    SOM("Som"),
    VIBRAR("Vibrar");

    private String modoString;

    CelularModos(String modo) {
        this.modoString = modo;
    }

    public String getString(){
        return modoString;
    }
}
