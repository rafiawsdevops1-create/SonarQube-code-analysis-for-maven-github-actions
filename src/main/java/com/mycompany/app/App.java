package com.mycompany.app;

public class App {
    public String greet() {
        return "Hello SonarCloud!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.greet());
    }
}
