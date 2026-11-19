# Extension Validation Report

- Extension: tachiyomi-all.hentairox-v1.6.14
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: galleryadults
- Source ID: 2799291971714927306
- Source name: HentaiRox
- Source language: en
- Selected manga input: popular offset 0: [Incognitymous] Sultry Summer (Ben 10) [Ongoing] (`.../650417`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [Incognitymous] Sultry Summer (Ben 10) [Ongoing] (`.../650417`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Mrsmiles [ARTIST] (`.../614791`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | [Hijun, Abyo4] Cougar 101 (Official) [1-73] [OnGoing] (`.../874962`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [Helmeet El Gato] Body Swaping with Zed and Sunny (`.../874913`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | [Incognitymous] Sultry Summer (Ben 10) [Ongoing] (`.../650417`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Incognitymous] Sultry Summer (Ben 10) [Ongoing] (`.../650417`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../650417`) |  | <1s |
| pages | `getPageList(chapter)` | success | 333 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Incognitymous\] Sultry Summer (Ben 10) \[Ongoing\], URL=`.../650417` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 86/86 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 86/86 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://m9.hentairox.com/.../thumb.jpg` (image/jpeg, 44770 bytes, 250x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../650417` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://m9.hentairox.com/.../cover.jpg` (image/jpeg, 74940 bytes, 350x504) |  |  |  |
| details author | PASS | incognitymous |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ahegao, anal, blowjob, comic, cousin, cunnilingus, deepthroat, defloration, exhibitionism, femdom, ffm threesome, forced exposure, full color, group, hidden sex, incest, lolicon, masturbation, nakadashi, selfcest, shimapan, shotacon, story arc, sumata, virginity |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies**: ben 10<br><br>**Characters**: ben tennyson, gwen tennyson, lucy mann<br><br>**Groups**: group<br><br>**Languages**: english<br><br>**Category**: western<br><br>**Pages**: 333 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 333 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://m9.hentairox.com/.../1.jpg` (image/jpeg, 263116 bytes, 1280x1843) |  |  |  |
