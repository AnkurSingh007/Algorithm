#include<iostream>
#include<math.h>
using namespace std;


int getIntAtPos(int num, int pos){
	if(pos == 0)return num%10;
    int divisor = 1;
	for(int i = 0; i < pos; i++){
		divisor *= 10;
	}
	if(pos == 0)return num %10;
	else{
		return (num - (num % divisor) )/ divisor;
	}
}


void countingsort(int *arr, int size, int pos){
	int temp[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int k = 0;
	for(int j = 0; j < 10; j++){
		for(int i = k; i < size; i++){
				if(getIntAtPos(arr[i], pos) == j){
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k++] = temp;
				}
	
		}

	}
	
}
	




int main(){
	cout<<"How many Numbers do you want to enter"<<endl;
	int num = 0;
	int max;//not initialised
	int maxNumofDigits = 0;
	cin>>num;
	int *arr = new int[num];
	cout<<"Enter the list of numbers"<<endl;
	for(int i = 0; i <num; i++){
		cin>>arr[i];
		if(i == 0)max = arr[i];
		else if(max < arr[i]){
			max = arr[i];
		}
	}
	while(max != 0){
		max /= 10;
		maxNumofDigits += 1;
	}
	for(int i = 0; i < maxNumofDigits; ++i){
		countingsort(arr, num, i);
	}
	
	cout<<"----------------------------------------------"<<endl;
	cout<<"sorted array is"<<endl;
	for(int i = 0; i < num; i++){
		cout<<arr[i]<<endl;
	}
	return 0;
}

