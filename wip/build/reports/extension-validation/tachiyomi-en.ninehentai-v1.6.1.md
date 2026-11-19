# Extension Validation Report

- Extension: tachiyomi-en.ninehentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7689490563697355048
- Source name: NineHentai
- Source language: en
- Selected manga input: popular offset 0: [Circle Spice] These mother and son only have 10 minutes for their secret sex! | Kono Haha To Musuko Ga Kateinai SEX Dekiru Jikan Wa Juppun Dake! [English] [Ghostmilflame] (`.../154752`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | [Circle Spice] These mother and son only have 10 minutes for their secret sex! | Kono Haha To Musuko Ga Kateinai SEX Dekiru Jikan Wa Juppun Dake! [English] [Ghostmilflame] (`.../154752`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | [Kagono Tori] Kekkyoku Mesugaki wa Otona ni Katenai | In the End, A Little Brat Can't Beat an Adult [English] [gotbored] [Digital] (`.../154572`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | [CLEF]  Daily Life in The Village- (`.../155124`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | [みみっく] skeb依頼 アーキタイプ：アース三姉妹と志貴君のお話 (`.../155107`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 18 | [Circle Spice] These mother and son only have 10 minutes for their secret sex! | Kono Haha To Musuko Ga Kateinai SEX Dekiru Jikan Wa Juppun Dake! [English] [Ghostmilflame] (`.../154752`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Circle Spice] These mother and son only have 10 minutes for their secret sex! | Kono Haha To Musuko Ga Kateinai SEX Dekiru Jikan Wa Juppun Dake! [English] [Ghostmilflame] (`.../154752`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../154752`) |  | <1s |
| pages | `getPageList(chapter)` | success | 72 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Circle Spice\] These mother and son only have 10 minutes for their secret sex! \| Kono Haha To Musuko Ga Kateinai SEX Dekiru Jikan Wa Juppun Dake! \[English\] \[Ghostmilflame\], URL=`.../154752` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=\[みみっく\] skeb依頼 アーキタイプ：アース三姉妹と志貴君のお話, URL=`.../155107` at page 1 offset 17 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.9hentai.so/.../cover.jpg` (image/jpeg, 75225 bytes, 350x496) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../154752` |  |  |  |
| details thumbnail URL | PASS | `https://i.9hentai.so/.../cover.jpg` |  |  |  |
| details author | PASS | Circle Spice |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Sole Male, Big Breasts, Impregnation, Milf, Mother, Ponytail, Sole Female, Mixed, Full Color, Mosaic Censorship |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Title: \[Circle Spice\] この母と息子が家庭内セックスできる時間は10分だけ!<br><br>Pages: 72 pages<br><br>Category: Doujinshi<br><br>Language: English |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 72 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.9hentai.so/.../1.jpg` (image/jpeg, 520095 bytes, 1280x1810) |  |  |  |
