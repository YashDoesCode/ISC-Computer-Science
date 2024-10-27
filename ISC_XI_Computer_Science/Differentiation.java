package ISC_XI_Computer_Science;

import java.util.Scanner;
import java.util.function.DoubleFunction;
public class Differentiation{ private static final double DX = 0.0001;

  /**
   * @param f f(x), the function to derive
   * @return f'(x), the derivative of the f(x)
   */
  private static DoubleFunction<Double> derive(DoubleFunction<Double> f) {
    return (x) -> (f.apply(x + DX) - f.apply(x)) / DX;
  }

  public static void main(String[] args) {
    {
      DoubleFunction<Double> cube = (x) -> x * x * x;
      DoubleFunction<Double> cubeDeriv = derive(cube);

      assert Math.round(cubeDeriv.apply(2)) == 12.0;
      assert Math.round(cubeDeriv.apply(3)) == 27.0;
      assert Math.round(cubeDeriv.apply(4)) == 48.0;
    }

    {
      // f(x) = sin(x), f'(x) = cos(x)
      DoubleFunction<Double> sinDerive = derive(Math::sin);

      // f'(2π) = cos(2π) = 1.0
      assert Math.round(sinDerive.apply(Math.PI * 2)) == 1.0;
    }
  }
}
