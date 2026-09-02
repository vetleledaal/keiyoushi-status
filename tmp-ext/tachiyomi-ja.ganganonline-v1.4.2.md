# Extension Validation Report

- Extension: tachiyomi-ja.ganganonline-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 26
- Lint: 2
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
- Selected manga input: popular offset 0: ギャルに優しいオタク君 (`.../1599`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 298 | ギャルに優しいオタク君 (`.../1599`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ギャルに優しいオタク君 (`.../1599`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ギャルに優しいオタク君 (`.../1599`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3 | 第1話-1 (`.../68205`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| popular listing | PASS | 298 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ギャルに優しいオタク君, URL=`.../1599` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 299/299 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 299/299 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.ganganonline.com/.../402654.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 13372 bytes, 540x338) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1599` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.ganganonline.com/.../402651.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 47830 bytes, 1080x675) |  |  |  |
| details author | PASS | 原作／138ネコ　作画／草中 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 見た目がオタクな男子高校生の小田倉と、ギャルな女子高生の鳴海。<br>本来は学校でも交わらない真逆のタイプの二人だったけれど、ひょんなことから小田倉は持ち前の手先の器用さで、鳴海の趣味に関するお願い事を次々と叶えていって!?<br><br>ギャルの趣味を理解するオタク君の学園青春ラブコメディー♪ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | LINT | 2 of 3 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.ganganonline.com/.../1477107.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 90682 bytes, 960x1365) |  |  |  |
