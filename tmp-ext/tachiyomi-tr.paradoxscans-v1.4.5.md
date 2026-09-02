# Extension Validation Report

- Extension: tachiyomi-tr.paradoxscans-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 3
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3730980240510982131
- Source name: Paradox Scans
- Source language: tr
- Selected manga input: popular offset 0: Bu Ülkeyi Ortadan Kaldırmayı Planlıyorum (`.../bu-ulkeyi-ortadan-kaldirmayi-planliyorum`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Bu Ülkeyi Ortadan Kaldırmayı Planlıyorum (`.../bu-ulkeyi-ortadan-kaldirmayi-planliyorum`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Cehennemde Harem Açtım (`.../i-opened-a-harem-in-hell`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Akademinin Oyuncusunu Öldürdüm (`.../akademinin-oyuncusunu-oldurdum`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Suikastçı Klanının En Küçük Oğlu, Beş İblis Kralının Gücüyle Geçmişe Dönüyor (`.../suikastci-klaninin-en-kucuk-oglu-bes-iblis-kralinin-gucuyle-gecmise-donuyor`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 10 | Bu Ülkeyi Ortadan Kaldırmayı Planlıyorum (`.../bu-ulkeyi-ortadan-kaldirmayi-planliyorum`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Bu Ülkeyi Ortadan Kaldırmayı Planlıyorum (`.../bu-ulkeyi-ortadan-kaldirmayi-planliyorum`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 91 | Bölüm 1 (`.../bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bu Ülkeyi Ortadan Kaldırmayı Planlıyorum, URL=`.../bu-ulkeyi-ortadan-kaldirmayi-planliyorum` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 106/106 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 106/106 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://paradoxscans.com/.../gorsel_2026-09-01_202158956-300x400.png` (image/png, 252569 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bu-ulkeyi-ortadan-kaldirmayi-planliyorum` |  |  |  |
| details thumbnail URL | FAIL | Thumbnail URL `data:image/gif;base64,R0lGODdhAQABAPAAAMPDwwAAACwAAAAAAQABAAACAkQBADs=` is not an absolute HTTP(S) URL (data scheme) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Aksiyon, drama, Fantazi, 6h 4m to finish |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Bir zamanlar her şeye gücü yeten İskelet Kralı olan Kim Isaac, artık tulum giymiş bir bebek. Tanrılar tarafından kandırılıp hapsedildikten sonra, Kutsal İmparatorluğun kalbinde yaşayan bir aziz ailesine reenkarne oldu. Yürüyemiyor ve konuşamıyor, ama entrika kurabiliyor. Gölgelerden çalışan sadık iblis takipçileri ve yeraltı dünyasından bile daha derin bir kinle donanmış olan bu bebek, sevimli görünmek için burada değil — intikam almak için burada. Kutsal İmparatorluk, başlarına neyin geleceğinden habersiz… ve tanrılar, İskelet Kralı’na karşı geldiklerine çok yakında pişman olacaklar!<br><br>Alternatif Başlık: Bu Ülkeyi Ortadan Kaldırmayı Planlıyorum • I'm Going to Destroy This Country • I'm Gonna Annihilate This Land • I Will Raze This Land • I'm Going to Wipe Out This Country • Holy Hella's Ultimate End • Voy a aniquilar esta tierra • 이 나라를 없앨 예정인데요 • 聖者ですが、この国を滅ぼします |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 91 chapters |  |  |  |
| chapter dates | PASS | 91 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://c1.skycdn.online/.../0001.jpg` (image/jpeg, 1241550 bytes, 760x14000) |  |  |  |
