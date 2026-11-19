# Extension Validation Report

- Extension: tachiyomi-all.manga18fx-v1.6.61
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
- Source ID: 3157287889751723714
- Source name: Manga18fx
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../secret-class-01`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | Secret Class (`.../secret-class-01`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | Mother’s Friends (`.../mothers-friends`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 23 | Return of the First Patriarch: The Strongest Reincarnates into His Descendant 1000 Years Later (`.../return-of-the-first-patriarch-the-strongest-reincarnates-into-his-descendant-1000-years-later`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Genius Archer’s Streaming (`.../genius-archers-streaming`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Secret Class (`.../secret-class-01`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../secret-class-01`) |  | <1s |
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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class-01` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 66/66 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 66/66 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga18fx.com/.../secret-classm.jpg` (image/jpeg, 16570 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class-01` |  |  |  |
| details thumbnail URL | PASS | `https://manga18fx.com/.../secret-classm.jpg` |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Minachan |  |  |  |
| details genres | PASS | Adult, Comedy, Harem, Romance, Seinen, Slice of Life, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Secret Class is about a wife of two cheating on her husband with whom she has two daughters and a boy they took in.<br><br>Alternative names: 비밀 수업 / 秘密教學 / Clases secretas / Secret Teaching / Bimilsueop / 비밀수업 / 秘密教学 / 秘密の授業 / Kelas Rahasia / Bi mi jiao xue / Enseñanza Secreta / Cuck Class |  |  |  |
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
| page load | PASS | `https://img01.manga18fx.com/.../1-001.jpg` (image/webp (encoding: lossy), 41812 bytes, 720x880; server Content-Type: image/jpeg) |  |  |  |
