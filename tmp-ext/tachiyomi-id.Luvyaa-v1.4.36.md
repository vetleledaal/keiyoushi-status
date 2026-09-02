# Extension Validation Report

- Extension: tachiyomi-id.Luvyaa-v1.4.36
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1316015886884953118
- Source name: Luvyaa
- Source language: id
- Selected manga input: latest offset 0: King of Beasts (`.../king-of-beasts`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Flowers Are Bait (`.../flowers-are-bait`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 18 | A Pervert Who Only Picks and Devours Other Perverts (`.../a-pervert-who-only-picks-and-devours-other-perverts`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | King of Beasts (`.../king-of-beasts`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | Yuusha Party wo Kubi ni Natta node Kokyou ni Kaettara, Member Zenin ga Tsuitekitandaga (`.../yuusha-party-wo-kubi-ni-natta-node-kokyou-ni-kaettara-member-zenin-ga-tsuitekitandaga`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 67 | Campus Favorite (`.../campus-favorite`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | King of Beasts (`.../king-of-beasts`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 11 | Chapter 1 (`.../king-of-beasts-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 30: title=King of Beasts, URL=`.../king-of-beasts` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 139/139 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 139/139 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://v4.luvyaa.co/.../i505203.png` (image/png, 137481 bytes, 300x399) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../king-of-beasts` |  |  |  |
| details thumbnail URL | PASS | `https://v4.luvyaa.co/.../i505203.png` |  |  |  |
| details author | PASS | Author |  |  |  |
| details artist | PASS | Artist |  |  |  |
| details genres | PASS | Genre, Action, School life, Supernatural |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Di benua Arkava, klan-klan binatang memegang kekuasaan lewat Hukum Taring yang kejam. Raka, pewaris Klan Singa yang masih muda, difitnah membunuh ayahnya sendiri pada malam penobatan. Ia kabur ke kota pelabuhan dan menyamar di tengah manusia, lalu menemukan jejak konspirasi antara para pedagang senjata dan Klan Serigala yang ingin memicu perang besar agar pasar mereka laku. Sambil diburu para pemburu tahta, Raka belajar menahan amarahnya dan membaca tanda-tanda alam yang diwariskan leluhurnya. Dengan bantuan Liora si pemanah elang, Niru sang dukun kadal, dan Yasha putri harimau yang membangkang tradisi, Raka menelusuri legenda Mahkota Akar yang konon bisa menautkan suara seluruh klan. Setiap langkah membuka rahasia masa lalu yang getir, termasuk kebenaran tentang kematian sang raja. Pada klimaks, Raka menantang Hukum Taring bukan dengan dominasi, melainkan dengan perjanjian baru yang melindungi rantai kehidupan. Gelar Raja Para Binatang akhirnya berarti lebih dari sekadar kekuatan, melainkan keberanian untuk memutus siklus balas dendam dan memulai era yang adil bagi semua makhluk.<br><br>Alternative Names: The King of Beasts, 百兽之王, 覇王兵士、復讐する |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img1.cdn-nyaa.link/.../01.webp <redacted query values: v>` (image/webp (container: extended), 428460 bytes, 728x7700) |  |  |  |
