package SortingAlgorithms;

public class Heapsort {

    public static void heapsort(int[] array) {
        int n = array.length;

        // Construção do heap máximo
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extração dos elementos do heap e ordenação
        for (int i = n - 1; i >= 0; i--) {
            // Mover o root (máximo) para o final
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Chama heapify no heap reduzido
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Se o filho à esquerda for maior que o pai
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // Se o filho à direita for maior que o maior atual
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // Se o maior não for o pai, troque-os e continue a heapify
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }
}
