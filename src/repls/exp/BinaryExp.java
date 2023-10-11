package repls.exp;

import java.math.BigDecimal;

public abstract class BinaryExp implements Exp {
    private final Exp left;
    private final Exp right;

    public BinaryExp(Exp left, Exp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public BigDecimal evaluate() {
        return apply(left.evaluate(), right.evaluate());
    }

    public abstract BigDecimal apply(BigDecimal left, BigDecimal right);
}
