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
    return (isMcNugget(value -20) || isMcNugget(value - 9) || isMcNugget(value - 6));
    }
}

/* Can be written as follows:
    return value >= 0
        && (
            value == 0
            || isMcNugget(value - 20)
            || isMcNugget(value - 9)
            || isMcNugget(value - 6)
        );
  }

 */