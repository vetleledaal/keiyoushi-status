# Extension Validation Report

- Extension: tachiyomi-id.ainzscansid-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6828652413569586396
- Source name: Ainz Scans ID
- Source language: id
- Selected manga input: popular offset 0: Leveling In The Future (`.../leveling-in-the-future`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Leveling In The Future (`.../leveling-in-the-future`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Versatile Sword Cultivator (`.../versatile-sword-cultivator`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Chaotic Sword God (`.../chaotic-sword-god`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Job Change: I am the Strongest Paladin (`.../job-change-i-am-the-strongest-paladin`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Leveling In The Future (`.../leveling-in-the-future`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Leveling In The Future (`.../leveling-in-the-future`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 50 | Chapter 299 (`.../chapter-299`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Leveling In The Future, URL=`.../leveling-in-the-future` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://adminv2.ainzscans01.com/.../cover-f755e9e6-1ea9-11f1-9ab1-02420a000b03-db022a29-e1a3-437f-a5a2-57ee1f0c0554.webp` (image/webp (encoding: lossy), 51070 bytes, 456x652) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../leveling-in-the-future` |  |  |  |
| details thumbnail URL | PASS | `https://adminv2.ainzscans01.com/.../cover-f755e9e6-1ea9-11f1-9ab1-02420a000b03-db022a29-e1a3-437f-a5a2-57ee1f0c0554.webp` |  |  |  |
| details author | PASS | 常盘勇者 |  |  |  |
| details artist | PASS | 常盘勇者 |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Pada zaman kuno, binatang buas menyerang dunia dan umat manusia kalah dalam pertarungan. Lu Sheng bertransmigrasi ke masa itu, namun dalam mimpinya dia memasuki 10.000 tahun kemudian di dunia itu yang memiliki pengetahuan tentang teknik bela diri yang lebih maju, membuatnya memiliki harapan untuk mengubah keadaan. Meskipun peradaban bela diri telah mencapai puncaknya, Lu Sheng menjadi satu-satunya harapan untuk memulihkan umat manusia. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | PASS | 50 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.uqni.net/.../000.png` (image/png, 1073814 bytes, 1853x1322) |  |  |  |
