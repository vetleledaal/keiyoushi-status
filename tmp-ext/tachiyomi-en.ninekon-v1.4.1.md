# Extension Validation Report

- Extension: tachiyomi-en.ninekon-v1.4.1
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
- Source implementation: keiyoushi.source.Generated
- Source ID: 4415429126767799340
- Source name: Ninekon
- Source language: en
- Selected manga input: popular offset 0: Half Succubus Wo Hirotta (`.../153809633634de20543e3dcc748e44b1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 70 | Half Succubus Wo Hirotta (`.../153809633634de20543e3dcc748e44b1`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 70 | One Punch-Man - One-Hurricane (Doujinshi)frame (`.../d77ff008a30b84d314c1b6d842e36a0c`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 70 | Home Centre Sales Clerk’s Life in Another World ~with the titles - “DIY Master”, “Green Master” and “Pet Master”~ (`.../d850e14d13906074084d3c573a42c2f9`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 70 | A World of Stigma (`.../6be7ffea2db872fb93026b404d1a4cf0`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Half Succubus Wo Hirotta (`.../153809633634de20543e3dcc748e44b1`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Half Succubus Wo Hirotta (`.../153809633634de20543e3dcc748e44b1`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 339 | Chapter 1 (`.../pages`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 70 entries |  |  |  |
| latest listing | PASS | 70 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Half Succubus Wo Hirotta, URL=`153809633634de20543e3dcc748e44b1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 281/281 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 281/281 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media1.ninekon.com/.../153809633634de20543e3dcc748e44b1.jpg` (image/jpeg, 12904 bytes, 225x318) |  |  |  |
| details identity | PASS | Details preserved selected URL `153809633634de20543e3dcc748e44b1` |  |  |  |
| details thumbnail URL | PASS | `https://media1.ninekon.com/.../153809633634de20543e3dcc748e44b1.jpg` |  |  |  |
| details author | PASS | zurikishi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | comedy, slice-of-life, pornographic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Take a child half succubus and half human. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 339 chapters |  |  |  |
| chapter dates | LINT | 338 of 339 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=338 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media1.ninekon.com/.../00001-62263.jpg` (image/jpeg, 492416 bytes, 2892x4096) |  |  |  |
