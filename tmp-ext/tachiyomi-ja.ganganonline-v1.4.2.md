# Extension Validation Report

- Extension: tachiyomi-ja.ganganonline-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 26
- Lint: 3
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1467355738916791140
- Source name: Gangan Online
- Source language: ja
- Selected manga input: popular offset 0: スライム倒して300年、知らないうちにレベルMAXになってました (`.../11`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 285 | スライム倒して300年、知らないうちにレベルMAXになってました (`.../11`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | スライム倒して300年、知らないうちにレベルMAXになってました (`.../11`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | スライム倒して300年、知らないうちにレベルMAXになってました (`.../11`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 12 | 第1話-1 - レベルMAXになっていた (`.../1166`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 285 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=スライム倒して300年、知らないうちにレベルMAXになってました, URL=`.../11` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 287/287 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 287/287 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.ganganonline.com/.../430592.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 18382 bytes, 540x338) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../11` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.ganganonline.com/.../430589.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 65196 bytes, 1080x675) |  |  |  |
| details author | PASS | 原作／森田季節(GAノベル／SBクリエイティブ刊)　漫画／シバユウスケ　キャラクター原案／紅緒 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 仕事のためだけに生きた人生を終え、不老不死の魔女に転生して、スローライフを300年続けてたら、レベル99になってました。 世界最強の噂を聞きつけ、やってくる冒険者やドラゴン。私のスローライフはどうなるの!? |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 5 name |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | LINT | 11 of 12 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=11 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.ganganonline.com/.../23972.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 217240 bytes, 960x1365) |  |  |  |
