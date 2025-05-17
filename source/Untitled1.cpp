#include <stdio.h>
#define inputfile "C:\\test.txt"
#define MAX 100

typedef struct GRAPH {
    int n;
    int a[MAX][MAX];
} DOTHI;

int docMaTranKe(const char tenFile[], DOTHI* g) {
    FILE* f;
    f = fopen(tenFile, "rt");
    if (f == NULL) {
        printf("Khong mo duoc file\n");
        return 0;
    }
    
    fscanf(f, "%d", &g->n);
    
    for (int i = 0; i < g->n; i++) {
        for (int j = 0; j < g->n; j++) {
            fscanf(f, "%d", &g->a[i][j]);
        }
    }
    fclose(f);
    return 1;
}

void xuatMaTranKe(DOTHI g) {
    printf("So dinh cua do thi la: %d\n", g.n);
    printf("Ma tran ke cua do thi la : \n");
    for (int i = 0; i < g.n; i++) {
        for (int j = 0; j < g.n; j++) {
            printf("%4d ", g.a[i][j]);
        }
        printf("\n");
    }
}

int kiemTraMaTranKeHopLe(DOTHI g) {
    for (int i = 0; i < g.n; i++) {
        for (int j = 0; j < g.n; j++) {
            if (g.a[i][j] != g.a[j][i]) {
                return 0;
            }
        }
    }
    return 1;
}

int main() {
    DOTHI g;
    if (docMaTranKe(inputfile, &g) == 1) {
        printf("Doc thong tin do thi tu file thanh cong.\n\n");
        xuatMaTranKe(g);
        printf("Do thi co ma tran ke: %s\n",
            kiemTraMaTranKeHopLe(g) == 1 ? "hople" : "khong hop le");
        printf("Do thi thuoc dang: %s\n",
            kiemTraMaTranKeHopLe(g) == 1 ? "vo huong" : "co huong");
    }    
    return 0;
}

