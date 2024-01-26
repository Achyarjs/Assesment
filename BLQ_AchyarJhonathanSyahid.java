import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BLQ_AchyarJhonathanSyahid {
    public static void main(String[] args) throws ParseException {
        Soal soal = new Soal();

        // Input Nomor Soal
        // No4, No21, No22 belum
        soal.No4();
        }
}

class Soal {
    public void No1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang = ");
        int uang = scan.nextInt();

        //Kacamata : 500 600 700 800
        //Baju : 200 400 350
        //Sepatu : 400 350 200 300
        //Buku : 100 50 150

        System.out.print("Harga Kacamata = ");
        scan.nextLine();
        String[] kacamata = scan.nextLine().trim().split(" ");

        System.out.print("Harga Baju = ");
        String[] baju = scan.nextLine().trim().split(" ");

        System.out.print("Harga Sepatu = ");
        String[] sepatu = scan.nextLine().trim().split(" ");

        System.out.print("Harga Buku = ");
        String[] buku = scan.nextLine().trim().split(" ");


        int[] nKaca = new int[kacamata.length];
        for (int i = 0; i < kacamata.length; i++) {
            nKaca[i] = Integer.parseInt(kacamata[i]);
        }

        // Cetak Harga Kacamata
        // System.out.println("Harga Kacamata : "+ Arrays.toString(nKaca));

        int[] nBaju = new int[baju.length];
        for (int i = 0; i < baju.length; i++) {
            nBaju[i] = Integer.parseInt(baju[i]);
        }

        // Cetak Harga Baju
        // System.out.println("Harga Baju : "+ Arrays.toString(nBaju));

        int[] nSepatu = new int[sepatu.length];
        for (int i = 0; i < sepatu.length; i++) {
            nSepatu[i] = Integer.parseInt(sepatu[i]);
        }

        // Cetak Harga Sepatu
        // System.out.println("Harga Sepatu : "+ Arrays.toString(nSepatu));

        int[] nBuku = new int[buku.length];
        for (int i = 0; i < buku.length; i++) {
            nBuku[i] = Integer.parseInt(buku[i]);
        }

        // Cetak Harga Buku
        // System.out.println("Harga Buku : "+ Arrays.toString(nBuku));

        scan.close();

        int temp = 0;
        int max = 0;
        int Hkaca = 0;
        int Hbaju = 0;
        int Hsepatu = 0;
        int Hbuku = 0;

        for (int i = 0; i < kacamata.length; i++) {
            for (int j = 0; j < baju.length; j++) {
                for (int k = 0; k < sepatu.length; k++) {
                    for (int l = 0; l < buku.length; l++) {
                        temp = nKaca[i] + nBaju[j] + nSepatu[k] + nBuku[l];
                        if (temp >= max && temp <= uang) {
                            max = temp;
                            Hkaca = nKaca[i];
                            Hbaju = nBaju[j];
                            Hsepatu = nSepatu[k];
                            Hbuku = nBuku[l];
                        }
                    }
                }
            }
        }

