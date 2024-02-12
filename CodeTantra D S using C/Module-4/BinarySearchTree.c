#include <stdio.h>
#include <stdlib.h>

struct node {
    int d;
    struct node *rl;
    struct node *ll;
};

typedef struct node* N;

N getnode() {
    N x;
    x = (N)malloc(sizeof(struct node));
    return x;
}

N insert(int i, N root) {
    N temp, prev, cur;
    temp = getnode();
    temp->d = i;
    temp->rl = NULL;
    temp->ll = NULL;

    if (root == NULL) {
        return temp;
    } else {
        prev = NULL;
        cur = root;
 while (cur != NULL) {
            prev = cur;
            if (i <= prev->d) {
                cur = cur->ll;
            } else {
                cur = cur->rl;
            }
        }
        if (i <= prev->d) {
            prev->ll = temp;
        } else {
            prev->rl = temp;
        }
        return root;
    }
}

void search(N root) {
    int k;
    N cur = root;
    printf("Search Node: ");
    scanf("%d", &k);
    while (cur != NULL) {
        if (k == cur->d) {
            printf("Node found\n");
            return;
        }
        if (k < cur->d) {
            cur = cur->ll;
        } else {
            cur = cur->rl;
        }
    }
    printf("Node not found\n");
}

N inorderpred(N root) {
    if (root == NULL || root->ll == NULL)
        return NULL;

    root = root->ll;
    while (root->rl != NULL) {
        root = root->rl;
    }
    return root;
}
N delete(N root, int i) {
    if (root == NULL) {
        return NULL;
    }
    if (i < root->d) {
        root->ll = delete(root->ll, i);
    } else if (i > root->d) {
        root->rl = delete(root->rl, i);
    } else {
        if (root->ll == NULL && root->rl == NULL) {
            free(root);
            return NULL;
        } else if (root->ll == NULL) {
            N temp = root->rl;
            free(root);
            return temp;
        } else if (root->rl == NULL) {
            N temp = root->ll;
            free(root);
            return temp;
        } else {
            N ipre = inorderpred(root);
            root->d = ipre->d;
            root->ll = delete(root->ll, ipre->d);
        }
    }
    return root;
}

void inorder(N root) {
    if (root == NULL) {
        return;    }
    inorder(root->ll);
    printf("%d ", root->d);
    inorder(root->rl);
}
void preorder(N root)
{
if(root==NULL)
{
printf("Tree is empty\n");
return;
}
    printf("%d ", root->d);
    inorder(root->ll);
    inorder(root->rl);
}
void postorder(N root)
{
if(root==NULL)
{
printf("Tree is empty\n");
return;
}
    inorder(root->ll);
    inorder(root->rl);
    printf("%d ", root->d);
}

int main() {
    N root = NULL;
    int ch, key;
  do {
        printf("1.Insert node\n2.Search for node\n3.Delete node\n4.Display tree\n5.Exit\n");
        printf("Enter choice: ");
        scanf("%d", &ch);
        switch (ch) {
            case 1:
                printf("Insert Node: ");
                scanf("%d", &key);
                root = insert(key, root);
                break;
            case 2:
                search(root);
                break;
            case 3:
                printf("Delete node: ");
                scanf("%d", &key);
                root = delete(root, key);
break;
            case 4:
                inorder(root);
                printf("\n");
                break;
            case 5:
                exit(0);
            default:
                printf("Invalid choice\n");
                break;
        }
    } while (ch != 5);

    return 0;
}
