package shcherbyna.homeworks.homework7;

import static shcherbyna.homeworks.homework7.ArrayValueCalculator.doCalc;

class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4) {
            throw new ArraySizeException("Array must be 4х4");
        }
        int value = 0;
        int counter = 0;
        for (String[] string : array) {
            int counter2 = 0;
            if (string.length != 4) {
                throw new ArraySizeException("Array MUST be 4х4");
            } else {
                for (String number : string) {
                    try {
                        value += Integer.parseInt(number);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException("Value in index [" + counter + "]" + "[" + counter2 + "] are incorrect");
                    }
                    counter2++;
                }
            }
            counter++;
        }
        return value;
    }
}

class ArraySizeException extends Exception {
    ArraySizeException(String a) {
        super(a);
    }
}

class ArrayDataException extends Exception {
    ArrayDataException(String a) {
        super(a);
    }
}

class Main {
    public static void main(String[] args) {

        String[][] array = {{"1", "1", "1", "1"},
                {"1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}};

        try {
            System.out.println(doCalc(array));
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other type of exception");
        }

        String[][] array2 = {{"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "tut", "1"},
                {"1", "1", "1", "1"}};

        try {
            System.out.println(doCalc(array2));
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other type of exception");
        }

        String[][] array3 = {{"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}};

        try {
            System.out.println(doCalc(array3));
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other type of exception");
        }
    }
}





