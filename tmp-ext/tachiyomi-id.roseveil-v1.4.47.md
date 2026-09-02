# Extension Validation Report

- Extension: tachiyomi-id.roseveil-v1.4.47
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
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
- Source ID: 5328028029485519937
- Source name: Roseveil
- Source language: id
- Selected manga input: popular offset 0: ADULT READING CLUB (Moymoyxi) (`.../adult-reading-club-moymoyxi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | ADULT READING CLUB (Moymoyxi) (`.../adult-reading-club-moymoyxi`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | I Drank It Instead of My Husband [SAKURA] (`.../i-drank-it-instead-of-my-husband-sakura`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Somehow with My Brother's Friend [ROSEVEIL] (`.../somehow-with-my-brothers-friend-roseveil`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Tidal Warning [ROSEVEIL] (`.../tidal-warning-roseveil`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ADULT READING CLUB (Moymoyxi) (`.../adult-reading-club-moymoyxi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ADULT READING CLUB (Moymoyxi) (`.../adult-reading-club-moymoyxi`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 12 | Chapter 31 (`.../chapter-31`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ADULT READING CLUB (Moymoyxi), URL=`adult-reading-club-moymoyxi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.roseveil.org/.../cover-ac4bbc60-1365-11f1-97f7-02420a000503-004b0544-88e1-4107-8c03-68c90278e6ee.png` (image/png, 94138 bytes, 168x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `adult-reading-club-moymoyxi` |  |  |  |
| details thumbnail URL | PASS | `https://api.roseveil.org/.../cover-ac4bbc60-1365-11f1-97f7-02420a000503-004b0544-88e1-4107-8c03-68c90278e6ee.png` |  |  |  |
| details author | PASS | gold bozi |  |  |  |
| details artist | PASS | van |  |  |  |
| details genres | PASS | Drama, Adult, Josei, Mature, Smut |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Pada hari pertama kuliah, Ho-eun bergabung dengan klub kampus—hanya untuk mendapati dirinya dikelilingi oleh para senior yang menawan dan berani tanpa malu-malu. Ia hanya diminta untuk membaca buku dengan keras. Kedengarannya cukup mudah… sampai ia menyadari apa yang sebenarnya ia baca. Bingung dan tidak tahu bagaimana harus bereaksi, Ho-eun terjebak antara rasa malu, kebingungan, dan sensasi aneh yang tidak bisa ia jelaskan. Cara mereka menatapnya, cara mereka menggodanya… itu membangkitkan sesuatu yang asing. Dia ingin lari, tapi ada sesuatu yang menahannya. Lagipula, kelulusannya bergantung pada klub ini. Akankah ia berhasil lolos dari cengkeraman sunbae-sunbae yang mesum dan berbahaya itu, atau akankah ia terseret lebih dalam ke dalam permainan mereka yang menyimpang? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.roseveil.org/.../page_001.jpg` (image/jpeg, 480149 bytes, 827x5742) |  |  |  |
