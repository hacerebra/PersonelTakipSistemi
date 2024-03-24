/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proje2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hacerebra
 */
public class HacerEbraOzdemir_DB_PersonelTakip {

    private static final String connectionString = "jdbc:mysql://127.0.0.1:3306/company_db?user=root&password=fsmEbra123";
    private static Connection conn;

    public static HacerEbraOzdemir_Yonetici YoneticiGiris(String mail, String sifre) {
        HacerEbraOzdemir_Yonetici yonetici = null;//Ilk olarak, Yonetici nesnesi null olarak baslatilir.
        try {
            conn = DriverManager.getConnection(connectionString);//DriverManager.getConnection(connectionString) kullanilarak veritabanina baglanti olusturulur. connectionString, veritabani baglanti bilgilerini temsil eder.
            Statement stmt = conn.createStatement();//conn.createStatement() ile bir Statement nesnesi olusturulur ve SQL sorgularini calistirmak icin kullanilir.
            //mail ve sifre parametrelerine gore db_personel.tbl_yonetici tablosundan veri almak icin bir SQL sorgusu olusturulur.
            String query = "SELECT * FROM db_personel.tbl_yonetici WHERE mail='" + mail + "' AND sifre='" + sifre + " ';";
            ResultSet rs = stmt.executeQuery(query);//stmt.executeQuery(query) kullanilarak sorgu calistirilir ve geriye ResultSet nesnesi dondurulur. Bu nesne, alinan satirlari icerir.
            if (rs.next()) { //Eger ResultSet en az bir satir iceriyorsa (rs.next() kontrolu ile), bu eslesme bir kayit bulundu anlamina gelir.
                yonetici = new HacerEbraOzdemir_Yonetici();
                //Yeni bir Yonetici nesnesi olusturulur ve ilgili degerler ResultSet icerisinden alinarak, Yonetici nesnesinin alanlarina atanir.
                yonetici.id = rs.getInt("id");
                yonetici.ad_soyad = rs.getString("ad_soyad");
                yonetici.mail = rs.getString("mail");
                yonetici.sifre = rs.getString("sifre");

            }
            conn.close();//Veritabani baglantisi kapatilir.
        } catch (SQLException ex) { //SQLException veritabani islemleri sirasinda olusursa, hata mesaji yazdirilir.
            System.out.println(ex.getMessage());
        }
        return yonetici;

    }

    public static HacerEbraOzdemir_Personel PersonelGiris(String mail, String sifre) {
        HacerEbraOzdemir_Personel personel = null;//Ilk olarak, Personel nesnesi null olarak baslatilir.

        try {
            conn = DriverManager.getConnection(connectionString);//DriverManager.getConnection(connectionString) kullanilarak veritabanina baglanti olusturulur. connectionString, veritabani baglanti bilgilerini temsil eder.
            Statement stmt = conn.createStatement();//conn.createStatement() ile bir Statement nesnesi olusturulur ve SQL sorgularini calistirmak icin kullanilir.
            //mail ve sifre parametrelerine gore db_personel.tbl_personel tablosundan veri almak icin bir SQL sorgusu olusturulur.
            String query = "SELECT * FROM db_personel.tbl_personel WHERE mail='" + mail + "' AND sifre='" + sifre + "';";
            ResultSet rs = stmt.executeQuery(query);//stmt.executeQuery(query) kullanilarak sorgu calistirilir ve geriye ResultSet nesnesi dondurulur. Bu nesne, alinan satirlari icerir.
            if (rs.next()) { //Eger ResultSet en az bir satir iceriyorsa (rs.next() kontrolu ile), bu eslesme bir kayit bulundu anlamina gelir.
                personel = new HacerEbraOzdemir_Personel();
                //Yeni bir Personel nesnesi olusturulur ve ilgili degerler ResultSet icerisinden alinarak, Personel nesnesinin alanlarina atanir.
                personel.id = rs.getInt("id");
                personel.ad_soyad = rs.getString("ad_soyad");
                personel.mail = rs.getString("mail");
                personel.sifre = rs.getString("sifre");
                personel.pozisyon = rs.getString("pozisyon");
                personel.calisma_saati = rs.getBoolean("calisma_saati");
                personel.cinsiyet = rs.getString("cinsiyet");
            }

            conn.close();//Veritabani baglantisi kapatilir.
        } catch (SQLException ex) {//SQLException veritabani islemleri sirasinda olusursa, hata mesaji yazdirilir.
            System.out.println(ex.getMessage());
        }

        return personel;
    }

