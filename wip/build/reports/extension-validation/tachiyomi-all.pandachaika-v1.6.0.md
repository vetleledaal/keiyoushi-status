# Extension Validation Report

- Extension: tachiyomi-all.pandachaika-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.l
- Source ID: 3599272016034823454
- Source name: PandaChaika
- Source language: en
- Selected manga input: popular offset 0: [Hyocorou] Lover Delivery Service [ENG] (`.../19845`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | [Hyocorou] Lover Delivery Service [ENG] (`.../19845`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 100 | [Mino Inomi] Tonight I tell My Older Sister! (COMIC Kairakuten BEAST 2012-09) [English] [The Lusty Lady Project] (`.../2876`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | [diletta (Bunapi 397 Yen)] Class de Kakure Ninki no Hirose-san ga Guigui kuru! | Hirose-san, the class's secret crush, is making a bold move! [English] [meganekun_tl] [Digital] (`.../63928`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 100 | [Master of Tea & Chaos Studio (Sencha Bashira, Mugicha Bashira)] Isekai 100-nin Giri | 100+ Body Counts in Isekai [English] [Digital] (`.../63366`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [Hyocorou] Lover Delivery Service [ENG] (`.../19845`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Hyocorou] Lover Delivery Service [ENG] (`.../19845`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../19845`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Hyocorou\] Lover Delivery Service \[ENG\], URL=`19845` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 401/401 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 401/401 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.chaika.moe/.../thumb2.jpg` (image/jpeg, 17944 bytes, 195x290) |  |  |  |
| details identity | PASS | Details preserved selected URL `19845` |  |  |  |
| details thumbnail URL | PASS | `https://static.chaika.moe/.../thumb2.jpg` |  |  |  |
| details author | PASS | Hyocorou |  |  |  |
| details artist | PASS | Hyocorou |  |  |  |
| details genres | PASS | Defloration |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Uploader: vivika<br><br>Female tags: Defloration<br><br>Japanese Title: \[ひょころー\]宅配Lover<br>Pages: 16<br>File Size: 5.01 MB<br>Public Date: Friday, 28 Oct 2016 12:32 (CEST)<br>Posted: Wednesday, 2 May 2012 22:20 (CEST)<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://panda.chaika.moe/.../search <redacted query values: sort, asc_desc, category, title, tags, filecount_from, filecount_to, reason, uploader, page, apply, and json>` to `https://panda.chaika.moe/.../search <redacted query values: sort, asc_desc, category, title, tags, filecount_from, filecount_to, reason, uploader, page, apply, and json>` (1 redirects) |  |  |  |
| page load | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network>` (image/png, 294385 bytes, 1079x1600; server Content-Type: application/vnd.comicbook+zip) |  |  |  |
