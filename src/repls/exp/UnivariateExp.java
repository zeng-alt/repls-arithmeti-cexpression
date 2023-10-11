package repls.exp;

import java.math.BigDecimal;

public abstract class UnivariateExp implements Exp {

    private final Exp exp;

    public UnivariateExp(Exp exp) {
        this.exp = exp;
    }

    @Override
    public BigDecimal evaluate() {
        return apply(exp.evaluate());
    }

    public abstract BigDecimal apply(BigDecimal exp);
}
