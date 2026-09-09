# Extension Validation Report

- Extension: tachiyomi-tr.okutoon-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
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
| popular | `fetchPopularManga(1)` | success | 24 | The Forgotten Field (`.../the-forgotten-field`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Return of the Unrivaled Spear Knight (`.../return-of-the-unrivaled-spear-knight`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Survival Story of a Sword King in a Fantasy World (`.../survival-story-of-a-sword-king-in-a-fantasy-world`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Regressing as the Reincarnated Bastard of the Sword Clan (`.../regressing-as-the-reincarnated-bastard-of-the-sword-clan`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Forgotten Field (`.../the-forgotten-field`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Forgotten Field (`.../the-forgotten-field`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 34 | Bölüm 1 (`.../bolum-1`) |  | 1-10s |
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
| chapters | PASS | 34 chapters |  |  |  |
| chapter dates | PASS | 34 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
