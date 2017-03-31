import java.util.Scanner;

public class Mahasiswa2{
	public static void main (String[] args){


		Scanner input = new Scanner(System.in);
		char matakuliah;
		int jumlahsks;

		System.out.print("Masukan matakuliah : ");
		matakuliah = input.next().charAt(0);

		System.out.print("Masukan jumlahsks : ");
		jumlahsks = input.nextInt();

		System.out.println("=====================");


		Mahasiswa mhs = new Mahasiswa("STTB");
		System.out.println(mhs.nama);
		System.out.println(matakuliah);
		System.out.println(jumlahsks);

	}
}