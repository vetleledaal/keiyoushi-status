# Extension Validation Report

- Extension: tachiyomi-tr.araznovel-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6376619749329806300
- Source name: ArazNovel
- Source language: tr
- Selected manga input: popular offset 0: Rakudai Kenja no Gakuin Musou: Nidome no Tensei, S-Rank Cheat Majutsushi Boukenroku (`.../99`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Rakudai Kenja no Gakuin Musou: Nidome no Tensei, S-Rank Cheat Majutsushi Boukenroku (`.../99`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Kuma to Tanuki (`.../115`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | The Fiancées Live Together (`.../105`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Arrogant CEO: Wife Hunter (`.../76`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Rakudai Kenja no Gakuin Musou: Nidome no Tensei, S-Rank Cheat Majutsushi Boukenroku (`.../99`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Rakudai Kenja no Gakuin Musou: Nidome no Tensei, S-Rank Cheat Majutsushi Boukenroku (`.../99`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 74 | Bölüm 1.1 (`.../1051`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Settings can only be passed to CEF before createClient is called the first time. Current state is TERMINATED | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Settings can only be passed to CEF before createClient is called the first time. Current state is TERMINATED | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Rakudai Kenja no Gakuin Musou: Nidome no Tensei, S-Rank Cheat Majutsushi Boukenroku, URL=`99` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga.araznovel.com/.../71f9J9XcNCL._SL1422_1200x1200_crop_center.webp` (image/webp (container: extended), 214658 bytes, 844x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `99` |  |  |  |
| details thumbnail URL | PASS | `https://manga.araznovel.com/.../71f9J9XcNCL._SL1422_1200x1200_crop_center.webp` |  |  |  |
| details author | PASS | SHIRAISHI Arata |  |  |  |
| details artist | PASS | Kentarou, UO Denim |  |  |  |
| details genres | PASS | Manga, Action, Adventure, Fantasy, Harem, Romance, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rakudai Kenja no Gakuin Musou: İkinci Bir Şans ve Büyünün Zirvesine Uzanan Yol<br>Rakudai Kenja no Gakuin Musou: Nidome no Tensei, S-Rank Cheat Majutsushi Boukenroku, klasik reenkarnasyon (isekai) temalarını, "yetenek" ve "zamanın etkisi" kavramları üzerinden yeniden yorumlayan sürükleyici bir fantezi serisidir. Modern dünyadan fantastik bir evrene transfer olan ve hayatını büyüye adayan bir adamın, başarısızlıkla biten ilk yaşamından sonra küllerinden doğuşunu anlatır. Seri, türün benzerlerinden farklı olarak "bilginin en büyük güç olduğu" gerçeğini etkileyici bir dille gözler önüne seriyor.<br><br>1. Ephtal’in Trajik Geçmişi ve 400 Yıllık Sıçrayış<br>Hikaye, "Rüzgar Bilgesi" olarak tanınmak isteyen Ephtal’in hüsran dolu vedasıyla başlar. Modern Dünya'dan gelip büyü dünyasına adım atan Ephtal, tüm ömrünü büyü sanatında ustalaşmaya adasa da doğuştan gelen yeteneksizliği yüzünden hayallerine ulaşamadan hayata gözlerini yumar. Onun için büyü, sadece bir araç değil bir yaşam biçimidir; ancak genetik kısıtlamalar ve yetenek havuzu buna izin vermemiştir.<br>Kader ona ikinci bir şans tanır: Ephtal, 400 yıl sonra aynı isimle yeniden doğar. Geçmiş hayatındaki muazzam teorik bilgi birikimini, formülleri ve tecrübesini koruyarak uyandığında, karşısında beklediğinden çok daha farklı, adeta evrimini tersine tamamlamış bir dünya bulur. Bu yeni dünyada, eski bilgiler sadece tozlu raflarda kalan efsanelerden ibarettir.<br><br>2. Gerileyen Bir Medeniyet ve "Yeteneksiz" Bir Deha<br>Ephtal’in en büyük keşfi, geçen 400 yılda büyü sanatının gelişmek yerine korkunç bir yıkıma uğramış olmasıdır. Eskiden temel sayılan büyülerin artık "efsanevi" veya "imkansız" kabul edildiği bu yeni çağda, büyücüler artık teoriden kopuk ve sadece basit kalıplara hapsolmuş durumdadır. Büyü kullanımı, sanatsal bir derinlikten çıkıp sığ bir kaba kuvvete dönüşmüştür.<br>Ephtal’in geçmişte "yetersiz" gördüğü ve üzerine binlerce kez pratik yaptığı bilgi seviyesi, günümüz dünyası için ulaşılamaz bir tanrısal güç niteliğindedir. Kendi döneminde zirveye çıkamayan Ephtal, büyü seviyesinin yerlerde süründüğü bu yeni çağda, istemeden de olsa yaşayan en güçlü büyücüye dönüşmüştür. Bu durum, serideki güç dengelerini tamamen altüst eden en temel unsurdur.<br><br>3. Detaylı Karakter Analizi ve Sosyal Dinamikler<br>Seri, karakterin gelişimini fiziksel kas gücünden ziyade entelektüel üstünlük ve stratejik zeka üzerine kurar:<br><br><br> 	<br>Ephtal: Azmi ve çalışma disipliniyle tanınan bir karakterdir. Yetenekten yoksun olduğu bir hayattan geldiği için, gücünü kaba kuvvetle değil, büyü teorilerini en ince ayrıntısına kadar bilmesiyle elde eder. Kendine "başarısız" dese de, aslında o bir "bilgi devi"dir. Onun mütevazılığı, çevresindeki insanlar için hem bir hayranlık hem de bir korku kaynağıdır.<br><br> 	<br>Akademi Öğrencileri ve Profesörler: Ephtal’in kaydolduğu büyü akademisindeki çevre, büyü dünyasının ne kadar gerilediğinin bir temsilidir. Profesörlerin bile açıklayamadığı kadim formülleri Ephtal'in tek bir el hareketiyle çözmesi, akademideki hiyerarşiyi kökten sarsar.<br><br> 	<br>Rakipler ve Antagonist Yapı: Ephtal'in karşısına çıkan rakipler genellikle soyluluklarına veya doğuştan gelen yeteneklerine güvenen kibirli karakterlerdir. Ephtal'in onlara karşı kazandığı zaferler, sadece bir dövüş başarısı değil, aynı zamanda emeğin yeteneğe karşı kazandığı bir zaferdir.<br><br><br>4. Akademi Hayatı ve Güç Gösterisi<br>Ephtal, büyü sanatını yeniden zirveye taşımak amacıyla akademiye katılır. Ancak burada karşılaştığı şey, büyü dünyasının ne kadar yozlaştığıdır. Bir zamanlar herkesin bildiği "Rüzgar Kontrolü" gibi teknikler artık unutulmuş, yerini verimsiz ve yavaş metodlar almıştır.<br>Kendi döneminde bir çırağın bile yapabildiği büyüleri yaparak profesörleri hayrete düşüren Ephtal, "başarısız bir öğrenci" etiketinden, dünyanın dengelerini değiştiren bir "S-Seviye" büyücüye dönüşür. Akademi, onun için bir eğitim alanından ziyade, kaybolan büyü medeniyetini yeniden inşa edeceği ve geleceğin büyücülerini doğru şekilde eğiteceği bir merkez haline gelir.<br><br>5. Büyü Sistemindeki Teknik Derinlik<br>Rakudai Kenja no Gakuin Musou, büyü sistemini anlatırken "nasıl" sorusuna cevap vermeyi ihmal etmiyor. Büyülerin sadece isimlerinin söylenip patlamaların yaşandığı sıradan animelerin aksine, bu seride rünlerin dizilimi, elementlerin birbirleriyle olan etkileşimi ve enerjinin verimli kullanımı gibi teknik detaylar ön plandadır. Ephtal'in her hareketi, 400 yıllık bir başarısızlığın getirdiği kusursuz bir optimizasyonun sonucudur. Bu teknik anlatım, seriyi okurken alınan keyfi iki katına çıkarır.<br><br>6. Görsel Estetik ve Atmosfer<br>Manganın çizim tarzı, büyülerin karmaşıklığını hissettirecek şekilde titizlikle tasarlanmıştır. Ephtal büyü yaptığında havada beliren devasa rün çemberleri ve enerji akışları, 400 yıl sonraki dünyanın "sığ" büyüleri ile muazzam bir kontrast oluşturur. Çizimlerdeki bu fark, eski dünyanın ihtişamını ve yeni dünyanın basitliğini okuyucuya kelimelere ihtiyaç duymadan hissettirir. Özellikle savaş sahnelerindeki dinamizm, karakterin "ezici üstünlüğünü" vurgular.<br><br>7. Neden Mutlaka Okumalısınız? (En İyi 3 Temel Neden)<br>Eğer bu eşsiz dünyaya adım atmak isterseniz, işte serinin sizi içine çekecek 3 ana unsuru:<br><br><br> 	<br>Sıfırdan Zirveye (Emek Odaklı): Yetenek eksikliğinin, doğru bilgi ve azimle nasıl bir avantaja dönüşebileceğini en iyi anlatan yapımlardan biridir.<br><br> 	<br>Dünya İnşası ve Tarihsel Gizem: 400 yıl içinde medeniyete ne oldu? Büyü neden geriledi? Bu sorular okuyucuyu sürekli merakta bırakarak seriyi bir gizem hikayesine dönüştürür.<br><br> 	<br>Tatmin Edici Gelişim: Ana karakterin rakiplerini kaba kuvvetle değil, onlara büyü sanatının gerçeklerini "öğreterek" domine etmesi izlemesi en keyifli süreçlerden biridir.<br><br><br>Serinin güncel durumunu takip etmek için MangaUpdates sayfasını ziyaret edebilir veya sitemizdeki diğer isekai serileri incelemelerine göz atabilirsiniz.<br><br>Alternatif isimler: From Overshadowed to Overpowered: Second Reincarnation of a Talentless Sage,Rakudai Kenja no Gakuin Musou,The Unsuccessful yet Academically Unparalleled Sage ~A Cheating S-Rank Sorcerer's Post-Rebirth Adventurer Log~,Необыкновенный неудачник - Дневник переродившегося колдуна S-ранга,墮落的賢者學院無雙的學院,墮落的賢者學院無雙的學院-在400年後的世界中兩次重生無雙劍的最堅強的賢者,落第賢者の学院無双,落第賢者の学院無双　～二度目の転生、Ｓランクチート魔術師冒険録～,落第贤者的学院无双 第二回转生，S等级作弊魔术师冒险记,낙제 현자의 학원 무쌍 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 74 chapters |  |  |  |
| chapter dates | PASS | 74 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Settings can only be passed to CEF before createClient is called the first time. Current state is TERMINATED |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
