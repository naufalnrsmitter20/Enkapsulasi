package OOP.tugasEnkapsulasi;

public class testsiswa {
    public static void main(String[] args) {
        // TODO code application logic here
    EncapSiswa siswa = new EncapSiswa();
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
    
        System.out.println("nama: "+siswa.getName()
        + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()
        + " tahun");
    }

}
