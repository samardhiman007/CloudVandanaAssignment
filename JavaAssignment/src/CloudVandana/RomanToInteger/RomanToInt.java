package CloudVandana.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    private static final Map<Character,
                Integer> roman = new HashMap<Character,
                            Integer>()
    {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public  int convert(String s)
    {
        int sum = 0;
        int n = s.length();

        for(int i = 0; i < n; i++)
        {

            if (i != n - 1 && roman.get(s.charAt(i)) <
                    roman.get(s.charAt(i + 1)))
            {
                sum += roman.get(s.charAt(i + 1)) -
                        roman.get(s.charAt(i));
                i++;
            }
            else
            {
                sum += roman.get(s.charAt(i));
            }
        }
        return sum;
    }


}
