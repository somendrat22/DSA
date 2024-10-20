#include <bits/stdc++.h>
using namespace std;

vector<int> SmallestGreaterElements(vector<int> arr) {

	unordered_map<int,int> mpp;

	int n = arr.size();

	int *temp = new int[n];

	for(int i=0; i<n; i++) 
		temp[i] = arr[i];
	
	for(int i=0; i<n-1; i++){
		for(int j=0; j<n-i-1; j++){
			if(arr[j] > arr[j+1]){
				swap(arr[j],arr[j+1]);
			}
		}
		// n-1-i index contains the correct position element
		if(n-i-1 == n-1)
			mpp[arr[n-i-1]] = (int)-1e7;
		else
			mpp[arr[n-i-1]] = arr[n-i];
	}
	
	mpp[arr[0]] = arr[1];

	vector<int> ans;
	
	for(int i=0; i<n; i++){
		ans.push_back(mpp[temp[i]]);
	}

	return ans;
}

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin>>arr[i];
    }
    vector<int> ans = SmallestGreaterElements(arr);

    for(int a : ans)
        cout<<a<<" ";
    return 0;
}
