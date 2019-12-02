

public class Main {

    public static void main(String[] args) {
        String originalString = "This is a 4.0% test for 4.0% A.P.R. and 4.2% without test 4.0% ";
        print(originalString);
        String newString = theReplacer(originalString).toString();
        print(newString);
    }

    public static void print(String output) {
        System.out.println(output);
    }

    public static Boolean doesNotHaveAPR(String input, int percentIndex)
    {
        int offset = 2;
        if(!(input.length() > percentIndex
                && input.length() > percentIndex + offset
                && input.length() > "apr".length() + percentIndex + offset
                && input.length() > "A.P.R.".length() + percentIndex + offset))
        {
            return true; // We don't have any string length to check-- safe to assume we don't have any kind of APR.
        }
        else return !
                ("APR".equals(input.substring(percentIndex + offset, percentIndex + "APR".length() + offset))
                        || "apr".equals(input.substring(percentIndex + offset, percentIndex + "apr".length() + offset))
                        || "A.P.R.".equals(input.substring(percentIndex + offset, percentIndex + "A.P.R.".length() + offset))
                        || "a.p.r.".equals(input.substring(percentIndex + offset, percentIndex + "a.p.r".length() + offset))
                );
    }

    public static StringBuilder theReplacer(String input) {
        int percentIndex = input.indexOf('%'); // Returns first match of '%'
        StringBuilder theResult = new StringBuilder();
        if(percentIndex == input.length() - 1) {
            return theResult.append(input + " APR");
        }
        else if (percentIndex > 0) {
            if(doesNotHaveAPR(input, percentIndex)) {
                // Insert APR after % when not found..
                theResult.append(input.substring(0, percentIndex + 1) + " APR" + theReplacer(input.substring(percentIndex + 1, input.length())));
                return theResult;
            }
            else {
                // APR in some form already exists, just skip it and move on to next occurrence..
                theResult.append(input.substring(0, percentIndex + 1) + theReplacer(input.substring(percentIndex + 1, input.length())));
                return theResult;
            }
        }
        return theResult.append(input); // Same as above
    }

}
