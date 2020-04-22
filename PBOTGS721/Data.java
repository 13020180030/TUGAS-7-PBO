/* 	Nur Ainun Zulkarnain
	130 2018 0030
*/

//nomor 7
//Program inheritance interface
public class Data implements MataKuliah{

	@Override
	public void namaMhs() {
		System.out.println("Nama Mahasiswa = Vira");
		
	}

	@Override
	public String stb() {
		return "13020180073";
	}
	
	@Override
	public String mk() {
		return "Pemrograman Berorientasi Objek";
	}
	
}