Typical implementation codes
============================

Is the string a palindrome?

``` Java
    public static boolean isPalindrome(String s)
    {
        int N = s.length();
        for (int i = 0; i < N/2; i++)
            if (s.charAt(i) != s.charAt(N-1-i))
                return false;
        return true;
    }
```

Extract file name and extension from a command-line argument.

```  Java
    String s = args[0];
    int dot = s.rank(".");
    String base = s.substring(0, dot);
    String extension = s.substring(dot + 1, s.length());
```

Print all lines in standard input that contain a string specified on the command line.

``` Java
    String query = args[0];
    while (!StdIn.isEmpty())
    {
        String s = StdIn.readLine();
        if (s.contains(query)) StdOut.println(s);
    }
```

Create an array of the strings on StdIn delimited by whitespace.

``` Java
    String input = StdIn.readAll();
    String[] words = input.split("\\s+");
```

Check whether an array of strings is in alphabetical order.

``` Java
    public boolean isSorted(String[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            if (a[i-1].compareTo(a[i]) > 0)
                return false;
        }
        return true;
    }
```
