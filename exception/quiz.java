package Hata;


    class OgrenciNotHesaplamaException extends Exception {
        public void hataMesajiGoster() {
            System.out.println("Bilinmeyen bir hata oluştu!");
        }
    }

    class NegatifNotException extends OgrenciNotHesaplamaException {
        @Override
        public void hataMesajiGoster() {
            System.out.println("Negatif not girişi yapılamaz!");
        }
    }

    class Ogrenci {
        private String isim;
        private double vizeNot;
        private double finalNot;
        private double not;

        public Ogrenci(String isim, double vizeNot, double finalNot) throws OgrenciNotHesaplamaException {
            if (vizeNot < 0 || finalNot < 0) {
                throw new NegatifNotException();
            }

            this.isim = isim;
            this.vizeNot = vizeNot;
            this.finalNot = finalNot;
            not = notHesapla();
        }

        private double notHesapla() {
            return (vizeNot * 0.4) + (finalNot * 0.6);
        }

        public String basariDurumu(double sinifOrtalamasi) {
            return (not >= sinifOrtalamasi) ? "Başarılı" : "Başarısız";
        }

        public String getIsim() {
            return isim;
        }

        public double getNot() {
            return not;
        }
    }

    public class quiz {
        public static void main(String[] args) {
            try {
                java.util.Scanner scanner = new java.util.Scanner(System.in);

                System.out.println("Öğrenci sayısını girin:");
                int ogrenciSayisi = scanner.nextInt();
                Ogrenci[] ogrenciler = new Ogrenci[ogrenciSayisi];

                double toplamNot = 0;
                for (int i = 0; i < ogrenciSayisi; i++) {
                    System.out.println((i + 1) + ". Öğrencinin adını girin:");
                    String isim = scanner.next();

                    System.out.println("Vize notunu girin:");
                    double vizeNot = scanner.nextDouble();

                    System.out.println("Final notunu girin:");
                    double finalNot = scanner.nextDouble();

                    try {
                        ogrenciler[i] = new Ogrenci(isim, vizeNot, finalNot);
                        toplamNot += ogrenciler[i].getNot();
                    } catch (NegatifNotException e) {
                        ogrenciler[i] = new Ogrenci(isim, 0, 0);
                        e.hataMesajiGoster();
                    } catch (NumberFormatException e) {
                        ogrenciler[i] = new Ogrenci(isim, 0, 0);
                        System.out.println("Girilen notlar sayı değil!");
                    } catch (NullPointerException e) {
                        ogrenciler[i] = new Ogrenci(isim, 0, 0);
                        System.out.println("Not girişi yapılmadan not hesaplama işlemine geçilemez!");
                    } catch (OgrenciNotHesaplamaException e) {
                        ogrenciler[i] = new Ogrenci(isim, 0, 0);
                        e.hataMesajiGoster();
                    }

                    System.out.println("Uygulama devam ediyor...");
                }

                double sinifOrtalamasi = toplamNot / ogrenciSayisi;

                for (Ogrenci ogrenci : ogrenciler) {
                    System.out.println(ogrenci.getIsim() + " Öğrencinin başarı durumu: " + ogrenci.basariDurumu(sinifOrtalamasi));
                }

                scanner.close();
            } catch (Exception e) {
                System.out.println("Bilinmeyen bir hata oluştu!");
                e.printStackTrace();
            }
        }
    }

