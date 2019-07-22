package singlesun;

public class Sun {
    
    private double temperature;
    private double size;
    private static Sun sun;
    
    private Sun(){
        
    }
    
    public static Sun getInstance(){
        if(sun == null){
            sun = new Sun();
        }
        return sun;
    }
    
}
