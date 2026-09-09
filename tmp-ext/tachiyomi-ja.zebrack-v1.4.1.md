# Extension Validation Report

- Extension: tachiyomi-ja.zebrack-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4709947565690324919
- Source name: Zebrack
- Source language: ja
- Selected manga input: popular offset 0: Vジャンプ (`.../228`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 200 | Vジャンプ (`.../228`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | ラジエーションハウス (`.../2359`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | Vジャンプ (`.../228`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Vジャンプ (`.../228`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 3 | 🔒 (Preview) Vジャンプ 2026年8月号【アクセスコード付き】 (`.../2`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 3 |  |  | 10s+ |

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
| popular listing | PASS | 200 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vジャンプ, URL=`228#1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 216/216 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 216/216 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://asset.zebrack-comic.com/.../36573.jpg <redacted query values: drm_key and expires>` (image/jpeg, 78433 bytes, 418x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `228#1` |  |  |  |
| details thumbnail URL | PASS | `https://asset.zebrack-comic.com/.../36573.jpg <redacted query values: drm_key and expires>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 毎月21日発売！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://asset.zebrack-comic.com/.../262035535.jpg <redacted query values: drm_key and expires>` (image/jpeg, 473487 bytes, 1426x2048) |  |  |  |
