# muzik_calar_projem
Müzik Çalar Uygulaması

Bu proje, bağlı listeler veri yapısını kullanarak temel bir müzik çalar uygulaması geliştirmeyi amaçlamaktadır. Proje, kullanıcıların şarkı listesini yönetmelerine, şarkıları çalmalarına ve gezinmelerine olanak tanır.


Özellikler:
Şarkı ekleme, silme ve düzenleme.
Bir sonraki veya önceki şarkıya geçme.
Şu an çalan şarkıyı görüntüleme.
Kullanıcı dostu bir arayüz (Java Swing ile).


Kullanılan Teknolojiler;
Programlama Dili: Java
Veri Yapısı: Bağlı Listeler (Linked List)
Arayüz: JPanel(Java Swing ile)


Projenin Çalışma Mantığı:
Bağlı Listeler: Şarkılar, her biri bir düğüm (node) olacak şekilde bağlı liste yapısında tutulur.
Her düğüm, şarkı bilgilerini ve bir sonraki düğüme bağlantıyı içerir.
Listeye şarkı ekleme/silme gibi işlemler doğrudan bağlı liste üzerinde yapılır.


Arayüz: Swing kullanılarak basit bir oynatma listesi tasarlanmıştır. Kullanıcılar butonlar aracılığıyla şarkılar arasında geçiş yapabilir veya yeni şarkılar ekleyebilir.


Örnek Kullanım: 
Uygulamayı başlat.
Şarkı listesine yeni bir şarkı ekle: "Şarkı Ekle" butonunu kullanarak şarkı bilgilerini gir.
Çalma işlemini başlat ve "Sonraki" ya da "Önceki" ile şarkılar arasında geçiş yap.
Şarkıları silmek veya düzenlemek için ilgili butonları kullan.


Ekran Görüntüleri


Uygulama Başlangıç Ekranı. Bu ekran,uygulama başladığında kullanıcıya gösterilecek ilk ekrandır.
![image](https://github.com/user-attachments/assets/0f8a2bbd-2148-4603-ba8d-4ecf1f57cb55)

Kullanıcı 'Şarkı Ekle' butonuna tıkladıktan sonra dosya yolunu seçer. Seçim tamamlandığında bu onay mesajı görüntülenir.
![Ekran görüntüsü 2024-11-30 132442](https://github.com/user-attachments/assets/7fef4973-d20a-4ba9-ab41-2f2b849f9783)

Uygulamanın arayüzünde kullanıcıların işlemlerini kolaylaştırmak için çeşitli butonlar bulunmaktadır.Bu butonlar sayesinde kullanıcı,çalma listesini kolayca yönetebilir ve şarkılar arasında gezinme işlemleri gerçekleştirebilir.

"Çal" :Seçilen şarkıyı çalmaya başlar.

"Durdur": Çalan Şarkıyı Durdurur.

"Önceki": Çalma listesinde bir önceki şarkıya dönüş yapılmasını sağlar.

"Sonraki": Çalma listesindeki bir sonraki şarkıya geçiş yapar.

"Başa Sar": Çalan şarkının tekrar baştan çalmasını sağlar.

![Ekran görüntüsü 2024-11-30 132501](https://github.com/user-attachments/assets/7dd47861-6824-4b2e-ac30-afba0463f2eb)
![Ekran görüntüsü 2024-11-30 132521](https://github.com/user-attachments/assets/a2c5707c-2a0a-4d00-8147-5c25bd620196)



