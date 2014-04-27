package ru.hse.se.g272.ervo.ooaip.crosszeros;

/**
 * Section of crosses-zeros game.
 *
 * @author Ervo Victor
 * @since 18.03.14
 */
public class Section {

    /**
     * Value placed in section.
     */
    private SectionValue value = SectionValue.EMPTY;

    /**
     * Left bound of section.
     */
    private int leftBound;

    /**
     * Right bound of section.
     */
    private int rightBound;

    /**
     * Top bound of section.
     */
    private int topBound;

    /**
     * Bottom bound of section.
     */
    private int bottomBound;

    /**
     * Value placed in section.
     * @return Value placed in section.
     */
    public final SectionValue getValue() {
        return value;
    }

    /**
     * Sets Value placed in section.
     * @param sectionValue New Value
     */
    public final void setValue(final SectionValue sectionValue) {
        this.value = sectionValue;
    }

    /**
     * Left bound of section.
     * @return Left bound of section.
     */
    public final int getLeftBound() {
        return leftBound;
    }

    /**
     * Sets Left bound of section.
     * @param bound Left bound of section.
     */
    public final void setLeftBound(final int bound) {
        this.leftBound = bound;
    }

    /**
     * Right bound of section.
     * @return Right bound of section.
     */
    public final int getRightBound() {
        return rightBound;
    }

    /**
     * Sets right bound of section.
     * @param bound right bound of section.
     */
    public final void setRightBound(final int bound) {
        this.rightBound = bound;
    }

    /**
     * Top bound of section.
     * @return top bound of section.
     */
    public final int getTopBound() {
        return topBound;
    }

    /**
     * Sets top bound of section.
     * @param bound top bound of section.
     */
    public final void setTopBound(final int bound) {
        this.topBound = bound;
    }

    /**
     * Bottom bound of section.
     * @return bottom bound of section.
     */
    public final int getBottomBound() {
        return bottomBound;
    }

    /**
     * Sets bottom bound of section.
     * @param bound bottom bound of section.
     */
    public final void setBottomBound(final int bound) {
        this.bottomBound = bound;
    }
}
