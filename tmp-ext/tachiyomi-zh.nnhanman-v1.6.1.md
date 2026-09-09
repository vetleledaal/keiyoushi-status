# Extension Validation Report

- Extension: tachiyomi-zh.nnhanman-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6412117657297236190
- Source name: 鸟鸟韩漫
- Source language: zh
- Selected manga input: popular offset 0: 老師的親密指導 (`.../lao-shi-de-qin-mi-zhi-dao.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 老師的親密指導 (`.../lao-shi-de-qin-mi-zhi-dao.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | 成人漫畫取材課 (`.../cheng-ren-man-hua-qu-cai-ke.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 老師的親密指導 (`.../lao-shi-de-qin-mi-zhi-dao.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 老師的親密指導 (`.../lao-shi-de-qin-mi-zhi-dao.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 113 | 第113話-奮不顧身的濕身承諾 (`.../chapter-85544.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 191 |  |  | 1-10s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=老師的親密指導, URL=`.../lao-shi-de-qin-mi-zhi-dao.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb.niaopic.com/.../20240907080924141.jpg` (image/jpeg, 156252 bytes, 302x403) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lao-shi-de-qin-mi-zhi-dao.html` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.niaopic.com/.../20240907080924141.jpg` |  |  |  |
| details author | PASS | NOKO 雲河尹 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 正妹, 肉慾, 浪漫, 大尺度, 巨乳, 有夫之婦 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 為了把會長家的學渣兒子送進名門大學，換取10億獎金，家教老師們無所不用其極。「範辰…想知道老師內褲裡面…長什麼樣子嗎?♥」想擺爛?能敵過我的美人計再說! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 113 chapters |  |  |  |
| chapter dates | LINT | All 113 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=113 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 191 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://new.niaopic.com/.../20260908152232737.jpg` at pages 1, 4 |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://new.niaopic.com/.../20260908152232737.jpg` (image/jpeg, 30797 bytes, 720x608) |  |  |  |
