# Extension Validation Report

- Extension: tachiyomi-all.manga18me-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source theme: yiimadara
- Source ID: 6244055465910932489
- Source name: Manga18.me
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 21 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 21 | My Brother’s Slipped Inside Me in The Bathtub (`.../my-brothers-slipped-inside-me-in-the-bathtub`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 23 | Villain To Kill (`.../villain-to-kill`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | KinkFolder.ZIP (`.../kinkfolderzip`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 339 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | <1s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 78/78 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 78/78 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga18.me/.../secret-class-thumbnail.jpg` (image/jpeg, 16570 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://manga18.me/.../secret-class-thumbnail.jpg` |  |  |  |
| details author | PASS | Gang-cheol Wang |  |  |  |
| details artist | PASS | Minachan |  |  |  |
| details genres | PASS | Comedy, Harem, Mature, Romance, Slice of Life, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dae Ho, who became an orphan at the age of 13, was adopted by his father’s friend. However, Dae Ho in adulthood knew nothing about the relationship between men and women. Aunt and sisters decided to give pure Dae Ho a secret class… This story is about a wife of two cheating on her husband with whom she has two daughters and a boy they took in.<br><br>Alternative names: Bimilsueop ; 비밀 수업 ; 秘密教學 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 339 chapters |  |  |  |
| chapter dates | LINT | 1 of 339 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img-r1.manga18.me/.../1-001.jpg` (image/webp (encoding: lossy), 41812 bytes, 720x880; server Content-Type: image/jpeg) |  |  |  |
