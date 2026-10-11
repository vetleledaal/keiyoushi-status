# Extension Validation Report

- Extension: tachiyomi-ar.mangatuk-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6924751245735287034
- Source name: MangaTuk
- Source language: ar
- Selected manga input: popular offset 0: Tears on a Withered Flower (`.../wpser_8063be9ecbddf5cb92a38a1bcc`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Tears on a Withered Flower (`.../wpser_8063be9ecbddf5cb92a38a1bcc`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | I Want to Be a Big Baddie (`.../wpser_f7bac03cdb97cf037b3c2e3ec4`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Tale of Hyangdan (`.../cufyddoymrbecw9yfnzirlsp`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | The Forgotten Field (`.../s2725fwrq8j05mbvgbfueof2`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tears on a Withered Flower (`.../wpser_8063be9ecbddf5cb92a38a1bcc`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tears on a Withered Flower (`.../wpser_8063be9ecbddf5cb92a38a1bcc`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 106 | الفصل 1 (`.../wpchap_1db3d2687bb7ee500aa8961957`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tears on a Withered Flower, URL=`wpser_8063be9ecbddf5cb92a38a1bcc` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 119/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://content.mangatuk.com/.../rmgjj5osjevpcrt8tp0ixk92.webp` (image/webp (encoding: lossy), 174876 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `wpser_8063be9ecbddf5cb92a38a1bcc` |  |  |  |
| details thumbnail URL | PASS | `https://content.mangatuk.com/.../rmgjj5osjevpcrt8tp0ixk92.webp` |  |  |  |
| details author | PASS | Gae |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | manhwa, محتوى للبالغين, دراما, جوسي, محتوى ناضج, رومانسية |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | خيانة مريرة، ديون متراكمة، وفقدان طفل.. هكذا انهارت حياة "نا هاي-سو" أمام زوج غادر. وبينما هي على حافة الهاوية، يظهر شاب غامض يطلب منها تعليم الحب الناضج! فهل يزهر الندى على قلبها المحطم؟ رحلة درامية ناضجة عن التعافي، الخيانة، والأمل المستحيل. اكتشف كيف تولد الروح من جديد في Tears on a Withered Flower.<br><br>أسماء أخرى:<br>دموع على زهرة ذابلة<br>Kareta Hana ni Namida wo<br>Lacrime su un fiore appassito<br>Lágrimas en una flor marchita<br>Lágrimas sobre flores murchas<br>Lệ Vương Trên Cánh Hoa Tàn<br>Nước Mắt Trên Đóa Hoa Tàn<br>Pleure pour cette fleur<br>Sideun Kkoch-e Nunmul-eul<br>Solmuş Bir Çiçeğin Gözyaşları<br>Tears for the Withered Flower<br>Tränen auf einer welken Blume<br>Łzy ze zwiędłych kwiatów<br>Слёзы на увядшем цветке<br>Слёзы по увядшему цветку<br>บุปผารุ่มราคะ<br>枯れた花に涙を<br>枯萎之花上的眼泪<br>枯萎的花淚<br>시든 꽃에 눈물을 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 106 chapters |  |  |  |
| chapter dates | PASS | 106 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://content.mangatuk.com/.../001.webp` (image/webp (encoding: lossy), 282242 bytes, 750x15921) |  |  |  |
