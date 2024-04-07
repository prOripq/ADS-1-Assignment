import java.util.Scanner;
1.
public class Main {
    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null");
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = findMinimum(numbers);
        System.out.println("Minimum element in the array is: " + min);

        scanner.close();
    }
}

2.

public class Main {
    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null");
        }

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        double avg = calculateAverage(numbers);
        System.out.println("Average num is: " + avg);

        scanner.close();
    }
}

3.

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        boolean isPrime = isPrime(n);
        System.out.println("Number is: " + isPrime);

        scanner.close();
    }
}

4.

public class Main {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        long factorial = factorial(n);
        System.out.println("Factorial is: " + factorial);

        scanner.close();
    }
}

5.

public class Main {
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci sequence is not defined for negative numbers");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int fibonacci = fibonacci(n);
        System.out.println("Factorial is: " + fibonacci);

        scanner.close();
    }
}

6.

public class Main {
    public static double calculatePower(double a, int n) {
        return Math.pow(a, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double a = scanner.nextInt();
        int n = scanner.nextInt();
        double Pow = calculatePower(a, n);
        System.out.println("Pow is: " + Pow);

        scanner.close();
    }
}

7.

public class Main {
    public static void permutations(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                permutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
            }
        }
    }

    public static void printAllPermutations(String s) {
        permutations("", s);
    }

    public static void main(String[] args) {
        String s = "IOX";
        System.out.println("Permutations of the string '" + s + "':");
        printAllPermutations(s);

    }
}

8.


public class Main {
    public static String isAllDigits(String s) {
        if (s == null || s.isEmpty()) {
            return "NO";
        }

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
        String s1 = "123456";
        String s2 = "123a12";
        System.out.println("\"" + s1 + "\" consists only of digits: " + isAllDigits(s1));
        System.out.println("\"" + s2 + "\" consists only of digits: " + isAllDigits(s2));

    }
}

9.


public class Main {
    public static int calculateBinomialCoefficient(int n, int k) {
        // Base cases
        if (k == 0 || k == n) {
            return 1;
        }

        return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int binomialCoefficient = calculateBinomialCoefficient(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + binomialCoefficient);
        scanner.close();
    }
}

10.


public class Main {
    public static int gcd(int a, int b) {
        // Base case: If b is 0, then GCD(a, b) = a
        if (b == 0) {
            return a;
        }

        // Otherwise, recursively call gcd with b and the remainder of a divided by b
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = gcd(n, k);
        System.out.println("GCD of " + n + " and " + k + " is: " + result);
        scanner.close();
    }
}

