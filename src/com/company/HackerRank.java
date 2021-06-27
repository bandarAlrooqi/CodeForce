package com.company;

import java.math.BigInteger;
import java.util.*;

public class HackerRank {

    public static void main(String[] args) {




    }
    public static void printArray(Object[] array){
        for(var i : array)
            System.out.println(i);
    }
    public static boolean isBalanced(char[] array){
        Stack<Character> stack = new Stack<>() ;
        Stack<Character> stack2 = new Stack<>() ;
        Stack<Character> stack3 = new Stack<>() ;
        for(var i : array)
            if(i == '(')stack.push(i);
            else if (i == ')')
                if(stack.isEmpty())return false;
                else stack.pop();
            else if (i == '{')stack2.push(i);
            else if (i == '}')
                if(stack2.isEmpty())return false;
                else stack2.pop();
            else if (i == '[')stack3.push(i);
            else if(i == ']')
                if(stack3.isEmpty())return false;
                else stack3.pop();

        return stack.isEmpty() && stack2.isEmpty() && stack3.isEmpty();
    }

    public static String twoStrings(String s1, String s2) {
        // Write your code here
         Set<Character> set = new HashSet<>();
         var arr = s1.toCharArray();
         for(var i : arr)
             set.add(i);
         arr = s2.toCharArray();
         for(var i : arr)
             if(set.contains(i)){
                 return "YES";
             }
    return "NO";
    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
         Hashtable<String,Integer> hashtable = new Hashtable<>();
         for(var i : magazine)
             if(hashtable.containsKey(i))
                 hashtable.put(i,hashtable.get(i) + 1);
             else
                 hashtable.put(i,1);

             for(var i : note)
                 if(hashtable.containsKey(i) && hashtable.get(i) > 0)
                     hashtable.put(i,hashtable.get(i) - 1);
                 else {
                     System.out.println("No");
                     return;
                 }
        System.out.println("Yes");

    }
    static void bresenham(int x,int y,int x2,int y2){
        int X = x2 - x;
        int Y = y2 - y;
        int p = (2*Y) -X;
        while ((x != x2 || y!=y2)  ){
            System.out.println(p+"\t("+x+","+y+")");
            if(p>=0){
                p = p + (2*Y) - (2*X);
                x++;y++;
            }else{
                p = p + (2*Y);x++;}

        }
        System.out.println(p+"\t("+x+","+y+")");

    }
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long max = Long.MIN_VALUE;
        long[][] matrix = new long[1][n];
        Set<Long> set = new HashSet<>();
        StringBuilder a = new StringBuilder();

        for (List<Integer> query : queries) {

            for (int j = query.get(0) - 1; j < query.get(1); j++) {
                matrix[0][j] += query.get(2);
                max = Math.max(matrix[0][j], max);
            }
        }
        return max;
    }
