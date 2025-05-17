#include <stdio.h>
#include <stdlib.h>

int main() {
    FILE *tep_dau_vao, *tep_dau_ra;
    int n, i, j;
    int **ma_tran_ke;
    int *bac_vao;
    int *bac_ra;

    // M? t?p d?u vào d? d?c
    tep_dau_vao = fopen("C:\\Users\\Administrator\\Desktop\\in\\BacVaoRa.INP.txt", "r");
    if (tep_dau_vao == NULL) {
        printf("Khong the mo tep BacVaoRa.INP\n");
        return 1;
    }

    // Ð?c s? lu?ng d?nh c?a d? th?
    if (fscanf(tep_dau_vao, "%d", &n) != 1) {
        printf("Loi khi doc so luong dinh\n");
        fclose(tep_dau_vao);
        return 1;
    }

    // C?p phát b? nh? cho ma tr?n k?
    ma_tran_ke = (int **)malloc(n * sizeof(int *));
    if (ma_tran_ke == NULL) {
        printf("Khong the cap phat bo nho cho ma tran ke\n");
        fclose(tep_dau_vao);
        return 1;
    }
    for (i = 0; i < n; i++) {
        ma_tran_ke[i] = (int *)malloc(n * sizeof(int));
        if (ma_tran_ke[i] == NULL) {
            printf("Khong the cap phat bo nho cho ma tran ke\n");
            for (j = 0; j < i; j++) {
                free(ma_tran_ke[j]);
            }
            free(ma_tran_ke);
            fclose(tep_dau_vao);
            return 1;
        }
    }

    // Ð?c ma tr?n k? t? t?p
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            if (fscanf(tep_dau_vao, "%d", &ma_tran_ke[i][j]) != 1) {
                printf("Loi khi doc ma tran ke\n");
                for (int hang = 0; hang < n; hang++) {
                    free(ma_tran_ke[hang]);
                }
                free(ma_tran_ke);
                fclose(tep_dau_vao);
                return 1;
            }
        }
    }

    // Ðóng t?p d?u vào
    fclose(tep_dau_vao);

    // Tính b?c vào và b?c ra c?a t?ng d?nh
    bac_vao = (int *)malloc(n * sizeof(int));
    bac_ra = (int *)malloc(n * sizeof(int));
    if (bac_vao == NULL || bac_ra == NULL) {
        printf("Khong the cap phat bo nho cho mang bac\n");
        for (i = 0; i < n; i++) {
            free(ma_tran_ke[i]);
        }
        free(ma_tran_ke);
        free(bac_vao);
        free(bac_ra);
        return 1;
    }

    for (i = 0; i < n; i++) {
        bac_vao[i] = 0;
        bac_ra[i] = 0;
        for (j = 0; j < n; j++) {
            // B?c ra c?a d?nh i là s? lu?ng c?nh di ra t? i (s? lu?ng 1 trên hàng i)
            if (ma_tran_ke[i][j] == 1) {
                bac_ra[i]++;
            }
            // B?c vào c?a d?nh i là s? lu?ng c?nh di vào i (s? lu?ng 1 trên c?t i)
            if (ma_tran_ke[j][i] == 1) {
                bac_vao[i]++;
            }
        }
    }

    // M? t?p d?u ra d? ghi
    tep_dau_ra = fopen("C:\\Users\\Administrator\\Desktop\\out\\BacVaoRa.OUT.txt", "w");
    if (tep_dau_ra == NULL) {
        printf("Khong the mo tep BacVaoRa.OUT\n");
        for (i = 0; i < n; i++) {
            free(ma_tran_ke[i]);
        }
        free(ma_tran_ke);
        free(bac_vao);
        free(bac_ra);
        return 1;
    }

    // Ghi s? lu?ng d?nh vào t?p d?u ra
    fprintf(tep_dau_ra, "%d\n", n);

    // Ghi b?c vào và b?c ra c?a t?ng d?nh vào t?p d?u ra
    for (i = 0; i < n; i++) {
        fprintf(tep_dau_ra, "%d %d\n", bac_vao[i], bac_ra[i]);
    }

    // Ðóng t?p d?u ra
    fclose(tep_dau_ra);

    // Gi?i phóng b? nh?
    for (i = 0; i < n; i++) {
        free(ma_tran_ke[i]);
    }
    free(ma_tran_ke);
    free(bac_vao);
    free(bac_ra);

    return 0;
}
