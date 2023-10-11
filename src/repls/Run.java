package repls;

import repls.parse.ParserExp;


public class Run {

    private String exp;
    private final ParserExp parserExp;

    public Run(String exp) {
        this.exp = exp;
        this.parserExp = new ParserExp();
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String show() {
        return parserExp.parse(exp).show();
    }

    public String evaluate() {
        return parserExp.parse(exp).evaluate().toString();
    }

    public static void main(String[] args) {
        new Run("1+2").show();
    }
}
