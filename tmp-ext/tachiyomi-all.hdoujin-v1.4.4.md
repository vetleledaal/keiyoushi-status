# Extension Validation Report

- Extension: tachiyomi-all.hdoujin-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 3677056573528884471
- Source name: HDoujin
- Source language: en
- Selected manga input: latest offset 0: [Numirechan] HouseMaid Rena comic [English, Japanese] (`.../3d215df97763`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 80 | [Bad Mushrooms (Chicke III, 4why)] 1/5 no Renai Kanjou (Gotoubun no Hanayome) [English] [Digital] [Sample] (`.../f80ff5318f79`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 80 | [Eromazun (Ma-kurou)] Kyonyuu na Gibo, Nyuuyoku Chuu 2 | My Busty Stepmother In The Bath, Part 2 [English] (`.../8801ccc61911`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 80 | [Numirechan] HouseMaid Rena comic [English, Japanese] (`.../3d215df97763`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 80 | [Jikomanzoku (Akitsuki Itsuki)] Saimin-kei Omnibus -hypnostasy- | Hypnosis Omnibus -hypnostasy- [Digital] [English] [Morally Bankrupt Wizard Translations] (`.../71ca46031c9a`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | [Numirechan] HouseMaid Rena comic [English, Japanese] (`.../3d215df97763`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Numirechan] HouseMaid Rena comic [English, Japanese] (`.../3d215df97763`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../3d215df97763`) |  | 1-10s |
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
| popular listing | PASS | 80 entries |  |  |  |
| latest listing | PASS | 80 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Numirechan\] HouseMaid Rena comic \[English, Japanese\], URL=`225658/3d215df97763` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 322/322 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 322/322 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://erocdn.net/.../dc2d2180-d35e-4d0c-ac49-ecb7d63b22d1.webp` (image/webp (encoding: lossy), 21050 bytes, 250x353) |  |  |  |
| details identity | PASS | Details preserved selected URL `225658/3d215df97763` |  |  |  |
| details thumbnail URL | PASS | `https://erocdn.net/.../dc2d2180-d35e-4d0c-ac49-ecb7d63b22d1.webp` |  |  |  |
| details author | PASS | Sumirechan |  |  |  |
| details artist | PASS | Sumirechan |  |  |  |
| details genres | PASS | Sumirechan |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Uploaders: Ninetydollardoujin<br><br>Posted: Wednesday, 9 Sep 2026 20:46 (CEST)<br>Pages: 15<br><br> |  |  |  |
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
