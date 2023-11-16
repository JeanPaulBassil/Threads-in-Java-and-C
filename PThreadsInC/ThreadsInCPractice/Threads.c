#include<pthread.h>
#include<unistd.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct {
    int upper;
    int lower;
} BOUNDS;
int sum;
void* runner(void *param);

int main(int argc, char *argv[]){
    if(argc != 3){
        perror("Usage: ./Threads <Upper> <Lower>");
        exit(EXIT_FAILURE);
    }

    BOUNDS bounds;
    bounds.upper = atoi(argv[1]);
    bounds.lower = atoi(argv[2]);

    pthread_t tid;
    pthread_attr_t attr;

    pthread_attr_init(&attr);
    pthread_create(&tid, &attr, runner, &bounds);

    pthread_join(tid, NULL);

    printf("Sum: %d.\n", sum);
    
    return 0;
}

void * runner(void * param){
    BOUNDS * bound = (BOUNDS *) param;
    sum = 0; 
    for(int i = bound->lower; i <= bound->upper; i++){
        sum += i;
    }

    pthread_exit(0);
}