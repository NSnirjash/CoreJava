
package sports;

public class Football extends Sports{
    private String massage;

    public Football() {
    }

    public Football(String massage) {
        this.massage = massage;
    }

    @Override
    public String Play() {
        
        return "Football is a popular game ai all over the world";
        
//        return super.Play(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
}
