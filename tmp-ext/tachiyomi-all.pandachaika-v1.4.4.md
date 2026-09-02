# Extension Validation Report

- Extension: tachiyomi-all.pandachaika-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.l
- Source ID: 3599272016034823454
- Source name: PandaChaika
- Source language: en
- Selected manga input: latest offset 0: [Basutei Shower (Katsurai Yoshiaki)] Choukyourankou [English] (`.../3106`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | [Hyocorou] Lover Delivery Service [ENG] (`.../19845`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 100 | [Mino Inomi] Tonight I tell My Older Sister! (COMIC Kairakuten BEAST 2012-09) [English] [The Lusty Lady Project] (`.../2876`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 100 | [Basutei Shower (Katsurai Yoshiaki)] Choukyourankou [English] (`.../3106`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 100 | [(Sencha Bashira, Mugicha Bashira)] Fairy Brothel (Volume 1): The Virgin Orc Assigned To The Dark Skinned Elf [English] [Comics EnjoyerTranslation] (`.../62542`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | [Basutei Shower (Katsurai Yoshiaki)] Choukyourankou [English] (`.../3106`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Basutei Shower (Katsurai Yoshiaki)] Choukyourankou [English] (`.../3106`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../3106`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 35 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Basutei Shower (Katsurai Yoshiaki)\] Choukyourankou \[English\], URL=`3106` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 401/401 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 401/401 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.chaika.moe/.../thumb2.jpg` (image/jpeg, 30038 bytes, 250x355) |  |  |  |
| details identity | PASS | Details preserved selected URL `3106` |  |  |  |
| details thumbnail URL | PASS | `https://static.chaika.moe/.../thumb2.jpg` |  |  |  |
| details author | PASS | Basutei Shower |  |  |  |
| details artist | PASS | Katsurai Yoshiaki |  |  |  |
| details genres | PASS | Schoolboy Uniform, Anal, Big Breasts, Bikini, Blackmail, Bondage, Double Penetration, Impregnation, Mind Break, Mind Control, Piercing, Rape, Schoolgirl Uniform, Slave, Stockings, Swimsuit, X-ray, null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Uploader: arg xd<br><br>Male tags: Schoolboy Uniform<br><br>Female tags: Anal, Big Breasts, Bikini, Blackmail, Bondage, Double Penetration, Impregnation, Mind Break, Mind Control, Piercing, Rape, Schoolgirl Uniform, Slave, Stockings, Swimsuit, X-ray<br><br>Japanese Title: \[バス停シャワー (桂井よしあき)\] 調狂乱孔 \[英訳\]<br>Pages: 35<br>File Size: 22.44 MB<br>Public Date: Saturday, 22 Aug 2026 00:19 (CEST)<br>Posted: Monday, 28 Jul 2014 18:41 (CEST)<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network>` (image/jpeg, 622743 bytes, 1128x1600; server Content-Type: application/vnd.comicbook+zip) |  |  |  |
