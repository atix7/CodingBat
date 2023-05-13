import java.util.Arrays;
import java.util.Collections;

public class Main {
    /* public static int last2(String str) {
         int sum = 0;
         boolean found = false;
         for (int i = 0; i < str.length() - 1; i++) {
             System.out.println("Substring kulso for " + str.substring(i, i + 2));
             String firstPart = str.substring(i, i + 2);        // A két tagú string, amit keresek

             for (int j = 0; j < str.length() - 2; j++) {
                 String bigger = str.substring(j++, j+2);          //A maradék string
                 //System.out.println(bigger);
                 if (bigger.equals(firstPart)) {
                     System.out.println("Bigger belso for  " + bigger + "   " + firstPart);
                     found = true;
                 }
                 if (found) {
                     sum++;
                     System.out.println("  found " + sum);
                     found = false;
                 }
             }
         }
         for (int i = 0; i < str.length()-1; i++) {
             //System.out.println(str.substring());

         }
         return sum;
     }*/
    /*public static boolean parrotTrouble(boolean talking, int hour) {
        boolean back = false;
        if (talking) {
            if ((hour > 0 && hour < 7) || (hour > 20 && hour < 24)){
                back = true;
            } else{
                back = false;
            }
        }
        return back;
    }*/
    /*public static boolean posNeg(int a, int b, boolean negative) {
        boolean back = false;
        if (negative) {
            if (a < 0 && b < 0)
                back = true;
        }else {
            if (a < 0 || b < 0)
                back = true;
        }
        return back;
    }*/

    /*public static String frontBack(String str) {
        if (str.length() > 1) {
            String back = str.substring(str.length() - 1, str.length());
            String front = str.substring(0, 1);
            return (back+ str.substring(1,str.length()-1) +front);
        } else {
            return str;

        }
    }*/
    /*
    public static boolean icyHot(int temp1, int temp2) {
        boolean back = false;
        if (temp1 > 100) {
            if (temp2 < 0)
                back = true;
        }else {
            if (temp1 < 0 && temp2 >100)
                back = true;
        }return back;
    }*//*
    public static String startOz(String str) {
        String back = "";
        String back1 = "";
        if (str.length() >= 2 && str.charAt(1)=='z') {
                back = "z";
            }
            if (str.charAt(1) == 'z') {
                back1 = "z";
            }
            return back + back1;
        } else {
            back =

            return back;
        }
    }*/
    /*
    public static boolean lastDigit(int a, int b) {
        boolean back = false;
        if (a % 10 == b % 10) {
            System.out.println("a vege " + a % 10);
            System.out.println("b vege " + b % 10);
            back = true;
        }
            System.out.println("a vege " + a % 10);
            System.out.println("b vege " + b % 10);
        return back;
    }*/
    /*public static boolean makes10(int a, int b) {
        boolean back = false;
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }else return false;
    }*/
    /*public static String notString(String str) {
        String notStr = "";
        if (str.length() > 3) {
            notStr = str.substring(0, 3);
            //System.out.println(not);
        }else if(str.length()==3){
            if (str.equals("not"))
                return str;
        }
        if (notStr.equals("not")) {
            return str;
        } else return "not " + str;
    }*/
    /*
    public static boolean has271(int[] nums) {
        boolean back = false;
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == nums[i + 1] - 5 && (nums[i + 2] == nums[i] - 1) ||
                    (nums[i + 2] == nums[i] - 2)) {
                back = true;
            } else
                back = false;
            System.out.println(nums[i] + " " + nums[i + 1] + " " + nums[i + 2]);
        }
        return back;
    }*/
    /*
    public static boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            return true;
        } else return false;
    }*/
    /*public static int makeEnds(int[] nums) {
        int[] myArray = new int[2];
        if (nums.length == 1){
            myArray[0] = nums[0];
            myArray[1] = nums[1];
        }else {
            myArray[0] = nums[0];
            myArray[1] = nums[nums.length-1];
        }
        return myArray;
    }*/
    /*
    public static int sum67(int[] nums) {
        int sum = 0;
        boolean six = false;
        boolean seven = false;
        if (nums.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 6) {
                    six = true;
                }
                if (nums[i] == 7)
                    seven = true;
            }
            if (six && seven) {
                six = false;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i]!=6 && !six){
                        sum += nums[i];
                    }else {
                        six= true;
                    }
                    if (nums[i] == 7)
                        six=false;
                }
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == 6 || nums[i] == 7) {
                        continue;
                    }
                    sum += nums[i];
                }
            }
        }
        return sum;
    }*/
    /*
    public static boolean has22(int[] nums) {
        boolean back = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2) {
                if (nums[i + 1] == 2)
                    back = true;
            }
        }
        return back;
    }*/
    /*
    public static boolean lucky13(int[] nums) {
        boolean back = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3){
                back=false;
            }
        }
        return back;
    }*/
    /*
    public static int[] zeroFront(int[] nums) {
        int countZero=0;
        int countOther=0;
        int[] resultZero = new int[nums.length];
        int[] resultOther = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]== 0){
                resultZero[countZero]=nums[i];
                countZero++;
            }else {
                resultOther[countOther]=nums[i];
                countOther++;
            }
        }
        for (int i = 0; i < countOther; i++) {
            resultZero[countZero++]=resultOther[i];
        }
        for (int i = 0; i < resultZero.length; i++) {
            System.out.println(resultZero[i]);
        }
        return resultZero;
    }*/
    /*public static int maxSpan(int[] nums) {
        int[] similar = new int[nums.length];
        int[] tempCount = new int[nums.length];
        int[] tempNum = new int[nums.length];
        int count = 0;
        int max = 0;

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        } else {
            for (int i = 0; i < nums.length; i++) {
                similar[i] = nums[i];
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == similar[i]) {
                        count++;
                        //System.out.print("Count IN:  " + count + "\n");
                    }
                }
                tempCount[i] = count;   //Hányszor van meg az adott helytől balra, az adott szám
                tempNum[i] = nums[i];   //Mi az adott szám, ami többször megvan
                count = 0;
            }
            for (int i = 0; i < tempCount.length; i++) {
                System.out.println("tempCount array: " + tempCount[i] + "  tempNum array: " + tempNum[i]);
            }
            //max = Collections.max(Arrays.asList(tempNumm));
            //System.out.println(Collections.max(tempNum));
            for (int i = 0; i < tempCount.length; i++) {
                if (tempCount[i] > max)
                    max = tempCount[i];
            }
            System.out.println("A legnagyobb a tempCount-ból: " + max);
            System.out.print("Count :  ");
            return count;
        }*/
    /*public static boolean sum28(int[] nums) {
        int sum=0;
        for (int i : nums
        ) {
            if (i==2){
                sum+=i;
            }
        }
        if (sum==8){
            return true;
        }else return false;
    }*/

