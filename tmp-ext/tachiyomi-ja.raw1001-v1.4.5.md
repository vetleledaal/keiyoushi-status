# Extension Validation Report

- Extension: tachiyomi-ja.raw1001-v1.4.5
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
- Source ID: 3349575794425308347
- Source name: Raw1001
- Source language: ja
- Selected manga input: popular offset 0: キングダム (`.../kingudamu002`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 42 | キングダム (`.../kingudamu002`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 42 | 魔王の始め方 THE COMIC (`.../mo-wangno-shime-fang-the-comic`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 異世界魔王と召喚少女の奴隷魔術 (`.../yi-shi-jie-mo-wangto-zhao-huan-shao-nuno-nu-li-mo-shu`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | よわよわ先生 (`.../yowayowa-xian-sheng`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 6 | キングダム (`.../kingudamu002`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | キングダム (`.../kingudamu002`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 887 | 第1話 (`.../di1hua`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=キングダム, URL=`.../kingudamu002` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 138/138 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 138/138 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://raw1001.net/.../kingudamu.jpg` (image/jpeg, 84248 bytes, 360x504) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kingudamu002` |  |  |  |
| details thumbnail URL | PASS | `https://raw1001.net/.../kingudamu.jpg` |  |  |  |
| details author | PASS | 未詳 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | キングダム raw |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 887 chapters |  |  |  |
| chapter dates | PASS | 887 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.cdnkk.top/.../08-08-28-6515774075574930.webp` (image/webp (encoding: lossy), 322768 bytes, 800x1149; server Content-Type: image/jpeg) |  |  |  |
