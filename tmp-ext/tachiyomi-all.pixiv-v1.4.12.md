# Extension Validation Report

- Extension: tachiyomi-all.pixiv-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 4964829535501435742
- Source name: Pixiv
- Source language: en
- Selected manga input: latest offset 0: 【創作百合】大嫌いで大好きだった (`.../354917`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | きっくーと遥太の話 (`.../223161`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 50 | それ的な漫画 (`.../53`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 50 | 【創作百合】大嫌いで大好きだった (`.../354917`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | 学マス (`.../246805`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 【創作百合】大嫌いで大好きだった (`.../354917`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 【創作百合】大嫌いで大好きだった (`.../354917`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 4 | 【創作百合】　大嫌いで大好きだった① (`.../148725997`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 4 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=【創作百合】大嫌いで大好きだった, URL=`.../354917` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.pximg.net/.../149103389_p0_master1200.jpg` (image/jpeg, 137926 bytes, 600x841) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../354917` |  |  |  |
| details thumbnail URL | PASS | `https://i.pximg.net/.../149103389_p0_master1200.jpg` |  |  |  |
| details author | PASS | ごまぽん |  |  |  |
| details artist | PASS | ごまぽん |  |  |  |
| details genres | PASS | 創作百合, 百合, 創作漫画, 恋愛, 高校生, 日常 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i.pximg.net/.../148725997_p0.jpg` (image/jpeg, 3259991 bytes, 2122x2976) |  |  |  |
