# Extension Validation Report

- Extension: tachiyomi-en.hijalascans-v1.6.26
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 454381816904772144
- Source name: Hijala Scans
- Source language: en
- Selected manga input: popular offset 0: Fog Land (`.../fog-land`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Fog Land (`.../fog-land`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Mimosa (`.../mimosa`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Fog Land (`.../fog-land`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Garbage Time (`.../garbage-time`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Fog Land (`.../fog-land`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Fog Land (`.../fog-land`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 55 | Chapter 0 - FogLand  (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Fog Land, URL=`fog-land#58` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.en-hijala.com/.../df696597-6687-4013-85ba-b65e34377f49.jpg` (image/jpeg, 113656 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `fog-land#58` |  |  |  |
| details thumbnail URL | PASS | `https://storage.en-hijala.com/.../df696597-6687-4013-85ba-b65e34377f49.jpg` |  |  |  |
| details author | PASS | POGO |  |  |  |
| details artist | PASS | POGO |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Fantasy, mature, seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | From the same writer and illustrator as Jakdu. Fogland, a mysterious international prison, traps Dante Kang a science teacher sent to reform prisoners during a sudden riot, leaving him with only one way to escape: by becoming a leader. (https://en-hijala.com)<br><br>Alternative Names: 포그랜드 /  Фогланд / 迷雾禁区 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 41 name, chapter 55 name |  |  |  |
| chapters | PASS | 55 chapters |  |  |  |
| chapter dates | PASS | 55 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.en-hijala.com/.../01.webp` (image/webp (encoding: lossy), 1036968 bytes, 690x7310) |  |  |  |
