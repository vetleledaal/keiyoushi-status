# Extension Validation Report

- Extension: tachiyomi-id.ainzscansid-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 6828652413569586396
- Source name: Ainz Scans ID
- Source language: id
- Selected manga input: popular offset 0: Leveling In The Future (`.../leveling-in-the-future`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Leveling In The Future (`.../leveling-in-the-future`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Versatile Sword Cultivator (`.../versatile-sword-cultivator`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | The Demon Blades (`.../the-demon-blades`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Ancestor (`.../ancestor`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Leveling In The Future (`.../leveling-in-the-future`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Leveling In The Future (`.../leveling-in-the-future`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 351 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 80 |  |  | 1-10s |

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
| chapters | PASS | 351 chapters |  |  |  |
| chapter dates | PASS | 351 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 80 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gambar.xyz/.../639b9c54926a6012c3a54d08ea37f0a4.jpg` (image/jpeg, 164488 bytes, 720x2163) |  |  |  |
