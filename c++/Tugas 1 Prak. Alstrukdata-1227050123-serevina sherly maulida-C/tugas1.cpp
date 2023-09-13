#include <iostream>

using namespace std;

int main(){
	string keterangan,nama;
	int nilai;
	cout<<"nama : ";
	cin>>nama;
	cout << "Masukan Nilai : ";
	cin>>nilai;
	if (nilai >= 60){
		keterangan = "lulus";
	}else{
		keterangan ="tidak lulus";
	}
	cout<<"nama : "<<nama;
	cout << "Nilai Anda : "<<keterangan;
	return 0;
}
