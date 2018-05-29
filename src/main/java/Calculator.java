import java.util.*;
import java.util.regex.Pattern;

public class Calculator {

    public static float calculate(String parsable) {

        String[] expressions;
        float result,
              final_result = 0;
        expressions = parsable.split(" ");


        for (int i = 0; i < expressions.length; i++) {

            if (expressions[i].equals("+")) {
                result = Float.parseFloat(expressions[i - 1]) + Float.parseFloat(expressions[i + 1]);
                expressions[i + 1] = String.valueOf(result);
                final_result = result;
            }

            if (expressions[i].equals("-")) {
                result = Float.parseFloat(expressions[i - 1]) - Float.parseFloat(expressions[i + 1]);
                expressions[i + 1]  = String.valueOf(result);
                final_result = result;
            }

            if (expressions[i].equals("*")) {
                result = Float.parseFloat(expressions[i - 1]) * Float.parseFloat(expressions[i + 1]);
                expressions[i + 1]  = String.valueOf(result);
                final_result = result;
            }

            if (expressions[i].equals("/")) {
                result = Float.parseFloat(expressions[i - 1]) / Float.parseFloat(expressions[i + 1]);
                expressions[i + 1]  = String.valueOf(result);
                final_result = result;
            }
        }

        return final_result;

    }




}
