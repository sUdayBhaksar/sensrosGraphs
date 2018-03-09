
package flamingsoft.com.sensorsgraph.chart;

/**
 * The chart point style enumerator.
 */
public enum PointStyle {
  X("x"), CIRCLE("circle"), TRIANGLE("triangle"), SQUARE("square"), DIAMOND("diamond"), POINT(
      "point");

  /** The point shape name. */
  private String mName;

  /**
   * The point style enum constructor.
   * 
   * @param name the name
   */
  private PointStyle(String name) {
    mName = name;
  }

  /**
   * Returns the point shape name.
   * 
   * @return the point shape name
   */
  public String getName() {
    return mName;
  }

  /**
   * Returns the point shape name.
   * 
   * @return the point shape name
   */
  public String toString() {
    return getName();
  }

  /**
   * Return the point shape that has the provided symbol.
   * 
   * @param name the point style name
   * @return the point shape
   */
  public static PointStyle getPointStyleForName(String name) {
    PointStyle pointStyle = null;
    PointStyle[] styles = values();
    int length = styles.length;
    for (int i = 0; i < length && pointStyle == null; i++) {
      if (styles[i].mName.equals(name)) {
        pointStyle = styles[i];
      }
    }
    return pointStyle;
  }

  /**
   * Returns the point shape index based on the given name.
   * 
   * @return the point shape index
   */
  public static int getIndexForName(String name) {
    int index = -1;
    PointStyle[] styles = values();
    int length = styles.length;
    for (int i = 0; i < length && index < 0; i++) {
      if (styles[i].mName.equals(name)) {
        index = i;
      }
    }
    return Math.max(0, index);
  }

}
