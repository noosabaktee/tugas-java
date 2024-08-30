public class Nilai {
  String nim;
  String nama;
  double absen, tugas, uts, uas, akhir;
  
  public void Nilai(){
    System.out.println("NIM : " + nim);
    System.out.println("Nama : "+ nama);
    akhir = absen*0.1+tugas*0.2+uts*0.3+uas*0.4;
  }
  
  void CetakNilai(){
    System.out.println("Nilai Absen [10%] : "+ absen*0.1);
    System.out.println("Nilai Tugas [20%]: "+ tugas*0.2);
    System.out.println("Nilai UTS [30%] : "+ uts*0.3);
    System.out.println("Nilai UAS [40%] : " + uas*0.4);
    System.out.println("Nilai Akhir : "+ akhir);
  }

}