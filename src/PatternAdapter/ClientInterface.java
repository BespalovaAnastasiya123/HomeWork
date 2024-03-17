package PatternAdapter;

public class ClientInterface {
    private final int fild;

    public ClientInterface(int fild) {
        this.fild = fild;
    }

    public boolean fits(Number number){
        boolean result = false;
        if(fild > number.getName()){
            result = true;
        }
        return result;
    }
}