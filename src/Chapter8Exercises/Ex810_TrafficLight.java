package Chapter8Exercises;
// Exercise 8.10 

public enum Ex810_TrafficLight {
    RED(5),
    GREEN(10),
    YELLOW(3);
    
    private final int duration;
    
    Ex810_TrafficLight(int duration) {
        this.duration = duration;
    }
    
    public int getDuration() 
    {
        return duration;
    }
   
}








class TestEnum 
{
    public static void main(String[] args) {
        
        // Get enum values
        for (Ex810_TrafficLight traffic : Ex810_TrafficLight.values()) 
            System.out.printf("%s %s%n", traffic, traffic.getDuration());
    }
    
}