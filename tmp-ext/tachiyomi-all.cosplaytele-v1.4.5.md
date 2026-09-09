# Extension Validation Report

- Extension: tachiyomi-all.cosplaytele-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7395748658970167454
- Source name: CosplayTele
- Source language: all
- Selected manga input: popular offset 0: 萌白酱 (yikouyoutao) &#8211; Lady &#8220;28 photos and 1 video&#8221; (`.../lady-7`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 萌白酱 (yikouyoutao) &#8211; Lady &#8220;28 photos and 1 video&#8221; (`.../lady-7`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Rinaijiao-(日奈娇) cosplay Cinderella &#8211; NIKKE &#8220;42 photos&#8221; (`.../cinderella-4`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | 咬一口兔娘ovo (Yaokoututu) cosplay Ryuuge Kisaki – Blue Archive “112 photos and 2 videos” (`.../ryuuge-kisaki-4`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | 你的小狗 (PuppyPorn090) cosplay Cartethyia – Wuthering Waves “21 photos and 1 video” (`.../cartethyia-7`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 萌白酱 (yikouyoutao) – Lady “28 photos and 1 video” (`.../lady-7`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../lady-7`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cosplaytele.com/.../yikouyoutao-Lady-29_result.webp` (image/webp (encoding: lossy), 84262 bytes, 2560x1572) |  |  |  |
| details identity | UNUSUAL | Details changed selected title 萌白酱 (yikouyoutao) &#8211; Lady &#8220;28 photos and 1 video&#8221; to 萌白酱 (yikouyoutao) – Lady “28 photos and 1 video” |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 萌白酱 (yikouyoutao), Cosplay Free Style, Cosplay Nude, Video Cosplay, 萌白酱 (yikouyoutao) |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 萌白酱 (yikouyoutao) – Lady “28 photos and 1 video” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | latest: `https://cosplaytele.com/.../1` to `https://cosplaytele.com` (1 redirects) |  |  |  |
| page load | PASS | `https://cosplaytele.com/.../yikouyoutao-Lady-1_result.webp` (image/webp (encoding: lossy), 53830 bytes, 900x1500) |  |  |  |