    //Bu metod, verilen Personel nesnesini veritabanina eklemek icin kullanilir. Basarili bir sekilde ekleme gerceklesirse true, aksi halde false dondurulur.
    public static boolean PersonelEkle(HacerEbraOzdemir_Personel personel) {
        try {
            conn = DriverManager.getConnection(connectionString);//DriverManager.getConnection(connectionString) kullanilarak veritabanina baglanti olusturulur. connectionString, veritabani baglanti bilgilerini temsil eder.
            Statement stmt = conn.createStatement();//Statement nesnesi olusturulur.
            //Personel nesnesi icindeki degerleri kullanarak, db_personel.tbl_personel tablosuna bir INSERT sorgusu olusturulur.
            String query = "INSERT INTO db_personel.tbl_personel VALUES (" + personel.id + ",'" + personel.ad_soyad + "','" + personel.mail + "','" + personel.sifre + "','" + personel.pozisyon + "'," + personel.calisma_saati + ",'" + personel.cinsiyet + "')";
            stmt.executeUpdate(query);
            conn.close();//Veritabani baglantisi kapatilir.
            return true;

        } catch (SQLException ex) {//SQLException veritabani islemleri sirasinda olusursa, hata mesaji yazdirilir.
            System.out.println(ex.getMessage());
            return false;
        }

    }

    //Bu metod, Personel nesnesinin bilgilerini kullanarak ilgili veritabani tablosunda guncelleme yapar. Basarili bir sekilde guncelleme gerceklesirse true, aksi halde false dondurulur.
    public static boolean PersonelGuncelle(HacerEbraOzdemir_Personel np1) {
        try {
            conn = DriverManager.getConnection(connectionString);//DriverManager.getConnection(connectionString) kullanilarak veritabanina baglanti olusturulur. connectionString, veritabani baglanti bilgilerini temsil eder.
            Statement stmt = conn.createStatement();//Statement nesnesi olusturulur.
            //Personel nesnesi icindeki degerleri kullanarak, db_personel.tbl_personel tablosunda bir guncelleme (UPDATE) sorgusu olusturulur.
            String query = "UPDATE db_personel.tbl_personel SET "
                    + "ad_soyad='" + np1.ad_soyad
                    + "',mail='" + np1.mail
                    + "',sifre='" + np1.sifre
                    + "',pozisyon='" + np1.pozisyon
                    + "', calisma_saati=" + np1.calisma_saati
                    + ", cinsiyet='" + np1.cinsiyet
                    + "' WHERE id=" + np1.id;
            stmt.executeUpdate(query);//stmt.executeUpdate(query) kullanilarak sorgu calistirilir ve veritabaninda ilgili kayit guncellenir.
            conn.close();//Veritabani baglantisi kapatilir.
            return true;

        } catch (SQLException ex) {//SQLException veritabani islemleri sirasinda olusursa, hata mesaji yazdirilir.
            System.out.println(ex.getMessage());
            return false;
        }

    }

    //Bu metod, verilen id degerine sahip kaydi ilgili veritabani tablosundan silmek icin kullanilir. Basarili bir sekilde silme gerceklesirse true, aksi halde false dondurulur.
    public static boolean IdIlePersonelSil(int id) {
        try {
            conn = DriverManager.getConnection(connectionString);//DriverManager.getConnection(connectionString) kullanilarak veritabanina baglanti olusturulur. connectionString, veritabani baglanti bilgilerini temsil eder.
            Statement stmt = conn.createStatement();//Statement nesnesi olusturulur.
            //Belirtilen id degerine sahip kaydi db_personel.tbl_personel tablosundan silmek icin bir DELETE sorgusu olusturulur.
            String query = "DELETE FROM db_personel.tbl_personel WHERE id =" + id;
            stmt.executeUpdate(query);
            conn.close();//Veritabani baglantisi kapatilir.
            return true;

        } catch (SQLException ex) {//SQLException veritabani islemleri sirasinda olusursa, hata mesaji yazdirilir.
            System.out.println(ex.getMessage());
            return false;
        }

    }

