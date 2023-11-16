#include<pthread.h>
#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>

int sum;
void* runner(void *param);

int main(int argc, char *argv[]){
    pthread_t tid;
    pthread_attr_t attr;

    pthread_attr_init(&attr);

    int n = 20;

    pthread_create(&tid, &attr, runner, &n);

    pthread_join(tid, NULL);

    printf("Sum Thread 1 = %d.\n", sum);
    return 0;
}

void * runner(void * param){
    int * upper = (int *) param;
    sum = 0;
    for(int i = 0; i <= *upper; i++)
        sum += i;

    pthread_exit(0);
}