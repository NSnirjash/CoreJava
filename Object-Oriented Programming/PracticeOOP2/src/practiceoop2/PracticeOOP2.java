
package practiceoop2;

import sports.Cricket;
import sports.Football;
import sports.Rugby;

public class PracticeOOP2 {

    public static void main(String[] args) {
        Football f = new Football();
        System.out.println(f.Play());
        
        Cricket c= new Cricket();
        System.out.println(c.Play());
        
        Rugby r = new Rugby();
        System.out.println(r.Play());
        
    }
    
}
