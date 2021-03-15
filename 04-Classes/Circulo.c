#include<stdio.h>

typedef struct{
  int x, y;
  int w, h;
}Circulo;

void print(Circulo* c){
  printf("Circulo de tamanho (%d, %d) na posicao (%d, %d). \n",
        c-> w, c->h, c->x, c->y);
}

void main(void){
  Circulo c1 = {5, 5, 15, 15};
  print(&c1);
}
