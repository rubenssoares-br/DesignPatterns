package application;

import entities.Editor;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.write("Like and");
        editor.write("Like and Subscribe");
        editor.write("Like and Subscribe to");
        editor.write("Like and Subscribe to the");
        editor.write("Like and Subscribe to the channel");

        System.out.println("\n" + editor + "\n");
        editor.undo();
        System.out.println(editor);
    }
}
