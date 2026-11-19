# Extension Validation Report

- Extension: tachiyomi-id.siimanga-v1.6.62
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4762501899936439936
- Source name: Siikomik
- Source language: id
- Selected manga input: popular offset 0: Tears on a Withered Flower (`.../tears-on-a-withered-flower`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | The Peaceful Life Of A Maid Who Hides Her Power And Enjoys It (`.../the-peaceful-life-of-a-maid-who-hides-her-power-and-enjoys-it`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Reverse Try (`.../reverse-try`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | On a Perfect Revenge (`.../on-a-perfect-revenge`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 125 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tears on a Withered Flower, URL=`.../tears-on-a-withered-flower` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://siikomik.com/.../Tears-on-a-Withered-Flower.webp <redacted query values: exp and sig>` (image/webp (container: extended), 90600 bytes, 960x1246) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tears-on-a-withered-flower` |  |  |  |
| details thumbnail URL | PASS | `https://siikomik.com/.../Tears-on-a-Withered-Flower.webp <redacted query values: exp and sig>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Drama, Romance, Adult |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 4.7 (72)<br><br>Kehidupan Na Hae-soo berubah ketika suaminya mengkhianatinya dengan berselingkuh, membuatnya terlilit hutang dan kehilangan anak mereka. Setelah itu, ia mendapati suaminya bersama seorang wanita yang lebih muda. Dengan perasaan hancur dan putus asa, Na Hae-soo merasa kehidupannya di sekelilingnya runtuh dan hancur. Namun, seorang pemuda misterius tiba-tiba memasuki hidupnya, meminta untuk diajari tentang cinta orang dewasa. Keluguan dan ketulusannya mulai mengusik emosi dalam diri Na Hae-soo, dan menantangnya untuk mempertimbangkan kembali langkah apa yang akan diambil.<br><br>**Alternative Names:**<br>- 시든 꽃에 눈물을<br>- Air Mata Bunga yang Layu |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 125 chapters |  |  |  |
| chapter dates | PASS | 125 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://siikomik.com/.../01.webp <redacted query values: exp and sig>` (image/webp (encoding: lossy), 391954 bytes, 800x8000) |  |  |  |
