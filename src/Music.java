import model.Duration;

public class Music {
    public static void main(String[] args) {
        try {
            Duration d = new Duration(3, 44);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
