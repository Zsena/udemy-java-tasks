package practice;

class Copying {

    static int[] copyOfArray(int[] array, int[] array2) {

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
            array2[i] = Math.abs(array[i]);
            System.out.print(array2[i]);
        }
        return array2;
    }
}

