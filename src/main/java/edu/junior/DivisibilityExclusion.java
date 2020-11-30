package edu.junior;

/**
 * Author: eukovko
 * Date: 11/23/2020
 */
public class DivisibilityExclusion {

    private int[] numbers;

    public DivisibilityExclusion() {
    }

    public DivisibilityExclusion(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] removeOdd() {
        // TODO: Remove all odd numbers from the array with for loop
        int length = numbers.length;  //9
        int count = 0;
        for (int index = 0; index < length; index++) {   // 0<9
            if (numbers[index] % 2 != 0) {   /// element massiva делится на 3 без остатка
                count++;  // считаем кол-во подходящих вариантов
            }// счётчик
        }
        int index = 0;
        int[] r = new int[length - count];
        for (int j = 0; j < length; j++) {
            if (numbers[j] % 2 == 0) {
                r[index++] = numbers[j];
            }
        }
        return r;
    }

    public int[] removeEven() {
        // TODO: Remove all even numbers from the array with for-each loop
        int length = numbers.length;  //9
        int count = 0;
        for (int index : numbers) {   // 0<9
            if (index % 2 == 0) {   /// element massiva делится на 3 без остатка
                count++;  // считаем кол-во подходящих вариантов
            }// счётчик
        }
        int index = 0;
        int[] r = new int[length - count];
        for (int j: numbers) {
            if (j % 2 != 0) {
                r[index++] = j;
            }
        }
        return r;
    }


    public int[] removeEvenOrOdd(boolean odd) {
        // TODO: Remove all odd or even numbers (based on the second argument) from the array with for-each loop
        int length = numbers.length;  //9
        int count = 0;
        int[] r = new int[length - count];
        for (int i: numbers) {
            if (numbers[1] % 2 == 0) {
                for (int index : numbers) {   // 0<9
                    if (index % 2 == 0) {   /// element massiva делится на 3 без остатка
                        count++;  // считаем кол-во подходящих вариантов
                    }// счётчик
                }
                int index = 0;
                for (int j: numbers) {
                    if (j % 2 != 0) {
                        r[index++] = j;
                    }
                }

            } else {
                for (int index: numbers) {
                    if (index % 2 != 0) {
                        count++;
                    }
                }
                int index = 0;
                for (int j:numbers) {
                    if (j % 2 == 0) {
                        r[index++] = j;
                    }
                }
            }
        }
        return r;
    }


    public int[] removeDivisibleByThree() {
        // TODO: Remove all numbers which are divisible by three from the array with while or do-while loop
        int index = 0;
        int length = numbers.length;  //9
        int count = 0;
        while (index < length) {   // 0<9
            if (numbers[index] % 3 == 0) {   /// element massiva делится на 3 без остатка    [1,2,3,4,5,6,7,8,9]
                count++;  // считаем кол-во подходящих вариантов 4
            }
            index++;    // счётчик
        }
        int j = 0;
        index = 0;
        int[] r = new int[length - count]; /// 6 чисел
        while (j < length) {
            if (numbers[j] % 3 != 0) {
                r[index++] = numbers[j];
            }
            j++;
        }
        return r;
    }


    public int[] removeDivisible(int divisor) {
        // TODO: Remove all numbers which are divisible by the second argument
        throw new UnsupportedOperationException();
    }
}
