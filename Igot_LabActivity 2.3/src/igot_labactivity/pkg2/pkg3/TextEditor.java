
package igot_labactivity.pkg2.pkg3;

public class TextEditor {
    private String text;
    
    public String wordBefore[] = new String[50];
    public int previous = 0;

    public TextEditor (String initialText) {
        wordBefore[previous] = text;
        previous++;
        this.text = initialText;
    }
    
    public String getText() {
        return this.text;
    }
    
    public void setText(String newText) {
        this.text = newText;
    }
    
    public void append(String newText) {
        wordBefore[previous] = text;
        previous++;
        this.text += newText;
    }
    
    public void delete(int n) {
        wordBefore[previous] = text;
        previous++;
        
        if (n >= this.text.length()) {
        } else {
            this.text = this.text.substring(0, this.text.length() - n);
        }
    }
}

