# Extension Validation Report

- Extension: tachiyomi-all.koharu-v1.4.20
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 1484902275639232927
- Source name: SchaleNetwork
- Source language: en
- Selected manga input: latest offset 0: [Hatsui Tsumo] Gold Medal Thrusting (`.../105f9fbe022c`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | [Kansai Orange (Arai Kei)] Knock-Up Game (`.../978190285bad`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 40 | [Yamanashi Musume (Shituzhi & Tulip)] I Spent the Whole Time Fucking My Girlfriend's Friend While She Went on a Trip 1 (`.../5a9520b29fc9`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 40 | [Hatsui Tsumo] Gold Medal Thrusting (`.../105f9fbe022c`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | [ShindoL] Exposed Love -Sarashi Ai- (`.../ed1cbb746a2b`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | [Hatsui Tsumo] Gold Medal Thrusting (`.../105f9fbe022c`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Hatsui Tsumo] Gold Medal Thrusting (`.../105f9fbe022c`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../105f9fbe022c`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.io.IOException: Open webview to refresh token | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.io.IOException: Open webview to refresh token | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Hatsui Tsumo\] Gold Medal Thrusting, URL=`27597/105f9fbe022c` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nozomi.erocdn.net/.../320.jpg` (image/jpeg, 16655 bytes, 320x452) |  |  |  |
| details identity | PASS | Details preserved selected URL `27597/105f9fbe022c` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://nozomi.erocdn.net/.../896.jpg` (image/jpeg, 102714 bytes, 896x1265) |  |  |  |
| details author | PASS | Hatsui Tsumo |  |  |  |
| details artist | PASS | Hatsui Tsumo |  |  |  |
| details genres | PASS | Hatsui Tsumo, Big Penis, Blowjob, Bukkake, Nakadashi, Osananajimi, Ponytail, Busty ♀, Full Color, Vanilla |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Posted: Wednesday, 9 Sep 2026 08:14 (CEST)<br>Pages: 56<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Open webview to refresh token |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
