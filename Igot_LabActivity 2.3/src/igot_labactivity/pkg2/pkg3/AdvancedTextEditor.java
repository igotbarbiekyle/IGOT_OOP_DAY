
package igot_labactivity.pkg2.pkg3;

public class AdvancedTextEditor extends TextEditor {
    public AdvancedTextEditor(String text) {
        super(text);
    }
    
    public void undo() {
        previous--;
           setText(wordBefore[previous]);
        }
    }
