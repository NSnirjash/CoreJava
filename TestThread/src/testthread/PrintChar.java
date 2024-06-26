
package testthread;

public class PrintChar implements Runnable{
    
    private char charToPrint;
    private int times;

    public PrintChar(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }
    
    

    @Override
    public void run() {
        for(int i = 0; i< times; i++){
              System.out.print(charToPrint);
        }
    }
    
}

class PrintNumber implements Runnable{
    private int lastNum;

    public PrintNumber(int lastNum) {
        this.lastNum = lastNum;
    }
    
    @Override
    public void run(){
        for (int i=1; i<=lastNum;i++){
            System.out.print(" " + i);
        }
    }
}
