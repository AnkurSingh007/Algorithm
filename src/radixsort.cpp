#include<iostream>
#include<math.h>
using namespace std;


int getIntAtPos(int num, int pos){
	if(pos == 0)return num%10;
    int divisor = 1;
	for(int i = 0; i <pos; i++){
		divisor *= 10;
	}
	if(pos == 0)return num %10;          
	else{
		return ((num - (num % divisor) )/ divisor)%10;
	}
}


void radixsort(int *arr, int size, int numdig){
	int arr2[size];
	int digits[size];
	int k = 0;
	for(int i = 0; i< size; i++){
		arr2[i] = 0;
		digits[0] = 0;
	}
	for(int i = 0; i < numdig; i++){
		int temp[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		//Getting digits 
		for(int k = 0;  k < size; k++){
			digits[k] = getIntAtPos(arr[k], i);
		}
		//printing digits
		for(int k = 0; k < size; k++){
			cout<<digits[k]<<"\t";
		}
		cout<<endl;
		//Historgram creation
		for(int j = 0; j < size; j++){
			if(digits[j] != 9){
				for(int k = digits[j] + 1; k < 10; k++){
				temp[k]++;
				}
			}
		}
		//printing histogram
		cout<<"Histogram is"<<endl;
		for(int k = 0; k < 10; k++){
			cout<<temp[k]<<"\t";
		}
			cout<<endl;
		//sorting based on position of digit
		for(int j = 0; j < size; j++){
			if(digits[j] != 9){
				if(temp[digits[j]] != temp[digits[j] + 1]){
					arr2[temp[digits[j]]++] = arr[j];
				}
			}
			else if(temp[9] <= size - 1){
				arr2[temp[9]++] = arr[j];
			}
		}
		cout<<endl;
		//priting array
		cout<<endl;
		for(int k = 0; k < size; k++){
			cout<<arr2[k]<<"\t";
		}
		cout<<endl;
		for(int j = 0; j < size; j++){
			arr[j] = arr2[j];
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
	radixsort(arr, num, maxNumofDigits);
	cout<<"----------------------------------------------"<<endl;
	cout<<"sorted array is"<<endl;
	for(int i = 0; i < num; i++){
		cout<<arr[i]<<endl;
	}
	return 0;
}

