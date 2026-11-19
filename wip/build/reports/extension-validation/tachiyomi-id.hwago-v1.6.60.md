# Extension Validation Report

- Extension: tachiyomi-id.hwago-v1.6.60
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
- Source implementation: keiyoushi.source.Generated
- Source theme: hwalumi
- Source ID: 5490253431755133280
- Source name: Hwago
- Source language: id
- Selected manga input: popular offset 0: Beasts That Cross the Line (`.../beasts-that-cross-the-line`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Beasts That Cross the Line (`.../beasts-that-cross-the-line`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Atonement, For Your Cruelty [ MOCCACINNO×MILUNA ] (`.../atonement-for-your-cruelty-moccacinnomiluna`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Spirit Fingers (`.../spirit-fingers`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Ardel's Couple Fraud (`.../ardels-couple-fraud`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Beasts That Cross the Line (`.../beasts-that-cross-the-line`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Beasts That Cross the Line (`.../beasts-that-cross-the-line`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 75 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Beasts That Cross the Line, URL=`beasts-that-cross-the-line` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hwg.imgsvr.my.id/.../cover_iiNiek.webp` (image/jpeg, 21545 bytes, 299x400; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `beasts-that-cross-the-line` |  |  |  |
| details thumbnail URL | PASS | `https://hwg.imgsvr.my.id/.../cover_iiNiek.webp` |  |  |  |
| details author | PASS | Kkoleuleuk |  |  |  |
| details artist | PASS | Jeonghwa |  |  |  |
| details genres | PASS | Adult, Drama, Ecchi, Mature, Reverse Harem, Smut, Josei |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Kehidupan sehari-hari yang membosankan… pria-pria berbahaya datang untuk membangkitkan nalurimu.”<br>Para wanita... B... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 75 chapters |  |  |  |
| chapter dates | LINT | All 75 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=75 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hwg.imgsvr.my.id/.../001_EgWFJa.webp` (image/webp (container: extended), 413726 bytes, 728x7280) |  |  |  |
