package edu.cnm.deepdive;

public class Frobenius {

  /* Pack sizes are 6, 9, 20. */
  public static boolean isMcNugget(int value) {
//    TODO Return true if value can be expressed as the sum of intergral multiples
//     (including multiplication by zero) of the 3 original McNugget pack sized; return false otherwise.
    if (value < 0) {
      return false;
    }
    if (value == 0) {
      return true;
    }
    return (isMcNugget(value - 20) || isMcNugget(value - 9) || isMcNugget(value - 6));
  }

  /**
   * Determines if {@code value} can be expressed as the sum of non-negative integral multiples of
   * the elements of {@code packSizes}. (If we invoke {@code isGeneralMcNugget(value, new int[]{20,
   * 9, 6})}, the result returned should be identical to that returned by {@link #isMcNugget(int)
   * isMcNugget(value)}.
   *
   * @param value     target/goal number.
   * @param packSizes array of distinct pack sizes, in descending order.
   * @return true if value is a McNugget number using the specific pack sizes, false otherwise.
   */
  public static boolean isGeneralMcNugget(int value, int[] packSizes) {
    return value >= 0 && (value == 0 || isGeneralMcNugget(value - packSizes[0], packSizes)
    );
  }
}


/* Above solution can be written as follows:
    return value >= 0
        && (
            value == 0
            || isMcNugget(value - 20)
            || isMcNugget(value - 9)
            || isMcNugget(value - 6)
        );
  }

 */