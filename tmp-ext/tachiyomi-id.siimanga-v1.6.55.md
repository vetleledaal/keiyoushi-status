# Extension Validation Report

- Extension: tachiyomi-id.siimanga-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4762501899936439936
- Source name: Siikomik
- Source language: id
- Selected manga input: popular offset 0: Tears on a Withered Flower (`.../218`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Tears on a Withered Flower (`.../218`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | A Secretly Capable Child Is Seeking For Her Dad (`.../529`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Sister-in-law of the Heroine in a Childcare Novel (`.../1336`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Back-Alley Illegal Clinic (`.../1584`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tears on a Withered Flower (`.../218`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tears on a Withered Flower (`.../218`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 116 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tears on a Withered Flower, URL=`218` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://siikomik.id/.../Tears-on-a-Withered-Flower-175x238.webp` (image/webp (container: extended), 10552 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `218` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://siikomik.id/.../Tears-on-a-Withered-Flower.webp` (image/webp (container: extended), 90600 bytes, 960x1246) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Drama, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kehidupan Na Hae-soo berubah ketika suaminya mengkhianatinya dengan berselingkuh, membuatnya terlilit hutang dan kehilangan anak mereka. Setelah itu, ia mendapati suaminya bersama seorang wanita yang lebih muda. Dengan perasaan hancur dan putus asa, Na Hae-soo merasa kehidupannya di sekelilingnya runtuh dan hancur. Namun, seorang pemuda misterius tiba-tiba memasuki hidupnya, meminta untuk diajari tentang cinta orang dewasa. Keluguan dan ketulusannya mulai mengusik emosi dalam diri Na Hae-soo, dan menantangnya untuk mempertimbangkan kembali langkah apa yang akan diambil.<br><br>Alternative Names: 시든 꽃에 눈물을 / Air Mata Bunga yang Layu |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 116 chapters |  |  |  |
| chapter dates | LINT | 111 of 116 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=111 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `chapters` at offsets 0, 1 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ffjackss107.my.id/.../01.webp` (image/webp (encoding: lossy), 391954 bytes, 800x8000) |  |  |  |
