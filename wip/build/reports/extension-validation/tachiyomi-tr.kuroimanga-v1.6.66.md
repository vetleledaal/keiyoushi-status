# Extension Validation Report

- Extension: tachiyomi-tr.kuroimanga-v1.6.66
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 8755089223917220341
- Source name: Kuroi Manga
- Source language: tr
- Selected manga input: popular offset 0: Kod Adı Anastasia (`.../5197`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Kod Adı Anastasia (`.../5197`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Lotusun Kalbi (`.../9767`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Marry In Bed at 19 (`.../12914`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Paslı Kesişmeler (`.../17587`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kod Adı Anastasia (`.../5197`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kod Adı Anastasia (`.../5197`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 76 | Bölüm 0 (`.../bolum-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Bu seriyi okumak için abone olmalısınız | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Bu seriyi okumak için abone olmalısınız | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kod Adı Anastasia, URL=`5197` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.kuroimanga.site/.../codenamee-350x476.jpg` (image/jpeg, 58892 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `5197` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.kuroimanga.site/.../codenamee.jpg` (image/jpeg, 1007058 bytes, 960x1359) |  |  |  |
| details author | PASS | Han |  |  |  |
| details artist | PASS | HAN |  |  |  |
| details genres | PASS | Aksiyon, Anladın işte 😉, Drama, Fanfinfon, Gerilim, Gizem, Güncel Seriler, Işın Kılıçları, Macera, Manhwa, Psikoloji, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kod adı Anastasia Oku<br><br>Neden 2 farklı seri olarak paylaşıyoruz?<br><br>Burası serinin orijinal sayfasıdır. 1. sezon ardından 2. sezon ile devam etmekte olan Codename Anastasia serimiz yüksek talep ve merak konusu olmasının yanı sıra çeşitli şikayet ve telif sorunlarının da konusu olmaktadır. Bu nedenle ihtimalleri göz önünde bulundurarak; geçici olarak seri kaldırma durumu yaşanırsa diye bir yedek sayfa oluşturulmuştur. 2. Sezon yedek bağlantıda da paylaşılmaya devam edilmektedir. Amacımız daima senin, sitemiz üzerinden Türkçe ve Kaliteli olarak kesintisiz erişimini sağlamaktır.<br><br>“Kwon Taekjoo, Rusya’ya git ve “Anastasia’yı bul.” Ulusal İstihbarat Teşkilatı gözdesi “Kwon Taekjoo”, Rusya ve Kuzey Kore (yani DPRK) arasındaki gizli bir ortaklıkla yaratılan ölümcül silah “Anastasia’yı tanımlama ve deşifre etme göreviyle acilen Moskova’ya gönderilir. Ancak, Rusya’ya işi halletmek için gittiği ilk seferinde, gönderilir gönderilmez her şey ters gitmeye başlar. NIS tarafından görevlendirilen yerel bir ortak olarak ortaya çıkan ve kendini ajan olarak tanıtan “Zhenia’adlı bir adam, Kwon Taekjoo’nun kafasını daha da karıştırır. Rus iş dünyası ve siyasi figürleri arasında etkili bir figür gibi görünen ve yeraltı mafyalarıyla bağlantıları olan “Zhenia’ her zaman rahat ve neşeli görünür. Aynı zamanda, dengesiz mizacıyla Kwon Taekjoo’nun sabrını zorlar ve “Zhenia”, her zorlukla başa çıkabilen bu adama, “Kwon Taekjoo’ya yeni yeni farkına vardığı bir ilgi göstermeye başlar. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 76 chapters |  |  |  |
| chapter dates | PASS | 76 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Bu seriyi okumak için abone olmalısınız |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
