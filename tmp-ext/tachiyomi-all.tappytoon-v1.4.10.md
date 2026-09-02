# Extension Validation Report

- Extension: tachiyomi-all.tappytoon-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 7049142072741547166
- Source name: Tappytoon
- Source language: en
- Selected manga input: popular offset 0: Light and Shadow (`.../lightnshadow%7C48`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 90 | Light and Shadow (`.../lightnshadow%7C48`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 58 | Once an Assassin, Now a Royal Nanny (`.../once-an-assassin-now-a-royal-nanny%7C1355`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Light and Shadow (`.../lightnshadow%7C48`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Light and Shadow (`.../lightnshadow%7C48`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 103 | Episode 1 (`.../316979852`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 90 entries |  |  |  |
| latest listing | PASS | 58 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Light and Shadow, URL=`lightnshadow\|48` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 149/149 listing manga have titles and URLs; 149 pipe-containing URLs skipped from classification |  |  |  |
| thumbnail URLs | PASS | 149/149 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://d1ed0vta5mrb00.cloudfront.net/.../lightnsha2_col420610.jpg` (image/jpeg, 114322 bytes, 420x610) |  |  |  |
| details identity | PASS | Details preserved selected URL `lightnshadow\|48` |  |  |  |
| details thumbnail URL | PASS | `https://d1ed0vta5mrb00.cloudfront.net/.../lightnsha2_col420610.jpg` |  |  |  |
| details author | PASS | Ryu Hyang, Hee Won |  |  |  |
| details artist | PASS | Ryu Hyang, Hee Won |  |  |  |
| details genres | PASS | Rating: Everyone |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Sequel series "Golden Time" now available on Tappytoon! • It's a rude insult when lowly and headstrong servant Edna comes to marry Duke Eli, instead of the noble daughter he expected. But the ambitious maid hides an even bigger secret behind her obvious ruse - one that could change the kingdom's very history. Can the two find freedom, redemption - and love - without drawing their swords on each other? Based on the hit novel. Genre: Romance, Drama \[Series Complete\]<br><br><br>❖  ❖  ❖<br>Read the original novel on Tappytoon!<br>Available on both web and app.<br><br>ⓒ Ryu Hyang, Hee Won/KIDARISTUDIO<br>All rights reserved. Published by Tappytoon under license from partners. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 83 name, chapter 95 name, chapter 96 name |  |  |  |
| chapters | PASS | 103 chapters |  |  |  |
| chapter dates | PASS | 103 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://content-repository-cdn.tappytoon.com/.../w_lns1zyaa_9_1.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 315861 bytes, 720x4000; server Content-Type: application/octet-stream) |  |  |  |
