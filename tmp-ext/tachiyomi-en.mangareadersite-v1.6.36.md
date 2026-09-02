# Extension Validation Report

- Extension: tachiyomi-en.mangareadersite-v1.6.36
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
- Source ID: 2527199067559866087
- Source name: MangaReader.site
- Source language: en
- Selected manga input: popular offset 0: Kimetsu no Yaiba (`.../kimetsu-no-yaiba_106`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Kimetsu no Yaiba (`.../kimetsu-no-yaiba_106`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Yuan Zun (`.../yuan-zun`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Shinka no Mi (`.../shinka-no-mi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Kamen Rider W: Fuuto Tantei (`.../kamen-rider-w-fuuto-tantei`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kimetsu no Yaiba (`.../kimetsu-no-yaiba_106`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kimetsu no Yaiba (`.../kimetsu-no-yaiba_106`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 236 | Chapter 1 - Cruelty (`.../chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kimetsu no Yaiba, URL=`.../kimetsu-no-yaiba_106` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb.mghcdn.com/.../kimetsu-no-yaiba.jpg` (image/jpeg, 123502 bytes, 250x358) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kimetsu-no-yaiba_106` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.mghcdn.com/.../kimetsu-no-yaiba.jpg` |  |  |  |
| details author | PASS | Gotouge Koyoharu |  |  |  |
| details artist | PASS | Gotouge Koyoharu |  |  |  |
| details genres | PASS | Historical, Action, Comedy, Adventure, Drama, Tragedy, Demons, Martial Arts, Supernatural, Shounen, Safe |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tanjiro is the oldest son in his family who has lost his father. One day, Tanjiro ventures off to another town to sell charcoal. Instead of going home, he ends up staying the night at someone else's house due to rumors of a demon nearby in the mountains. When he gets home the following day, a terrible tragedy awaits him.<br><br>Alternative Names:<br>- 鬼滅の刃<br>- 鬼灭之刃 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 236 chapters |  |  |  |
| chapter dates | PASS | 236 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imgx.mghcdn.com/.../1.jpg` (image/jpeg, 243909 bytes, 728x1059) |  |  |  |
