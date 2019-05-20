package com.app.pucmaps;

public class RequestClass {

    public RequestClass() {
    }

    public RequestClass(String latAtual, String longAtual) {
        this.latAtual = latAtual;
        this.longAtual = longAtual;
    }
    String latAtual;
    String longAtual;

    public String getlongAtual() {
        return longAtual;
    }

    public void setlongAtual(String longAtual) {
        this.longAtual = longAtual;
    }

    public String getlatAtual() {
        return latAtual;
    }

    public void setlatAtual(String latAtual) {
        this.latAtual = latAtual;
    }
}
