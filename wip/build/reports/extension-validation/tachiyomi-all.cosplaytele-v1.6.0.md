# Extension Validation Report

- Extension: tachiyomi-all.cosplaytele-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7395748658970167454
- Source name: CosplayTele
- Source language: all
- Selected manga input: popular offset 0: ChuChu Magic cosplay Nahida &#8211; Genshin Impact &#8220;98 photos and 1 video&#8221; (`.../nahida-30`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | ChuChu Magic cosplay Nahida &#8211; Genshin Impact &#8220;98 photos and 1 video&#8221; (`.../nahida-30`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Meroko 魅瞳 (Meroko12356) cosplay Taihou Wedding Dress &#8211; Azur Lane &#8220;43 photos&#8221; (`.../taihou-wedding-dress`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Machi馬吉 – Reverse Bunny “147 photos” (`.../reverse-bunny`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | ChuChu Magic cosplay Ayaka Kamisato – Genshin Impact “141 photos and 1 video” (`.../ayaka-kamisato-23`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ChuChu Magic cosplay Nahida – Genshin Impact “98 photos and 1 video” (`.../nahida-30`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../nahida-30`) |  | <1s |
| pages | `getPageList(chapter)` | success | 98 |  |  | <1s |

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
| thumbnail | PASS | `https://cosplaytele.com/.../ChuChu-Magic-cosplay-Nahida-Genshin-Impact-18_result.webp` (image/webp (encoding: lossy), 93856 bytes, 2560x1444) |  |  |  |
| details identity | UNUSUAL | Details changed selected title ChuChu Magic cosplay Nahida &#8211; Genshin Impact &#8220;98 photos and 1 video&#8221; to ChuChu Magic cosplay Nahida – Genshin Impact “98 photos and 1 video” |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ChuChu Magic, Nahida, Genshin Impact, ChuChu Magic, Cosplay Game, Cosplay Genshin Impact, Cosplay Nude, Video Cosplay, Genshin Impact |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ChuChu Magic cosplay Nahida – Genshin Impact “98 photos and 1 video” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 98 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://cosplaytele.com/.../1` to `https://cosplaytele.com` (1 redirects) |  |  |  |
| page load | PASS | `https://cosplaytele.com/.../ChuChu-Magic-cosplay-Nahidaa-Genshin-Impact-1_result.webp` (image/webp (encoding: lossy), 87520 bytes, 1044x1600) |  |  |  |
