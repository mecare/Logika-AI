import java.util.Scanner;
public class AI {
    
    public static void main(String[] args) {
        AI call=new AI();
        call.Soal();
    }
        public void Soal() {
        AI call=new AI();
        Scanner baca = new Scanner(System.in);
        System.out.println("============================================================="
                + "\nTerdapat 4 Objek : SERIGALA, KAMBING,SAYURAN,PETANI"
                + "\nYang harus di sebrangkan Melewati JEMBATAN");
        System.out.println("Syarat:"
                    + "\n1.SERIGALA Tidak boleh dengan KAMBING"
                    + "\n2.KAMBING Tidak Boleh Dengan SAYURAN");
            System.out.println("============================================================="
                    + "\n\t\t\tKEMUNGKINAN PROSES"
                    + "\n=============================================================");
        System.out.println("1.Kambing Meyebrang");
        System.out.println("2.Sayuran Menyebrang");
        System.out.println("3.Serigala Menyebrang");
        System.out.println("4.Kambing Kembali");
        System.out.println("5.Sayuran Kembali");
        System.out.println("6.Serigala Kembali");
        System.out.println("7.Perahu Kembali");
        System.out.println("=============================================================");
        call.Proses_Penyebrangan();
        }
        public void Proses_Penyebrangan(){
        AI call=new AI();
        int object1,object2,object3,object4,object5,object6,object7;
        Scanner input=new Scanner(System.in);
            System.out.print("Masukan Proses 1: ");
            object1=input.nextInt();
            if (object1 == 1) {
            System.out.print("SIP.. Proses 2: ");
            object2 = input.nextInt();
            if (object2 == 7) {
                System.out.print("SIP.. Proses 3: ");
                object3 = input.nextInt();
                if (object3 == 2) {
                    System.out.print("SIP.. Proses 4: ");
                    object4 = input.nextInt();
                    if (object4 == 4) {
                        System.out.print("SIP.. Proses 5: ");
                        object5 = input.nextInt();
                        if (object5 == 3) {
                            System.out.print("SIP.. Proses 6: ");
                            object6 = input.nextInt();
                            if (object6 == 7) {
                                System.out.print("SIP.. Proses 7: ");
                                object7 = input.nextInt();
                                if (object7 == 1) {
                                    System.out.println("=============================================================");
                                    System.out.println("PROSES Correct");
                                    System.out.println("============================================================="
                                            + "\nUrutan Proses"
                                            + "\n1."+object1+ " "
                                                    + "\n2."+object2+" "
                                                            + "\n3."+object3+" "
                                            + "\n4."+object4+" "
                                                    + "\n5."+object5+" "
                                                            + "\n6."+object6+" "
                                                                    + "\n7."+object7);
                                } else {
        System.out.println("Proses Tahapan Yang Anda Masukan Salah");
        System.out.println("Silahkan di ulangi");
        System.out.println("=============================================================");
        call.Proses_Penyebrangan();
        
                                }
                            } else {
        System.out.println("Proses Tahapan Yang Anda Masukan Salah");
        System.out.println("Silahkan di ulangi");
        System.out.println("=============================================================");
        call.Proses_Penyebrangan();
        
                               
                            }
                        } else {
        System.out.println("Proses Tahapan Yang Anda Masukan Salah");
        System.out.println("Silahkan di ulangi");
        System.out.println("=============================================================");
        call.Proses_Penyebrangan();
        
                            
                        }
                    } else {
        System.out.println("Proses Tahapan Yang Anda Masukan Salah");
        System.out.println("Silahkan di ulangi");
        System.out.println("=============================================================");
        call.Proses_Penyebrangan();
        
                    }
                } else {
        System.out.println("Proses Tahapan Yang Anda Masukan Salah");
        System.out.println("Silahkan di ulangi");
        System.out.println("=============================================================");
        call.Proses_Penyebrangan();
        
                }
            } else {
        System.out.println("Proses Tahapan Yang Anda Masukan Salah");
        System.out.println("Silahkan di ulangi");
        System.out.println("=============================================================");
        call.Proses_Penyebrangan();
        
                
            }
        } else {
        System.out.println("Proses Tahapan Yang Anda Masukan Salah");
        System.out.println("Silahkan di ulangi");
        System.out.println("=============================================================");
        call.Proses_Penyebrangan();
        
            
        }
    }
                }