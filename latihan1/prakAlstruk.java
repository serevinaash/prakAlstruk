class Tanggal {int hari,bulan,tahun;}
class prakAlstruk{public static void main(String[]args){
	Tanggal t1 = new Tanggal();
	t1.hari = 2;
	t1.bulan = 10;
	t1.tahun = 2013;
	Tanggal t2 = new Tanggal();
	t2.hari = 7;
System.out.println("waktu sebelumnya : "+t1.hari+"-"+t1.bulan+"-"+t1.tahun);
System.out.println("sekarang : "+t2.hari+"-"+t2.bulan+"-"+t2.tahun);}
}