    //Bu metod, veritabanindaki db_personel.tbl_personel tablosunda ad_soyad veya mail sutunlarinda yapilan arama sonucunda bulunan personel kayitlarini ArrayList<Personel> olarak donndurur. Bu sayede, AdVeMailleAra metoduyla istenilen arama metnini kullanarak personelleri bulabilirsiniz.
    public static ArrayList<HacerEbraOzdemir_Personel> AdVeMailleAra(String arama) {
        ArrayList<HacerEbraOzdemir_Personel> plist = new ArrayList<>();//Bu liste, bulunan personel kayitlarini tutacak.
        try {
            conn = DriverManager.getConnection(connectionString);//DriverManager.getConnection(connectionString) kullanilarak veritabanina baglanti olusturulur. connectionString, veritabani baglanti bilgilerini temsil eder.
            Statement stmt = conn.createStatement();//Statement nesnesi olusturulur.
            //Arama sorgusu olusturulur. Bu sorgu, db_personel.tbl_personel tablosunda ad_soyad veya mail sutunlarinda search metnini iceren kayitlari secer.
            String query = "SELECT * FROM db_personel.tbl_personel WHERE ad_soyad LIKE '%" + arama + "%' OR mail LIKE '%" + arama + "%'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {//while dongusu kullanilarak tum sonuclar dolasilir.
                HacerEbraOzdemir_Personel personel = new HacerEbraOzdemir_Personel();
                //Her bir sonuç icin bir Personel nesnesi olusturulur ve veritabani sutunlarindan ilgili degerler alinarak nesneye atanir.
                personel.id = rs.getInt("id");
                personel.ad_soyad = rs.getString("ad_soyad");
                personel.mail = rs.getString("mail");
                personel.sifre = rs.getString("sifre");
                personel.pozisyon = rs.getString("pozisyon");
                personel.calisma_saati = rs.getBoolean("calisma_saati");
                personel.cinsiyet = rs.getString("cinsiyet");

                plist.add(personel);//Olusturulan Personel nesnesi plist listesine eklenir.
            }
            conn.close();//Veritabani baglantisi kapatilir.
        } catch (SQLException ex) {
            Logger.getLogger(HacerEbraOzdemir_Frm_Yonetici.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plist;

    }

    //Bu metod, db_personel.tbl_personel tablosunda belirli bir id degeriyle yapilan arama sonucunda bulunan personel kaydini dondurur. Istenilen id degeriyle veritabaninda bir kayit bulunursa, bu kayit bir Personel nesnesi olarak temsil edilir ve metot tarafindan dondurulur. Eger id degeriyle bir kayit bulunamazsa, null degeri dondurulur.
    public static HacerEbraOzdemir_Personel IdIleArama(int id) {
        HacerEbraOzdemir_Personel personel = null;
        try {
            //Veritabani baglantisi olusturulur ve bir Statement nesnesi olusturulur. Ardindan, SQL sorgusu kullanilarak belirli bir id degeriyle personel aramasi yapilir ve sonuclar ResultSet nesnesinde saklanir.
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();//Statement nesnesi olusturulur.
            String query = "SELECT * FROM db_personel.tbl_personel WHERE id=" + id + ";";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                personel = new HacerEbraOzdemir_Personel();
                personel.id = rs.getInt("id");
                personel.ad_soyad = rs.getString("ad_soyad");
                personel.mail = rs.getString("mail");
                personel.sifre = rs.getString("sifre");
                personel.pozisyon = rs.getString("pozisyon");
                personel.calisma_saati = rs.getBoolean("calisma_saati");
                personel.cinsiyet = rs.getString("cinsiyet");

            }
            //Son olarak, veritabani baglantisi kapatilir ve personel nesnesi dondurulur. Eger herhangi bir hata meydana gelirse, SQLException yakalanir ve hatanin loglanmasi saglanir.
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HacerEbraOzdemir_Frm_Yonetici.class.getName()).log(Level.SEVERE, null, ex);
        }
        return personel;

    }

    //Bu metod, bir personele maas bilgisi eklemek icin kullanilir.
    public static boolean PersoneleMaasEkle(String isim_personel, String maas) {
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();//Statement nesnesi olusturulur.
            //isim_personel ve maas parametrelerinden alinan degerler kullanilarak bir SQL sorgusu olusturulur. Bu sorgu, db_personel.tbl_personel_maas tablosuna isim_personel ve maas degerlerini eklemek icin kullanilir.
            String query = "INSERT INTO db_personel.tbl_personel_maas"
                    + "(isim_personel, maas) " //id yi veri tabanı otamatik atıyor. bu kısımda sadece kullanılıcıdan alınacak kısım yazılır.
                    + "VALUES ('" + isim_personel + "','" + maas + "');";
            stmt.executeUpdate(query);//Veritabaninda degisiklik yapilir ve maas bilgisi eklenir. Ardindan, veritabani baglantisi kapatilir.
            conn.close();
            //Herhangi bir hata olusmazsa, kullaniciya mesaj gösterilir ve true degeri dondurulur.
            JOptionPane.showMessageDialog(null, "Maaş bilgisi sisteme eklenmiştir.");
            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //Maas bilgisi zaten mevcut ise eklenmez ve hata mesaji verilir.
            JOptionPane.showMessageDialog(null, "Maaş eklemek isteğiniz personele ait maaş bilgisi sistemde bulunmaktadır. Yeni bir maaş eklenemez.");
            return false;
        }

    }

    public static boolean PersoneldenMaasSil(String isim_personel, String maas) {
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();//Statement nesnesi olusturulur.
            //isim_personel ve maas parametrelerinden alinan degerler kullanilarak bir SQL sorgusu olusturulur. Bu sorgu, db_personel.tbl_personel_maas tablosundan isim_personel ve maas degerlerine sahip olan maas bilgisini silmek icin kullanilir.
            String query = "DELETE FROM db_personel.tbl_personel_maas WHERE isim_personel = '" + isim_personel + "' AND maas = '" + maas + "';";
            stmt.executeUpdate(query);//Sorgu stmt.executeUpdate(query) ile yurutulerek veritabaninda degisiklik yapilir ve maas bilgisi silinir. Ardindan, veritabani baglantisi kapatilir.
            conn.close();
            //Herhangi bir hata olusmazsa, kullaniciya mesaj gösterilir ve true degeri dondurulur.
            JOptionPane.showMessageDialog(null, "Maaş bilgisi sistemden silinmiştir.");
            return true;

        } catch (SQLException ex) {
            //Eger verilen isim ve maas degeriyle eslesen bir maas bilgisi bulunmazsa herhangi bir degisiklik yapilmaz.
            System.out.println(ex.getMessage());
            return false;
        }

    }

    //Bu metod, veritabanindaki maas bilgilerini almak icin kullanilir.
    public static ArrayList<HacerEbraOzdemir_Maas> GetMaas() {
        ArrayList<HacerEbraOzdemir_Maas> maas = null;
        try {
            //Veritabani baglantisi olusturulur ve bir Statement nesnesi olusturulur.
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            //db_personel.tbl_maas tablosundan tum verileri iceren bir SQL sorgusu olusturulur. Bu sorgu, stmt.executeQuery(query) ile yurutulerek veritabanindan maas bilgileri alinir ve bir ResultSet nesnesine atanir.
            String query = "SELECT * FROM db_personel.tbl_maas ;";
            ResultSet rs = stmt.executeQuery(query);
            maas = new ArrayList<>();//maas adinda bir ArrayList olusturulur.

            while (rs.next()) {
                HacerEbraOzdemir_Maas m = new HacerEbraOzdemir_Maas();//Bir Maas nesnesi olusturulur.
                //Kayıttan gelen id, maas_turu ve maas degerleri Maas nesnesine atanir.
                m.id = rs.getInt("id");
                m.maas_turu = rs.getString("maas_turu");
                m.maas = rs.getString("maas");
                maas.add(m);//Olusturulan Maas nesnesi maas listesine eklenir.

            }
            conn.close();//Veritabani baglantisi kapatilir.
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return maas;

    }

    //Bu metod, bir personelin izin gunlerini veritabanina eklemek icin kullanilir.
    public static boolean IzinGunuEkle(HacerEbraOzdemir_Personel personel, String ızın_gunu) {
        try {
            //Veritabani baglantisi olusturulur ve bir Statement nesnesi olusturulur.
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            //db_personel.tbl_personel_izin tablosuna yeni bir kayit eklemek icin SQL sorgusu olusturulur. Sorgu, personel parametresi uzerinden gelen personelin adi ve izin_gunu parametresi uzerinden gelen izin gunu degeri kullanilarak olusturulur.
            String query = "INSERT INTO db_personel.tbl_personel_izin"
                    + "(personel_isim, izin_gunu) "
                    + "VALUES ('" + personel.ad_soyad + "','" + personel.izin + "');";
            stmt.executeUpdate(query);
            conn.close();//Veritabani baglantisi kapatilir.
            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

    //Bu metod, veritabaninda belirli bir arama terimine gore personelin izin gunlerini getirmek icin kullanilir.
    public static ArrayList<HacerEbraOzdemir_Personel> IzinGoster(String arama) {
        ArrayList<HacerEbraOzdemir_Personel> plist = new ArrayList<>();
        try {
            //Veritabani baglantisi olusturulur ve bir Statement nesnesi olusturulur.
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            //db_personel.tbl_personel_izin tablosundan personel_isim sutununda belirli bir arama terimini iceren kayitlari secmek icin SQL sorgusu olusturulur. Arama parametresi alinir ve sorgunun LIKE ifadesiyle uyusması saglanır.
            String query = "SELECT * FROM db_personel.tbl_personel_izin WHERE personel_isim LIKE '%" + arama + "%'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                HacerEbraOzdemir_Personel personel = new HacerEbraOzdemir_Personel();
                //Her bir satir icin bir Personel nesnesi olusturulur ve personel_isim ve izin_gunu sutunlarindaki degerler atanir. Olusturulan Personel nesnesi plist listesine eklenir.
                personel.ad_soyad = rs.getString("personel_isim");
                personel.izin = rs.getString("izin_gunu");
                plist.add(personel);
            }
            conn.close();//Veritabani baglantisi kapatilir.
            //SQL hatasi meydana gelirse, SQLException yakalanir, hata mesaji konsola yazdirilir ve bos bir plist liste döndürülür.
        } catch (SQLException ex) {
            Logger.getLogger(HacerEbraOzdemir_Frm_Yonetici.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plist;

    }

    //Bu metod, veritabanindan belirli bir personelin izin bilgisini silmek icin kullanilir.
    public static boolean PersoneldenIzinSil(String isim_personel, String izin) {
        try {
            //Veritabani baglantisi olusturulur ve bir Statement nesnesi olusturulur.
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            //db_personel.tbl_personel_izin tablosundan personel_isim sutunuyla isim_personel parametresi eslesen ve izin_gunu sutunuyla izin parametresi eslesen kaydi silmek icin SQL sorgusu olusturulur.
            String query = "DELETE FROM db_personel.tbl_personel_izin WHERE personel_isim = '" + isim_personel + "' AND izin_gunu = '" + izin + "';";
            stmt.executeUpdate(query);//Veritabaninda ilgili kayit silinir.
            conn.close();//Veritabani baglantisi kapatilir.
            return true;
            //SQL hatasi meydana gelirse, SQLException yakalanir, hata mesaji konsola yazdirilir ve false döndürülür.
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

}
