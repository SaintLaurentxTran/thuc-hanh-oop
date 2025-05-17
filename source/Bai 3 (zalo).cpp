#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAXN 100005

typedef struct Node {
    int vertex;
    struct Node* next;
} Node;

Node* adj[MAXN];  // Danh sách k?
int bac[MAXN];    // M?ng luu b?c c?a t?ng d?nh

Node* createNode(int v) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->vertex = v;
    newNode->next = NULL;
    return newNode;
}

void addEdge(int u, int v) {
    Node* newNode = createNode(v);
    newNode->next = adj[u];
    adj[u] = newNode;
}

int main() {
    FILE *fin = fopen("C:\\Users\\Administrator\\Desktop\\in\\DanhSachKe.INP.txt", "r");
    FILE *fout = fopen("C:\\Users\\Administrator\\Desktop\\out\\DanhSachKe.OUT.txt", "w");
    if (!fin || !fout) {
        printf("Khong the mo file.\n");
        return 1;
    }

    int n;
    fscanf(fin, "%d\n", &n);

    for (int i = 1; i <= n; i++) {
        adj[i] = NULL;
        bac[i] = 0;
    }

    char line[500000];
    for (int i = 1; i <= n; i++) {
        if (fgets(line, sizeof(line), fin) == NULL) break;

        int len = strlen(line);
        if (len > 0 && line[len - 1] == '\n') line[len - 1] = '\0';

        if (strlen(line) == 0) continue;

        char* token = strtok(line, " ");
        while (token != NULL) {
            int v = atoi(token);
            addEdge(i, v);
            addEdge(v, i);
            token = strtok(NULL, " ");
        }
    }

    for (int i = 1; i <= n; i++) {
        int count = 0;
        Node* p = adj[i];
        while (p != NULL) {
            count++;
            p = p->next;
        }
        bac[i] = count;
    }

    // Xu?t file theo d?nh d?ng yêu c?u
    fprintf(fout, "%d\n", n);
    for (int i = 1; i <= n; i++) {
        fprintf(fout, "%d", bac[i]);
        if (i != n) fprintf(fout, " ");
    }
    fprintf(fout, "\n");

    for (int i = 1; i <= n; i++) {
        Node* p = adj[i];
        while (p != NULL) {
            Node* temp = p;
            p = p->next;
            free(temp);
        }
    }
}

