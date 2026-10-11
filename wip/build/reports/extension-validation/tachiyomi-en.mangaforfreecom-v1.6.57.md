# Extension Validation Report

- Extension: tachiyomi-en.mangaforfreecom-v1.6.57
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: madara
- Source ID: 1099222169691387069
- Source name: Mangaforfree.com
- Source language: en
- Selected manga input: popular offset 0: Stop Smoking (`.../359817`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Stop Smoking (`.../359817`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Relationship Reversal (`.../359268`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | It’s A Lie, But It’s Okay (`.../362427`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Taming A Female Bully (`.../360259`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Stop Smoking (`.../359817`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stop Smoking (`.../359817`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 128 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Stop Smoking, URL=`359817` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaforfree.com/.../Stop-Smoking-manga-free-175x238.jpg` (image/jpeg, 10298 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `359817` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangaforfree.com/.../Stop-Smoking-manga-free-193x278.jpg` (image/jpeg, 12478 bytes, 193x278) |  |  |  |
| details author | PASS | AA |  |  |  |
| details artist | PASS | Momobird |  |  |  |
| details genres | PASS | Adult, Drama, Ecchi, Manhwa, Mature, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Even though I get teased for being short and bullied at work, my house is paradise!! … I thought it was like that, but the neighbors are smoking like crazy!! I couldn’t stand it anymore and went to look for them, but I met a fierce-looking, heavy-duty gangster, Na Se-young!<br><br>Alternative Names: Stop Smoking/ Deja de fumar/ DEJA DE FUMAR / Someone Stop Her! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 128 chapters |  |  |  |
| chapter dates | PASS | 128 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangaforfree.com/.../1.jpg` (image/jpeg, 205209 bytes, 720x7980) |  |  |  |
