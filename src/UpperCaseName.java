import java.util.function.Function;

public class UpperCaseName implements Function<Produto, String> {
    @Override
    public String apply(Produto p) {
        return p.getName() .toUpperCase();
    }
}