        System.out.println("\nUang yang terpakai : " +max);
        System.out.println("\n===Harga Barang Yang Didapat===");
        System.out.println("Kacamata : "+Hkaca);
        System.out.println("Baju : "+Hbaju);
        System.out.println("Sepatu : "+Hsepatu);
        System.out.println("Buku : "+Hbuku);
    }

    public void No2() throws ParseException {
        long diff;
        int hPinjam = 0;
        int hA = 0;
        int hB = 0;
        int hC = 0;
        int hD = 0;
        int TotalDenda = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Batas Pinjam Buku A : ");
        int bA = scan.nextInt();

        System.out.print("Input Batas Pinjam Buku B : ");
        int bB = scan.nextInt();

        System.out.print("Input Batas Pinjam Buku C : ");
        int bC = scan.nextInt();

        System.out.print("Input Batas Pinjam Buku D : ");
        int bD = scan.nextInt();

        System.out.print("Input Tanggal Pinjam (dd-MM-yyyy) : ");
        String pinjam = scan.next().trim();

        System.out.print("Input Tanggal Kembali (dd-MM-yyyy) : ");
        String kembali = scan.next().trim();

        scan.close();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyy");
        Date akhir = formatter.parse(kembali);
        Date awal = formatter.parse(pinjam);

        //Mencari hari
        diff = (akhir.getTime() - awal.getTime())/86400000;
        hPinjam = (int) diff;
        System.out.println("Total rentang waktu : "+hPinjam);

        if (awal.getTime() > akhir.getTime()){
            System.out.println("\nHari pengembalian lebih kecil dari hari peminjaman.");
        } else {
            if (diff>0) {
                bA = (hPinjam - bA) * 100;
                if (bA > 0) {
                    System.out.println("\nTotal Denda Buku A : "+bA);
                    hA = bA;
                } else {
                    System.out.println("\nTotal Denda Buku A : 0");
                }
            }
            if (diff>0) {
                bB = (hPinjam - bB) * 100;
                if (bB > 0) {
                    System.out.println("\nTotal Denda Buku B : "+bB);
                    hB = bB;
                } else {
                    System.out.println("\nTotal Denda Buku B : 0");
                }
            }
            if (diff>0) {
                bC = (hPinjam - bC) * 100;
                if (bC > 0) {
                    System.out.println("\nTotal Denda Buku C : "+bC);
                    hC = bC;
                } else {
                    System.out.println("\nTotal Denda Buku C : 0");
                }
            }
            if (diff>0) {
                bD = (hPinjam - bD) * 100;
                if (bD > 0) {
                    System.out.println("\nTotal Denda Buku D : "+bD);
                    hD = bD;
                } else {
                    System.out.println("\nTotal Denda Buku D : 0");
                }
            }
        }
        TotalDenda = hA + hB + hC + hD;
        System.out.println("\nTotal Denda : "+TotalDenda);
        System.out.println();
    }

    public void No3() throws ParseException {
        long diff;
        int j = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masuk Parkir : ");
        String masuk = scan.next().trim();

        System.out.print("Keluar Parkir : ");
        String keluar = scan.next().trim();

        scan.close();

        //logic untuk menghitung denda jika ada

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");
        Date awal = formatter.parse(masuk);
        Date akhir = formatter.parse(keluar);

        // mencari total parkir dalam detik
        diff = (akhir.getTime() - awal.getTime())/1000;

            //mencari durasi lebih dari 24jam
            if (diff/86400 > 0){
                    do {
                        j = j + 15000;
                        diff = diff - 86400;
                        } while (diff >= 86400);

            } else {
            }
            
            if (diff > 0) {
                
                while (diff > 0 ){
                    if(diff > 28800) {
                        j = j + 8000;
                        diff = diff - 86400;
                    } else if (diff > 0 && diff <= 28800) {
                        j = j + 1000;
                        diff = diff - 3600;
                    }
                }

            }
            System.out.println("Total biaya parkir adalah : "+j);
    }

    public void No4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input n = ");
        Integer n = scan.nextInt();
        scan.close();

        int bil = 2;
        int output = 0;
        int x = 0;
        int i = 1;

        while (output < n) {

            while (x<=2) {
                if (bil % i == 0) {
                    x++;
                }
                i++;
            }

            if (x == 2) {
                System.out.print(bil + " ");
                output++;
            }
            x = 0;
            i = 1;
            bil++;
        }
    }

    public void No5() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = scan.nextInt();

        scan.close();

        int fib[] = new int[n];
        for(int i=0 ; i<n; i++) {
            if (i<2) {
                fib[i] = i;
            } else {
                fib[i] = fib[i-1] + fib[i-2];
            }
            System.out.print(fib[i]+" ");
        }
    }

    public void No6() {
        int i;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input sembarang kata/angka/karakter : ");
        String input = scan.nextLine().trim();

        scan.close();

        String rev="";
        int x = input.length();
        for(i=(x-1); i>=0; i--){
            rev = rev + input.charAt(i);
         }
         System.out.println("\nHasil Reverse : \n"+rev);

        if (input.equalsIgnoreCase(rev)) {
            System.out.println("\nInputan Tersebut Palindrome");
        } else {
            System.out.println("\nInputan Tersebut Bukan Palindrome");
        }
    }

    public void No7() {
        int jmlarray, x;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input Angka = ");
        String[] input = scan.nextLine().split(" ");
        scan.close();

        jmlarray = input.length;
        int[] angka = new int[jmlarray];

        for (int i = 0; i < jmlarray; i++) {
            angka[i] = Integer.parseInt(input[i]);
        }

        // Ascending
        for (int i = 0; i < jmlarray; i++) {
            for (int j = i + 1; j < jmlarray; j++) {
                if (angka[i] > angka[j]) {
                    x = angka[i];
                    angka[i] = angka[j];
                    angka[j] = x;
                }
            }
        }

        int totalAngka = 0;
        System.out.print("Urut dari yang terkecil : ");
        for (int i = 0; i < jmlarray; i++) {
            System.out.print(angka[i] + " ");
            totalAngka++;
        }


        System.out.println("\n");

        System.out.println("Total angka = "+totalAngka);

        // Mean
        double hitungMean = 0;
        for (int c = 0; c < jmlarray; c++) {
            hitungMean += angka[c];
        }
        hitungMean = hitungMean / jmlarray;
        System.out.println("Mean = " + hitungMean);

        // Median
        double hitungMedian = 0;
        double xX = 0;
        if (jmlarray % 2 == 0) {
            xX += ((angka[(jmlarray / 2) - 1] + angka[(jmlarray / 2)]));
            hitungMedian = xX / 2;
            System.out.println("Median = " + hitungMedian);
        } else {
            System.out.println("Median = " + angka[jmlarray / 2]);
        }

        // Modus
        int jmlh = 0;
        int max = 0;
        int angkaModus = 0;
        for (int c = 0; c < jmlarray; c++) {
            for (int d = 0; d < jmlarray; d++) {
                if (angka[c] == angka[d]) {
                    jmlh++;
                }
            }
            if (jmlh > max) {
                max = jmlh;
                angkaModus = angka[c];
            }
            jmlh = 0;
        }
        System.out.println("Modus = " + angkaModus + " Muncul Sebanyak " + max + " Kali");
    }

    public void No8() {
        /*
        Tentukan nilai minimal dan maksimal dari penjumlahan 4 komponen deret ini
        1 2 4 7 8 6 9
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Input deret bilangan = ");
        String[] stringDeret = scan.nextLine().trim().split(" ");

        scan.close();

        int jmlarray, x;

        jmlarray = stringDeret.length;
        int[] angka = new int[jmlarray];
        for (int i = 0; i < jmlarray; i++) {
            angka[i] = Integer.parseInt(stringDeret[i]);
        }

        // Ascending
        for (int i = 0; i < jmlarray; i++) {
            for (int j = i + 1; j < jmlarray; j++) {
                if (angka[i] > angka[j]) {
                    x = angka[i];
                    angka[i] = angka[j];
                    angka[j] = x;
                }
            }
        }

        int totalAngka = 0;
        System.out.print("\nUrut dari yang terkecil : ");
        for (int i = 0; i < jmlarray; i++) {
            System.out.print(angka[i] + " ");
            totalAngka++;
        }
        
        System.out.println("\nTotal angka = "+totalAngka);

        // Min
        int min = 0;
        System.out.print("Hasil Min = ");
        for (int i = 0; i < jmlarray - 3; i++) {
            min = min + angka[i];
        }

        System.out.println(min);

        // Max
        int max = 0;
        System.out.print("Hasil Max = ");
        for (int i = 3; i < jmlarray; i++) {
            max = max + angka[i];
        }

        System.out.print(max);
    }

    public void No9() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input n = ");
        Integer n = scan.nextInt();
        scan.close();
        
        int i, x = 0;
        for (i=1; i<=n; i++){
            x = x + n;
            System.out.print(x+" ");
        }
        System.out.println("");
    }

    public void No10() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input kalimat = ");
            String input = scan.nextLine().trim();
            scan.close();

            String[] arr = input.split(" ");
    
            String hasil = "";
    
            for (int i = 0; i < arr.length; i++) {
                hasil = hasil + arr[i].charAt(0) + "***"
                        + arr[i].charAt(arr[i].length() - 1) + " ";
            }
    
            hasil.trim();
            System.out.println(hasil);
        
    }

    public void No11() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input String = ");
        String input = scan.nextLine().trim();
        scan.close();

        // Input Afrika atau Jeruk

        String hasil = "";
        String bintang = "";
        for (int i = 0; i < input.length() / 2; i++) {
            bintang += "*";
        }

        for (int i = input.length() - 1; i >= 0; i--) {
            hasil = bintang + input.charAt(i) + bintang;
            System.out.println(hasil);
        }
    }

    public void No12() {
        int jmlarray, x;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input Angka = ");
        String[] input = scan.nextLine().split(" ");
        scan.close();

        jmlarray = input.length;
        int[] angka = new int[jmlarray];

        for (int i = 0; i < jmlarray; i++) {
            angka[i] = Integer.parseInt(input[i]);
        }

        // Ascending
        for (int i = 0; i < jmlarray; i++) {
            for (int j = i + 1; j < jmlarray; j++) {
                if (angka[i] > angka[j]) {
                    x = angka[i];
                    angka[i] = angka[j];
                    angka[j] = x;
                }
            }
        }
        
        System.out.print("Urut dari yang terkecil : ");
        for (int i = 0; i < jmlarray; i++) {
            System.out.print(angka[i] + " ");
        }
    }

    public void No13() throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Jam (hh:mm) AM/PM = ");
        String waktu = scan.nextLine().trim();
        scan.close();

        // konversi ke date
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
        Date date = formatter.parse(waktu);

        int jam = Integer.parseInt(new SimpleDateFormat("h").format(date));
        int menit = Integer.parseInt(new SimpleDateFormat("m").format(date));

        // Logic mencari sudut terkecil yang dibentuk jarum jam

        double sudut = 0;
        double sudutAwal = 0;
        double menitTemp = menit;
        double jamTemp = jam;

        // sudut perjam
        jam = jam * 30;
        // sudut permenit
        menit = menit * 6;
        // selisih sudut
        sudutAwal = jam - menit;
        sudut = Math.abs(sudutAwal);

        //Logic untuk menentukan pergeseran jarum jam
        if (jamTemp > 0 && jamTemp < 6) {
            menitTemp = menitTemp / 2;
            sudut = sudut - menitTemp;
        } else if (jamTemp >= 6) {
            menitTemp = menitTemp / 2;
            sudut = sudut + menitTemp;
        }

        if (sudut > 180) {
            sudut = 360 - sudut;
        }

        System.out.println(Math.abs(sudut));
    }

    public void No14() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Deret = ");
        String[] deret = scan.nextLine().trim().split(" ");

        System.out.print("Input N Rotasi = ");
        int n = scan.nextInt();
        scan.close();

        // Logic untuk rotasi ke kiri deret sebanak N
        // 3 9 0 7 1 2 4
        // N = 3 → 7 1 2 4 3 9 0
        // N = 1 → 9 0 7 1 2 4 1

        int jmlarray = deret.length;
        int[] angka = new int[jmlarray];

        for (int i = 0; i < jmlarray; i++) {
            angka[i] = Integer.parseInt(deret[i]);
        }

        // Rotasi Ke Kiri
        int x, i, j;
        for (i = 0; i < n; i++) {
            x = angka[0];
            for (j = 0; j < jmlarray - 1; j++) {
                angka[j] = angka[j + 1];
            }
            angka[j] = x;

            System.out.print("Rotasi Ke - " + (i+1) + " : ");
            for (int c = 0; c < jmlarray; c++) {
                System.out.print(angka[c] + " ");
            }
            System.out.println();
        }
    }

    public void No15() throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Jam (hh:mm:ss) AM/PM = ");
        String waktu = scan.nextLine().trim();
        scan.close();

        // Input AM/PM
        // Input 03:40:44 PM
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
        Date date = formatter.parse(waktu);

        // Diubah ke 24H
        String hasil =
        new SimpleDateFormat("HH:mm:ss").format(date);
        
        System.out.println("\nHasil = "+hasil);
    }

    public void No16() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Harga Makanan (pisah spasi) = ");
        String[] harga = scan.nextLine().trim().split(" ");
        scan.close();

        // 42 50 30 70 30
        // logic untuk menghitung harga yang dibagi rata
        // 1 orang alergi ikan == menu ke 0

        int jmlarray;

        jmlarray = harga.length;
        int[] hargaInt = new int[jmlarray];
        for (int i = 0; i < jmlarray; i++) {
            hargaInt[i] = Integer.parseInt(harga[i]);
        }

        double menulain = 0;
        double menu1 = 0;

        for (int i = 0; i < jmlarray; i++) {
            if (i == 0) {
                menu1 = menu1 + hargaInt[i];
            } else {
                menulain += hargaInt[i];
            }
        }

        System.out.println("Harga = " + (menu1 + menulain));

        double hargaPajakSatu;
        double hargaPajakLain;
        hargaPajakSatu = menu1 + (menu1 * 0.15);
        hargaPajakLain = menulain + (menulain * 0.15);
        System.out.println("Harga setelah pajak = " + (hargaPajakLain + hargaPajakSatu));

        System.out.println("Total Harga Orang Alergi : "+ (hargaPajakLain/4));
        System.out.println("Total Harga 3 Orang Lainnya : "+(((hargaPajakSatu)/3)+(hargaPajakLain/4))+"/orang");
    }

    public void No17() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Perjalanan Hattori = ");
        String[] perjalanan = scan.nextLine().trim().split(" ");
        scan.close();

        // logic menghitung berapa gunung dan lembah yang dilewati hattori
        // N N T N N N T T T T T N T T T N T N

        int jalan = 0, gunung = 0, lembah = 0;
        for (int i = 0; i < perjalanan.length; i++) {
            if (perjalanan[i].equals("N")) {
                jalan = jalan + 1;
                if (jalan == 0){
                    lembah++;
                }
            } else if (perjalanan[i].equals("T")) {
                jalan = jalan - 1;
                if (jalan == 0){
                    gunung++;
                }
            }
            // System.out.println("Jalan : "+jalan);
        }
        System.out.println("Gunung = "+gunung+" | Lembah = "+lembah);
    }

    public void No18() throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Jam Makan (HH) = ");
        String[] jam = scan.nextLine().trim().split(" ");

        System.out.print("Input Kalori = ");
        String[] cal = scan.nextLine().trim().split(" ");
        
        System.out.print("Input Waktu Olahraga (HH) = ");
        int jamOL = scan.nextInt();
        scan.close();
        

        int jmlarray1, jmlarray2;
        int selisih_jam = 0, temp_jam = 0;
        int total_cal = 0, temp_cal = 0;

        jmlarray1 = jam.length;
        int[] jamInt = new int[jmlarray1];
        for (int i = 0; i < jmlarray1; i++) {
            jamInt[i] = Integer.parseInt(jam[i]);
        }

        jmlarray2 = cal.length;
        int[] calInt = new int[jmlarray2];
        for (int j = 0; j < jmlarray2; j++) {
            calInt[j] = Integer.parseInt(cal[j]);
        }

        for (int i = 0; i < jmlarray1; i++) {
            temp_jam = jamOL - jamInt[i];
            selisih_jam = selisih_jam + temp_jam;
        }

        for (int j = 0; j < jmlarray2; j++) {
            total_cal = total_cal + calInt[j];
        }

        System.out.println("\nTotal Selisih Jam : "+selisih_jam);
        System.out.println("Total Kalori : "+total_cal);

        double total_waktuOL = 0;
        total_waktuOL = 0.1 * total_cal * selisih_jam;
        System.out.println("\nTotal Waktu Olahraga : "+total_waktuOL+" Menit");

        int cc_air = 0;
        while (total_waktuOL > 30) {
            cc_air = cc_air + 100;
            total_waktuOL = total_waktuOL - 30;
            // System.out.println("sisa waktu olahraga : "+total_waktuOL);
        }
        System.out.println("Total Air yang diminum Donna Sepanjang Berolahraga : "+cc_air+" CC");
        
        cc_air = cc_air + 500;
        System.out.println("Total Air yang Diminum : "+cc_air+" CC");
    }

    public void No19() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input kalimat : ");
        String kalimat = scan.nextLine().trim().toLowerCase();

        scan.close();

        final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String hasil = null;

        int count = 0;

        for (int i = 0; i < alphabet.length; i++) {
            if (kalimat.contains(String.valueOf(alphabet[i]))) {
                hasil = "Pangrams";
                count++;
            } else {
                hasil = "Not Pangrams";
                break;
            }
        }
        System.out.println(count);
        System.out.println(hasil);
        
    }

    public void No20() {
        Scanner scan = new Scanner(System.in);

        // Batu
        // Gunting
        // Kertas
        System.out.print("Score Awal Player A = ");
        int scoreA = scan.nextInt();

        System.out.print("Score Awal Player B = ");
        int scoreB = scan.nextInt();

        while (scoreA >= 0 && scoreB >= 0) {
            System.out.print("Suit Player A = ");
            String PlayerA = scan.next().toUpperCase();
            System.out.print("Suit Player B = ");
            String PlayerB = scan.next().toUpperCase();

            if (PlayerA.equals("B") && PlayerB.equals("B")){
                scoreA = scoreA + 0;
                scoreB = scoreB + 0;
                System.out.println();
                System.out.println("Suit Seri");
                System.out.println("Score A saat ini : " + scoreA);
                System.out.println("Score B saat ini : " + scoreB);
            } else if (PlayerA.equals("B") && PlayerB.equals("G")){
                scoreA = scoreA + 2;
                scoreB = scoreB - 1;
                System.out.println();
                System.out.println("A Menang Suit");
                System.out.println("Score A saat ini : " + scoreA);
                System.out.println("Score B saat ini : " + scoreB);
            } else if (PlayerA.equals("B") && PlayerB.equals("K")){
                scoreA = scoreA - 1;
                scoreB = scoreB + 2;
                System.out.println();
                System.out.println("B Menang Suit");
                System.out.println("Score A saat ini : " + scoreA);
                System.out.println("Score B saat ini : " + scoreB);
            } else if (PlayerA.equals("G") && PlayerB.equals("B")){
                scoreA = scoreA - 1;
                scoreB = scoreB + 2;
                System.out.println();
                System.out.println("B Menang Suit");
                System.out.println("Score A saat ini : " + scoreA);
                System.out.println("Score B saat ini : " + scoreB);
            } else if (PlayerA.equals("G") && PlayerB.equals("G")){
                scoreA = scoreA + 0;
                scoreB = scoreB + 0;
                System.out.println();
                System.out.println("Suit Seri");
                System.out.println("Score A saat ini : " + scoreA);
                System.out.println("Score B saat ini : " + scoreB);
            } else if (PlayerA.equals("G") && PlayerB.equals("K")){
                scoreA = scoreA + 2;
                scoreB = scoreB - 1;
                System.out.println();
                System.out.println("A Menang Suit");
                System.out.println("Score A saat ini : " + scoreA);
                System.out.println("Score B saat ini : " + scoreB);
            } else if (PlayerA.equals("K") && PlayerB.equals("B")){
                scoreA = scoreA + 2;
                scoreB = scoreB - 1;
                System.out.println();
                System.out.println("A Menang Suit");
                System.out.println("Score A saat ini : " + scoreA);
                System.out.println("Score B saat ini : " + scoreB);
            } else if (PlayerA.equals("K") && PlayerB.equals("G")){
                scoreA = scoreA - 1;
                scoreB = scoreB + 2;
                System.out.println();
                System.out.println("B Menang Suit");
                System.out.println("Score A saat ini : " + scoreA);
                System.out.println("Score B saat ini : " + scoreB);
            } else if (PlayerA.equals("K") && PlayerB.equals("K")){
                scoreA = scoreA + 0;
                scoreB = scoreB + 0;
                System.out.println();
                System.out.println("Suit Seri");
                System.out.println("Score A saat ini : " + scoreA);
                System.out.println("Score B saat ini : " + scoreB);
            }

            if (scoreA <= 0) {
                System.out.println("\nGAME OVER!");
                System.out.println("Player B WIN");
                System.exit(0);
            } else if (scoreB <= 0) {
                System.out.println("\nGAME OVER!");
                System.out.println("Player A WIN");
                System.exit(0);
            }

            System.out.print("\nLanjut atau Udahan ? ");
            String lanjutG = scan.next().toUpperCase().trim();
            System.out.println();

            if (lanjutG.equals("UDAHAN")) {
                System.out.println("DRAW");
            }
        }
        scan.close();
    }

    public void No21() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Lintasan (Kombinasi 1 atau 2) = ");
        String[] harga = scan.nextLine().trim().split(" ");
        scan.close();

        // 1 = Jalan => +1 ST
        // 2 = Lubang => -2 ST

        int jmlarray;
        jmlarray = harga.length;
        int[] hargaInt = new int[jmlarray];
        for (int i = 0; i < jmlarray; i++) {
            hargaInt[i] = Integer.parseInt(harga[i]);
        }
    }

    public void No22() {
        
    }
}
