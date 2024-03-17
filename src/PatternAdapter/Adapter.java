package PatternAdapter;

public class Adapter extends Number{
    private final Service line;


    public Adapter(Service line) {

        this.line = line;
    }

    @Override
    public int getName() {
        int res;
        res = (int) line.getBoard();
        return res;
    }
}
