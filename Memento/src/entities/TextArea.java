package entities;

public class TextArea {
    private String text;

    public void set(String text) {
        this.text = text;
    }

    public Memento takeSnapshot() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento.getSavedText();
    }

    @Override
    public String toString() {
        return "TextArea{" +
                "text='" + text + '\'' +
                '}';
    }

    public static class Memento {
        private final String text;

        private Memento(String textToSave) {
            text = textToSave;
        }

        private String getSavedText() {
            return text;
        }

        @Override
        public String toString() {
            return "Memento{" +
                    "text='" + text + '\'' +
                    '}';
        }
    }

}
