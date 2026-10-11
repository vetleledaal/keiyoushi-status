# Extension Validation Report

- Extension: tachiyomi-all.nhentaixxx-v1.6.11
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: galleryadults
- Source ID: 1759845183972082995
- Source name: NHentai.xxx
- Source language: en
- Selected manga input: popular offset 0: [Jairou] Shounen ga Otona ni Natta Natsu [English] [Decensored] (`.../498213`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | [Jairou] Shounen ga Otona ni Natta Natsu [English] [Decensored] (`.../498213`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | [Jajujo (Jovejun.)] My Daily Life, Taking Care of Sexual Urges with My Naughty Sister ~If I Win Against Onee-chan, We'll Have Raw, Impregnation Sex!♥~ [Digital] [English] [tsuyoshi] (`.../520159`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | [Murata Denji] Mesu Gaki Ririka-chan Wakarase Keikaku 2 (Shoujo Kumikyoku 31) [English] [MTL] (`.../705387`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | [Azuma Tesshin] Motokano 1 Ch.1-7 [English] [biribiri] (`.../705304`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Jairou] Shounen ga Otona ni Natta Natsu [English] [Decensored] (`.../498213`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../498213`) |  | <1s |
| pages | `getPageList(chapter)` | success | 199 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.nhentaimg.com/.../thumb.jpg` (image/jpeg, 44568 bytes, 250x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../498213` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.nhentaimg.com/.../cover.jpg` (image/jpeg, 77383 bytes, 350x506) |  |  |  |
| details author | PASS | jairou, xil |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big breasts, double vaginal, exhibitionism, ffm threesome, filming, glasses, group, harem, incest, lolicon, mmf threesome, nakadashi, netorare, rough translation, shotacon, sister, story arc, tankoubon, uncensored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Languages**: english, translated<br><br>**Category**: doujinshi<br><br>**Pages**: 199<br><br>**Alternative title**: 少年が大人になった夏 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 199 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://i2.nhentai.xxx/.../1.jpg` to `https://i2.nhentaimg.com/.../1.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://i2.nhentai.xxx/.../1.jpg` (image/jpeg, 332013 bytes, 1280x1850) |  |  |  |
