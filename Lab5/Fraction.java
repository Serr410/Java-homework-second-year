package Lab5;

public class Fraction implements Fractionable{
    private int top;
    private int bot;
    private Double cachedDecimalValue;
    private boolean isCacheValid;


    public Fraction(int top, int bot) {
        setTopAndBot(top, bot);
    }
    private void setTopAndBot(int top, int bot) {
        if (bot == 0) {
            throw new IllegalArgumentException("Cant divide using zero");
        }
        if (bot < 0) {
            top = (-1) * top;
            bot = -bot;
        }
        this.top = top;
        this.bot = bot;
        invalidateCache();
    }
    private void invalidateCache() {
        isCacheValid = false;
        cachedDecimalValue = null;
    }

    @Override
    public double getDecimalValue() {
        if (!isCacheValid || cachedDecimalValue == null) {
            cachedDecimalValue = (double) this.top / this.bot;
            isCacheValid = true;
        }
        return cachedDecimalValue;
    }

    @Override
    public void setNumerator(int top) {
        setTopAndBot(top, this.bot);
    }

    @Override
    public void setDenominator(int bot) {
        setTopAndBot(this.top, bot);
    }
    @Override
    public String toString() {
        return this.top + "/" + this.bot;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Fraction otherFraction = (Fraction) obj;
        return this.top == otherFraction.top &&
                this.bot == otherFraction.bot;
    }
}
