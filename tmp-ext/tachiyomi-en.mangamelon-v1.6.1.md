# Extension Validation Report

- Extension: tachiyomi-en.mangamelon-v1.6.1
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7505916148185744347
- Source name: MangaMelon
- Source language: en
- Selected manga input: popular offset 0: Jujutsu Kaisen (`.../E46a7z53`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Jujutsu Kaisen (`.../E46a7z53`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | Naruto (Color) (`.../YP9fI3L7`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Sword Art Online - Unital Ring (`.../jPrUDI6o`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | The Fox Club (`.../dBMXTAR1`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Jujutsu Kaisen (`.../E46a7z53`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jujutsu Kaisen (`.../E46a7z53`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 273 | Chapter 1 (`.../NpSqBe8u`) |  | <1s |
| pages | `getPageList(chapter)` | success | 58 |  |  | <1s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jujutsu Kaisen, URL=`E46a7z53` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 147/147 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 147/147 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fs.mangamelon.com/.../aKV2.webp` (image/webp (encoding: lossy), 67706 bytes, 460x722) |  |  |  |
| details identity | PASS | Details preserved selected URL `E46a7z53` |  |  |  |
| details thumbnail URL | PASS | `https://fs.mangamelon.com/.../aKV2.webp` |  |  |  |
| details author | PASS | AKUTAMI Gege |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Horror, School Life, Shounen, Supernatural |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Although Yuji Itadori looks like your average teenager, his immense physical strength is something to behold! Every sports club wants him to join, but Itadori would rather hang out with the school outcasts in the Occult Research Club. One day, the club manages to get their hands on a sealed cursed object. Little do they know the terror they’ll unleash when they break the seal. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 273 chapters |  |  |  |
| chapter dates | PASS | 273 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://fs.mangamelon.com/.../Gziz.webp` (image/webp (encoding: lossy), 189562 bytes, 1067x1600) |  |  |  |
