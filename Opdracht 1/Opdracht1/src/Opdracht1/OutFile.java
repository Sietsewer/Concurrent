/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Opdracht1;

/**
 *
 * @author Sietse
 */
public class OutFile{
    private char[][] lines;
    private int lineCount;
    private int lineLength;
    private int cursorLine = 0;
    private int cursorChar = 0;
    private boolean hasSpace = false;// Is false when file is full, or null.
    //note: null =/= empty. Null = constructor not called. Gives nullref ex.
    
    public OutFile(int lines, int length){
        this.lines = new char[lines][length];
        this.lineCount = lines;
        this.lineLength = length;
        hasSpace = true;
    }
    
    public boolean hasSpace(){
        return hasSpace;
    }
    
    public OutFile(OutFile file){
        this.lines = file.lines.clone();// Dereference the pointers
        this.lineCount = file.lineCount;
        this.lineLength = file.lineLength;
        this.cursorLine = file.cursorLine;
        this.cursorChar = file.cursorChar;
        this.hasSpace = file.hasSpace;
    }
    
    public String addText(char[] line){
        String overFlow = new String();// Constructs String object.
        for(char c : line){// Iterates trough the char[] that will be added.
            if(hasSpace){// Checks if the record has space for more files.
                this.lines[cursorLine][cursorChar] = c;// sets character at cursor position.
                cursorChar++;// Moves cursor to next character.
                if(cursorChar >= lineLength){// Checks if the cursor > index.
                    cursorChar = 0;// resets the cursor to the first char.
                    cursorLine++;// moves the cursor to the next line.
                    hasSpace = !(cursorLine >= lineCount);
                }
                
            } else {// Branches here if the record is full.
                overFlow = overFlow + c;// Adds char c to overflow.
            }
        }
        return overFlow;// Returns "" if there was no overflow.
    }
    
    public void printRecord(){
        for(char[] x : this.lines){// Loops trough char[][], and prints each char. Also has some newlines.
            for(char y : x){
                System.out.print(y == 0 ? '-' : y);
            }
            System.out.println();
        }
    }
    
    public String printRecordString(){
        String s = "";
        for(char[] x : this.lines){// Loops trough file and appends string. Also adds some styling characters.
            for(char y : x){
                s = s + (y == 0 ? '-' : y);
            }
            s = s + System.getProperty("line.separator");// Appends a line seperator for style.
        }
        return s;
    }
    
    public char[][] getGrid(){
        return lines;
    }
}
