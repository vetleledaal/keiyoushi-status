# Extension Validation Report

- Extension: tachiyomi-all.nhentaito-v1.6.10
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: galleryadults
- Source ID: 1911624300824763845
- Source name: NHentai.to
- Source language: en
- Selected manga input: popular offset 0: [Amagami Honpo (Manno)] Iribitari Gal ni Manko Tsukawasete Morau Hanashi 1 - 3 | The Gyaru I Hang Out with Lets Me Use Her Pussy 1 - 3 [English] [Digital] (`.../532611`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | [Amagami Honpo (Manno)] Iribitari Gal ni Manko Tsukawasete Morau Hanashi 1 - 3 | The Gyaru I Hang Out with Lets Me Use Her Pussy 1 - 3 [English] [Digital] (`.../532611`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | [Kamatsuka (Kamatsuka)] Chichi no Saikon de Doukyo suru Koto ni Natta Gibo no Gijou Shimai to Kawarugawaru Sex shite shimatta Hon | Living with My Stepmom and Stepsisters After Dad's Remarriage and Having Sex with Them All [English] [Digital] (`.../565276`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | [Blue Percussion (Bourne)] Kiara's Destruction - The Organ Destruction of a fallen heroine [ENG] (`.../680870`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | [Hoshino Ryuichi] Hitozuma Onmyouji Sakuya 1 - 3 (`.../680751`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Amagami Honpo (Manno)] Iribitari Gal ni Manko Tsukawasete Morau Hanashi 1 - 3 | The Gyaru I Hang Out with Lets Me Use Her Pussy 1 - 3 [English] [Digital] (`.../532611`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../532611`) |  | <1s |
| pages | `getPageList(chapter)` | success | 110 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zrocdn.xyz/.../thumb.jpg` (image/webp (encoding: lossy), 17352 bytes, 500x704; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../532611` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://zrocdn.xyz/.../cover.jpg` (image/webp (encoding: lossy), 26312 bytes, 700x985; server Content-Type: image/jpeg) |  |  |  |
| details author | PASS | manno |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ahegao, big areolae, big breasts, blowjob, compilation, condom, cunnilingus, emotionless sex, glasses, gyaru, multi-work series, nakadashi, schoolgirl uniform, sole female, sole male, twintails, x-ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies**: original<br><br>**Groups**: amagami honpo<br><br>**Languages**: english, translated<br><br>**Categories**: doujinshi<br><br>**Pages**: 110<br><br>**Alternative title**: \[甘噛本舗 (まんの)\] 入り浸りギャルにま〇こ使わせて貰う話1 - 3 \[英訳\] \[DL版\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 110 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://zrocdn.xyz/.../1.jpg` (image/jpeg, 264203 bytes, 1280x1801) |  |  |  |