//    static void bresenham(int x1, int y1, int x2, int y2){
//        int m_new = 2 * (y2 - y1);
//        int slope_error_new = m_new - (x2 - x1);
//
//        for (int x = x1, y = y1; x <= x2; x++)
//        {
//            System.out.print("(" +x + "," + y + ")\n");
//
//            // Add slope to increment angle formed
//            slope_error_new += m_new;
//
//            // Slope error reached limit, time to
//            // increment y and update slope error.
//            if (slope_error_new >= 0)
//            {
//                y++;
//                slope_error_new -= 2 * (x2 - x1);
//            }
//        }
//    }
    static int minimumSwaps(int[] arr) {
        int count = 0 ;
        int mid = (arr.length / 2);

        for (int i = 1; i <= arr.length; i++) {
            if(arr[i-1] == i)continue;
            // perfect swap
            if(arr[arr[i-1] -1 ] == i){
                int temp = arr[arr[i-1] -1 ];
                arr[arr[i-1] -1 ] = arr[i-1];
                arr[i-1] = temp;
                count++;
                continue;
            }


            if(arr[i-1] >= mid){
                int min = Integer.MAX_VALUE,index = 0;
                for (int j = mid; j < arr.length; j++)
                    if(arr[j] - i < min){
                        min = arr[j] - i;
                        index = j;
                    }
                int value = arr[index];
                arr[index] = arr[i -1];
                arr[i - 1] = value;
            }else {
                int min = Integer.MAX_VALUE,index = 0;
                for (int j = 0; j < mid; j++)
                    if(arr[j] - i < min){
                        min = arr[j] - i;
                        index = j;
                    }
                int value = arr[index];
                arr[index] = arr[i -1];
                arr[i - 1] = value;
            }
            count++;
        }
        return count;

    }

    public static void minimumBribes(List<Integer> q) {
        int count =0;
        for (int i = q.size()-1; i >-1 ; i--) {
            if (q.get(i) - (i+1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0,q.get(i) - 2); j <i ; j++) {
                if(q.get(j)>q.get(i))count++;
            }
        }
        
        System.out.println(count);
    }
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        for (int i = 0; i < d; i++) {
            int value = a.remove(0);
            a.add(value);
        }
        return a;

    }
    public static int hourglassSum(List<List<Integer>> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                 max =Math.max( arr.get(i).get(j) + arr.get(i).get(j+1) +arr.get(i).get(j+2) +
                         arr.get(i+1).get(j+1) +
                         arr.get(i+2).get(j) + arr.get(i+2).get(j+1) +arr.get(i+2).get(j+2),max);

        return max;
    }
    public static void countSwaps(List<Integer> a) {
        Integer[] array = a.toArray(new Integer[0]);
        int swaps = 0 ;
        for (int i = 0; i <array.length ; i++) {
            for (int j = i; j <array.length ; j++) {
                if(array[i] > array[j] ){
                    swaps++;
                    var temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+array[0]);
        System.out.println("Last Element: "+array[array.length-1]);
    }
    public static long countInversions(List<Integer> arr) {

        if(arr.size() < 2) return 0 ;
        Integer[] array = arr.toArray(new Integer[0]);
        int middle = (array.length %2 == 0 ? array.length + 1 : array.length) / 2;

        Integer[] left = Arrays.copyOfRange(array,0,middle);
        Integer[] right = Arrays.copyOfRange(array,middle,array.length);
        return  countInversions(Arrays.asList(right))+countInversions(Arrays.asList(left))+merge(left,right,array);

    }
    private static long merge(Integer[] left,Integer[] right, Integer[] result){
        int i = 0, j = 0, k = 0;
        long len = 0;
        while (i < left.length && j < right.length)
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            }
            else{
                result[k++] = right[j++];
                len += left.length - i;
            }


        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
        return len;
    }
    public static void swap(Integer[] array,int a , int b){
        var temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public static int activityNotifications(List<Integer> expenditure, int d) {
        // Write your code here
        if (expenditure.size() <= d) return 0;

        Integer[] array = expenditure.toArray(new Integer[0]);
        int index = 0,notification = 0; double median = 0 ;
        for (int i = d; i < expenditure.size(); i++) {
            int[] subArray = countingSort(Arrays.copyOfRange(array,index++,i));

            if (d % 2 == 0)
                median =  (subArray[d/2] + subArray[d/2 -1 ]) ;
             else
                 median = subArray[d/2] * 2 ;

             if(array[i] >= median)notification++;
            System.out.println(Arrays.toString(subArray));
            System.out.println(median + "\t"+notification);
        }
        return notification;
    }
    private static int[] countingSort(Integer[] array){
        int[] values = new int[2000];

        for (int i = 0; i < array.length; i++) {
            values[array[i]]++;
        }
        int[] sort = new int[array.length];
        int k = 0;
        for (int i = 0; i <values.length; i++) {
            for (int j = 0; j < values[i]; j++) {
                sort[k++] = i;
            }
        }
        return sort;
    }

    public static int maximumToys(List<Integer> prices, int k) {
        prices.sort(Collections.reverseOrder());
        int x = 0;
        for (int i = prices.size() - 1; i >= 0; i--) {
            if (x + prices.get(i) <= k)
                x += prices.get(i);
            else break;
        }
        return x;

    }

    public static long flippingBits(long n) {
        String binary = Long.toBinaryString(n);
        while (binary.length() != 32)
            binary = "0" + binary;
        char[] array = new char[32];
        for (int i = 0; i < 32; i++)
            if (binary.charAt(i) == '0')
                array[i] = '1';
            else
                array[i] = '0';
        String answer = new String(array);

        return Long.parseLong(answer, 2);
    }

    public static void kaprekarNumbers(int p, int q) {
        String s = "";
        for (int i = p; i <= q; i++) {
            if (i == 0) s += "0 ";
            else if (i == 1) s += "1 ";
            int n = i * i;
            if (n < 10) continue;
            String num = n + "";
            long one = Long.parseLong(num.substring(0, num.length() / 2));
            long two = Long.parseLong(num.substring(num.length() / 2));
            if (one + two == i)
                s += i + " ";
        }
        System.out.println(s);

    }

    public static String biggerIsGreater(String str) {
        char[] chars = str.toCharArray();
        int i = chars.length - 1;
        while (i > 0) {
            if (chars[i - 1] >= chars[i]) {
                i--;
            } else {
                int j = i;
                while (j < chars.length && chars[j] > chars[i - 1]) {
                    j++;
                }
                char temp = chars[i - 1];
                chars[i - 1] = chars[j - 1];
                chars[j - 1] = temp;

                char[] newChar = new char[chars.length];
                System.arraycopy(chars, 0, newChar, 0, i);
                int end = chars.length - 1;
                for (int k = i; k < chars.length; k++) {
                    newChar[k] = chars[end--];
                }
                return new String(newChar);
            }
        }
        return "no answer";
    }

    public static String organizingContainers(List<List<Integer>> container) {
        int[] box = new int[container.size()];
        int[] balls = new int[container.size()];
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < balls.length; j++) {
                box[i] += container.get(i).get(j);
                balls[i] += container.get(j).get(i);
            }
        }
        Arrays.sort(box);
        Arrays.sort(balls);
        return Arrays.equals(box, balls) ? "Possible" : "Impossible";
    }

    public static long taumBday(long B, long W, long X, long Y, long Z) {
        long cost = 0;

        if (X < Y) {
            cost = cost + (B * X);
            if (Y < Z + X) {
                cost = cost + (W * Y);
            } else {
                cost = cost + (W * (Z + X));
            }
        } else {
            cost = cost + (W * Y);
            if (X < Z + Y) {
                cost = cost + (B * X);
            } else {
                cost = cost + (B * (Z + Y));
            }
        }
        return cost;

    }

    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here
        int numberOfAttendees = topic.size();
        int numberOfTopics = topic.get(0).length();
        int maxTopic = 0;
        int maxTeam = 1;
        for (int i = 0; i < numberOfAttendees; i++) {
            for (int j = i; j < numberOfAttendees; j++) {
                if (i == j) continue;
                int currentMatch = 0;
                for (int k = 0; k < numberOfTopics; k++) {
                    if (topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1') currentMatch++;
                }
                if (currentMatch > maxTopic) {
                    maxTopic = currentMatch;
                    maxTeam = 1;
                } else if (currentMatch == maxTopic) maxTeam++;
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(maxTopic);
        list.add(maxTeam);
        return list;

    }

    public static int queensAttack(int n, int k, int rQueen, int cQueen, List<List<Integer>> obstacles) {
        //Row Column coordinates of the closes object in each direction
        int rRObstacle = -1;
        int cRObstacle = -1;
        int rBRObstacle = -1;
        int cBRObstacle = -1;
        int rBObstacle = -1;
        int cBObstacle = -1;
        int rBLObstacle = -1;
        int cBLObstacle = -1;
        int rLObstacle = -1;
        int cLObstacle = -1;
        int rTLObstacle = -1;
        int cTLObstacle = -1;
        int rTObstacle = -1;
        int cTObstacle = -1;
        int rTRObstacle = -1;
        int cTRObstacle = -1;

        //Total squares attacked by the queen
        int reachableSquares = 0;

        //Finds the closest object in each direction
        for (int a0 = 0; a0 < k; a0++) {
            int rObstacle = obstacles.get(a0).get(0);
            int cObstacle = obstacles.get(a0).get(1);


            //Right
            if ((cObstacle < cRObstacle || rRObstacle == -1) && cObstacle > cQueen && rObstacle == rQueen) {
                rRObstacle = rObstacle;
                cRObstacle = cObstacle;
            }

            //Bottom Right
            if (rQueen - rObstacle == cObstacle - cQueen && cObstacle > cQueen && rObstacle < rQueen
                    && ((rObstacle > rBRObstacle && cObstacle < cBRObstacle) || rBRObstacle == -1)) {
                rBRObstacle = rObstacle;
                cBRObstacle = cObstacle;
            }

            //Bottom
            if ((rObstacle > rBObstacle || rBObstacle == -1) && rObstacle < rQueen && cObstacle == cQueen) {
                rBObstacle = rObstacle;
            }

            //Bottom Left
            if (rQueen - rObstacle == cQueen - cObstacle && cObstacle < cQueen && rObstacle < rQueen
                    && ((rObstacle > rBLObstacle && cObstacle > cBLObstacle) || rBLObstacle == -1)) {
                rBLObstacle = rObstacle;
                cBLObstacle = cObstacle;
            }

            //Left
            if ((cObstacle > cLObstacle || rLObstacle == -1) && cObstacle < cQueen && rObstacle == rQueen) {
                rLObstacle = rObstacle;
                cLObstacle = cObstacle;
            }

            //Top Left
            if (cQueen - cObstacle == rObstacle - rQueen && cObstacle < cQueen && rObstacle > rQueen
                    && ((rObstacle < rTLObstacle && cObstacle > cTLObstacle) || rTLObstacle == -1)) {
                rTLObstacle = rObstacle;
                cTLObstacle = cObstacle;
            }

            //Top
            if ((rObstacle < rTObstacle || rTObstacle == -1) && rObstacle > rQueen && cObstacle == cQueen) {
                rTObstacle = rObstacle;
                cTObstacle = cObstacle;
            }

            //Top Right
            if (rObstacle - rQueen == cObstacle - cQueen && cObstacle > cQueen
                    && rObstacle > rQueen && ((rObstacle < rTRObstacle && cObstacle < cTRObstacle) || rTRObstacle == -1)) {
                rTRObstacle = rObstacle;
                cTRObstacle = cObstacle;
            }

        }

        //Calculates the distance to the closest obstacle in each direction and adds it to reachableSquares
        //R B L T
        reachableSquares += (cRObstacle != -1) ? (cRObstacle - cQueen - 1) : n - cQueen;
        reachableSquares += (rBObstacle != -1) ? (rQueen - rBObstacle - 1) : rQueen - 1;
        reachableSquares += (cLObstacle != -1) ? (cQueen - cLObstacle - 1) : cQueen - 1;
        reachableSquares += (rTObstacle != -1) ? (rTObstacle - rQueen - 1) : n - rQueen;

        //BR BL TL TR
        reachableSquares += (cBRObstacle != -1) ? (cBRObstacle - cQueen - 1) : Math.min(n - cQueen, rQueen - 1);
        reachableSquares += (rBLObstacle != -1) ? (cQueen - cBLObstacle - 1) : Math.min(cQueen - 1, rQueen - 1);
        reachableSquares += (cTLObstacle != -1) ? (cQueen - cTLObstacle - 1) : Math.min(cQueen - 1, n - rQueen);
        reachableSquares += (rTRObstacle != -1) ? (cTRObstacle - cQueen - 1) : Math.min(n - cQueen, n - rQueen);

        return reachableSquares;
    }

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        arr.sort(Collections.reverseOrder());
        int max = 0;
        for (int i : arr)
            max = Math.max(max, Math.abs(arr.indexOf(i) - arr.lastIndexOf(i)));
        return arr.size() - max - 1;

    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // In maths. if (a + b) % k = 0 => then ((a % k) + (b % k)) % k = 0
        // Example: (5 + 7) % 6 = 0 => then (5 % 6) + (7 % 6) > (5 + 1) % 6 = 0

        // Solution: Find remainder of each element in the array.
        // then, choose max element from the pair which together can able to be divided by k. If one pair is "i" then other pair will be "k-i"
        // For example: S = {2, 3, 7, 8, 12} and k = 5.
        // Now we have 3 numbers whose remainder 2 => ( 2 % 5 = 2, 7 % 5 = 2, 12 % 5 = 2)
        // and also we have 2 numbers whose remainder 3 => (3, 8)
        // Right now we have to choose one of the element from that pair (3, 2) (where 3 > numbers 2, 7, 12 && 2 > numbers 3, 8)
        // Because of the problem, we will choose the max which is 3.

        int[] remainderArr = new int[k];
        // find remainder of each element in the array S
        // For example k = 4, S = {0, 5, 7, 10} => remainderArr will be: {0, 1, 1, 1}
        // where each index represents remainder. For example remainderArr[2] = 1 means
        // that there is 1 number whose remainder 2 after divided 4. (10 % 4 = 2)
        for (Integer each : s) {
            remainderArr[each % k]++;
        }

        // After getting each remainder, index 0 (actually remainder 0) is a special case
        // Think of it like this:
        //      1. There will be no element such as k - 0 = k. (remainderArr[k] will give us ArrayIndexOutOfBoundsException)
        //      2. If there are 2 elements in remainderArr[0], we have to choose only 1, otherwise, we can sum up 2 or more
        //         zeros, then non-sub divisible set could be divisible by k.
        int zeroRemainder = remainderArr[0];

        // That's why, our initial subset size is 1, if there is a zero remainder,
        //                                           otherwise it is 0
        int maxNumberOfDivisibleSet = zeroRemainder > 0 ? 1 : 0;

        // Another thing is that pair which is itself. That's means, let's say k = 4, therefore pair of remainderArr[2]
        // will also be remainderArr[2]( i = 2 then, k - i = 2). Thus, we have to choose only 1 element from that pair (or we should increment
        // the result number just 1)
        // if condition "i != k - i" will handle this situation.
        for (int i = 1; i <= (k / 2); i++) {
            if (i != k - i)
                maxNumberOfDivisibleSet += Math.max(remainderArr[i], remainderArr[k - i]);
            else
                maxNumberOfDivisibleSet++;
        }

        return maxNumberOfDivisibleSet;

    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
        List<Integer> list = new ArrayList<>();
        while (arr.size() != 1) {
            int index = 0;
            int value = arr.get(index);
            list.add(arr.size());
            List<Integer> list2 = new ArrayList<>();
            for (int i : arr) {
                if (i - value == 0) continue;
                list2.add(i - value);
            }
            arr = list2;
        }
        list.add(1);
        return list;
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y2 < y1) return 10_000;
        if (m2 < m1) return m1 - m2 * 500;
        if (d2 < d1) return 15 * (d1 - d2);
        return 0;


    }

    public static int squares(int a, int b) {
        return (int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1;

    }

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int count = 0, i = 0;
        char[] sa = s.toCharArray(), ta = t.toCharArray();
        for (; i < sa.length && i < ta.length; i++)
            if (sa[i] != ta[i])
                break;
        int n1 = s.length(), n2 = t.length();
        count = n1 - i + n2 - i;

        if (k == count || k >= n1 + n2)       // Case 1
            return "Yes";
        else if (count % 2 == k % 2 && count <= k) // Case 2
            return "Yes";
        else             // Case 3
            return "No";
    }

    public static void extraLongFactorials(int n) {
        BigInteger big = new BigInteger(n + "");
        for (int i = n - 1; i > 1; i--)
            big = big.multiply(new BigInteger(i + ""));
        System.out.println(big);
    }

    public static String timeConversion(String s) {
        if (s.charAt(8) == 'A' && s.charAt(0) == '1' && s.charAt(1) == '2')
            return "00" + s.substring(2, s.length() - 2);
        if (s.charAt(8) == 'P' && s.charAt(0) == '1' && s.charAt(1) == '2') return s.substring(0, s.length() - 2);
        if (s.charAt(8) == 'P') return (Integer.parseInt(s.substring(0, 2)) + 12) + s.substring(2, s.length() - 2);
        return s.substring(0, s.length() - 2);
    }

    public static void miniMaxSum(List<Integer> arr) {
        long m = 0, max = 0;
        arr.sort(Collections.reverseOrder());
        for (int i = 0; i < 4; i++) {
            max += arr.get(i);
            m += arr.get(i + 1);
        }
        System.out.println(m + " " + max);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(arr.size() - 1 - i).get(arr.size() - 1 - i);
        }
        return Math.abs(sum2 - sum1);

    }

    static List<Integer> climbingLeaderboard(List<Integer> scores, List<Integer> alice) {
        int n = scores.size();
        int m = alice.size();


        int[] res = new int[m];
        int[] rank = new int[n];

        rank[0] = 1;

        for (int i = 1; i < n; i++) {
            if (scores.get(i) == scores.get(i - 1)) {
                rank[i] = rank[i - 1];
            } else {
                rank[i] = rank[i - 1] + 1;
            }
        }

        for (int i = 0; i < m; i++) {
            int aliceScore = alice.get(i);
            if (aliceScore > scores.get(0)) {
                res[i] = 1;
            } else if (aliceScore < scores.get(i - 1)) {
                res[i] = rank[n - 1] + 1;
            } else {
                int index = binarySearch(scores.toArray(new Integer[0]), aliceScore);
                res[i] = rank[index];

            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (int i : res) a.add(i);
        return a;

    }

    private static int binarySearch(Integer[] a, int key) {

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key && key < a[mid - 1]) {
                return mid;
            } else if (a[mid] > key && key >= a[mid + 1]) {
                return mid + 1;
            } else if (a[mid] < key) {
                hi = mid - 1;
            } else if (a[mid] > key) {
                lo = mid + 1;
            }
        }
        return -1;
    }


    public static long repeatedString(String s, long n) {
        long numberOfReps = n / s.length();
        long remainder = n % s.length();
        long total = 0;
        for (int a = 0; a < s.length(); a++) {
            if (s.charAt(a) == 'a') {
                total++;
            }
        }
        total = total * numberOfReps;
        for (int a = 0; a < remainder; a++) {
            if (s.charAt(a) == 'a')
                total++;
        }
        return total;
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int jump = 0;
        int i = 0;
        while (i < c.size()) {
            if (i + 2 < c.size() && c.get(i + 2) == 0)
                i += 2;
            else
                i += 1;

            jump++;
        }
        return jump - 1;

    }

    public static int countingValleys(int steps, String path) {
        boolean countAble = true;
        int valleys = 0;
        int seaLevel = 0;
        for (char i : path.toCharArray()) {
            if (i == 'D')
                seaLevel--;
            else
                seaLevel++;
            if (seaLevel < 0 && countAble) {
                valleys++;
                countAble = false;
            }
            if (seaLevel >= 0)
                countAble = true;
        }
        return valleys;

    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i : ar) {
            if (set.contains(i)) {
                sum++;
                set.remove(i);
            } else
                set.add(i);

        }
        return sum;
    }

    public static int findMinCost(int[][] cost, int m, int n) {
        if (n == 0 || m == 0) {
            return Integer.MAX_VALUE;
        }
        if (m == 1 && n == 1) {
            return cost[0][0];
        }
        return Integer.min(findMinCost(cost, m - 1, n), findMinCost(cost, m, n - 1))
                + cost[m - 1][n - 1];
    }

    public static int min(List<int[]> list, int l) {
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < l; j++) {
                int index = list.get(i)[0];
                int start = list.get(i)[1];
                int end = list.get(i)[2];
                for (int k = start; k < end; k++) {
                    if (set.contains(j)) continue;
                    set.add(j);
                    list2.add(index);
                }
            }
            if (list2.size() > list3.size())
                list3 = list2;
            list2.clear();
            set.clear();
        }
        System.out.println(list3);
        return list3.size();
    }

    private static void print(List<List<Integer>> matrix) {
        for (var i : matrix)
            System.out.println(i);
    }

    public static int five(Map<String, Integer> map) {
        if (map.size() < 5) {
            return 0;
        }
        int teamFive = 0;
        int num = 0;
        for (String i : map.keySet()) {

            num++;
            if (num == 5) {
                teamFive++;
                num = 0;
            }
        }
        for (String i : map.keySet()) {
            if (map.get(i) > 1) teamFive++;
        }
        return teamFive;

    }

    public static int six(Map<String, Integer> map) {
        if (map.size() < 6) {
            return 0;
        }
        int teamFive = 0;
        int num = 0;
        for (String i : map.keySet()) {
            num++;
            if (num == 6) {
                teamFive++;
                num = 0;
            }
        }
        for (String i : map.keySet()) {
            if (map.get(i) > 1) teamFive++;
        }
        return teamFive;
    }

    /*
    static String[] findStrings(String[] w, int[] queries) {
        String[] array = getOneArray(w);
        List<String> q = new ArrayList<>();
        for(int i : queries)
            if(i-1 >= array.length || i-1 < 0)
                q.add("INVALID");
            else
                q.add(array[i-1]);
        return  q.toArray(new String[0]);
    }
    static String[] getOneArray(String[] w){
        Set<String> list = new TreeSet<>();
        for(String i : w){
            list.addAll(Arrays.asList(i.split("")));
            list.add(i);
            if(i.length()>2) {
                int l = i.length();
                while (l != 1){
                    int start = 0;
                    while ((start)<l) {
                        list.add(i.substring(start, l));
                        start++;
                    }
                    l--;
                }
            }
        }
        return list.toArray(new String[0]);
    }
    One problem --> time limit on test case 5
     */
    static void matrixRotation(List<List<Integer>> matrix, int r) {
        for (int i = 0; i < r; i++) {
            rotate(matrix, matrix.size(), matrix.get(0).size(), 0);
        }


    }

    static void rotate(List<List<Integer>> matrix, int ROW_SIZE, int COL_SIZE, int rowR) {
        if (COL_SIZE <= 2 || ROW_SIZE < 1) return;
        int value = matrix.get(rowR).remove(rowR);
        for (int i = rowR + 1; i < ROW_SIZE - 1; i++) {
            matrix.get(i).add(rowR, value);
            value = matrix.get(i).remove(rowR + 1);
        }
        matrix.get(ROW_SIZE - 1).add(rowR, value);
        value = matrix.get(ROW_SIZE - 1).remove(COL_SIZE);
        matrix.get(rowR).add(COL_SIZE - 1, value);
        for (int i = ROW_SIZE - 2; i > rowR; i--) {
            matrix.get(i).add(COL_SIZE, value);
            value = matrix.get(i).remove(COL_SIZE - 1);
        }

        rotate(matrix, ROW_SIZE - 1, COL_SIZE - 1, rowR + 1);
    }

    static void permute(java.util.List<int[]> arr, int k, List<int[]> list) {
        for (int i = k; i < arr.size(); i++) {
            java.util.Collections.swap(arr, i, k);
            permute(arr, k + 1, list);
            java.util.Collections.swap(arr, k, i);
            list.addAll(arr);
        }
        if (k == arr.size() - 1) {
            return;

        }
    }


}
