#include <stdio.h>
#include <stdlib.h>


int main() {
    FILE *inputFile, *outputFile;
    int n, i, j;
    int **adjacencyMatrix;
    int *degree;

    // M? file d?u vào d? d?c
    inputFile = fopen("C:\\Users\\Administrator\\Desktop\\in\\BacDoThiVoHuong.INP.txt", "r");
    if (inputFile == NULL) {
        printf("Khong the mo file BacDoThiVoHuong.INP\n");
        return 1;
    }

    // Ð?c s? lu?ng d?nh c?a d? th?
    if (fscanf(inputFile, "%d", &n) != 1) {
        printf("Loi khi doc so luong dinh\n");
        fclose(inputFile);
        return 1;
    }

    // C?p phát b? nh? cho ma tr?n k?
    adjacencyMatrix = (int **)malloc(n * sizeof(int *));
    if (adjacencyMatrix == NULL) {
        printf("Khong the cap phat bo nho cho ma tran ke\n");
        fclose(inputFile);
        return 1;
    }
    for (i = 0; i < n; i++) {
        adjacencyMatrix[i] = (int *)malloc(n * sizeof(int));
        if (adjacencyMatrix[i] == NULL) {
            printf("Khong the cap phat bo nho cho ma tran ke\n");
            for (j = 0; j < i; j++) {
                free(adjacencyMatrix[j]);
            }
            free(adjacencyMatrix);
            fclose(inputFile);
            return 1;
        }
    }

    // Ð?c ma tr?n k? t? file
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            if (fscanf(inputFile, "%d", &adjacencyMatrix[i][j]) != 1) {
                printf("Loi khi doc ma tran ke\n");
                for (int row = 0; row < n; row++) {
                    free(adjacencyMatrix[row]);
                }
                free(adjacencyMatrix);
                fclose(inputFile);
                return 1;
            }
        }
    }

    // Ðóng file d?u vào
    fclose(inputFile);

    // Tính b?c c?a t?ng d?nh
    degree = (int *)malloc(n * sizeof(int));
    if (degree == NULL) {
        printf("Khong the cap phat bo nho cho mang bac\n");
        for (i = 0; i < n; i++) {
            free(adjacencyMatrix[i]);
        }
        free(adjacencyMatrix);
        return 1;
    }
    for (i = 0; i < n; i++) {
        degree[i] = 0;
        for (j = 0; j < n; j++) {
            if (adjacencyMatrix[i][j] == 1) {
                degree[i]++;
            }
        }
    }

    // M? file d?u ra d? ghi
    outputFile = fopen("C:\\Users\\Administrator\\Desktop\\out\\BacDoThiVoHuong.OUT.txt", "w");
    if (outputFile == NULL) {
        printf("Khong the mo file BacDoThiVoHuong.OUT\n");
        for (i = 0; i < n; i++) {
            free(adjacencyMatrix[i]);
        }
        free(adjacencyMatrix);
        free(degree);
        return 1;
    }

    // Ghi s? lu?ng d?nh vào file d?u ra
    fprintf(outputFile, "%d\n", n);

    // Ghi b?c c?a t?ng d?nh vào file d?u ra
    for (i = 0; i < n; i++) {
        fprintf(outputFile, "%d", degree[i]);
        if (i < n - 1) {
            fprintf(outputFile, " ");
        }
    }
    fprintf(outputFile, "\n");

    // Ðóng file d?u ra
    fclose(outputFile);

    // Gi?i phóng b? nh?
    for (i = 0; i < n; i++) {
        free(adjacencyMatrix[i]);
    }
    free(adjacencyMatrix);
    free(degree);

    return 0;
}
