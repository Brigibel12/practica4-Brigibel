package org.example;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);
        app.get("/", ctx -> {
            ctx.html("<h1>Practica #4 de Brigibel: Aplicacion 1</h1>");
        });
    }
}