    /*Return a version of the given array where each zero value in the array is replaced by the largest
    odd value to the right of the zero in the array. If there is no odd value to the right of the zero,
     leave the zero as a zero.
    zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
    zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
    zeroMax([0, 1, 0]) → [1, 1, 0]                         */
    /*public static int[] zeroMax(int[] nums) {
        int result[] = new int[nums.length];
        int count = 0;
        int max = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 != 0) {
                max = Math.max(max, nums[i]);
            }
            if (nums[i] == 0)
                nums[i] = max;
        }
        for (int n: nums)
            System.out.println(n);

        return nums;
    }*/
    public static int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i < nums.length-1 && nums[i] == val) {
                if (nums[i] != nums[i-1] && nums[i] != nums[i+1])
                    nums[i] = Math.max(nums[i-1], nums[i+1]);
            }
        }
        for (int n : nums)
            System.out.println(n);
        return nums;
    }


    public static void main(String[] args) {
        //System.out.println(last2("hixxhi"));
        //System.out.println(parrotTrouble(true, 21));
        //System.out.println(posNeg(-2, -2, false));    //03.27. Warmup-1
        //System.out.println(frontBack("ab"));             //03.27. Warmup-1
        //System.out.println(icyHot(120,1));                //03.27.Warmup-1
        //System.out.println(startOz("tzbzoo"));                //03.27. Warmup-1
        //System.out.println(lastDigit(7, 323));                //03.28.Warmup-1
        //System.out.println(makes10(9, 9));                //03.28.Warmup-1
        //System.out.println(notString("not"));                //03.29.Warmup-1
        //System.out.println(has271(new int[]{2, 7, 1}));                //03.29.Warmup-1
        //System.out.println(no23(new int[]{2, 5}));                //04.06.Warmup-1
        //System.out.println(makeEnds(new int[]{1,2, 5}));                //04.09.Array-1
        //System.out.println(sum67(new int[]{1, 6,  1, 7,3}));                //04.11.Array-2
        //System.out.println(has22(new int[]{1, 2, 3,2}));                //04.11.Array-2
        //System.out.println(lucky13(new int[]{9, 2, 5, 2}));                //04.11.Array-2
        //System.out.println(zeroFront(new int[]{0,1, 1, 0,1}));                //04.11.Array-2
        //System.out.println(maxSpan(new int[]{1, 2, 8, 2, 2, 8, 2}));                //04.12.Array-3
        //System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2,2}));                //05.09.Array-2
        //System.out.println(zeroMax(new int[]{0, 5, 0, 3}));                //05.11.Array-2
        System.out.println(notAlone(new int[]{1, 1, 1, 2}, 1));                //05.11.Array-2
    }
}
