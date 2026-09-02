# Extension Validation Report

- Extension: tachiyomi-tr.okutoon-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6023377011056301844
- Source name: OkuToon
- Source language: tr
- Selected manga input: popular offset 0: The Forgotten Field (`.../the-forgotten-field`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | The Forgotten Field (`.../the-forgotten-field`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | SSS-Rank Paladin Who Transcends Common Sense (`.../sss-rank-paladin-who-transcends-common-sense`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Surviving the Game as a Barbarian (`.../surviving-the-game-as-a-barbarian`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | The Student, the Witch, and the Academy (`.../the-student-the-witch-and-the-academy`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Forgotten Field (`.../the-forgotten-field`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Forgotten Field (`.../the-forgotten-field`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 32 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Forgotten Field, URL=`.../the-forgotten-field` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://om-cdn.okutoon.com/.../cover_1785923833_bb2cbaae.webp` (image/webp (encoding: lossy), 126728 bytes, 600x804) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-forgotten-field` |  |  |  |
| details thumbnail URL | PASS | `https://om-cdn.okutoon.com/.../cover_1785923833_bb2cbaae.webp` |  |  |  |
| details author | PASS | Kim Suji |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Günlük Hayat, Romantizm, Shoujo, Shounen, Tarihi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "Her gün dua ediyorum, bu sevdanın nihayete ermesi için. Seni sevmeye bugün son vereyim, yarın aşkımdan eser kalmasın." Yasak bir ilişkiden doğan talihsiz İmparatorluk Prensesi Talia Roem Gwirta, kendisini hiçbir zaman gerçekten kabul etmeyen bir dünyada büyür. Dışlanmışlık, aşağılama ve düşmanlık içinde geçen yıllar, onun ruhunda derin yaralar açar. Bu yüzden Talia, kendisine yaklaşan herkese dikenlerini gösteren, kırılganlığını öfkenin ardına saklayan birine dönüşür. Ancak bu sert savunma, yalnızca tek bir kişinin önünde anlamını yitirir. O kişi, doğunun soylu varisi Varkas Laedgo Siorcan'dır. İmparatorluk hanedanına bağlı büyük bir soyun halefi olan Varkas, çocukluğundan beri kusursuz olmak zorunda bırakılmıştır. Ağır ve acımasız bir disiplinle yetiştirilen genç adam, zamanla duygularını bastırmış, sadece ailesinin onuru ve görevleri için yaşayan birine dönüşmüştür. Varkas, merhum imparatoriçeye verdiği sözü yerine getirmek adına Talia'nın büyük üvey ablası Aila ile nişanlanır. Zaten kırılgan bir hayat süren Talia için bu karar, taşıması neredeyse imkânsız bir yıkıma dönüşür. İmkânsız, yasak ve sonu acı gibi görünen bu aşk, tam da her şeyin tükendiği anda beklenmedik bir dönüm noktasına ulaşır. The Forgotten Field, saray entrikaları, bastırılmış duygular ve yaralı iki insanın kaderle örülü ilişkisini anlatan dramatik bir tarihi romantizm hikâyesi sunuyor. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | PASS | 32 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
